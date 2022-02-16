
package SoftwareClass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raad_
 */
public class Members {
    private ArrayList<Employees> listEmployees = new ArrayList<>();
    private ArrayList<Customers> listCustomers = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    private String name;
    private String lastName;
    private String email;
    private int id;
    private Employees employee, subEmployee;
    private Customers customer;
    private Workstation workstation; 
    private Workstation workstationSub;

    public Members() {
    }

    
    public Members(String name, String lastName, String email, int id) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
        this.listEmployees = listEmployees;
        this.listCustomers = listCustomers;
        this.employee = new Employees();
        this.customer = new Customers();
    }
    
    public void createEmployee(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese nombre del empleado: ");
            String nombre = input.nextLine();
            System.out.print(" Ingrese el apellido del empleado: ");
            String apellido = input.nextLine();
            System.out.print(" Ingrese el correo electrónico: ");
            String correo = input.nextLine();
            System.out.print(" Ingresa número de identificación: ");
            int ID = input.nextInt();
            System.out.print(" Ingrese el salario: ");
            double salario = input.nextDouble();
            workstation = new Workstation();

            employee = new Employees(salario, workstation, nombre, apellido, correo, ID);
            this.listEmployees.add(employee);
            setListEmployees(getListEmployees());

            
            System.out.print(" ¿El empleado es administrativo? [si/no]: ");
            String answer = input.next();
            
            if (answer.equals("si")){
                System.out.print(" ¿Cuántos subordinados tiene a cargo?: ");
                int subordinates = input.nextInt();

                System.out.println(" •----------------------------------------------•");
                System.out.println("           Información del subordinado ");
                System.out.println(" •----------------------------------------------•");
                for(int i = 1; i<=subordinates;i++){
                    System.out.print(" Ingresa número de identificación: ");
                    int IDSub = input.nextInt();
                    System.out.print(" Ingrese nombre del subordinado: ");
                    String nombreSub = input.next();
                    System.out.print(" Ingrese el apellido: ");
                    String apellidoSub = input.next();
                    System.out.print(" Ingrese el correo electrónico: ");
                    String correoSub = input.next();
                    System.out.print(" Ingrese el salario: ");
                    double salarioSub = input.nextDouble();
                    System.out.print(" ¿A qué categoría pertenece?: ");
                    String categoria = input.next();
                    Category category = new Category(categoria);
                    System.out.println("");
                    workstationSub = new Workstation();

                    subEmployee = new Employees(salarioSub, workstationSub, nombreSub, apellidoSub, correoSub, IDSub);
                    subEmployee.setCategory(category);
                    employee.assignEmployees(subEmployee);
                } 
            }
            System.out.print(" ¿Desea crear otro empleado? [si/no]: ");
            option = input.next();
            System.out.println("");  
        }
    }
        
    public void createCustomers(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese nombre: ");
            String nombre = input.nextLine();
            System.out.print(" Ingrese el apellido: ");
            String apellido = input.nextLine();
            System.out.print(" Ingrese el correo electrónico: ");
            String correo = input.nextLine();
            System.out.print(" Ingresa número de identificación: ");
            int ID = input.nextInt();
            System.out.print(" Ingrese el número de celular: ");
            long celular = input.nextLong();
            System.out.print(" Ingrese la dirección: ");
            String direccion= input.nextLine();
            
            customer = new Customers(direccion, celular, nombre, apellido, correo, ID);
            this.listCustomers.add(customer);
            setListCustomers(getListCustomers());
                
            System.out.print(" ¿Desea crear otro cliente? [si/no]: ");
            option = input.next();
            System.out.println("");
        }
    }
    
    public void readEmployees(){
        System.out.print(" Ingrese el número de identificación de la persona que desea listar: ");
        int ID = input.nextInt();
        getListEmployees().forEach(objeto -> {
            
            if(objeto.getId() == ID){
                System.out.println(" Los datos de la persona son: ");
                System.out.println(" Número de identificación: "+objeto.getId());
                System.out.println(" Nombre: "+objeto.getName());
                System.out.println(" Apellido: "+objeto.getLastName());
                System.out.println(" Correo electrónico: "+objeto.getEmail());
                System.out.println(" Salario: "+objeto.getSalary());
                workstation.readAllWorkstation();
            }else{
                System.out.println(" El número de identificación ingresado no se encuentra.");
            } 
        });
    }
    
    public void readCustomers(){
        System.out.print(" Ingrese el número de identificación de la persona que desea listar: ");
        int ID = input.nextInt();
        getListCustomers().forEach(objeto -> {
            
            if(objeto.getId() == ID){
                System.out.println(" Los datos de la persona son: ");
                System.out.println(" Número de identificación: "+objeto.getId());
                System.out.println(" Nombre: "+objeto.getName());
                System.out.println(" Apellido: "+objeto.getLastName());
                System.out.println(" Correo electrónico: "+objeto.getEmail());
                System.out.println(" Direccion: "+objeto.getAddress());
                System.out.println(" Teléfono celular: "+objeto.getCellPhone());
            }else{
                System.out.println(" El número de identificación ingresado no se encuentra.");
            } 
        });
    }
    
    public void readAllEmployees(){
        getListEmployees().forEach(objeto -> {
            System.out.println(" Número de identificación: "+objeto.getId()+"Nombre: "+objeto.getName()+" Apellido: "+objeto.getLastName()+" Correo: "+objeto.getEmail()+" Salario: "+objeto.getSalary());
        });
    }
    
    public void readAllCustomers(){
        getListCustomers().forEach(objeto -> {
            System.out.println(" Número de identificación: "+objeto.getId()+"Nombre: "+objeto.getName()+" Apellido: "+objeto.getLastName()+" Correo: "+objeto.getEmail()+" Dirección: "+objeto.getAddress()+" Teléfono de calular: "+objeto.getCellPhone());
        });
    }
    
    public void updateEmployees(){
        String option = "si";
        while ("si".equals(option)){
            System.out.println("");
            System.out.print(" Ingrese el número de identificación del empleado: ");
            int ID = input.nextInt();
            System.out.println("");
            
            for (Employees objeto : getListEmployees()){
                if(objeto.getId() == ID){
                    System.out.print(" Ingrese nombre: ");
                    String nombre = input.nextLine();
                    System.out.print(" Ingrese el apellido: ");
                    String apellido = input.nextLine();
                    System.out.print(" Ingrese el correo electrónico: ");
                    String correo = input.nextLine();
                    System.out.print(" Ingrese el salario: ");
                    double salario = input.nextDouble();

                    System.out.println("");
                    objeto.setName(nombre);
                    objeto.setLastName(apellido);
                    objeto.setId(ID);
                    objeto.setEmail(correo);
                    objeto.setSalary(salario);
                    workstation.updateWorkstation();
                    objeto.setWorkstation(workstation);
                    
                }else {
                    System.out.println(" La número de identificación ingresada no se encuentra.");
                }
            }
        }
    }
    
    public void updateCustomers(){
        String option = "si";
        while ("si".equals(option)){
            System.out.println("");
            System.out.print(" Ingrese el número de identificación de la persona: ");
            int ID = input.nextInt();
            System.out.println("");
            
            for (Customers objeto : getListCustomers()){
                if(objeto.getId() == ID){
                    System.out.print(" Ingresa número de identificación: ");
                    ID = input.nextInt();
                    System.out.print(" Ingrese nombre: ");
                    String nombre = input.nextLine();
                    System.out.print(" Ingrese el apellido: ");
                    String apellido = input.nextLine();
                    System.out.print(" Ingrese el correo electrónico: ");
                    String correo = input.nextLine();
                    System.out.print(" Ingrese la dirección: ");
                    String direccion = input.nextLine();
                    System.out.print(" Ingrese el número de celular: ");
                    long celular = input.nextLong();

                    System.out.println("");
                    objeto.setName(nombre);
                    objeto.setLastName(apellido);
                    objeto.setId(ID);
                    objeto.setEmail(correo);
                    objeto.setAddress(direccion);
                    objeto.setCellPhone(celular);
                }else {
                    System.out.println(" La número de identificación ingresada no se encuentra.");
                }
            }
        }
    }
    
    
    public void deleteEmployees(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese el número de identificación: ");
            int ID = input.nextInt();
            System.out.println("");
            
            for (int j = 0; j < getListEmployees().size(); j++) {
                Employees objeto = getListEmployees().get(j);
                
                if (objeto.getId() == ID){
                    this.listEmployees.remove(objeto);
                }else {
                    System.out.println(" El número de identificación ingresado no se encuentra.");
                }
            }
        }
    }
    
    public void deleteCustomers(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese el número de identificación: ");
            int ID = input.nextInt();
            System.out.println("");
            
            for (int j = 0; j < getListCustomers().size(); j++) {
                Customers objeto = getListCustomers().get(j);
                
                if (objeto.getId() == ID){
                    this.listCustomers.remove(objeto);
                }else {
                    System.out.println(" El número de identificación ingresado no se encuentra.");
                }
            }
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the listMembers
     */
    
    public String getMemberType(){
        return "";
    }

    /**
     * @return the employee
     */
    public Employees getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

    /**
     * @return the customer
     */
    public Customers getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    /**
     * @return the listEmployees
     */
    public ArrayList<Employees> getListEmployees() {
        return listEmployees;
    }

    /**
     * @param listEmployees the listEmployees to set
     */
    public void setListEmployees(ArrayList<Employees> listEmployees) {
        this.listEmployees = listEmployees;
    }

    /**
     * @return the listCustomers
     */
    public ArrayList<Customers> getListCustomers() {
        return listCustomers;
    }

    /**
     * @param listCustomers the listCustomers to set
     */
    public void setListCustomers(ArrayList<Customers> listCustomers) {
        this.listCustomers = listCustomers;
    }
    
}
