package com.bear.DAO;

public interface PropertyFinder extends Finder
{
    <T> T findByTitle(String title);

    <T> T findByDescription(String description);
}
