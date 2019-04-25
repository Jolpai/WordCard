package jolpai.com.wordcard.Dagger;

import dagger.Component;
import jolpai.com.wordcard.Home;
import jolpai.com.wordcard.Home_P;

@Component
public interface AppComponent {

    Home_P getHome_Presenter();

    void inject(Home home);
}
