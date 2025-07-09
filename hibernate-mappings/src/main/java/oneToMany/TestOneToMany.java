package oneToMany;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class TestOneToMany {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		--- Save Data ---

//		--- Save Company first in isolation ---

//		Company company = new Company(0, "Dabur", null);
//		session.save(company);

//		--- Save Products second in relation ---
//		Company company = session.get(Company.class, 7);
//		Product product1 = new Product(0, "AAA", 111, company);
//		Product product2 = new Product(0, "GGG", 456, company);
//		Product product3 = new Product(0, "EEE", 789, company);
//		session.save(product1);
//		session.save(product2);
//		session.save(product3);

//		--- All Data Nested ---
		Company company = session.get(Company.class, 7);
			System.out.println("---Company---");
			System.out.println(company);
			System.out.println("---Products---");
			for (Product product: company.getProducts())
				System.out.println(product);

			System.out.println();

//		Product p = (Product)session.createCriteria(Product.class)
//		.add(Restrictions.eq("productName", "Parachute Oil"))
//		.list().get(0);
//		
//		System.out.println(p);

		transaction.commit();
		session.close();
	}

}
