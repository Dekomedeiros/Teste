import javax.swing.JOptionPane;

public class Principal {

	
	
	public static void main(String[] args) {
		int opc = -1;
		opc = Integer.parseInt(JOptionPane.showInputDialog("MENU" + "\n\n" + "1) Cadastrar funcionário: "));
		
		if(opc == 1) {
			String nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do funcionário: "));
			int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o id do cliente: "));
			Funcionario f1 = new Funcionario(nome, idade, id);
			
			
		}
		
		
	}

}