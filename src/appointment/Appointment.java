/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author morvana.bonin
 */
public class Appointment {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        int option = -1;
        
        do {

            System.out.println("Menu: ");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Listar Paciente");
            System.out.println("0 - Sair");
            
            try {

                option = Console.scanInt("Digite a opção desejada: ");
                System.out.println(option);
                
                PatientRegistries patientList = new PatientRegistries();
                RegistrationMedicines medicineList = new RegistrationMedicines();

                switch(option) {

                    case 1:
                        System.out.println("Cadastrando Pacientes e Listando Pacientes");
                        String name = Console.scanString("Nome: ");
                        String phone = Console.scanString("Telefone: ");
                        String address = Console.scanString("Endereço: ");
                        Patient patient = new Patient(name, phone, address); 
                        patientList.add(patient);
                        patientList.showList(patient);
                    break;
                    case 2:
                        System.out.println("Cadastrando Medicamentos e Listando Medicamentos");
                        String nameMed = Console.scanString("Nome: ");
                        String description = Console.scanString("Descrição: ");
                        Medicine medicine = new Medicine(nameMed, description);
                        medicineList.add(medicine);
                        medicineList.showList(medicine);
                    break;
                    case 0:
                        System.out.println("Finalizando a aplicação");
                    break;
                    default:
                        System.out.println("Opção Inválida");
                }

            } catch(InputMismatchException e) {
                e.getMessage();
                System.out.println("Tipo de dado inválido");
            }

        } while(option != 0);
 
    }
    
}
