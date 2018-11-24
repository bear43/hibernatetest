package com.bear.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAOImpl implements DAO
{
    private static EntityManagerFactory manager = Persistence.createEntityManagerFactory("sample");
    protected EntityManager em = manager.createEntityManager();
    @Override
    public void create(Object obj)
    {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public <T> T read(T obj)
    {
        return (T)em.find(obj.getClass(), obj);
    }

    @Override
    public void update(Object obj)
    {
        em.getTransaction().begin();
        em.refresh(obj);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Object obj)
    {
        em.getTransaction().begin();
        em.remove(obj);
        em.getTransaction().commit();
        em.close();
    }
}
