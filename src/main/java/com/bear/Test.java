package com.bear;


import com.bear.DAO.UserDAOImpl;
import com.bear.DAO.UserFinder;
import java.util.List;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        UserFinder userRepo = new UserDAOImpl();
        Object o = userRepo.findByID(0);
    }
}
