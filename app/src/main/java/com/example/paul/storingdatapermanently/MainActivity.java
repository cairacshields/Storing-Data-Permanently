package com.example.paul.storingdatapermanently;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*
    We are going to go over how to use shared preferences to save our users data!
    Shared Preferences is a great way to store small amounts of data, such as a users preferences!
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //The following line of code will initialize our SharedPreferences, we have to pass in our package name and
        //specify a mode for which we want our data to be kept. Usually we want it to be Private.
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.paul.storingdatapermanently", Context.MODE_PRIVATE);

        //The below line of code is how we actually put items into our shared preference, you need to provide
        //a key and a value in order to store objects in shared preferences. This is so that we can retrieve items when
        //necessary.
        sharedPreferences.edit().putString("Username", "Caira").apply();

        //We can create a variable to hold the value of our users Username, which we will retrieve from our
        //SharedPreference variable using the specified Key. 
        String username = sharedPreferences.getString("Username", "");

        //Now we can log the value of our Username key to see that whatever we stored is there
        Log.i("Username", username);
    }
}
