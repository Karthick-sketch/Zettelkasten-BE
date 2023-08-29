package com.kuripu.zettelkasten.service;

import com.kuripu.zettelkasten.entity.Note;
import com.kuripu.zettelkasten.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NoteService {
    @Autowired
    NoteRepository noteRepository;

    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    public List<Map<String, String>> getNoteList() {
        return noteRepository.getAllNotesList();
    }

    public Note findNoteByReferenceID(String refId) {
        return noteRepository.findByReferenceID(refId);
    }
}
