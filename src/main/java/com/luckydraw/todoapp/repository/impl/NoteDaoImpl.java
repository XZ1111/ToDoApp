package com.luckydraw.todoapp.repository.impl;

import com.luckydraw.todoapp.model.Note;
import com.luckydraw.todoapp.repository.AbstractDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class NoteDaoImpl extends AbstractDao<Note> {

    public NoteDaoImpl(EntityManager em) {
        super(em);
        this.clazz = Note.class;
    }
}
