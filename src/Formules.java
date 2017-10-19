public interface Formules {
	
	/*1. Crea un programa que solicite dos números y 
	 * muestre su resta únicamente cuando el valor de 
	 * la resta supere el valor 50.*/
	Integer valorSupera50(Integer a, Integer b);
	
	/*2. Modifica el programa anterior para que 
	 * además de los dos números a restar, se pida también
	 * el valor máximo que puede alcanzar esa resta.
	 * (En lugar de ser el valor 50 como en el ejercicio
	 * anterior, ese valor será pedido desde el programa.*/
	Integer valorSuperaNum(Integer a, Integer b, Integer c);
	
	/*3. Crea un programa parecido al anterior donde se muestre
	 * el resultado de sumar dos números siempre y cuando la suma
	 * de ambos sea inferior o igual a 15.*/
	Integer sumaMax15(Integer a, Integer b);
	
	/* 4. Se requiere la realización de un programa que calcule 
	 * el área de las siguientes figuras geométricas: a) Rectángulo
	b) Cuadrado c) Rombo */
	Double areaRectanguloCuadrado(Double a, Double b);
	Double areaRombo(Double a, Double b);
	
	/*5. Crea un programa que permita decir, dados dos números por el
	 * usuario, si son múltiplos el uno del otro.*/
	Boolean sonMultiplos(Integer a, Integer b);
	
	/*6. Crea un programa que dados 4 números indique si los números
	 * son iguales y cuál de ellos es el menor y mayor número de todos
	 * ellos. El programa además deberá mostrar por pantalla el resultado
	 * de restar el mayor por el menor de ellos y el resultado de
	 * multiplicar los otros dos.*/
	Boolean sonIguales(Integer[] a);
	Integer elMesGranDeQuatre(Integer[] a);
	Integer elMesPetitDeQuatre(Integer[] a);
	Integer multiplicaDosInter(Integer[] a);

	Integer restar(Integer a, Integer b);
	Integer multiplica(Integer a, Integer b);



	/*7. Dados cinco números solicitados desde el programa por teclado,
	 * se mostrará la media aritmética de esos números, el resultado de
	 * multiplicarlos todos y nos indicará si el número mayor de ellos,
	 * es posible  que la resta del resto de números de positivo.*/	
	Double media(Double a[]);
	Double multiplicaCinco(Double a[]);
	
	/*8. Crea un programa de dados dos números nos muestre los siguientes 
	 * resultados:
		a) Dividir el número mayor por el número menor.
		b) Resta del número menor + 10 por el número mayor. Se mostrará el 
		restultado siempre y cuando la resta no de un valor negativo.
		c) Elevar el número mayor a la potencia del número menor. */
	Double division(Double a, Double b);
	Double resta10(Double a, Double b);
	Double potenciaMenor(Double a, Double b);
	
	/*9. Indicar si tres números introducidos por teclado al inicio del 
	 * programa, son divisibles por 2, 3, 5 y 10.*/
	void esDivisible(Integer a, Integer b, Integer c);
	
	/* 10. Cread un programa que permita introducir dos números y realizar
	 * una operación en base al número de código, 1 , 2 o 3 permita restar,
	 * multiplicar o dividir ambos números y mostrar el
	 * resultado por pantalla.
	 */
	void tresOperacions(Double a[]);


	Double divideix(Double a, Double b);
	
	Double resta(Double a, Double b);

	Integer resta(Integer a, Integer b);

	Double multiplica(Double a, Double b);

	Integer[] demanaQuatreEnters();
	
	Integer[] demanaTresEnters();
	
	Integer [] demanaDosEnters();

	Double[] demanaDosDoubles();

	Double[] demanaCincDoubles();

}
