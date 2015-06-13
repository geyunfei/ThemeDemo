
package gp.yunfei.themedemo;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.hello2.R;

public class MainActivity extends Activity {
    Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sp = getSharedPreferences("theme", Context.MODE_PRIVATE);
        int theme = sp.getInt("theme", -1);
        setTheme(theme);
        setContentView(R.layout.activity_main);
    }

    public void onSelectTheme(View view) {
        int theme;
        switch (view.getId()) {
            case R.id.bt1:
                theme = R.style.MyRed_Theme;
                break;

            case R.id.bt2:
                theme = R.style.MyRedLight_Theme;
                break;

            case R.id.bt3:
                theme = R.style.MyBlue_Theme;
                break;

            case R.id.bt4:
                theme = R.style.MyBlueLight_Theme;
                break;

            case R.id.bt5:
                theme = R.style.MyGreen_Theme;
                break;

            case R.id.bt6:
                theme = R.style.MyGreenLight_Theme;
                break;

            default:
                theme = android.R.style.Theme_DeviceDefault;
        }
        
        SharedPreferences sp = getSharedPreferences("theme", Context.MODE_PRIVATE);
        Editor editor = sp.edit();
        editor.putInt("theme", theme);
        editor.commit();
        recreate();
    }
}
