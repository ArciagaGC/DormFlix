package com.example.dormflixv2;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class feedbacksuccess extends AppCompatActivity {
    Button submit;
    TextView comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackstart);

        submit = findViewById(R.id.btnSubmit);
        comment = findViewById(R.id.feedbox);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(comment.getText().toString())){
                    Toast.makeText(feedbacksuccess.this,"Field cannot be empty", Toast.LENGTH_LONG).show();

                }
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference();

                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        Object value =  snapshot.getValue();

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Toast.makeText(feedbacksuccess.this, "Failed to send !", Toast.LENGTH_LONG).show();

                    }
                });
                myRef.child("feedbacks").child(comment.getText().toString()).child("comments").setValue(comment.getText().toString());
                Toast.makeText(feedbacksuccess.this,"Thanks for feedback", Toast.LENGTH_LONG).show();
            }
        });



        }
}
