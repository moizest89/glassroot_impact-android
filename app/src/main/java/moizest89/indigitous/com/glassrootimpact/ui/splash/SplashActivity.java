package moizest89.indigitous.com.glassrootimpact.ui.splash;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

import moizest89.indigitous.com.glassrootimpact.R;
import moizest89.indigitous.com.glassrootimpact.Utility;
import moizest89.indigitous.com.glassrootimpact.ui.main.MainActivity;

public class SplashActivity extends AppCompatActivity {

    private long splashDelay = 1000; //2 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setTime();

    }

    public void setTime(){

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Utility.changeActivity(SplashActivity.this, MainActivity.class, null, true);
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, splashDelay);

    }

}
