package com.kuripu.zettelkasten.controller;

import com.kuripu.zettelkasten.entity.Note;
import com.kuripu.zettelkasten.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class NotesController {
    @Autowired
    NoteService noteService;

    @GetMapping("/")
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

    @GetMapping("/notelist")
    public List<Map<String, String>> getNoteList() {
        return noteService.getNoteList();
    }

    @GetMapping("note/{refId}")
    public Note getNoteByReferenceID(@PathVariable String refId) {
        return noteService.findNoteByReferenceID(refId);
    }
}
