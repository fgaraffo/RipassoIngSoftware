package esempiocompany;

/**
 * Classe che rappresenta un impiegato dell'azienda * 
 */

public class Employee {
	
	// classe di base o super-classe (più generale)
	
	public String name;
	public double wage;
	
	/** Metodo per costruire un Employee
	 *  @param name Nome dell'impiegato
	 *  @param wage Paga dell'impiegato
	 */	
	
	public Employee(String name, double wage) {
		//super();
		this.name = name;
		this.wage = wage;
	}
	
	
	/** Metodo per incrementare la paga
	 *  
	 */
	
	public void incrementWage()
	{
		wage += 500;
	}
	
	public String toString()
	{
		return ""+name+" "+wage;
	}
	
	public boolean equals (Object other)
	{
		Employee otherEmployee = (Employee) other; // CASTING
		if (otherEmployee.wage==this.wage && otherEmployee.name.equals(this.name))
			return true;
		else
			return false;
		
	}
	
	
}
