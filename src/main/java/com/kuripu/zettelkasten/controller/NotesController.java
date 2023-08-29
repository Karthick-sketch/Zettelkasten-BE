package com.kuripu.zettelkasten.controller;

import com.kuripu.zettelkasten.entity.Note;
import com.kuripu.zettelkasten.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotesController {
    @Autowired
    NoteService noteService;

    @GetMapping("/")
    public List<Note> getNotes() {
        return noteService.getNotes();
    }
}
