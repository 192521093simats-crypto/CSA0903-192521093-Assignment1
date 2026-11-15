public class Main {
    public static void main(String[] args) {
        // Jagged array: each floor can contain a different number of slots.
        String[][] slots = new String[3][];
        slots[0] = new String[20];
        slots[1] = new String[15];
        slots[2] = new String[25];

        int totalSlots = 0;
        for (String[] floor : slots) totalSlots += floor.length;

        int parkingMinutes = 130;
        int billableHours = (parkingMinutes + 59) / 60;
        double hourlyRate = 30.0;
        System.out.println("Total slots: " + totalSlots);
        System.out.println("Billable hours: " + billableHours);
        System.out.println("Fee: Rs " + (billableHours * hourlyRate));
    }
}
