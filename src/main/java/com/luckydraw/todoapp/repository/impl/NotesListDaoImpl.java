package com.luckydraw.todoapp.repository.impl;

import com.luckydraw.todoapp.model.NotesList;
import com.luckydraw.todoapp.repository.AbstractDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class NotesListDaoImpl extends AbstractDao<NotesList> {

    public NotesListDaoImpl(EntityManager em) {
        super(em);
        this.clazz = NotesList.class;
    }
}
