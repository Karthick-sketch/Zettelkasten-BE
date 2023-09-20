package com.kuripu.zettelkasten.controller;

import com.kuripu.zettelkasten.entity.Note;
import com.kuripu.zettelkasten.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "http://localhost:5173/")
@RestController
public class NotesController {
    @Autowired
    NoteService noteService;

    @GetMapping("/")
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

    @GetMapping("/notelist")
    public Collection<Map<String, String>> getNoteTitles() {
        return noteService.getNoteTitles();
    }

    @GetMapping("note/{noteId}")
    public Note getNoteByReferenceID(@PathVariable String noteId) {
        return noteService.findNoteByReferenceID(noteId);
    }
}
