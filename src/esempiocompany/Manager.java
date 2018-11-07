package esempiocompany;
public class Manager extends Employee {
	
	// classe derivata o sotto-classe (più specifica)
	// classe Manager estende la classe Employee
	// eredita attributi e metodi
	// può ridefinire metodi esistenti o aggiungerne di nuovi
	// può aggiungere nuovi attributi
	
	//String name; --> ereditati
	//double wage;
	
	String managedUnit;
	
	public Manager(String name, double wage, String managedUnit)
	{
		super(name, wage);
		//this.name = name;
		//this.wage = wage;
		this.managedUnit = managedUnit;
	}
	
	// OVERRIDING, metodo con stesso nome ma corpo diverso
	public void incrementWage()
	{
		wage+=500000;
	}
	
	public void changeUnit(String newUnit)
	{
		managedUnit=newUnit;
	}
	
	public String toString()
	{
		return ""+name+" "+wage+" "+managedUnit;
	}
	
}
