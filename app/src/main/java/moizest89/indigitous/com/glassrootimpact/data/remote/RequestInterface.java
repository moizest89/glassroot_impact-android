package moizest89.indigitous.com.glassrootimpact.data.remote;


import java.util.List;

import moizest89.indigitous.com.glassrootimpact.data.models.Request;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public interface RequestInterface {


    @GET("/requests")
    Call<List<Request>> getRequests();


}
