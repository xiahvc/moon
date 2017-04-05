package test;

public class ValuableTest {
	public static void main(String args[]){
		Checkingaccount a = new Checkingaccount(100,50,0.01,0.07);
		SavingAccount b = new SavingAccount(100,0.05);
		Human c = new Human("Mark",20);
		Car d = new Car("MyCar",5000);
		Valuable[] objectList=new Valuable[4];
		objectList[0] = a;
		objectList[1] = b;
		objectList[2] = (Valuable) c;
		objectList[3] = (Valuable) d;
		
		for(Valuable objectItem : objectList) {
			System.out.printf("%s \n",objectItem.toString());
			System.out.printf("6 month later Valuable : %.2f\n\n",objectItem.EstimateValue(6));
		}
	}
}