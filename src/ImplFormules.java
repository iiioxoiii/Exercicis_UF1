import java.util.Arrays;
import java.util.Scanner;

public class ImplFormules implements Formules {

	/*1. Crea un programa que solicite dos números y 
	 * muestre su resta únicamente cuando el valor de 
	 * la resta supere el valor 50.*/
	public Integer valorSupera50(Integer a, Integer b) {
		Integer s = null;
		a = a-b;
		if(a >= 50) {
			s=a;
		}
		return s;
	}
	
	/*2. Modifica el programa anterior para que 
	 * además de los dos números a restar, se pida también
	 * el valor máximo que puede alcanzar esa resta.
	 * (En lugar de ser el valor 50 como en el ejercicio
	 * anterior, ese valor será pedido desde el programa.*/
	public Integer valorSuperaNum(Integer a, Integer b, Integer c) {
		Integer s = null;
		a = a-b;
		if(a <= c) {
			s=a;
		}
		return s;
	}

	/*3. Crea un programa parecido al anterior donde se muestre
	 * el resultado de sumar dos números siempre y cuando la suma
	 * de ambos sea inferior o igual a 15.*/
	public Integer sumaMax15(Integer a, Integer b) {
		a=a+b;
		if ( a <= 15){
		}else{
			a=null;
		}
		return a;
	}

	/* 4. Se requiere la realización de un programa que calcule 
	 * el área de las siguientes figuras geométricas: a) Rectángulo
	b) Cuadrado c) Rombo */
	public Double areaRectanguloCuadrado(Double a, Double b) {
		a = a*b;
		return a;
	}

	public Double areaRombo(Double a, Double b) {
		a=(a*b)/2;
		return a;
	}

	/*5. Crea un programa que permita decir, dados dos números por el
	 * usuario, si son múltiplos el uno del otro.*/
	public Boolean sonMultiplos(Integer a, Integer b) {
		Boolean s = false;
		if( ((a%b)==0) || ((b%a)==0)) {
			s=true;
		}
		return s;
	}

	
	/*6. Crea un programa que dados 4 números indique si los números
	 * son iguales y cuál de ellos es el menor y mayor número de todos
	 * ellos. El programa además deberá mostrar por pantalla el resultado
	 * de restar el mayor por el menor de ellos y el resultado de
	 * multiplicar los otros dos.*/

	public Boolean sonIguales(Integer a[]) {
		Boolean s = false;
		if ((a[0].equals(a[1])) && (a[1].equals(a[2])) && (a[2].equals(a[3])) ){
			s=true;
		}
		return s;
	}

	public Integer elMesGranDeQuatre(Integer a[]) {
		Arrays.sort(a);
		return a[3];
	}

	public Integer elMesPetitDeQuatre(Integer a[]) {
		Arrays.sort(a);
		return a[0];
	}

	public Integer multiplicaDosInter(Integer a[]) {
		Arrays.sort(a);
		return a[1]*a[2];

	}

	public Integer restar(Integer a, Integer b) {
		a = a-b;
		return a;
	}

	public Integer multiplica(Integer a, Integer b) {
		a = a*b;
		return a;
	}

	/*7. Dados cinco números solicitados desde el programa por teclado,
	 * se mostrará la media aritmética de esos números, el resultado de
	 * multiplicarlos todos y nos indicará si el número mayor de ellos,
	 * es posible  que la resta del resto de números de positivo.*/
	public Double media(Double a[]) {
		Double s;
		s = (a[0]+a[1]+a[2]+a[3]+a[4])/5;
		return s;
	}

	public Double multiplicaCinco(Double a[]) {
		Double s;
		s = a[0]*a[1]*a[2]*a[3]*a[4];
		return s;
	}

	/*8. Crea un programa de dados dos números nos muestre los siguientes 
	 * resultados:
		a) Dividir el número mayor por el número menor.
		b) Resta del número menor + 10 por el número mayor. Se mostrará el 
		restultado siempre y cuando la resta no de un valor negativo.
		c) Elevar el número mayor a la potencia del número menor. */
	
	public Double division(Double a, Double b) {
		if (a >= b) {
			a=a/b;
		}else {
			a=b/a;
		}
		return a;
	}
	
	public Double resta10(Double a, Double b) {
		Double s = null;
		if (a >= b) {
			b = b+10;
			if ((a-b) >= 0) {
				s = a-b;
			}
		}
		return s;
	}
	
