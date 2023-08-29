package com.kuripu.zettelkasten.repository;

import com.kuripu.zettelkasten.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface NoteRepository extends JpaRepository<Note, Long> {
    @Query(value = "SELECT id, reference_id, title, created_at, updated_at FROM notes;", nativeQuery = true)
    List<Map<String, String>> getAllNotesList();

    @Query(value = "SELECT * from notes where reference_id = ?;", nativeQuery = true)
    Note findByReferenceID(String refId);
}
