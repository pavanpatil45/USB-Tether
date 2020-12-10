package com.p4v4n.usbtether;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {
    /* access modifiers changed from: protected */
    @Override
    public void onCreate(Bundle bundle) {

        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        try {


            startActivityForResult(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS), 0);





        } catch (Exception e) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("This App is not supported by your Phone. Please Uninstall.");

            builder.show();
        }
    }
}