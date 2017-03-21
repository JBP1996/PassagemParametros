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
public class PassagemParametros {

    /**
     * @param args the command line arguments
     */
    public static void main (String args []){ 
        int val = 11; 
        TestaPassagemParametros.trocaValorPrimitivo (val);
        System.out.println ("val = "+val);

        ContaCorrente minhaConta = new ContaCorrente ("SuperHomem"); 
        System.out.println (minhaConta.getSaldo());

        TestaPassagemParametros.trocaValorObjeto (minhaConta); 
        System.out.println (minhaConta.getSaldo());

        TestaPassagemParametros.trocaReferenciaObjeto (minhaConta); 
        System.out.println (minhaConta.getNome()); 
    }
    
}
