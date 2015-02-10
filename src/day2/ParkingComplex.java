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

    public static class Attendee {

    }
}
