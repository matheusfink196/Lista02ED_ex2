package view;
import javax.swing.JOptionPane;
import controller.SubtController;
public class Principal {
	public static void main(String args[]) {
		SubtController subCont = new SubtController();
		
		int na = Integer.parseInt(JOptionPane.showInputDialog("digite valor de A "));
		int nb = Integer.parseInt(JOptionPane.showInputDialog("digite valor de B"));
				
		int resul = subCont.divisao(na, nb);
		System.out.println("resto da divisão : "+resul);
	}
}
