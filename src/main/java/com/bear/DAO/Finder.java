package com.bear.DAO;

import java.util.List;

public interface Finder
{
    <T> T findByID(long id);
    List findAll();
}
