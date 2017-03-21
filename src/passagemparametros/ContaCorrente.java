/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagemparametros;

/**
 *
 * @author JBP1996 Atec
 */
public class ContaCorrente {
    private static float dinheiroTotal;
    private float saldo; 
    private String nome;
    
    public ContaCorrente (String nome) {
        this.nome = nome;
        saldo = 0;
    }

    public static float getDinheiroTotal() {
        return dinheiroTotal;
    }

    public static void setDinheiroTotal(float dinheiroTotal) {
        ContaCorrente.dinheiroTotal = dinheiroTotal;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public ContaCorrente (String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }


    
    float verificaSaldo ( ) {
    return saldo;
    }
    void depositaValor (float valor) { 
        saldo = saldo + valor; 
        dinheiroTotal += valor;
    }
    void retiraValor (float valor) {
        if (saldo>=valor) {
            saldo = saldo-valor;
            dinheiroTotal -= valor;
        }
    }
}
