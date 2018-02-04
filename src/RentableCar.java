public class RentableCar extends Car implements Rentable {

    String kierunek;
    String id;

    Rentable(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getKierunek() {
        return kierunek;
    }

    @Override
    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    void rent(String firstName, String lastName, String id) {

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        setId(id);

    }

    @Override
    void handOver(){
          setWypozyczajacy(null);
    }


    @Override
    boolean isRent();
}

@Override
void toString(){


}
