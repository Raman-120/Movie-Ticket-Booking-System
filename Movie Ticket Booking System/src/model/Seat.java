package model;

import java.io.Serializable;

public class Seat implements Serializable {

    private String seatId;
    private SeatType type;


    Seat(String seatId, SeatType type){
        this.seatId = seatId;
        this.type = type;
    }

    public String getSeatId(){
        return this.seatId;
    }

    public SeatType seatType(){
        return this.type;
    }

}
