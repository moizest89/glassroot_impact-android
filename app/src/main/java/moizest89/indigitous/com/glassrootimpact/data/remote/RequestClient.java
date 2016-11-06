package moizest89.indigitous.com.glassrootimpact.data.remote;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class RequestClient {

    public static String baseUrl = "http://private-4e42a-churchrequests.apiary-mock.com/" ;

    private static RequestInterface articlesInterface;

    public static RequestInterface getClient(){

        if(articlesInterface == null){

            OkHttpClient okClient = new OkHttpClient();
//            okClient.interceptors().add(new Interceptor() {
//                @Override
//                public Response intercept(Chain chain) throws IOException {
//                    Response response = chain.proceed(chain.request());
//                    Log.e(TAG, "URL Connection:  "+chain.request().url().toString());
//                    return response;
//                }
//            });

            Retrofit client = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(okClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            articlesInterface = client.create(RequestInterface.class);

        }
        return articlesInterface;

    }

}
