package moizest89.indigitous.com.glassrootimpact;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class Utility {

    public final static String INTENT_SEND_DATA = "data";
    public final static String INTENT_CARROUSEL_POSITION = "position";


    public static void changeActivity(Context context, Class<?> target, Bundle options, boolean finish) {
        Intent i = new Intent(context, target);

        if (options != null)
            i.putExtras(options);

        context.startActivity(i);

        if (finish)
            ((Activity) context).finish();

    }
}
