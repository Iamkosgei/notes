package xyz.kosgei.notes.notes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotesService {


    @Autowired
    private NotesRepository notesRepository;

    List<Note> allNotes()
    {
        List<Note> notes = new ArrayList<>();
        notesRepository.findAll().forEach(notes::add);
        return notes;
    }

    void addNote(Note note)
    {
        notesRepository.save(note);
    }

}
