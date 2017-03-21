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
public class TestaPassagemParametros {
    public static void trocaValorPrimitivo (int num){
        num = num +6;
    }
    
    public static void trocaValorObjeto (ContaCorrente minhaConta){
        minhaConta.setSaldo(300);
    }
    
    public static void trocaReferenciaObjeto (ContaCorrente minhaConta){
        minhaConta = new ContaCorrente ("Mulher Maravilha", 200);
    }
} // da classe
