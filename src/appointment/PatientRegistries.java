/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Morvana
 */
public class PatientRegistries {
    
    private ArrayList<Patient> patientList;
    
    public PatientRegistries() {
       this.patientList = new ArrayList<Patient>();
    }
    
    @Override
    public String toString() {
        return "This is the patient registries. It contains " + patientList.size() + " of patients";
    }
        
    public PatientRegistries add(Patient patient){
        this.patientList.add(patient);
        System.out.print( "Add a new Patient: " );
        //This line show us the point reference in memory
        System.out.println( Arrays.toString( patientList.toArray() ) );
        return this;
    }
    
    public boolean contains(Patient patient) {
        return this.patientList.contains(patient);
    }
    
    public PatientRegistries showList(Patient patient) {
        for(Patient pat: patientList) {
            System.out.println("Código: " + pat.getID());
            System.out.println("Paciente: " + pat.getName());
            System.out.println("Telefone do paciente: " + pat.getPhone());
            System.out.println("Endereço do paciente: " + pat.getAddress());
        }
        return this;
    }
}
