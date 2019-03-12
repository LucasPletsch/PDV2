package Main;

import Persistencia.HibernateUtils;
import ProcessoDeVenda.Produto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Session sessao;

        HibernateUtils hiber = new HibernateUtils();
        SessionFactory session = hiber.getSessionFactory();
        Produto produto;

        try {
            sessao = session.openSession();

            Date data = new Date(05, 12, 2018);
            float valor = (float) 42000.0;

            produto = new Produto("Carro", 1, valor, (java.sql.Date) data);

            System.out.println(produto.toString());

        }catch (Exception sqlException) {
            System.out.println(sqlException);
        }

    }

}

