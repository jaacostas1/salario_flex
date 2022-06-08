package salarioflexible;

public class Deducciones {

	public int  flex;
	       double val_salud, val_pension;
	
public void cal_ded(int n1, int n2) {
		flex = (n1 * n2)/100;
		val_salud = (n1 - flex) * 0.08;
		val_pension   = (n1 - flex) * 0.08;		
	
}
}
