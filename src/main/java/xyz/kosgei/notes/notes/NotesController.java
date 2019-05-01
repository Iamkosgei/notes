package xyz.kosgei.notes.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotesController {

    @Autowired
    private NotesService notesService;

    @RequestMapping("/notes")
    public List<Note> allNotes()
    {
        return notesService.allNotes();
    }

    @RequestMapping("/notes/{id}")
    public Note oneNote(@PathVariable String id)
    {
        return notesService.findNote(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/notes")
    public void addNewNote(@RequestBody Note note)
    {
        notesService.addNote(note);
    }

    @PutMapping("/notes/{id}")
    public void updateNote(@RequestBody Note note ,@PathVariable String id )
    {
        notesService.updateNote(note,id);
    }
}