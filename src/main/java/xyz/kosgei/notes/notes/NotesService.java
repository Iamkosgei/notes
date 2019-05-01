package xyz.kosgei.notes.notes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotesService {


    @Autowired
    private NotesRepository notesRepository;

    //all notes
    List<Note> allNotes()
    {
        List<Note> notes = new ArrayList<>();
        notesRepository.findAll().forEach(notes::add);
        return notes;
    }

    // saving a new note
    void addNote(Note note)
    {
        notesRepository.save(note);
    }

    //getting a single note
    Note findNote(String id)
    {
        return notesRepository.findById(Integer.parseInt(id)).orElse(null);
    }

    //delete note
    public void deleteNote(String id)
    {
        notesRepository.deleteById(Integer.parseInt(id));
    }

    //update a note
    void updateNote(Note note,String id)
    {
      Note updatedNote = notesRepository.findById(Integer.parseInt(id)).get();

      updatedNote.setTitle(note.getTitle());
      updatedNote.setMessage(note.getMessage());

      notesRepository.save(updatedNote);
    }
}
