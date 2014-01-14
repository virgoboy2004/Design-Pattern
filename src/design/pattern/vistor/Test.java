package design.pattern.vistor;

import java.util.logging.Logger;

public class Test {
	public static Logger logger = Logger.getLogger(Test.class.getName());
	
	
	public static void main(String[] args) {
		Developer developer = new Developer(100000.0);
		
		ProductManager pm = new ProductManager(150000.0);
		
		Visitor vistor = new Visitor();

		logger.info("Visiting developer's salary");
		developer.accept(vistor);
		

		logger.info("Visiting product manager's salary");
		pm.accept(vistor);
		
		System.out.println(developer.salary);
		
		System.out.println(pm.salary);
		
		
		
		
		
		
		
	}

}
