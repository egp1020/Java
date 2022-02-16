
package SoftwareClass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raad_
 */
public class Company {
    private String businessName;
    private String address;
    private int nit;
    private Customers customers = new Customers();
    private Employees employees = new Employees();
    private ArrayList<Company> listCompany = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public Company() {
    }

    public Company(String businessName, String address, int nit, Employees employees) {
        this.businessName = businessName;
        this.address = address;
        this.nit = nit;
        this.employees = employees;
        this.customers = customers;
        this.listCompany = listCompany;
    }
    
    public void createCompany(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese el nombre de la compañía a crear: ");
            String nombre = input.nextLine();
            System.out.print(" Ingrese la dirección de la compañía a crear: ");
            String direccion = input.nextLine();
            System.out.print(" Ingrese el nit de la compañía a crear: ");
            int id = input.nextInt();
            
            System.out.println(" •----------------------------------------------•");
            System.out.println("           Información del empleado ");
            System.out.println(" •----------------------------------------------•");
            employees.createEmployee();
            
            System.out.println("¿La empresa tiene clientes? [si/no]: ");
            String answer = input.next();
            
            if(answer.equals("si")){
                System.out.println(" •----------------------------------------------•");
                System.out.println("           Información del cliente ");
                System.out.println(" •----------------------------------------------•");
                customers.createCustomers();
            }
            
            Company company = new Company(nombre, direccion, id, employees);
            this.listCompany.add(company);
            setListCompany(getListCompany());
            
            System.out.print(" ¿Desea crear otra compañía? [si/no]: ");
            option = input.nextLine();
            System.out.println("");
        }
        
    }
    
    public void readCompany(){
        System.out.print(" Ingrese el nit de la compañía que desea listar: ");
        int id = input.nextInt();
        
        getListCompany().forEach(objeto -> {
            if(objeto.nit == id){
                System.out.println(" Los datos de la compañía son: ");
                System.out.println("Nombre: "+objeto.getBusinessName());
                System.out.println("Dirección: "+objeto.getAddress());
                System.out.println("NIT: "+objeto.getNit());
                System.out.println("Empleado: "+objeto.getEmployees().getName());
            }else{
                System.out.println(" La companía ingresada no se encuentra.");
            }
            
        });
    }
    
    public void readAllCompany(){
        getListCompany().forEach(objeto -> {
            System.out.println("Nombre: "+objeto.getBusinessName()+" Dirección: "+objeto.getAddress()+" NIT: "+objeto.getNit()+"\nEmpleado: "+objeto.getEmployees().getName());
        });
    }
    
    public void updateCompany(){
        String option = "si";
        while ("si".equals(option)){
            System.out.println("");
            System.out.print(" Ingrese el nombre de la compañía a modificar: ");
            int id= input.nextInt();
            System.out.println("");
            
            for (Company objeto : getListCompany()){
                if(objeto.nit == id){
                    System.out.print(" Ingrese el nuevo nombre de la compañía: ");
                    String nombre = input.nextLine();
                    System.out.print(" Ingrese la nueva dirección de la compañía: ");
                    String direccion = input.nextLine();
                    System.out.print(" Ingrese el nuevo nit de la compañía: ");
                    id = input.nextInt();

                    employees.updateEmployees();

                    System.out.println("");
                    objeto.setBusinessName(nombre);
                    objeto.setAddress(address);
                    objeto.setNit(id);
                    objeto.setEmployees(employees);
                }else {
                    System.out.println(" La compañía ingresada no se encuentra.");
                }
            }
            
            System.out.print(" ¿Desea actualizar otra compañía? [si/no]: ");
            option = input.nextLine();
            System.out.println("");
        }
    }
    public void deleteCompany(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese el nit de la compañía a eliminar: ");
            int nit = input.nextInt();
            System.out.println("");
            
            for (int j = 0; j < getListCompany().size(); j++) {
                Company objecto = getListCompany().get(j);
                
                if (objecto.getNit() == nit){
                    this.listCompany.remove(objecto);
                }else {
                    System.out.println(" La companía ingresada no se encuentra.");
                }
            }
            setListCompany(getListCompany());
            System.out.print(" ¿Desea eliminar otra compañía? [si/no]: ");
            option = input.nextLine();
            System.out.println("");
        }
    }
    
    /**
     * @return the businessName
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * @param businessName the businessName to set
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * @return the employees
     */
    public Employees getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    /**
     * @return the customers
     */
    public Customers getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    /**
     * @return the listCompany
     */
    public ArrayList<Company> getListCompany() {
        return listCompany;
    }

    /**
     * @param listCompany the listCompany to set
     */
    public void setListCompany(ArrayList<Company> listCompany) {
        this.listCompany = listCompany;
    }
}
