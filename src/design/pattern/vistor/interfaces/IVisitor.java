package design.pattern.vistor.interfaces;

import design.pattern.vistor.Developer;
import design.pattern.vistor.ProductManager;

public interface IVisitor {
	
	public void visit(Developer developer);

	public void visit(ProductManager pm);

}
