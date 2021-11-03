package com.luckydraw.todoapp.service;

import com.luckydraw.todoapp.model.Note;
import com.luckydraw.todoapp.repository.impl.NoteDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class NoteServiceImpl implements ServiceInterface<Note> {

    private NoteDaoImpl noteDao;

    @Autowired
    public NoteServiceImpl(NoteDaoImpl noteDao) {
        this.noteDao = noteDao;
    }

    @Override
    public Note getById(Long id) {
        return noteDao.getById(id);
    }

    @Override
    public Note create(Note note) {
        return noteDao.create(note);
    }

    @Override
    public void remove(Note note) {
        noteDao.remove(note);
    }

    @Override
    public Set<Note> getAll() {
        return noteDao.getAll();
    }
}
