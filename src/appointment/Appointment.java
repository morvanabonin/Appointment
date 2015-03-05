/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;

/**
 *
 * @author morvana.bonin
 */
public class Appointment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Medicine obj = new Medicine("Dorflex", "Sanofi", false);
        
        System.out.println("Testando");
		
        System.out.println("Iremos imprimir um medicamento: " + obj.getName() + " ele é do laboratorio: " + obj.getLaboratory());
        
    }
    
}
