package com.jim.boat;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Captain implements RowingBoat {
    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat){
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        log.debug("Captain is rowing...");
        rowingBoat.row();
    }
}
