package util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import model.Bebe;
import model.BebeMedico;
import model.Medico;
import model.Residente;
import model.Mae;


public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties prop = new Properties();
				prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				prop.put(Environment.URL, "jdbc:mysql://localhost:3306/exercicio1?createDatabaseIfNotExist=true");
				prop.put(Environment.USER, "root");
				prop.put(Environment.PASS, "P4ssw0rd");
				prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
				prop.put(Environment.SHOW_SQL, "true");
				prop.put(Environment.HBM2DDL_AUTO, "update");
				
				configuration.addProperties(prop);
				configuration.addAnnotatedClass(Medico.class);
				configuration.addAnnotatedClass(Mae.class);
				configuration.addAnnotatedClass(Bebe.class);
				configuration.addAnnotatedClass(Residente.class);
				configuration.addAnnotatedClass(BebeMedico.class);
				
				ServiceRegistry registry = new StandardServiceRegistryBuilder()
											.applySettings(configuration.getProperties())
											.build();
				sessionFactory = configuration.buildSessionFactory(registry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

}
