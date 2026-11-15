# Task 1 – Understand the Problem and Identify the Objects

## Inputs and outputs
Inputs include vehicle registration number, vehicle category, user category/pass status, entry and exit time, floor and slot configuration, and (for EVs) charging units. Outputs include allocated floor/slot, unique ticket number, entry/exit records, parking fee and availability status.

## Candidate classes and responsibilities
| Class | Responsibility |
|---|---|
| ParkingFacility | Maintains floors/slots and allocates or releases slots |
| ParkingSlot | Stores slot number, category and occupancy |
| Vehicle | Common registration number and fee behaviour |
| TwoWheeler, Car, ElectricCar | Specialise vehicle rates and behaviour |
| ParkingTicket | Ticket number, vehicle, entry time and exit time |
| ParkingUser | Represents student, staff or visitor |
| ParkingPass | Represents a valid monthly/day pass |
| PricingRule | Calculates the fee for a parking duration |
| ParkingService | Coordinates entry, exit and payment |

Nouns such as vehicle, slot, ticket, floor and pass are candidate classes. Verbs such as allocate, release, enter, exit and calculate become methods.

## Business rules
1. One slot can contain at most one vehicle.
2. A vehicle cannot be allocated when no suitable slot is free.
3. Ticket numbers must be unique and must not be reused during a run.
4. A vehicle registration number cannot have two active tickets.
5. A released slot becomes available again.
6. Invalid floor/slot indexes and negative durations must be rejected.
7. Students and staff with valid monthly passes pay zero; visitors pay the applicable fee.

## Assumptions
The facility configuration is supplied at startup. Time is measured in minutes. Each started hour is charged as a full hour in the demonstration implementation. Fees are illustrative and can be changed by the university.

## Alternative: objects vs parallel arrays
With objects, each Vehicle keeps its registration number and related state together. A linear search by registration number is O(n). Adding an attribute means adding a field and suitable methods to Vehicle (or a subclass). With parallel arrays, registration number, type and entry time are stored at matching indexes. Search is also O(n), but every insertion/deletion must keep indexes synchronised. Adding an attribute requires another parallel array and increases the risk of inconsistent indexes. Both use O(n) total storage; an object representation also has per-object header/reference overhead.
