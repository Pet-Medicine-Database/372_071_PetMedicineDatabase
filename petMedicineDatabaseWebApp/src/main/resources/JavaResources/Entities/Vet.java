public class Vet{
    public Vet(){

    }

    private String TC_no;
    private Date start_date;
    private String expertise;
    private int num_of_patients;
    private String name;

    public String getTC_no() {
        return this.TC_no;
    }

    public void setTC_no(String TC_no) {
        this.TC_no = TC_no;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getExpertise() {
        return this.expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public int getNum_of_patients() {
        return this.num_of_patients;
    }

    public void setNum_of_patients(int num_of_patients) {
        this.num_of_patients = num_of_patients;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}