public class Apply {
    public Apply(){

    }

    private Vet vet;
    private Animal animal;
    private Vaccine vaccine;

    public Vet getVet(){
        return this.vet;
    }
    public void setVet(Vet vet){
        this.vet=vet;
    }

    public Animal getAnimal(){
        return this.animal;
    }
    public void setAnimal(Animal animal){
        this.animal=animal;
    }
    
    public Vaccine getVaccine(){
        return this.vaccine;
    }
}