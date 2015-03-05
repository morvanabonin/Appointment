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
public class Medicine {
    
    private String name;
    private String laboratory;
    private boolean generic;
    
    public Medicine(String name, String laboratory, boolean generic) throws Exception {
        this.setName(name);
        this.setLaboratory(laboratory);
        this.setGeneric(generic);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(! name.isEmpty()) {
            this.name = name;
        } else {
            throw new Exception ("Name cannot be empty");
        }
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) throws Exception {
        if(! laboratory.isEmpty()) {
            this.laboratory = laboratory;
        } else {
            throw new Exception ("Laboratory cannot be empty");
        }
    }

    public boolean isGeneric() {
        return generic;
    }

    public void setGeneric(boolean generic) {
        this.generic = generic;
    }
    
}
