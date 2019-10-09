package jolpai.com.wordcard;

import android.app.Application;

import jolpai.com.wordcard.Dagger.AppComponent;

public class WordCard extends Application {
    private static AppComponent component;
    // for dagger tutori  al
    //https://www.youtube.com/watch?v=3itfTHKFOqY

    @Override
    public void onCreate(){
        super.onCreate();

        //component = DaggerAppComponent.create();

    }
    public static AppComponent getComponent() {
        return component;
    }
}
