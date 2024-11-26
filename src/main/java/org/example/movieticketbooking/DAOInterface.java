package org.example.movieticketbooking;

import java.util.List;

public interface DAOInterface<T> {
    /**
     * Inserts a new entity into the database.
     *
     * @param entity The entity to insert.
     * @return The ID of the newly created entity.
     */
    int insert(T entity);

    /**
     * Reads an entity from the database by its ID.
     *
     * @param id The ID of the entity to read.
     * @return The entity with the specified ID, or null if not found.
     */
    T read(int id);

    /**
     * Updates an existing entity in the database.
     *
     * @param entity The entity to update.
     */
    void update(T entity);

    /**
     * Deletes an entity from the database.
     *
     * @param entity The entity to delete.
     */
    void delete(T entity);

    /**
     * Finds all entities in the database.
     *
     * @return A list of all entities.
     */
    List<T> findAll();
}

