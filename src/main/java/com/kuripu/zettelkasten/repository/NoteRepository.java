package com.kuripu.zettelkasten.repository;

import com.kuripu.zettelkasten.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
