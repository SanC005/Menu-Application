package com.example.menuapplication2;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                ImageView img = (ImageView) findViewById(R.id.imageView1);
                img.setVisibility(View.VISIBLE);
                return true;

            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Your CGPA is 9.12", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item3:
                WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(), "WIFI TURNED ON", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item4:
                finish();
                return true;
        }
        return false;
    }
}
//    public boolean onOptionsSelected(MenuItem item){
//        switch (item.getItemId()){
//            case R.id.item1:
//                Toast.makeText(getApplicationContext(),"You selected option 1",Toast.LENGTH_SHORT).show();
//                return true;
//
//            case R.id.item2:
//                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
//                return true;
//
//            case R.id.item3:
//               finish();
//                return true;
//        }
//        return false;
//    }
