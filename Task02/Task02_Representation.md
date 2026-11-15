# Task 2 – Choose the Data Representation

| Data | Suggested Java type | Reason |
|---|---|---|
| Floor and slot index | int | Whole-number indexes |
| Registration number | String | Contains letters and digits |
| Entry time | LocalDateTime | Represents date and time |
| Duration | long | Whole minutes, potentially large |
| Fee | double or BigDecimal | Currency calculation; BigDecimal is preferable for production |
| Occupancy | Vehicle or null | Null indicates an empty slot |

A jagged array `ParkingSlot[][]` represents floors with different slot counts. Each row can have a different length, matching the real facility. Scanner is suitable for console input.

## Casting and precision
Incorrect integer division can undercharge. For example, `130 / 60` evaluates to `2`, not 2.17. If every started hour is charged, use ceiling division: `(minutes + 59) / 60`. Convert to double only when needed for the fee calculation. Avoid `(double)(minutes / 60)` because integer division has already happened before casting.

## Alternative representations
A flat array can use `index = floor * slotsPerFloor + slot` only when every floor has the same number of slots. Different floor capacities require prefix offsets or a lookup table. A jagged array directly supports different row lengths. `ArrayList<ParkingSlot[]>` also supports rows of different lengths and can grow the number of floors dynamically. Access by known floor and slot is O(1) in all these array/list forms; storage is O(S), where S is the total number of slots.
