public class Car extends Vehicle {

    int ileSiedzen;

    public Car(String name, int year, int ileSiedzen) {
        super(name, year);
        this.ileSiedzen = ileSiedzen;
    }



    @Override
    boolean isRent (){

    boolean wypozyczony=false;

    if (getWypozyczajacy()!=null) wypozyczony=true;

    return wypozyczony;

    }


}
