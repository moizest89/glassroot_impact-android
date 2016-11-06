package moizest89.indigitous.com.glassrootimpact.ui.request.details;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import moizest89.indigitous.com.glassrootimpact.R;
import moizest89.indigitous.com.glassrootimpact.Utility;
import moizest89.indigitous.com.glassrootimpact.data.models.Request;
import moizest89.indigitous.com.glassrootimpact.data.models.Request_;

public class RequestDetailsActivity extends AppCompatActivity {

    @Bind(R.id.request_church_name)
    TextView request_church_name;
    @Bind(R.id.request_church_reason)
    TextView request_church_reason;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.request_church_items)
    LinearLayout request_church_items;

    private Request request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ButterKnife.bind(this);

        setActionBar();

        Bundle data = getIntent().getExtras();
        if (data != null && data.containsKey(Utility.INTENT_SEND_DATA)) {
            this.request = data.getParcelable(Utility.INTENT_SEND_DATA);

            getSupportActionBar().setSubtitle(this.request.getName());

            this.request_church_name.setText(this.request.getName());
            this.request_church_reason.setText(this.request.getReason());


        }

    }

    public void setActionBar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
        this.toolbar.setTitle(null);
        this.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    public void setRequestItems(List<Request_> request_s){

    }

}
