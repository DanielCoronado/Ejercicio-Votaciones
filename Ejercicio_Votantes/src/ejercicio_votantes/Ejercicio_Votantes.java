/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_votantes;

/**
 *
 * @author danie
 */
public class Ejercicio_Votantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int votantes;
        votantes = (int)(Math.random()*(400)+100);
	char votaciones [][] = new char [2][votantes];
		
	//char votantes [][] = new char [2][(int) Math.random()*(400)+100];
		
	double hombres, mujeres;
	int aprobHombres=0, aprobMujeres=0, desaprobMujeres=0;
		
	for (int i=0;i<votantes;i++){
			
		hombres = Math.random();
		mujeres = Math.random();
			
		if (hombres<0.33){
			votaciones [0][i] = '1';
		}else{
			if (hombres<0.66){
				votaciones [0][i] = '0';
			}else{
				if (hombres<=1){
					votaciones [0][i] = 'n';
				}
			}
		}
			
		if (mujeres<0.33){
			votaciones [1][i] = '1';
		}else{
			if (mujeres<0.66){
				votaciones [1][i] = '0';
			}else{
				if (mujeres<=1){
					votaciones [1][i] = 'n';
				}
			}	
		}
	}
	for (int i=0;i<2;i++){
		for (int j=0; j<votantes;j++){
			if (votaciones[0][j]=='1'){
				aprobHombres = aprobHombres +1;
			}
			if (votaciones[1][j]=='1'){
				aprobMujeres = aprobMujeres +1;
			}
			if (votaciones [1][j]=='0'){
				desaprobMujeres = desaprobMujeres+1;
			}
		}
	}
	String cadena1 = "Cantidad de Hombres que aprueban la gestión: ";
		
	String cadena2 = "Cantidad de Mujeres que desaprueban la gestión: ";
		
	String cadena3 = "Porcentaje del total de encuestados que aprueban la gestion: ";
	double porcentaje = ((aprobHombres+aprobMujeres)*(100)/(2*votantes));
		
	String cadena4 = "Cantidad total de personas encuestadas: ";
	int total = (2*votantes);
		
	System.out.println(cadena1 + aprobHombres);
	System.out.println(cadena2 + desaprobMujeres);
	System.out.println(cadena3 + porcentaje + "%");
	System.out.println(cadena4 + total);
    }
    
}
