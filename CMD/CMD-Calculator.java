import java.util.Scanner;

public class Trechner {

	
	  public static double expo (double zahl1, double zahl2){
		    
		    double result = zahl1; 
		    
		    if (zahl2 == 0){
		      result = 1;
		    }
		    
		    for (int i = 1; i< zahl2; i++){
		      result *=zahl1;
		    }
		    
		    return result; 
		  
		  }
		  
	  	public static double rechneFakultaet (double zahl1) {
	  		
	  		double result = 1;
	  	
	  		
	  		for (double v=1; v<=zahl1; v++) {
	  			result *= v;
	  		}
	  	
	  		return result;
	  	
	  	}
	  
	  	 public static double Hoch2 (double zahl1){
			    
			    double result = zahl1; 
			    
			    if (2 == 0){
			      result = 1;
			    }
			    
			    for (int i = 1; i< 2; i++){
			      result *=zahl1;
			    }
			    
			    return result; 
			  
			  }
			  
	  	
	  	
	  	
	  	
	  
		public static void main (String [] args) {
			
		
				double zahl1;
				double zahl2;
				double Ergebnis;
				
				String i = null;
		
				Scanner leser = new Scanner(System.in);
					
				
				System.out.println("Welche Rechenoperation");
				System.out.println("Addition, Subtraktion, Division, Multiplikation, Fakultät, Quadratwurzel, Hoch2, Exponent");
		
				i = leser.next();
				
				String choice = i.substring(0);
				
				switch (choice)
				{
				case "Addition" : 
					System.out.println("Erster Wert");
					zahl1 = leser.nextDouble();
					System.out.println("Zweiter Wert");
					zahl2 = leser.nextDouble();
					Ergebnis = zahl1+zahl2;
					System.out.println("Ergebnis: " + Ergebnis);
					; break;
				
				case  "Subtraktion" :
					System.out.println("Erster Wert");
					zahl1 = leser.nextDouble();
					System.out.println("Zweiter Wert");
					zahl2 = leser.nextDouble();
					Ergebnis = zahl1-zahl2;
					System.out.println("Ergebnis: " + Ergebnis);
					; break;
				
				case "Division" :
					System.out.println("Erster Wert");
					zahl1 = leser.nextDouble();
					System.out.println("Zweiter Wert");
					zahl2 = leser.nextDouble();
					Ergebnis = zahl1/zahl2;
					System.out.println("Ergebnis: " + Ergebnis);
					; break;
				
				case "Multiplikation" :
					System.out.println("Erster Wert");
					zahl1 = leser.nextDouble();
					System.out.println("Zweiter Wert");
					zahl2 = leser.nextDouble();
					Ergebnis = zahl1*zahl2;
					System.out.println("Ergebnis: " + Ergebnis);
					; break;
				
				
				case "Exponent" :
					System.out.println("Erster Wert");
					zahl1 = leser.nextDouble();
					System.out.println("Zweiter Wert");
					zahl2 = leser.nextDouble();
					Ergebnis = expo(zahl1,zahl2);
					System.out.println("Ergebnis: " +expo(zahl1,zahl2));
					; break;
					
					
				case "Fakultät" :
					System.out.println("Fakultäten Wert");
					zahl1 = leser.nextDouble();
					Ergebnis = rechneFakultaet(zahl1);
					System.out.println("Ergebnis: " +rechneFakultaet(zahl1));
					; break;
					
					
				case "Hoch2" :
					System.out.println("Erster Wert");
					zahl1 = leser.nextDouble();
					Ergebnis = Hoch2(zahl1);  
					System.out.println("Ergebnis: " +Hoch2(zahl1));
					; break;
					
					
				case "Quadratwurzel" :	
					System.out.println("Erster Wert");
					zahl1 = leser.nextDouble();
					Ergebnis = Math.sqrt(zahl1);
					System.out.println("Ergebnis: " +Math.sqrt(zahl1));
					; break;
				
				case "Alle" :
					
					System.out.println("Erster Wert");
					zahl1 = leser.nextDouble();
					Ergebnis = Hoch2(zahl1);
					Ergebnis = Math.sqrt(zahl1);
					Ergebnis = rechneFakultaet(zahl1);
					
					System.out.println("Ergebnis Hoch2: " +Hoch2(zahl1));
					System.out.println("Ergebnis Quadratwurzel: " +Math.sqrt(zahl1));
					System.out.println("Ergebnis Fakultaet: " +rechneFakultaet(zahl1));
					; break;
				}	
					
				}
				
				}
				
				
		
		
