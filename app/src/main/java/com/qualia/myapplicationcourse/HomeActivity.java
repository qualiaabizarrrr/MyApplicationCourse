package com.qualia.myapplicationcourse;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class HomeActivity extends AppCompatActivity {
    private ImageView kelogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        kelogin = findViewById(R.id.kelogin);

        kelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}