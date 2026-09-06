package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Screen implements Serializable {

    private int screenId;
    private String screenName;
    private List<Seat> seats;

    Screen(int screenId, String screenName){
        this.screenId = screenId;
        this.screenName = screenName;
        this.seats = new ArrayList<>();
    }

}
