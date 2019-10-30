public class Vaccine{
    public Vaccine(){

    }
    
    private String serial_number;
    private String name;
    private Date expiration_date;
    private int stock;

    public String getSerial_number() {
        return this.serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpiration_date() {
        return this.expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}