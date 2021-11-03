package com.luckydraw.todoapp.service;

import java.util.Set;

public interface ServiceInterface<T> {

    T getById(Long id);
    T create(T t);
    void remove(T t);
    Set<T> getAll();
}
