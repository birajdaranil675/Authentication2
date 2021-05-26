package com.example.authentication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText name, email,contact,password,city;
    private Button submit;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        contact = findViewById(R.id.contact);
        password = findViewById(R.id.password);
        city = findViewById(R.id.city);

        databaseReference = FirebaseDatabase.getInstance().getReference("user");
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NAME = name.getText().toString().trim();
                String EMAIl = name.getText().toString().trim();
                String CONTACT = name.getText().toString().trim();
                String PASS = name.getText().toString().trim();
                String CITY = name.getText().toString().trim();

                String ID = databaseReference.push().getKey();

                model m = new model(ID,NAME,EMAIl,CONTACT,PASS,CITY);

                databaseReference.child(ID).setValue(m).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull  Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "user added sucessfully", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull  Exception e) {
                                Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
    }
}