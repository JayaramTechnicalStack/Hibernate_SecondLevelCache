package emp;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeClient {

	public static void main(String[] args) {
		

		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
        Session session1 = factory.openSession();
		/*
		 *  Employee e = new Employee();
		 * e.setEmpname("Vijay"); e.setSal(20000); e.setEmpadd("hyd");
		 * 
		 * session1.save(e); Transaction tx = session1.beginTransaction(); tx.commit();
		 */
		 
		 
		 //First level Cache
		 
		 
			/*
			 * Object o1 =session1.get(Employee.class, new Integer(1)); Employee
			 * e1=(Employee)o1; System.out.println("From Session1 Object Data");
			 * System.out.println(e1.getEmpno()+"  "+e1.getEmpname()+ "  "+e1.getSal()+
			 * " "+e1.getEmpadd());
			 * 
			 * Session session2 = factory.openSession();
			 * 
			 * System.out.println("From Session2 Object Data"); Object o2
			 * =session2.get(Employee.class, new Integer(1)); Employee e2=(Employee)o2;
			 * System.out.println(e2.getEmpno()+"  "+e2.getEmpname()+ "  "+e2.getSal()+
			 * " "+e2.getEmpadd());
			 * 
			 * Object o3 =session2.get(Employee.class, new Integer(2)); Employee
			 * e=(Employee)o3; System.out.println(e.getEmpno()+"  "+e.getEmpname()+
			 * "  "+e.getSal()+ " "+e.getEmpadd());
			 */
		 
		 
		 //Session session3=factory.openSession();
		 /*Object o3 =session2.get(Employee.class, new Integer(1));
		 Employee e3=(Employee)o3;
		 System.out.println(e3.getEmpno()+"  "+e3.getEmpname()+ "  "+e3.getSal()+ " "+e3.getEmpadd());
		*/
			 
	/*	 Session session2 = factory.openSession();
		Object o5 =session2.get(Employee.class, new Integer(1));
			 Employee e5=(Employee)o5;
			 System.out.println("From Session2 Object Data");
			 System.out.println(e5.getEmpno()+"  "+e5.getEmpname()+ "  "+e5.getSal()+ " "+e5.getEmpadd());*/
					 
			/* Transaction tx=session1.beginTransaction();
			 tx.commit(); 
			 
		 Session session3=factory.openSession();
		 Object o3 =session3.get(Employee.class, new Integer(1));
		 Employee e3=(Employee)o3;
		 System.out.println("From Session2 Object Data:");
		 System.out.println(e3.getEmpno()+"  "+e3.getEmpname()+ "  "+e3.getSal()+ " "+e3.getEmpadd());
		 */
		 
		 //Second Level Cache
		 
			/*
			 * 
			 * Object o1 = session1.get(Employee.class, new Integer(1)); Employee e1 =
			 * (Employee) o1;
			 * 
			 * System.out.println(e1.getEmpno() + "  " + e1.getEmpname() + "  " +
			 * e1.getSal() + " " + e1.getEmpadd());
			 * 
			 * System.out.println("Object is loaded successfully from Database");
			 * 
			 * try { Thread.sleep(6000); } catch (Exception excep) {
			 * 
			 * }
			 * 
			 * System.out.println("Sleeping Time is completed");
			 * 
			 * Session session2 = factory.openSession(); Object o2 =
			 * session2.get(Employee.class, new Integer(2)); Employee e2 = (Employee) o2;
			 * System.out.println(e2.getEmpno() + "  " + e2.getEmpname() + "  " +
			 * e2.getSal() + " " + e2.getEmpadd());
			 * System.out.println("Object is loaded successfully from Database");
			 * 
			 * try { Thread.sleep(6000); } catch (Exception exception) { }
			 * 
			 * Session session3 = factory.openSession(); Object o3 =
			 * session3.get(Employee.class, new Integer(2)); Employee e3 = (Employee) o3;
			 * System.out.println(e3.getEmpno() + "  " + e3.getEmpname() + "  " +
			 * e3.getSal() + " " + e3.getEmpadd());
			 * System.out.println("Object is loaded successfully from Global Cache");
			 * session3.close();
			 */
			 
		 
		 
		/* 
		 Employee emp=new Employee();
		 emp.setEmpname("abc");
		 emp.setSal(4000);
		 emp.setEmpadd("Bangalore");
		 
		 
	 session1.save(emp);*/
	 
	 
	 
			 

	}

}
