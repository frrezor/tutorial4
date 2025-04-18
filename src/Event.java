public class Event {

    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats =100;
    private int availableSeats=10;
    private double price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }
    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


     public Event ( String name, double price) {
        this.name = name;
        this.price = price;
     }
     public Event ( String name, double price, String date) {

        this.name = name;
        this.price = price;
        this.date = date;
     }
     public Event ( String name,double price, String date, String location) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.location = location;
     }

     public String toString() {
        return name + " " + price + "PLN";
     }

     public void reserveSeat() {
        --availableSeats;
     }
}
