package com.zubairmuddasir12fyp.work_at_home.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.zubairmuddasir12fyp.work_at_home.R;
import com.zubairmuddasir12fyp.work_at_home.gigs;

import java.util.HashMap;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link intersts_sub#newInstance} factory method to
 * create an instance of this fragment.
 */
public class intersts_sub extends Fragment {
    private View objinterview;
    private TextView des2, users;
    private LinearLayout lv1;
    private ImageView gp;
    private String catergory;
    private DocumentReference documentReference;
    private FirebaseAuth auth;
    private FirebaseFirestore firebaseFirestore;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public intersts_sub() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment intersts_sub.
     */
    // TODO: Rename and change types and number of parameters
    public static intersts_sub newInstance(String param1, String param2) {
        intersts_sub fragment = new intersts_sub();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public void install() {
        des2 = objinterview.findViewById(R.id.des2);
        gp = objinterview.findViewById(R.id.gp);
        users = objinterview.findViewById(R.id.users);
        auth = FirebaseAuth.getInstance();
        lv1 = objinterview.findViewById(R.id.lv);

        firebaseFirestore = FirebaseFirestore.getInstance();
        if (auth != null) {
            String i = auth.getCurrentUser().getEmail();
            users.setText(i);
        } else {
            String j = auth.getCurrentUser().getDisplayName();
            users.setText(j);
        }

        if (!users.getText().toString().isEmpty()) {
            documentReference = firebaseFirestore.collection("Interest").document(users.getText().toString());
            documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                @Override
                public void onSuccess(DocumentSnapshot documentSnapshot) {
                    String username = documentSnapshot.getId();
                    String usercatory = documentSnapshot.getString("Category");
                    String useremail = documentSnapshot.getString("email");
                    if (usercatory != null) {

                        if (usercatory.equals("1")) {
                            des2.setText(R.string.logod);
                            gp.setImageResource(R.drawable.an);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.logod));
                                    startActivity(intent);
                                }
                            });

                        }
                        if (usercatory.equals("2")) {
                            des2.setText(R.string.logoA);
                            gp.setImageResource(R.drawable.gr);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.logoA));
                                    startActivity(intent);
                                }
                            });

                        }
                        if (usercatory.equals("3")) {
                            des2.setText(R.string.busc);
                            gp.setImageResource(R.drawable.nn);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.busc));
                                    startActivity(intent);
                                }
                            });

                        }
                        if (usercatory.equals("4")) {
                            des2.setText(R.string.traf);
                            gp.setImageResource(R.drawable.webt);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.traf));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("5")) {
                            des2.setText(R.string.soc);
                            gp.setImageResource(R.drawable.socialdes);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.soc));
                                    startActivity(intent);
                                }
                            });


                        }

                        if (usercatory.equals("6")) {
                            des2.setText(R.string.tshir);
                            gp.setImageResource(R.drawable.ahirt);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.tshir));
                                    startActivity(intent);
                                }
                            });


                        }

                        if (usercatory.equals("7")) {
                            des2.setText(R.string.voice);
                            gp.setImageResource(R.drawable.voics);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.voice));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("8")) {
                            des2.setText(R.string.seo);
                            gp.setImageResource(R.drawable.seo);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.seo));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("9")) {
                            des2.setText(R.string.photo);
                            gp.setImageResource(R.drawable.photo);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.photo));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("10")) {
                            des2.setText(R.string.artic);
                            gp.setImageResource(R.drawable.blog);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.artic));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("11")) {
                            des2.setText(R.string.word);
                            gp.setImageResource(R.drawable.wordpress);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.word));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("12")) {
                            des2.setText(R.string.ill);
                            gp.setImageResource(R.drawable.ill);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.ill));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("13")) {
                            des2.setText(R.string.mob);
                            gp.setImageResource(R.drawable.mobile);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.mob));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("14")) {
                            des2.setText(R.string.cra);
                            gp.setImageResource(R.drawable.creat);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.cra));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("15")) {
                            des2.setText(R.string.websd);
                            gp.setImageResource(R.drawable.web);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.websd));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("16")) {
                            des2.setText(R.string.inte);
                            gp.setImageResource(R.drawable.arct);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.inte));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("17")) {
                            des2.setText(R.string.res);
                            gp.setImageResource(R.drawable.res);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.res));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("18")) {
                            des2.setText(R.string.vid);
                            gp.setImageResource(R.drawable.video);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.vid));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("19")) {
                            des2.setText(R.string.mus);
                            gp.setImageResource(R.drawable.musiv);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.mus));
                                    startActivity(intent);
                                }
                            });


                        }
                        if (usercatory.equals("20")) {
                            des2.setText(R.string.other);
                            gp.setImageResource(R.drawable.othe);
                            lv1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(getActivity().getApplicationContext(), gigs.class);
                                    intent.putExtra("full", getString(R.string.other));
                                    startActivity(intent);
                                }
                            });


                        }
                    }
                }

            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        objinterview = inflater.inflate(R.layout.fragment_intersts_sub, container, false);
        install();
        return objinterview;
    }


}