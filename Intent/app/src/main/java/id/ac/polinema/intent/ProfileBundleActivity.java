package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import id.ac.polinema.intent.model.User;

public class ProfileBundleActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
        // TODO: bind here
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // TODO: display value here
            User u = extras.getParcelable("User");
        }
    }
}
