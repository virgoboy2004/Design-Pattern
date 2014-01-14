package design.pattern.vistor;

import design.pattern.vistor.interfaces.IVisitable;
import design.pattern.vistor.interfaces.IVisitor;

public class ProductManager implements IVisitable {

	public Double salary;
	
	public ProductManager(Double salary){
		this.salary = salary;
	}
	
	@Override
	public void accept(IVisitor vistor) {
		vistor.visit(this);
	}
	
}
