package salarioflexible;

public class Salario {

	public int salario, flexi; 
	
	public void cal_salario(int n1, int n2) {
		
		salario = n1;
		flexi   = n1 -  (n1 * n2)/100;				
		
	}
	
}
