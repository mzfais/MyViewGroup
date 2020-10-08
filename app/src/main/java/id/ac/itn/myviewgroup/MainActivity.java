package id.ac.itn.myviewgroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLinear, btnRelative, btnConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLinear = findViewById(R.id.btnLinear);
        btnLinear.setOnClickListener(this);
        btnRelative = findViewById(R.id.btnRelative);
        btnRelative.setOnClickListener(this);
        btnConstraint = findViewById(R.id.btnConstraint);
        btnConstraint.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLinear:
                Intent linear = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(linear);
                break;
            case R.id.btnRelative:
                Intent relative = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(relative);
                break;
            case R.id.btnConstraint:
                Intent constraint = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(constraint);
                break;
        }
    }
}