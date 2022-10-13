package com.jacaranda.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.jacaranda.prueba.Prueba;

public class PruebaDao {
	
	private StandardServiceRegistry sr;
	private SessionFactory sf;
	private Session session;
	
	
	public PruebaDao() {
		super();
		this.sr = new StandardServiceRegistryBuilder().configure().build();
		this.sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		this.session = sf.openSession();
	}
	
	public boolean addPrueba(Prueba p) {
		boolean result = false;
		try {
			session.getTransaction().begin();
			session.save(p);
			session.getTransaction().commit();
			result = true;
		}catch(Exception e) {
			System.out.println("En la excepción");
			System.out.println(e);
		}
		return result;
	}
	
}
