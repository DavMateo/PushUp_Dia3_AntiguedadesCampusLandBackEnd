package com.pushup.antiguedades.antiguedad.infrastructure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pushup.antiguedades.antiguedad.application.service.IAntiguedadService;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/antiguedad")
public class AntiguedadRestController {
    private final IAntiguedadService antiguedadService;

    @Autowired
    public AntiguedadRestController(IAntiguedadService antiguedadService){
        this.antiguedadService = antiguedadService;
    }

    @GetMapping
    public List<Antiguedades> getAllChapters() {
        return antiguedadService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Antiguedades> getChapterById(@PathVariable Long id) {
        Optional<Antiguedades> chapter = antiguedadService.findById(id);
        if (chapter.isPresent()) {
            return ResponseEntity.ok(chapter.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Antiguedades> createChapter(@RequestBody Antiguedades chapter) {
        Antiguedades savedChapter = antiguedadService.save(chapter);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedChapter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Antiguedades> updateChapter(@PathVariable Long id, @RequestBody Antiguedades chapter) {
        chapter.setIdantiguedades(id);
        try{
            Antiguedades updateChapter = antiguedadService.update(chapter);
            return ResponseEntity.ok(updateChapter);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChapter(@PathVariable Long id) {
        try{
            antiguedadService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND). build();
        }
    }
}