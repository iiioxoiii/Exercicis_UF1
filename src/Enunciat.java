public class Enunciat {
	
	 public void ex1(){
		 pinta("1.Crea un programa que solicite dos números y\n" +
                 "muestre su resta únicamente cuando el valor de\n"+
                 "la resta supere el valor 50");
	 }

	 public void ex2(){
	 	pinta("2.Modifica el programa anterior para que además de los\n" +
                "dos números a restar, se pida también el valor máximo que\n" +
                "puede alcanzar esa resta. (En lugar de ser el valor 50 como\n" +
                "en el ejercicio anterior, ese valor será pedido desde el programa.");
	 }

	 public void ex3(){
	 	pinta("3. Crea un programa parecido al anterior donde se muestre el\n" +
                "resultado de sumar dos números siempre y cuando la suma de ambos\n" +
                "sea inferior o igual a 15");
	 }

	 public void ex4(){
	 	pinta("Se requiere la realización de un programa que calcule el área de las siguientes figuras geométricas.\n" +
				"\n" +
				"a) Rectángulo\n" +
				"b) Cuadrado\n" +
				"c) Rombo\n");
	 }

	 public void ex5(){
		pinta("Crea un programa que permita decir, dados dos números por el usuario,\n" +
                "si son múltiplos el uno del otro.");
     }

     public void ex6() {
		pinta("6. Crea un programa que dados 4 números indique si los números son iguales\n" +
                "y cuál de ellos es el menor y mayor número de todos ellos. El programa además\n" +
                "deberá mostrar por pantalla el resultado de restar el mayor por el menor de ellos\n"+
                "y el resultado de  multiplicar los otros dos");
	 }

     public void ex7(){
	    pinta("7. Dados cinco números solicitados desde el programa por teclado, se mostrará la media\n" +
                "aritmética de esos números, el resultado de multiplicarlos todos y nos indicará si el\n" +
                "número mayor de ellos, es posible  que la resta del resto de números de positivo.");
     }

     public void ex8(){
        pinta("8. Crea un programa de dados dos números nos muestre los siguientes resultados:\n" +
                "a) Dividir el número mayor por el número menor.\n" +
                "b) Resta del número menor + 10 por el número mayor. Se mostrará el restultado siempre\n" +
                "y cuando la resta no de un valor negativo.\n" +
                "c) Elevar el número mayor a la potencia del número menor.");
     }

     public void ex9(){
         pinta("9. Indicar si tres números introducidos por teclado al inicio del programa, \n" +
                 "son divisibles por 2, 3, 5 y 10.");
     }

     public void ex10(){
         pinta("10. Cread un programa que permita introducir dos números y realizar una operación\n" +
                 "en base al número de código, 1 , 2 o 3 permita restar, multiplicar o dividir ambos\n" +
                 " números y mostrar el resultado por pantalla.");
     }


     public static void pinta (Object o) {
		System.out.println(o);
     }



}
