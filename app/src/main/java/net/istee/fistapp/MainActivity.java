package net.istee.fistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private EditText mEnterNameEditText;
    private Button mEnterNameButton;
    private TextView mDisplayNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnterNameEditText = findViewById(R.id.et_name);
        mEnterNameButton = findViewById(R.id.bt_enter_name);
        mDisplayNameTextView = findViewById(R.id.tv_display_name);

        mEnterNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEnterNameEditText.getText().toString();

                Toast.makeText(MainActivity.this,"Hello " + name, Toast.LENGTH_LONG).show();

                mDisplayNameTextView.setVisibility(View.VISIBLE);
                mDisplayNameTextView.setText(name);
            }
        });
    }
}