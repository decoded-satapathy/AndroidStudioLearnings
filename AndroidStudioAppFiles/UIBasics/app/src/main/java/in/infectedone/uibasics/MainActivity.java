package in.infectedone.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtTxtName;
    private TextView txtWelcome;
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnHello){
            txtWelcome.setText("Hello "+edtTxtName.getText().toString());
        }
        else if(view.getId() == R.id.edtTxtName){
            Toast.makeText(this, "Trying to write something", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
        edtTxtName.setOnClickListener(this);
    }
}