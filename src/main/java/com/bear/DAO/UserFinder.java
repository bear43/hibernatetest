package com.bear.DAO;

public interface UserFinder extends Finder
{
    <T> T findByLogin(String login);

    <T> T findByPassword(String password);
}
