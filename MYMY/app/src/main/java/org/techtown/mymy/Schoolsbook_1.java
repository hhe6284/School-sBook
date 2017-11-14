package org.techtown.mymy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Schoolsbook_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_1);
        Intent intent = getIntent();
        String code  = intent.getStringExtra("code");

        FirebaseDatabase.getInstance().getReference("new Group").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Intent intent = getIntent();
                String code = intent.getStringExtra("code");
                String mon1 = (String) dataSnapshot.child(code).child("mon_1").getValue();
                String mon2 = (String) dataSnapshot.child(code).child("mon_2").getValue();
                String mon3 = (String) dataSnapshot.child(code).child("mon_3").getValue();
                String mon4 = (String) dataSnapshot.child(code).child("mon_4").getValue();
                String mon5 = (String) dataSnapshot.child(code).child("mon_5").getValue();
                String mon6 = (String) dataSnapshot.child(code).child("mon_6").getValue();
                String mon7 = (String) dataSnapshot.child(code).child("mon_7").getValue();
                String tue1 = (String) dataSnapshot.child(code).child("tue_1").getValue();
                String tue2 = (String) dataSnapshot.child(code).child("tue_2").getValue();
                String tue3 = (String) dataSnapshot.child(code).child("tue_3").getValue();
                String tue4 = (String) dataSnapshot.child(code).child("tue_4").getValue();
                String tue5 = (String) dataSnapshot.child(code).child("tue_5").getValue();
                String tue6 = (String) dataSnapshot.child(code).child("tue_6").getValue();
                String tue7 = (String) dataSnapshot.child(code).child("tue_7").getValue();
                String wed1 = (String) dataSnapshot.child(code).child("wed_1").getValue();
                String wed2 = (String) dataSnapshot.child(code).child("wed_2").getValue();
                String wed3 = (String) dataSnapshot.child(code).child("wed_3").getValue();
                String wed4 = (String) dataSnapshot.child(code).child("wed_4").getValue();
                String wed5 = (String) dataSnapshot.child(code).child("wed_5").getValue();
                String wed6 = (String) dataSnapshot.child(code).child("wed_6").getValue();
                String wed7 = (String) dataSnapshot.child(code).child("wed_7").getValue();
                String thu1 = (String) dataSnapshot.child(code).child("thu_1").getValue();
                String thu2 = (String) dataSnapshot.child(code).child("thu_2").getValue();
                String thu3 = (String) dataSnapshot.child(code).child("thu_3").getValue();
                String thu4 = (String) dataSnapshot.child(code).child("thu_4").getValue();
                String thu5 = (String) dataSnapshot.child(code).child("thu_5").getValue();
                String thu6 = (String) dataSnapshot.child(code).child("thu_6").getValue();
                String thu7 = (String) dataSnapshot.child(code).child("thu_7").getValue();
                String fri1 = (String) dataSnapshot.child(code).child("fri_1").getValue();
                String fri2 = (String) dataSnapshot.child(code).child("fri_2").getValue();
                String fri3 = (String) dataSnapshot.child(code).child("fri_3").getValue();
                String fri4 = (String) dataSnapshot.child(code).child("fri_4").getValue();
                String fri5 = (String) dataSnapshot.child(code).child("fri_5").getValue();
                String fri6 = (String) dataSnapshot.child(code).child("fri_6").getValue();
                String fri7 = (String) dataSnapshot.child(code).child("fri_7").getValue();



                Log.d("미미a",mon1);
                TextView mon_1 = (TextView) findViewById(R.id.mon_1);
                TextView mon_2 = (TextView) findViewById(R.id.mon_2);
                TextView mon_3 = (TextView) findViewById(R.id.mon_3);
                TextView mon_4 = (TextView) findViewById(R.id.mon_4);
                TextView mon_5 = (TextView) findViewById(R.id.mon_5);
                TextView mon_6 = (TextView) findViewById(R.id.mon_6);
                TextView mon_7 = (TextView) findViewById(R.id.mon_7);
                TextView tue_1 = (TextView) findViewById(R.id.tue_1);
                TextView tue_2 = (TextView) findViewById(R.id.tue_2);
                TextView tue_3 = (TextView) findViewById(R.id.tue_3);
                TextView tue_4 = (TextView) findViewById(R.id.tue_4);
                TextView tue_5 = (TextView) findViewById(R.id.tue_5);
                TextView tue_6 = (TextView) findViewById(R.id.tue_6);
                TextView tue_7 = (TextView) findViewById(R.id.tue_7);
                TextView wed_1 = (TextView) findViewById(R.id.wed_1);
                TextView wed_2 = (TextView) findViewById(R.id.wed_2);
                TextView wed_3 = (TextView) findViewById(R.id.wed_3);
                TextView wed_4 = (TextView) findViewById(R.id.wed_4);
                TextView wed_5 = (TextView) findViewById(R.id.wed_5);
                TextView wed_6 = (TextView) findViewById(R.id.wed_6);
                TextView wed_7 = (TextView) findViewById(R.id.wed_7);
                TextView thu_1 = (TextView) findViewById(R.id.thu_1);
                TextView thu_2 = (TextView) findViewById(R.id.thu_2);
                TextView thu_3 = (TextView) findViewById(R.id.thu_3);
                TextView thu_4 = (TextView) findViewById(R.id.thu_4);
                TextView thu_5 = (TextView) findViewById(R.id.thu_5);
                TextView thu_6 = (TextView) findViewById(R.id.thu_6);
                TextView thu_7 = (TextView) findViewById(R.id.thu_7);
                TextView fri_1 = (TextView) findViewById(R.id.fri_1);
                TextView fri_2 = (TextView) findViewById(R.id.fri_2);
                TextView fri_3 = (TextView) findViewById(R.id.fri_3);
                TextView fri_4 = (TextView) findViewById(R.id.fri_4);
                TextView fri_5 = (TextView) findViewById(R.id.fri_5);
                TextView fri_6 = (TextView) findViewById(R.id.fri_6);
                TextView fri_7 = (TextView) findViewById(R.id.fri_7);


                Log.d("미미",code);
                mon_1.setText(mon1);
                mon_2.setText(mon2);
                mon_3.setText(mon3);
                mon_4.setText(mon4);
                mon_5.setText(mon5);
                mon_6.setText(mon6);
                mon_7.setText(mon7);
                tue_1.setText(tue1);
                tue_2.setText(tue2);
                tue_3.setText(tue3);
                tue_4.setText(tue4);
                tue_5.setText(tue5);
                tue_6.setText(tue6);
                tue_7.setText(tue7);
                wed_1.setText(wed1);
                wed_2.setText(wed2);
                wed_3.setText(wed3);
                wed_4.setText(wed4);
                wed_5.setText(wed5);
                wed_6.setText(wed6);
                wed_7.setText(wed7);
                thu_1.setText(thu1);
                thu_2.setText(thu2);
                thu_3.setText(thu3);
                thu_4.setText(thu4);
                thu_5.setText(thu5);
                thu_6.setText(thu6);
                thu_7.setText(thu7);
                fri_1.setText(fri1);
                fri_2.setText(fri2);
                fri_3.setText(fri3);
                fri_4.setText(fri4);
                fri_5.setText(fri5);
                fri_6.setText(fri6);
                fri_7.setText(fri7);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}