	public Double potenciaMenor(Double a, Double b) {
		if(a > b) {
			a = Math.pow(a, b);
		}else {
			a = Math.pow(b, a);
		}
		return a;
	}

	/*9. Indicar si tres números introducidos por teclado al inicio del 
	 * programa, son divisibles por 2, 3, 5 y 10.*/
	public void esDivisible(Integer a, Integer b, Integer c) {
		int v[] = {2,3,5,10};
		int [] w = {a,b,c};
		
		for (int x=0; x < w.length;x++) {
			for (int i=0;i < v.length; i++) {
				if ((w[x]%v[i])== 0) {
					pinta(w[x]+"es divisible entre" + v[i]);
				}else {
					System.out.println(w[x]+"no es divisible entre" + v[i]);
				}
			}
		}
	}

	/* 10. Cread un programa que permita introducir dos números y realizar
	 * una operación en base al número de código, 1 , 2 o 3 permita restar,
	 * multiplicar o dividir ambos números y mostrar el
	 * resultado por pantalla.
	 */
	public void tresOperacions(Double ii[]) {
		
		Scanner sc = new Scanner(System.in);
		
		pinta("1) a-b");
		pinta("2) a/b");
		pinta("3) a*b");
		pinta("Escriu la opcio i prem intro:");
		int op = sc.nextInt();
		
		switch (op) {
        	case 1: pinta(resta(ii[0],ii[1]));
                break;
        	case 2:	pinta(divideix(ii[0],ii[1]));
               	break;
        	case 3:	pinta(multiplica(ii[0],ii[1]));
        		break;
        	default: 
        		pinta("Cap de les opcions es correcte");
        		break;
		}
	}
	
	public Double divideix(Double a, Double b) {
		a = a/b;
		return a;
	}
	
	public Double resta(Double a, Double b) {
		a = a - b;
		return a;
	}

	public Integer resta(Integer a, Integer b) {
		a = a - b;
		return a;
	}
	
	public Double multiplica(Double a, Double b) {
		a = a*b;
		return a;
	}
	
	public Double[] demanaDosDoubles() {
		Double [] a = new Double[2];
		Scanner sc = new Scanner (System.in);
		pinta("Escriu el primer enter:");
		a[0] = sc.nextDouble();
		pinta("Escriu el segon enter:");
		a[1] = sc.nextDouble();
		return a;
	}

	 
	public Integer [] demanaDosEnters() {
		Integer[] a = new Integer[2];
		Scanner sc = new Scanner (System.in);
		pinta("Escriu el primer enter:");
		a[0] = sc.nextInt();
		pinta("Escriu el segon enter:");
		a[1] = sc.nextInt();
		return a;
	}
	
	
	public Integer [] demanaTresEnters() {
		Integer[] a = new Integer[3];
		Scanner sc = new Scanner (System.in);
		pinta("Escriu el primer enter:");
		a[0] = sc.nextInt();
		pinta("Escriu el segon enter:");
		a[1] = sc.nextInt();
		pinta("Escriu el tercer enter:");
		a[2] = sc.nextInt();
		return a;
	}


	public Integer[] demanaQuatreEnters() {
		Integer[] a = new Integer[4];
		Scanner sc = new Scanner (System.in);
		pinta("Escriu el primer enter:");
		a[0] = sc.nextInt();
		pinta("Escriu el segon enter:");
		a[1] = sc.nextInt();
		pinta("Escriu el tercer enter:");
		a[2] = sc.nextInt();
		pinta("Escriu el quart enter:");
		a[3] = sc.nextInt();
		return a;
	}

	public Double[] demanaCincDoubles(){
		Double[] a = new Double[5];
		Scanner sc = new Scanner (System.in);
		pinta("Escriu el primer decimal:");
		a[0] = sc.nextDouble();
		pinta("Escriu el segon decimal:");
		a[1] = sc.nextDouble();
		pinta("Escriu el tercer decimal:");
		a[2] = sc.nextDouble();
		pinta("Escriu el quart decimal:");
		a[3] = sc.nextDouble();
		pinta("Escriu el cinquè decimal:");
		a[4] = sc.nextDouble();
		return a;
	}

	public static void pinta(Object o) {
		System.out.println(o);
	}

}