package moizest89.indigitous.com.glassrootimpact.utility;

import android.content.Context;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class PabloPicasso {

    private static Picasso instance;

    public static Picasso with(Context context) {
        if (instance == null) {

            instance = new Picasso.Builder(context)
                    .downloader(new OkHttp3Downloader(context))
                    .build();
        }
        return instance;
    }

    private PabloPicasso() {
        throw new AssertionError("No instances.");
    }
}
