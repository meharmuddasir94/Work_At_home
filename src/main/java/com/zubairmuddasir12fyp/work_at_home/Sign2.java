package com.zubairmuddasir12fyp.work_at_home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sign2 extends AppCompatActivity {
    TextView tvgog;
    String emails;
    FirebaseFirestore objectFirebaseFirestore;
    DatabaseReference reference;
    FirebaseAuth auth;
    TextView textView;
    LoginButton loginButton;
    CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign2);
        loginButton = findViewById(R.id.login_button);
        tvgog = findViewById(R.id.tvgog);

        objectFirebaseFirestore = FirebaseFirestore.getInstance();

        textView = findViewById(R.id.textView);
        auth = FirebaseAuth.getInstance();
        callbackManager = CallbackManager.Factory.create();
        loginButton.setReadPermissions(Arrays.asList("email"));
    }

    public void buttonClickfb(View view) {
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                handleFacebookToken(loginResult.getAccessToken());
            }

            @Override
            public void onCancel() {
                Toast.makeText(Sign2.this, "User Cancaled it", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException error) {

            }
        });
    }

    private void handleFacebookToken(AccessToken accessToken) {
        Log.d("fdfadsgg", "handleFacebookAccessToken:" + accessToken);

        AuthCredential credential = FacebookAuthProvider.getCredential(accessToken.getToken());
        auth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d("fdfadsgg", "signInWithCredential:success");
                            FirebaseUser user = auth.getCurrentUser();
                            emails = auth.getCurrentUser().getEmail();
                            tvgog.setText(emails);
                            Intent i = new Intent(Sign2.this, savename.class);
                            startActivity(i);
                            finish();
                            storedata();
                            Toast.makeText(Sign2.this, "Authentication failed.", Toast.LENGTH_SHORT).show();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("fdfadsgg", "signInWithCredential:failure", task.getException());
                            FirebaseUser user = auth.getCurrentUser();
                            startActivity(new Intent(Sign2.this, HomeActivity.class));

                        }
                    }
                });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }


    public void storedata() {
        try {
            if (!tvgog.getText().toString().isEmpty()) {
                Map<String, String> objectMap = new HashMap<>();
                objectMap.put("email", tvgog.getText().toString());
                objectFirebaseFirestore.collection("Users")
                        .document(tvgog.getText().toString())
                        .set(objectMap)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {


                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Sign2.this, "F", Toast.LENGTH_SHORT).show();
                            }
                        });

            } else {
                Toast.makeText(Sign2.this, "Enter Values", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Toast.makeText(Sign2.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideRight(this);
    }

}
