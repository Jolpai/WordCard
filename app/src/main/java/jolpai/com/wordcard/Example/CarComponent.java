package jolpai.com.wordcard.Example;

import dagger.Component;
import jolpai.com.wordcard.Home;

@Component
public interface CarComponent {
    Car getCar();

    void inject (Home home);
}
