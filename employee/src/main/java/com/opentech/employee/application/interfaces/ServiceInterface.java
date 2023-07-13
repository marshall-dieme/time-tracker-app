package com.opentech.employee.application.interfaces;

import java.util.List;

public interface ServiceInterface<E> {
    E create(E entity);

    List<E> getAll();

    E getById(Long id);

    E getById(String id);

    E update(E entity);

    void delete(E entity);

}
