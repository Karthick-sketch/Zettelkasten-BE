package com.kuripu.zettelkasten.service;

import com.kuripu.zettelkasten.entity.Note;
import com.kuripu.zettelkasten.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    NoteRepository noteRepository;

    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    public List<Note> getNoteTitles() {
        return noteRepository.getNoteTitles();
    }

    public Note findNoteByReferenceID(String noteId) {
        return noteRepository.findByReferenceID(noteId);
    }
}
