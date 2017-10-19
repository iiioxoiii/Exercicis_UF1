import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		menuPrincipal();

	}
	
	
	public static void menuPrincipal() {
		
		Boolean sortir = false;

		while (!sortir) {
		
			pinta("Tria l'exercici [1-10]:");
			pinta("Per sortir prem 0");
			Scanner sc = new Scanner (System.in);
			int op = sc.nextInt();
		
			switch (op) {
		
				case 0: sortir = true;
					break;
				case 1: ex1();
                	break;
				case 2:	ex2();
               		break;
				case 3:	ex3();
        			break;
				case 4: ex4();
            		break;
				case 5:	ex5();
           			break;
				case 6:	ex6();
    				break;
				case 7: ex7();
            		break;
				case 8:	ex8();
           			break;
				case 9:	ex9();
    				break;
        		case 10: ex10();
        			break;
        	
        		default: 
        			pinta("Opció triada no es correcte");
        		break;
			}
		}
		pinta("by");
	}
		
	public static void ex1() {
		Enunciat i = new Enunciat();
		i.ex1();
		Formules f = new ImplFormules();
		Integer [] e = f.demanaDosEnters();
		pinta(f.valorSupera50(e[0],e[1]));
	}

	public static void ex2() {
		Enunciat i = new Enunciat();
		i.ex2();
		Formules f = new ImplFormules();
		Integer [] t = f.demanaTresEnters();
		pinta(f.valorSuperaNum(t[0],t[1],t[2]));

	}	
	
	public static void ex3() {
		Enunciat i = new Enunciat();
		i.ex3();
		Formules f= new ImplFormules();
		Integer [] t = f.demanaDosEnters();
		pinta(f.sumaMax15(t[0],t[1]));
	}
	
	public static void ex4() {
		Enunciat i = new Enunciat();
		i.ex4();
		Formules f = new ImplFormules();
		Double [] t = f.demanaDosDoubles();
		pinta("area rectangl: "+ f.areaRectanguloCuadrado(t[0],t[1]));
		pinta("area rombo:" + f.areaRombo(t[0],t[1]));
	}
	
	public static void ex5() {
		Enunciat i = new Enunciat();
		i.ex5();
		Formules f = new ImplFormules();
		Integer [] t = f.demanaDosEnters();
		pinta(f.sonMultiplos(t[0],t[1]));
	}
		
	public static void ex6() {
		Enunciat i = new Enunciat();
		i.ex6();
		Formules f = new ImplFormules();
		Integer [] t = f.demanaQuatreEnters();

		pinta("Son iguals?: "+ f.sonIguales(t));

		Integer max= f.elMesGranDeQuatre(t);
		Integer min= f.elMesPetitDeQuatre(t);

		pinta("max: "+ max);
		pinta("min: "+ min);

		pinta("resta :"+ f.resta(max, min));

	}
	
	public static void ex7() {
		Enunciat i = new Enunciat();
		i.ex7();
		Formules f = new ImplFormules();
		Double [] a = f.demanaCincDoubles();
		pinta(f.media(a));
		pinta(f.multiplicaCinco(a));
	}
	
	public static void ex8() {
		Enunciat i = new Enunciat();
		i.ex8();
		Formules f = new ImplFormules();

	}
	
	public static void ex9() {
		Enunciat i = new Enunciat();
		i.ex9();
		Formules f = new ImplFormules();
		Double [] a = f.demanaDosDoubles();
		pinta(f.division(a[0],a[1]));
		pinta(f.resta10(a[0],a[1]));

	}
	
	public static void ex10() {
		Enunciat i = new Enunciat();
		i.ex10();
		Formules f = new ImplFormules();
		Double [] dd = f.demanaDosDoubles();
		f.tresOperacions(dd);
	}

	public static void pinta(Object o){
		System.out.println(o);
	}


}
