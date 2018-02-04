


public class Program {

    public static void main(String[] args) {

        Vehicle[] tab = new Vehicle [2];

        tab[0]= new Car("Ford", 1993, 5 );
        tab[1]= new MotorBike("Ford", 1977, 4999 );

        RentableCar rentable=new RentableCar();
        rentable.rent("Jan", "Kowalski","13");



    }

}
