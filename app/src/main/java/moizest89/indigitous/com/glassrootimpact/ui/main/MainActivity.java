package moizest89.indigitous.com.glassrootimpact.ui.main;

import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.wang.avi.AVLoadingIndicatorView;

import butterknife.Bind;
import butterknife.ButterKnife;
import moizest89.indigitous.com.glassrootimpact.R;

public class MainActivity extends AppCompatActivity implements IMainView{

    @Bind(R.id.loader)
    AVLoadingIndicatorView loader;
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;


    private MainPresenter mainPresenter;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButterKnife.bind(this);

        this.adapter = new MainAdapter(this);

        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setAdapter(this.adapter);

        this.mainPresenter = new MainPresenter(this);
        this.mainPresenter.attachView(this);
        this.mainPresenter.getData();;



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void hideData() {
        this.recyclerView.animate().alpha(0).setDuration(600);
    }

    @Override
    public void showData() {
        this.recyclerView.animate().alpha(1).setDuration(600);
    }

    @Override
    public void hideLoader() {
        this.loader.animate().alpha(0).setDuration(600);
    }

    @Override
    public void showLoader() {
        this.loader.animate().alpha(1).setDuration(600);
    }
}
