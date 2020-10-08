package id.ac.itn.myviewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Relative Layout");
        }
    }

    // bisa juga dengan cara ini agar ketika ditekan kembali ke back stack (mainactivity)
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}