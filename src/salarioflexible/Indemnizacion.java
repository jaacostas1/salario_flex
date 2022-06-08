package salarioflexible;

public class Indemnizacion {

	public int  sal_dia, valor_ind, ano_may, sal_ano_may; 
    
public void cal_ind(int n1, int n2) {
	sal_dia = n1 / 30;
	
	if (n2 == 1) {
		valor_ind = n1;}
	else {
		ano_may = n2 -1;
		sal_ano_may = sal_dia * 20;
		valor_ind = n1 + (sal_ano_may * ano_may);
	}}}

		
	

