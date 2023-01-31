package br.com.senai.java.sa1aplicacao5;

import javax.swing.JOptionPane;

import br.com.senai.java.sa1app04.PessoaBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Empresa Voe, Grupo Empresarial");
		
		PessoaBO tbo = new PessoaBO();
		
		String resp=JOptionPane.showInputDialog("Informe o primeiro mês:");
		String resp1=JOptionPane.showInputDialog("Informe o segundo mês:");
		String resp2=JOptionPane.showInputDialog("Informe o terceiro mês:");
		
		double valorMes1 = Double.parseDouble(resp);
		double valorMes2 = Double.parseDouble(resp1);
		double valorMes3 = Double.parseDouble(resp2);
	
		JOptionPane.showMessageDialog(null, "Resultado dos trimestre: " + "\n" + String.format("%.2f", tbo.calcularMedia(valorMes1, valorMes2, valorMes3) ));
		
		

	}

}
