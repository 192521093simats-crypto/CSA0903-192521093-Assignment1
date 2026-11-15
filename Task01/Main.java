public class Main {
    static class Vehicle {
        String registrationNo;
        String type;
        Vehicle(String registrationNo, String type) {
            this.registrationNo = registrationNo;
            this.type = type;
        }
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("TN01AB1111", "CAR");
        System.out.println("Registration: " + v.registrationNo);
        System.out.println("Type: " + v.type);
        System.out.println("Candidate classes: Vehicle, ParkingSlot, ParkingTicket, ParkingFacility");
    }
} 
