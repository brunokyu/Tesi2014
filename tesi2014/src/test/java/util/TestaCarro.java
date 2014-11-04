package util;

import org.hibernate.Session;

public class TestaCarro {

	public static void main(String[] args) {
		//abre a sessão
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		Carro c = new Carro();
		c.setAno(2015);
		c.setCombustivel("Flex");
		c.setPlaca("NAB-4973");
		c.setChassi("985423565");
		c.setQuilometragem(0);
		c.setRENAVAN("8675238");
		c.setCor("Cinza");
		s.save(c);
		s.getTransaction().commit();
		s.close();
		

	}

}
