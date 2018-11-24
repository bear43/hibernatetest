package com.bear.DAO;

import java.util.List;

public class UserDAOImpl extends DAOImpl implements UserFinder
{
    @Override
    public <T> T findByLogin(String login)
    {
        return null;
    }

    @Override
    public <T> T findByPassword(String password)
    {
        return null;
    }

    @Override
    public <T> T findByID(long id)
    {
        T ret;
        em.getTransaction().begin();
        ret = (T)em.createQuery("from User where id="+id).getSingleResult();
        em.close();
        return ret;
    }

    @Override
    public List findAll()
    {
        List ret;
        em.getTransaction().begin();
        ret = em.createQuery("from User").getResultList();
        em.close();
        return ret;
    }
}
