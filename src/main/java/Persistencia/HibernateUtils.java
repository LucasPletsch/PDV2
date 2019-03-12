package Persistencia;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    //Fábrica de sessões de banco de dados constante no padrão SINGLETON

    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	/*private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();

		//  Use the mappings and properties specified in an application resource named hibernate.cfg.xml.
		configuration.configure("hibernate.cfg.xml");

		//Serviço que contém a configuração do banco de dados de acordo com o hibernate.cfg.xml
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);

	}*/

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
