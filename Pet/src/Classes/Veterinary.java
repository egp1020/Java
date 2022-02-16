
package Classes;

/**
 *
 * @author estefania.garces
 */
public class Veterinary extends AbstHospital {
    // Agregación con Pet y necesita de Doctor, se compone con Doctor.
    private String name;
    private String phone;
    private String address;
    private Doctor doct;

    public Veterinary(String name, String phone, String address, Doctor doct) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.doct = doct;
    }
    
    public String petCare(Pet mascota){
        System.out.println("Atendiendo mascota"+ mascota.getName());
        return mascota.getHealthStatus();
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
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the adress
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the adress to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the doct
     */
    public Doctor getDoct() {
        return doct;
    }

    /**
     * @param doct the doct to set
     */
    public void setDoct(Doctor doct) {
        this.doct = doct;
    }

    @Override
    public String getPatientType() {
        return "Animal";
    }

    @Override
    public String Surgery() {
        return "Surgery animal data";
    }
}
