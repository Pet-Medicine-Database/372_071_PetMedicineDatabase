public class Boarding{
    public Boarding(){

    }
    
    private Appointment appointment;
    private int bed_id;
    private String bed_type;
    private Date when_to_be_available;
    private boolean availability;

    public Appointment getAppointment() {
        return this.appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public int getBed_id() {
        return this.bed_id;
    }

    public void setBed_id(int bed_id) {
        this.bed_id = bed_id;
    }

    public String getBed_type() {
        return this.bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public Date getWhen_to_be_available() {
        return this.when_to_be_available;
    }

    public void setWhen_to_be_available(Date when_to_be_available) {
        this.when_to_be_available = when_to_be_available;
    }

    public boolean getAvailability() {
        return this.availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}