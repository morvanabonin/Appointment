/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;

import java.util.ArrayList;

/**
 *
 * @author Morvana
 */
public class RegistrationMedicines {
    
    private ArrayList<Medicine> medicideList;
    
    public RegistrationMedicines() {
       this.medicideList = new ArrayList<Medicine>();
    }
    
    @Override
    public String toString() {
        return "This list contains " + medicideList.size() + " of medicine";
    }
    
    public RegistrationMedicines add(Medicine medicine){
        this.medicideList.add(medicine);
        return this;
    }
    
    public boolean contains(Medicine medicine) {
        return this.medicideList.contains(medicine);
    }
    
    public RegistrationMedicines showList(Medicine medicine) {
        for(Medicine med: medicideList) {
            System.out.println("Código: " + med.getCode());
            System.out.println("Medicamento: " + med.getName());
            System.out.println("Descrição do medicamento: " + med.getDescription());
        }
        return this;
    }
}
