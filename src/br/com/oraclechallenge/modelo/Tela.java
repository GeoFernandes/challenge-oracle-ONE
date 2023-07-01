package br.com.oraclechallenge.modelo;

import javax.swing.JOptionPane;

public class Tela {
    public Object[] opcoesMenu = {"Conversor de Moeda", "Conversor de Temperatura"};
    public Object[] opcoesMoedas = {"Reais para Dólares", "Reais para Euros", "Reais para Libras", 
                "Reais para Yenes", "Reais para Won Coreano", "Dólares para Reais", "Euros para Reais", "Libras para Reais"};

    public void telaMenu() {
         Object menu = JOptionPane.showInputDialog(null, "Escolha uma opção" , 
                "Menu", JOptionPane.PLAIN_MESSAGE , null ,opcoesMenu,"");
        if(menu == opcoesMenu[0]){
            telaMoedas();
        }
    } 
 
    public void telaMoedas() {
        Object moedas = JOptionPane.showInputDialog(null, "Escolha uma opção" , "Moedas",
		    JOptionPane.PLAIN_MESSAGE , null ,opcoesMoedas,"");
            if (moedas == opcoesMoedas[0]) {
                JOptionPane.showMessageDialog(null, "Deu certo");
            }
    }
}
