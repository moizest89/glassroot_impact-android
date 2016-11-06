package moizest89.indigitous.com.glassrootimpact.ui.main;

import android.content.Context;

import java.util.List;

import moizest89.indigitous.com.glassrootimpact.data.models.Request;
import moizest89.indigitous.com.glassrootimpact.data.remote.RequestClient;
import moizest89.indigitous.com.glassrootimpact.data.remote.RequestInterface;
import moizest89.indigitous.com.glassrootimpact.ui.base.BasePresenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class MainPresenter extends BasePresenter<IMainView>{

    private Context context;
    private RequestInterface requestInterface;

    public MainPresenter(Context context) {
        this.context = context;

        this.requestInterface = RequestClient.getClient();
    }



    public void getData(){

        Call<List<Request>> call = this.requestInterface.getRequests();
        call.enqueue(new Callback<List<Request>>() {
            @Override
            public void onResponse(Call<List<Request>> call, Response<List<Request>> response) {

                if(response.isSuccessful()) {

                    List<Request> requests = response.body();

                    getMvpView().setData(requests);
                    getMvpView().hideLoader();
                    getMvpView().showData();


                }
            }

            @Override
            public void onFailure(Call<List<Request>> call, Throwable t) {

            }
        });

    }
}
