package xyz.kosgei.notes.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(method = RequestMethod.POST,value = "/notes")
    public void addNewNote(@RequestBody Note note)
    {
        notesService.addNote(note);
    }
}
