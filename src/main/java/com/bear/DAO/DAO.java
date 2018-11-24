package com.bear.DAO;

public interface DAO
{
    void create(Object obj);

    <T> T read(T obj);

    void update(Object obj);

    void delete(Object obj);
}
