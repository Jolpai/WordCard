package jolpai.com.wordcard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import javax.inject.Inject;

import jolpai.com.wordcard.Example.Car;
import jolpai.com.wordcard.Example.CarComponent;
import jolpai.com.wordcard.Example.DaggerCarComponent;

public class Home extends AppCompatActivity {

    private static final String TAG = "Home_View";
    private TextView mTextMessage;
    private Home_P presenter;
    @Inject public Car car;
    /**
     * We can add presenter object to field level declaration like
     * @Inject Home_P presenter............ this is field inject*/
    @Inject Home_P _presenter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CarComponent carComponent = DaggerCarComponent.create();
        //car = carComponent.getCar();// this is one way but there is another way to get object from dagger. we can use @Inject annotation
        carComponent.inject(this);
        car.drive();



        /*presenter = WordCard.getComponent().getHome_Presenter();
        WordCard.getComponent().inject(this);
        Log.d(TAG, presenter.className);
        Log.d(TAG, _presenter.className);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);*/
    }

}
