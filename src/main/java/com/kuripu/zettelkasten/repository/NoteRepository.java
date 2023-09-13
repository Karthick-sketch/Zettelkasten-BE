package com.kuripu.zettelkasten.repository;

import com.kuripu.zettelkasten.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {
    @Query(value = "SELECT id, note_id, name, created_at FROM notes;", nativeQuery = true)
    List<Note> getNoteTitles();

    @Query(value = "SELECT * from notes where reference_id = ?;", nativeQuery = true)
    Note findByReferenceID(String noteId);
}
