public abstract class Vehicle implements Moveable {

  private  String name;
  private  int year;
    private String kierunek;
    private Person wypozyczajacy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public Person getWypozyczajacy() {
        return wypozyczajacy;
    }

    public void setWypozyczajacy(Person wypozyczajacy) {

        this.wypozyczajacy = wypozyczajacy;
    }

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void turnLeft(){
        setKierunek("W lewo.");
    }

    public void turnRight(){
        setKierunek("W prawo.")}

    public void goForward(){
        setKierunek("Prosto");

    }

    public void goBack(){
        setKierunek("Do tyłu");
    }

}
