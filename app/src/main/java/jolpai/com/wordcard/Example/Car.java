package jolpai.com.wordcard.Example;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG="Car";

    /*Dagger Order 2. Variable inject*/
    @Inject Engine engine;
    private Wheels wheels;

    /*Dagger Order: 1. constructor inject*/
    @Inject
    public Car( Wheels wheels) {
        this.wheels = wheels;
    }

    /*Dagger Order: 3. method inject*/
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    
    public void drive(){
        Log.d(TAG, "drive: Driving...");
    }
}
