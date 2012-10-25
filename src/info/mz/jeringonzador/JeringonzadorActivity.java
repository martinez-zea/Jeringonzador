package info.mz.jeringonzador;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

/*
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
*/

public class JeringonzadorActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
