package com.zubairmuddasir12fyp.work_at_home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class FbAdapter5 extends FirestoreRecyclerAdapter<ModelClass5, FbAdapter5.FbViewHolder5> {
    Context context;

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public FbAdapter5(@NonNull FirestoreRecyclerOptions<ModelClass5> options, Context context) {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(@NonNull final FbViewHolder5 fbViewHolder, int i, @NonNull final ModelClass5 modelClass) {
        final String userName = getSnapshots().getSnapshot(i).getId();
        fbViewHolder.usTV.setText(modelClass.getTitle());
        fbViewHolder.blTV.setText(modelClass.getBody());
        fbViewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, open_news.class);
                intent.putExtra("userdes", modelClass.getTitle());
                intent.putExtra("usertime", modelClass.getBody());
                context.startActivity(intent);
            }
        });

    }

    @NonNull
    @Override
    public FbViewHolder5 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FbViewHolder5(LayoutInflater.from(context)
                .inflate(R.layout.notification_news, parent, false));

    }

    public class FbViewHolder5 extends RecyclerView.ViewHolder {
        TextView usTV, blTV, ciTV, coTV;
        View view;

        public FbViewHolder5(@NonNull View singleRow) {
            super(singleRow);
            usTV = singleRow.findViewById(R.id.username);
            blTV = singleRow.findViewById(R.id.username2);
            view = singleRow;

        }


    }
}

