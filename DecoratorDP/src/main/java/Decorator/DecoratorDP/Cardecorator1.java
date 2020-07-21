package Decorator.DecoratorDP;

public class Cardecorator1 implements Car1 {

	protected Car1 car;
	
	public Cardecorator1(Car1 c){
		this.car=c;
	}
	public void assemble() {
		this.car.assemble();
	}
	public void assemble1() {
		// TODO Auto-generated method stub
		
	}
	public void assemble2() {
		// TODO Auto-generated method stub
		
	}

}