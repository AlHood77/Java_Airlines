Java Airlines

practise using multiple Java Classes, enums and TDD to model an online travel booking agent.

## MVP
Create a `Passenger` class which has:
* a name
* a number of bags

Create a `Plane` class which has:
* an enum PlaneType (e.g. *BOEING747*) which stores capacity and total weight

Create a `Flight` class which has:
* an empty list of booked `Passenger`'s
* a `Plane`
* flight number (i.e. "FR756")
* destination (i.e. GLA, EDI)
* departure airport (i.e. GLA, EDI)
* departure time (use a String)

The `Flight` class should have methods to:
* return the number of available seats
* book a passenger (if there are remaining seats)

##Still to do

### Extensions
Create a `FlightManager` class which has methods to:
* calculate how much baggage weight should be reserved for each passenger for a flight
* calculate how much baggage weight is booked by passengers of a flight
* calculate how much overall weight reserved for baggage remains for a flight

### More Extensions
* Refactor the Flight's departure time to use the Date class (*HINT*: Look into **Type Migration** in IntelliJ to refactor faster)
* Add a 'flight' property to the `Passenger` class which is assigned when a passenger is added to a flight
* Add a 'seat number' property to the `Passenger` class as an integer. Set it to a random number which is assigned when a `Passenger` is booked on a flight
* Make sure the flight doesn't double book the same seat number to more than one passenger

### ***Super*** Extensions
* Write a method in `FlightManager` to sort the passengers of a `Flight` by seat number by implementing a Bubble Sort
* Write a method in `FlightManager` that uses a Binary Search to find a `Passenger` by seat number. Remember to use the previous method to sort the list first
