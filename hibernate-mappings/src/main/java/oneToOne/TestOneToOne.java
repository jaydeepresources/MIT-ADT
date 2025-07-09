package oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		--- Save GST ---
		
//		Company company = session.get(Company.class, 5);
//		GSTRegistration gstRegistration1 = new GSTRegistration(0, "ASD34REDFG", "Business", company);
//
//		session.save(gstRegistration1);
		
//		--- Update Company with GST ---
		
//		Company company = session.get(Company.class, 5);
//		GSTRegistration gstRegistration = session.get(GSTRegistration.class, 15);
//
//		company.setGstInfo(gstRegistration);
//		
//		session.update(company);

//		--- Save Company with GST ---
		
//		Company company = new Company(0, "Dabur", null);
//		GSTRegistration gstRegistration = new GSTRegistration(0, "LJ0798SDG", "Composite", null);
//
//		company.setGstInfo(gstRegistration);
//		gstRegistration.setCompany(company);
//
//		session.save(company);


//		--- Save both objects in isolation and then link with FK ---
//		GSTRegistration gstRegistration = session.get(GSTRegistration.class,4);
//		Company company = session.get(Company.class,5);
//
//		gstRegistration.setCompany(company);
//		company.setGstInfo(gstRegistration);
//
//		session.save(company);
//		transaction.commit();
//		session.close();
//		System.out.println("Saved.");

//		GSTRegistration gstRegistration = session.get(GSTRegistration.class,4);
//		System.out.println(gstRegistration.getCompany());

		Company company = session.get(Company.class,5);
		System.out.println(company.getGstInfo());
	}

}
