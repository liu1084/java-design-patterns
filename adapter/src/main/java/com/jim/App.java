package com.jim;
import com.jim.boat.Captain;
import com.jim.boat.FishingBoatAdapter;
import com.jim.request.Adaptee;
import com.jim.request.AdapteeAdapter;
import com.jim.request.Target;

public class App {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();

        //request
        Target adapter = new AdapteeAdapter(new Adaptee());
        adapter.request();
    }
}
