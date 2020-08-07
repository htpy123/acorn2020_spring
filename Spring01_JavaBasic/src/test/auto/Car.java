package test.auto;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		if(engine==null) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
	}
}
