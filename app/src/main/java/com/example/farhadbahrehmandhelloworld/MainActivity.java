package com.example.farhadbahrehmandhelloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button helloWorldButton;
    TextView helloWorldText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldButton = (Button)findViewById(R.id.helloWorldButton);
        helloWorldText = (TextView) findViewById(R.id.helloWorldText);
        imageView = (ImageView) findViewById(R.id.imageView);

        helloWorldButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (helloWorldText.getText() == "") {
            helloWorldText.setText("Hello World!!");
            imageView.setImageResource(R.drawable.hello_world_2);
        }
        else {
            helloWorldText.setText("");
            imageView.setImageResource(R.drawable.hello_world_1);
        }
    }
}