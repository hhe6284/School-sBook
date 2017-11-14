package org.techtown.mymy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class CodeActivity extends AppCompatActivity {

    EditText editcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        editcode = (EditText)findViewById(R.id.코드_e);
        Button btn01 = (Button)findViewById(R.id.button);
        Button btn02 = (Button)findViewById(R.id.button2);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CodeActivity.this, FirstForm.class);
                startActivity(intent);
            }
        });
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        String code = editcode.getText().toString().trim();
//        DatabaseReference bbsRef = database.getReference("new Group").child("lipstic");
//       bbsRef.addValueEventListener(new ValueEventListener() {
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                        Log.d("MainActivity", "ValueEventListener : " + snapshot.getValue());
//
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });





        btn02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String code = editcode.getText().toString().trim();

                FirebaseDatabase.getInstance().getReference("new Group").addListenerForSingleValueEvent(
                        new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String code = editcode.getText().toString().trim();
                                String nn = (String) dataSnapshot.child(code).child("key").getValue();



                                // Log.d("이거는nn", nn);
                                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                    String kk = (String) snapshot.getKey();
                                    Log.d("오오오오", kk);
                                    if (!(kk.equals(code))) {
                                        Log.d("이거이거이거", "으헝");
                                        Toast.makeText(CodeActivity.this, "제대로 된 값 입력바람", Toast.LENGTH_LONG);

                                    }


                                }
                                if (nn.equals(code)) {
                                    Intent intent = new Intent(CodeActivity.this, Schoolsbook_1.class);
                                    intent.putExtra("code",code);
                                    startActivity(intent);
                                    Log.d("이거는2nn", nn);

                                }








                                Log.d("오오", code);

                                //   Log.d("호호",nn);
                                // for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                // boolean isCorrect = nn == code;
                                // Log.d("아아악", "아아악 : " + snapshot.getValue());




                            }
                           // }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });

            }
        });



    }

}