/*Criar uma fun��o recursiva que receba o dividendo e o divisor de uma opera��o de divis�o e, por
subtra��es, exiba o resto da divis�o.*/

package controller;

public class SubtController {
	public SubtController() {
		super();
	}
	public int divisao(int a, int b) {
		if (b > a) {
			return a;			
		} else {
			a = divisao(a-b,b);
		}
		return a;	
	}
}
