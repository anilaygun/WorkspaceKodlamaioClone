package org.example.core.dataAccess;

import org.example.core.entities.Entity;

import java.util.List;
import java.util.function.Predicate;

public interface EntityRepository<T extends Entity> {
    //generic constraint? /generic bounded type?
    List<T> getAll(Predicate<T> filter);

    T get(Predicate<T> filter);

    void add(T entity);

    void update(T entity);

    void delete(T entity);
}
