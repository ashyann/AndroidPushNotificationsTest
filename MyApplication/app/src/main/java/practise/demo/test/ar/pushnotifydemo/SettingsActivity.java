package practise.demo.test.ar.pushnotifydemo;

import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity {
    public static final String SETTINGS_KEY_BACKEND_URL = "settings_backend_url";
    public static final String SETTINGS_KEY_USERNAME = "settings_username";
    public static final String SETTINGS_KEY_DEVICEGUID = "settings_deviceguid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
