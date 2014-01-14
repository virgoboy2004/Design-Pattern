package design.pattern.vistor;

import design.pattern.vistor.interfaces.IVisitable;
import design.pattern.vistor.interfaces.IVisitor;

public class Developer implements IVisitable{
	
	public Double salary;

	public Developer(Double base) {
		
		this.salary = base;
	}

	public void accept(IVisitor vistor) {
		vistor.visit(this);
	}

}
