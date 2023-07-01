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
                 switch(moedas){
                    case "Reais para Dólares":
                        JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realDolar(valor));
                        Continuar();
                    break;

                    case "Reais para Euros":
                        JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realEuro(valor));
                    break;

                    case "Reais para Libras":
                        JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realLibras(valor));
                    break;

                    case "Reais para Yenes":
                        JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realYenes(valor));
                    break;

                    case "Reais para Won Coreano":
                        JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + ConversorDeMoeda.realWon(valor));
                    break;

                    case "Dólares para Reais":
                        JOptionPane.showMessageDialog(null, "O valor da conversão é de US$ " + ConversorDeMoeda.dolarReal(valor));
                    break;

                    case "Euros para Reais":
                        JOptionPane.showMessageDialog(null, "O valor da conversão é de e " + ConversorDeMoeda.euroReal(valor));
                    break;

                    case "Libras para Reais":
                        JOptionPane.showMessageDialog(null, "O valor da conversão é de e " + ConversorDeMoeda.librasReal(valor));
                    break;
                } 
            }  catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite caracteres númericos");
                telaValor(moedas);
        }
    }

    // public class telaResultado() {
    //     JOptionPane.show
    // }

    public void Continuar() {
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Opções", 1, 
                            JOptionPane.YES_NO_CANCEL_OPTION, null);
            if(escolha != 1 && escolha != 2) {
                telaMenu();
            }   else if (escolha == 1) {
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
            } else {
                  JOptionPane.showMessageDialog(null, "Programa Concluido");
            }
    }
}