package Exercícios.Lista09.IntegraçãoCompleta.controle;

import Exercícios.Lista09.IntegraçãoCompleta.dominio.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static double calcularTotalImpostos(List<Tributavel> itensTributaveis) {
        double total = 0.0;
        for (Tributavel t : itensTributaveis) {
            total += t.calcularTributo();
        }
        return total;
    }

    public static void main(String[] args) {

        List<Tributavel> itensTributaveis = new ArrayList<>();

        itensTributaveis.add(new Eletronico(101, 2000.0)); 
        itensTributaveis.add(new Eletronico(102, 1500.0)); 

        double total = calcularTotalImpostos(itensTributaveis);
        System.out.println("Total de impostos a pagar: R$ " + total);
    }
}
