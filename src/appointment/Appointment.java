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
         Patient objP = new Patient("José Ferreira", "02-02-1989", "Masculino");
                
        System.out.println("Testando");
	System.out.println("Iremos imprimir um medicamento: " + obj.getName() + " ele é do laboratorio: " + obj.getLaboratory());
        System.out.println("Iremos imprimir um paciente de nome: " + objP.getName() + " data de nascimento: " + objP.getBirth_date() + " do sexo " + objP.getGender());
        
       
        
    }
    
}
