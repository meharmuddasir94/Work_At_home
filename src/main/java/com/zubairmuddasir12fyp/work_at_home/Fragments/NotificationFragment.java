package com.zubairmuddasir12fyp.work_at_home.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.zubairmuddasir12fyp.work_at_home.FbAdapter;
import com.zubairmuddasir12fyp.work_at_home.FbAdapter5;
import com.zubairmuddasir12fyp.work_at_home.ModelClass;
import com.zubairmuddasir12fyp.work_at_home.ModelClass5;
import com.zubairmuddasir12fyp.work_at_home.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {
    private FirebaseFirestore objectFirebaseFirestore;
    private FbAdapter5 objectFbAdapter;
    private RecyclerView objectrecyclerView;
    private List<ModelClass5> list;
    private View objviewhome;
    DatabaseReference reference;
    FirebaseAuth mAuth;

    DocumentReference documentReference;

    public NotificationFragment() {
        // Required empty public constructor
    }

    private void initializationVariable() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        objviewhome = inflater.inflate(R.layout.fragment_notification, container, false);
        initializationVariable();
        mAuth = FirebaseAuth.getInstance();
        objectrecyclerView = objviewhome.findViewById(R.id.rec);
        objectFirebaseFirestore = FirebaseFirestore.getInstance();
        addstatusToRV();
        return objviewhome;
    }

    private void addstatusToRV() {
        try {

            Query objectQuery = objectFirebaseFirestore.collection("Notification");
            FirestoreRecyclerOptions<ModelClass5> objectoptions
                    = new FirestoreRecyclerOptions.Builder<ModelClass5>()
                    .setQuery(objectQuery, ModelClass5.class)
                    .build();


            objectFbAdapter = new FbAdapter5(objectoptions, getActivity().getApplicationContext());
            objectrecyclerView.setAdapter(objectFbAdapter);
            objectrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext(), LinearLayoutManager.HORIZONTAL, true));


        } catch (Exception e) {

        }

    }

    @Override
    public void onStart() {
        super.onStart();
        objectFbAdapter.startListening();

    }

    @Override
    public void onStop() {
        super.onStop();

        objectFbAdapter.stopListening();
    }

}
