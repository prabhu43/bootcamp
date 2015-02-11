package day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Prabhu on 2/10/15.
 */
public class ParkingComplex {

    private ArrayList<ParkingLot> parkingLots;

    public ParkingComplex() {
        this.parkingLots = new ArrayList<ParkingLot>();
    }

    public boolean addParkingLot(ParkingLot parkingLot) {
        return parkingLots.add(parkingLot);
    }

    public void addParkingLotToAttendee(ParkingLot parkingLot, Attendee attendee) {
        attendee.addParkingLot(parkingLot);
    }

    public class Attendee {

        private ArrayList<ParkingLot> parkingLots;

        public Attendee() {
            this.parkingLots = new ArrayList<ParkingLot>();
        }

        public void addParkingLot(ParkingLot parkingLot) {
            this.parkingLots.add(parkingLot);
        }

        public ArrayList<ParkingLot> getParkingLots() {
            return parkingLots;
        }

//        public ParkingLot getCheapestParkingLot() {
//            ParkingLot cheapestParkingLot = null;
//            for (ParkingLot parkingLot : parkingLots) {
//                if (cheapestParkingLot == null) {
//                    cheapestParkingLot = parkingLot;
//                } else {
//                    if (cheapestParkingLot.getCost() > parkingLot.getCost()) {
//                        cheapestParkingLot = parkingLot;
//                    }
//                }
//            }
//            return cheapestParkingLot;
//        }


        public ParkingLot getParkingLot() {
            for (ParkingLot parkingLot : parkingLots) {
                if (!parkingLot.isFull()) {
                    return parkingLot;

                }
            }
            return null;
        }

//        public ParkingLot getParkingLotWithMaximumSpace() {
//            ParkingLot largestParkingLot = null;
//            for (ParkingLot parkingLot : parkingLots) {
//                if (parkingLot.isFull())
//                    continue;
//
//                if (largestParkingLot == null) {
//                    largestParkingLot = parkingLot;
//                } else {
//                    if (largestParkingLot.getAvailableSpaces() < parkingLot.getAvailableSpaces()) {
//                        largestParkingLot = parkingLot;
//
//                    }
//                }
//
//            }
//            return largestParkingLot;
//        }
    }
}
