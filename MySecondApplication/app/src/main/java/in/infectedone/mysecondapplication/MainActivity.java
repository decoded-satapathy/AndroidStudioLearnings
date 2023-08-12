package in.infectedone.mysecondapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onRegistration(View view){
        //firstName
        EditText txtEdtFirstName = findViewById(R.id.edtTxtFirstName);
        TextView txtFirstName = findViewById(R.id.txtViewFirstName);
        txtFirstName.setText("First Name: " + txtEdtFirstName.getText());

        //lastName
        EditText txtEdtLastName = findViewById(R.id.edtTextLastName);
        TextView txtLastName = findViewById(R.id.txtViewLastName);
        txtLastName.setText("Last Name: " + txtEdtLastName.getText());

        //email
        EditText txtEdtEmail = findViewById(R.id.editTextTextEmail);
        TextView txtEmail = findViewById(R.id.txtViewEmail);
        txtEmail.setText("Email: " + txtEdtEmail.getText());


    }
}