package com.mockito.service;

import com.mockito.DAO.DatabaseDAO;
import com.mockito.DAO.NetworkDAO;

public class RecordService {
	DatabaseDAO database;
    NetworkDAO network;
     
    //setters and getters
 
    public boolean save(String fileName)
    {
        database.save(fileName);
        System.out.println("Saved in database in Main class");
         
        network.save(fileName);
        System.out.println("Saved in network in Main class");
         
        return true;
    }
}
