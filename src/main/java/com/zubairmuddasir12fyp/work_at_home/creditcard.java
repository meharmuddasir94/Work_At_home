package com.zubairmuddasir12fyp.work_at_home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import java.util.HashMap;
import java.util.Map;


public class creditcard extends AppCompatActivity {
    EditText first, last, cvv, card, expire;

    Button btn;
    FirebaseFirestore objectFirebaseFirestore;
    String token;
    TextView tv, tok1;
    FirebaseUser user;
    DatabaseReference reference;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditcard);
        card = findViewById(R.id.tvcardname);
        cvv = findViewById(R.id.CVV);
        tok1 = findViewById(R.id.tok1);
        String tok = getIntent().getStringExtra("usertok");
        tok1.setText(tok);
        first = findViewById(R.id.firstname);
        last = findViewById(R.id.lastname);
        btn = findViewById(R.id.btn2);
        firebaseAuth = FirebaseAuth.getInstance();

        objectFirebaseFirestore = FirebaseFirestore.getInstance();
        tv = findViewById(R.id.user);
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
            @Override
            public void onComplete(@NonNull Task<InstanceIdResult> task) {
                if (task.isSuccessful()) {
                    token = task.getResult().getToken();
                }
            }
        });

        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users").child(user.getUid());
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                tv.setText(user.getName());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
            @Override
            public void onComplete(@NonNull Task<InstanceIdResult> task) {
                if (task.isSuccessful()) {
                    token = task.getResult().getToken();
                }
            }
        });

        expire = findViewById(R.id.datepick);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (card.getText().toString().isEmpty() && cvv.getText().toString().isEmpty() && first.getText().toString().isEmpty() && last.getText().toString().isEmpty() && expire.getText().toString().isEmpty()) {
                    ;
                    Toast.makeText(creditcard.this, "Enter values", Toast.LENGTH_SHORT).show();
                } else {
                    posttmanage();
                }

            }
        });
    }

    public void back(View view) {
        onBackPressed();
    }


    public void posttmanage() {

        try {


            if (!card.getText().toString().isEmpty() && !cvv.getText().toString().isEmpty() && !first.getText().toString().isEmpty() && !last.getText().toString().isEmpty() && !expire.getText().toString().isEmpty()) {
                Map<String, String> objectMap = new HashMap<>();
                objectMap.put("Cnumber", card.getText().toString());
                objectMap.put("Cvv", cvv.getText().toString());
                objectMap.put("First", first.getText().toString());
                objectMap.put("Last", last.getText().toString());
                objectMap.put("Expire", expire.getText().toString());
                objectMap.put("username", tv.getText().toString());
                objectMap.put("Token", token);
                objectMap.put("buyerToken", tok1.getText().toString());


                objectFirebaseFirestore.collection("Creditcard")
                        .document(tv.getText().toString())
                        .set(objectMap)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(creditcard.this, "First we will verify your details and paste order in a while ", Toast.LENGTH_SHORT).show();
                                onBackPressed();

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(creditcard.this, "Failed to post", Toast.LENGTH_SHORT).show();
                            }
                        });

            } else {
                Toast.makeText(creditcard.this, "Enter Values", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Toast.makeText(creditcard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


}