package BirthdayGreet.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    public static final String NAME_EXTRA = "name_extra";
    private TextView birthdayGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        String name = getIntent().getStringExtra(NAME_EXTRA);
        birthdayGreeting = findViewById(R.id.birthdayGreeting);
        birthdayGreeting.setText("Happy Birthday\n" + name + "!"+"\n");
    }
}
