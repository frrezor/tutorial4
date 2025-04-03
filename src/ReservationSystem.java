import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Event> events = new ArrayList<Event>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();


    public void addEvent(Event event) {
        events.add(event);
    }


    public void addEvent(String name, double price, String date, String location) {
        Event event = new Event(name, price, date, location);
        events.add(event);
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void addCustomer(String firstName, String lastName, String email) {
        Customer customer = new Customer(firstName, lastName, email);
        customers.add(customer);
    }
    public void  makeReservation(Customer customer, Event event) {
        customer.addReservation(event);
        event.reserveSeat();
    }
     public Event findEvent(String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) {
               return event;
            }
        }
         return null;
     }
     public Customer findCustomer(String lastName) {
        for (Customer customer : customers) {
            if (customer.getLastName().equals(lastName)) {
                return customer;
            }
        }
        return null;
     }

     public void  changeEventPrice(String name, double price) {
        Event event = findEvent(name);
        event.setPrice(price);

     }


}
