package com.luckydraw.todoapp.service;

import com.luckydraw.todoapp.model.NotesList;
import com.luckydraw.todoapp.repository.impl.NotesListDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class NotesListServiceImpl implements ServiceInterface<NotesList> {

    private NotesListDaoImpl notesListDao;

    @Autowired
    public NotesListServiceImpl(NotesListDaoImpl notesListDao) {
        this.notesListDao = notesListDao;
    }

    @Override
    public NotesList getById(Long id) {
        return notesListDao.getById(id);
    }

    @Override
    public NotesList create(NotesList notesList) {
        return notesListDao.create(notesList);
    }

    @Override
    public void remove(NotesList notesList) {
        notesListDao.remove(notesList);
    }

    @Override
    public Set<NotesList> getAll() {
        return notesListDao.getAll();
    }
}
