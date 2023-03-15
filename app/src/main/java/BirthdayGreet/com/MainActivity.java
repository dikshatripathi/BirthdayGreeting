package BirthdayGreet.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void createBirthdayCard(View view) {
        EditText nameInput = findViewById(R.id.nameInput);
        String name = nameInput.getText().toString();
        Intent intent = new Intent(this, BirthdayGreetingActivity.class);
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name);
        startActivity(intent);
    }

}