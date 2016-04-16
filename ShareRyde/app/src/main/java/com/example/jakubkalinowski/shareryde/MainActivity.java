package com.example.jakubkalinowski.shareryde;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
    //firebase reference
    private Firebase myFirebaseRef;

//    public void login(View view){
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Initialize Firebase with Android context
        Firebase.setAndroidContext(this);

        //Initialize new Firebase with our Firebase URL
        myFirebaseRef = new Firebase("https://shareryde.firebaseio.com/");
    }

    @Override
    protected void onStart(){
        super.onStart();
    }
//    myFirebaseRef.createUser("bobtony@firebase.com", "correcthorsebatterystaple", new Firebase.ValueResultHandler<Map<String, Object>>() {
//        @Override
//        public void onSuccess(Map<String, Object> result) {
//            System.out.println("Successfully created user account with uid: " + result.get("uid"));
//        }
//        @Override
//        public void onError(FirebaseError firebaseError) {
//            // there was an error
//        }
//    });

}
