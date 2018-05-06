package com.jim.boat;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FishingBoatAdapter implements RowingBoat{
    private FishingBoat fishingBoat;
    public FishingBoatAdapter(){
        this.fishingBoat = new FishingBoat();
    }

    public void row() {
        fishingBoat.sail();
    }
}
