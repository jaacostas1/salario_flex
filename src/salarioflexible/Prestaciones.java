package salarioflexible;

public class Prestaciones {

public int cesan, vacac, prima; 
	
	public void cal_pres(int n1, int n2) {
		
		cesan = n1 -  (n1 * n2)/100;
		vacac = n1 -  (n1 * n2)/100;				
		prima = (n1 -  (n1 * n2)/100)/2;
	}
	
}
	
	

