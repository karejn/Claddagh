package com.example.ekzhu.claddagh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remove underlines from web links
        TextView web = (TextView) findViewById(R.id.web);

        // Make sure the TextView was instantiated correctly
        if (web != null) {
            StringUtil.removeUnderlines((Spannable) web.getText());
        }

        // Remove underlines from number links
        TextView number = (TextView) findViewById(R.id.number);
        if (number != null) {
            StringUtil.removeUnderlines((Spannable) number.getText());
        }

        // Remove underlines from email links
        TextView email = (TextView) findViewById(R.id.email);
        if (email != null) {
            StringUtil.removeUnderlines((Spannable) email.getText());
        }
    }

    public void openMap(View v) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.at/maps/place/Pernhartgasse+4,+9020+Klagenfurt+am+Wörthersee/"));
        startActivity(intent);
    }


}

