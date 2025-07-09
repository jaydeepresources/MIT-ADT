package com.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class TestHibernate {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		--- Insert ---
//		Employee employee = new Employee(0, "John Doe", 12345.6f);
//		session.save(employee);
//		--- Update ---
//		Employee employee = new Employee(2, "Jane Rogers", 12356.7f);
//		session.update(employee);
//		--- Delete ---
//		Employee employee = new Employee(2, "", 0);
//		session.delete(employee);
//		--- Search ---
//		Employee employee = session.get(Employee.class, 1);
//		System.out.println(employee);
//		--- View All ---
//		Query query = session.createQuery("from Employee");
//		ArrayList<Employee> employees = (ArrayList<Employee>) query.list();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
//		--- Annotations ---
//		Car car1 = new Car(0, "KL12JH09", "Rapid", "Skoda", "White");
//		session.save(car1);
//		transaction.commit();
//		System.out.println("Car saved.");
//		--- HQL Update ---
//		Query query = session.createQuery("update Car set carColor=:c where carId=:i");
//		query.setParameter("c", "Silver");
//		query.setParameter("i", 1);
//		int res = query.executeUpdate();
//		System.out.println(res);
//		--- HQL Partial ---		
//		Query query = session.createQuery("select new Car(carId, carModel, carManufacturer) from Car c");
//		List<Car> cars = query.getResultList();
//		for (Car car : cars) {
//			System.out.println(car);
//		}
//		--- Query with like ---
//		Query query = session.createQuery("from Car c where c.carRegNo like :regNo");
//		query.setParameter("regNo", "KL%");
//		List<Car> cars = query.getResultList();
//		System.out.println(cars);
//		--- Criteria ---		
//		session.createCriteria(Car.class).add(Restrictions.like("carRegNo", "TS%")).list();
//		System.out.println(cars);
		transaction.commit();
		session.close();
	}

}
