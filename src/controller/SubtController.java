/*Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
subtrações, exiba o resto da divisão.*/

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
