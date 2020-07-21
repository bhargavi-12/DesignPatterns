package Decorator.DecoratorDP;

public class Scar1 extends Cardecorator1 {

	public Scar1(Car1 c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}