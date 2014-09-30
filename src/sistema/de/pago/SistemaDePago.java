/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.de.pago;

/**
 *
 * @author T
 */
public class SistemaDePago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pago chamaco1=new Pago();
        Pago chamaco2;
        
       System.out.println(new Pago().hacerpago(30, 3000));
        System.out.println(chamaco1.hacerpago(10,20000));
    }
    
   
    }

