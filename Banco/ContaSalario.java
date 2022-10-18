package Banco;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaSalario  extends Conta{


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void imprimirExtrastoDEtalhado() {
        System.out.println("EXTRATO DETALHADO DE CONTA POUPANÇA");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("DATA: " + sdf.format(agora));
        System.out.println("SALDO: " + this.getSaldo());
       // System.out.println("ANIVERSÁRIO: " + this.diaDoAniversario);
    }
}
