package com.dovalle.database.base;

import org.hibernate.internal.SessionFactoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityDatabase {
    private EntityManagerFactory factoryDB;
    private EntityManager manager;

    public EntityDatabase(){
        try {
            this.factoryDB = Persistence.createEntityManagerFactory("basicJPA");
            this.manager = this.factoryDB.createEntityManager();
            System.out.printf("\nSUCESS Create the factory and manager of entities.");
        }
        catch (Exception e){
            System.out.printf("\nERROR to create the factory and manager of entities. " + e.getMessage());
        }
    }

    public void add (Object entity){
        try {
            System.out.printf("\nBegin the transaction ");
            manager.getTransaction().begin();
            System.out.printf("\nPersisting the entity ");
            manager.persist(entity);
            System.out.printf("\nCommit the transaction ");
            manager.getTransaction().commit();
            System.out.println("\nSUCESS into transaction ");
        }
        catch (Exception e){
            System.out.println("\nERROR into transaction. " + e.getMessage());
            var rollbackInfo = "\nRollback was not necessary";
            if (manager != null && manager.getTransaction() != null) {
                manager.getTransaction().rollback();
                rollbackInfo = "\nRollback is done.";
            }
            System.out.printf(rollbackInfo);
        }
    }

    public void closeResources(){
        StringBuilder message = new StringBuilder();
        try {
            if (manager != null && manager.isOpen()) {
                manager.close();
                message.append("\nSUCESS: Manager entity was closed");
            }
            if (factoryDB != null && factoryDB.isOpen()) {
                factoryDB.close();
                message.append("\nSUCESS: Factory entity was closed");
            }
        }
        catch (Exception e){
            message.append("\nERROR to close one or more resources from EntityDatabase.");
        }
        finally {
            message.append("\nClosing resources was done");
            System.out.println(message.toString());
        }
    }


}
