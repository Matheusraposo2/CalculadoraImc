import javax.swing.JOptionPane;

public class imc {
	public static void main (String[] args) {
		String peso = JOptionPane.showInputDialog("Digite seu peso");
		String altura = JOptionPane.showInputDialog("Digite sua altura");
		
		double dPeso = Double.parseDouble(peso);
		double dAltura = Double.parseDouble(altura);
		double imc = (dPeso/(dAltura * dAltura));
		
		if(imc < 18.5) {
			
			JOptionPane.showMessageDialog(null, "Está abaixo do pesso");
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "Peso ideal");
		}
		
		else if(imc <=25 && imc <=29.9) {
			JOptionPane.showMessageDialog(null, "Está com sobre peso");
		}
		else if(imc >=30 && imc <= 34.9) {
			JOptionPane.showMessageDialog(null, "Obesidade grau 1");
		}
		else if(imc >= 35 && imc<=40) {
			JOptionPane.showMessageDialog(null,"Obesidade grau 2");
		}
		else if(imc > 40) {
			JOptionPane.showMessageDialog(null, "Obesidade grau 3");
		}
	}
}
