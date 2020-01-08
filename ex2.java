public class ex2 {
    int number;
    String destination;

    public ex2(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public ex2() {

    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void display(){
        System.out.println(""+getNumber()+""+getDestination());
    }


}
