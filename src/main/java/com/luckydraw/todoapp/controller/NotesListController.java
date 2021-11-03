package com.luckydraw.todoapp.controller;

import com.luckydraw.todoapp.model.NotesList;
import com.luckydraw.todoapp.service.NotesListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(value = "/notes-list")
public class NotesListController {

    private NotesListServiceImpl service;

    @Autowired
    public NotesListController(NotesListServiceImpl service) {
        this.service = service;
    }

    @GetMapping(value = "/all")
    public String getAllNotes(Model model){
        Set<NotesList> notesLists = service.getAll();
        model.addAttribute("notesList", notesLists);

        return "notesList";
    }

    @GetMapping(value = "/{id}")
    public NotesList getById(@PathVariable(value = "id") Long id){
        return service.getById(id);
    }
}
