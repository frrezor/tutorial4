import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Event> reservationList = new ArrayList<Event>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;

    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Event> getReservationList() {
        return reservationList;
    }
    public void setReservationList(ArrayList<Event> reservationList) {
        this.reservationList = reservationList;
    }

     public void addReservation(Event event) {
        reservationList.add(event);
     }

      public Customer (String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

      }
      public Customer (String firstName, String lastName, String email, ArrayList<Event> reservationList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.reservationList = reservationList;
      }

      public void displayReservations() {
        for ( Event event : reservationList ) {
            System.out.println(event.toString());
        }
      }
     public void cancelReservation(Event event) {
        reservationList.remove(event);
     }


}

