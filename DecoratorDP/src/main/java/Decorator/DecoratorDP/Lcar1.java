package Decorator.DecoratorDP;

public class Lcar1 extends Cardecorator1 {

	public Lcar1(Car1 c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}