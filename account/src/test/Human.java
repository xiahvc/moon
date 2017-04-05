package test;

public class Human implements Valuable {
	int age;
	String name;
public Human(String name,int age) {
			this.name=name;
			this.age=age;
}
public String toString(){
	return String.format("Human name : Mark\nregitstered age : 20");
	}
public double EstimateValue (int month) {
	return Double.POSITIVE_INFINITY;
}
}