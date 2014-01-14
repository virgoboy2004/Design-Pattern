package design.pattern.vistor;

import design.pattern.vistor.interfaces.IVisitor;

public class Visitor implements IVisitor {

	public void visit(Developer developer) {
		developer.salary = developer.salary * (1 + .08);
	}
	
	
	public void visit(ProductManager pm){
		pm.salary = pm.salary * (1 + .2);
	}

}
