package test;

public class Car implements Valuable{
	String name;
	double price;
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public String toString(){
		return String.format("car name : MyCar\ninitial price: 5000.00");
		}
	public double EstimateValue (int month) {
		double a = 0;
		double b = 0;
		a = price - (price*20/100);
		b = (double)a - month*a*1/100;
		return b;
	}
}