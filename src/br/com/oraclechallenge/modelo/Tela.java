package br.com.oraclechallenge.modelo;

import javax.swing.JOptionPane;

public class Tela {
    public Object[] opcoesMenu = {"Conversor de Moeda", "Conversor de Temperatura"};
    public Object[] opcoesMoedas = {"Reais para Dólares", "Reais para Euros", "Reais para Libras", 
                "Reais para Yenes", "Reais para Won Coreano", "Dólares para Reais", "Euros para Reais", "Libras para Reais"};

    public void telaMenu() {
         Object menu = JOptionPane.showInputDialog(null, "Escolha uma opção" , 
                "Menu", JOptionPane.PLAIN_MESSAGE , null ,opcoesMenu,""); 
        if(menu == opcoesMenu[0]) telaMoedas();   
    } 
 
    public void telaMoedas() {
        String moedas =(String) JOptionPane.showInputDialog(null, "Escolha uma opção" , "Moedas",
		    JOptionPane.PLAIN_MESSAGE , null ,opcoesMoedas,"");   
            telaValor(moedas);
    }

    public void telaValor(String moedas) {
         try {
                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
         }  catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite caracteres númericos");
                telaMoedas();
            }

         switch(moedas){
            case "Reais para Dólares":
                JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realDolar(valor));
            break;

            case "Reais para Euros":
                double euros = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
                JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realEuro(euros));
            break;

            case "Reais para Libras":
                double libras = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
                JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realLibras(libras));
            break;

            case "Reais para Yenes":
                double yenes = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
                JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realYenes(yenes));
            break;

            case "Reais para Won Coreano":
                double won = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
                JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realWon(won));
            break;

            case "Dólares para Reais":
                double reaisDolar = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
                JOptionPane.showMessageDialog(null, "O valor da conversão é de US$ " + ConversorDeMoeda.dolarReal(reaisDolar));
            break;

            case "Euros para Reais":
                double reaisEuros = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
                JOptionPane.showMessageDialog(null, "O valor da conversão é de e " + ConversorDeMoeda.euroReal(reaisEuros));
            break;

             case "Libras para Reais":
                double reaisLibras = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
                JOptionPane.showMessageDialog(null, "O valor da conversão é de e " + ConversorDeMoeda.librasReal(reaisLibras));
            break;
        } 
        
    }

    // public class telaResultado() {
    //     JOptionPane.show
    // }
    
}