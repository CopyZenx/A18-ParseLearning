package com.musayilmaz.parselearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DATABASE DATABASE

        /*
        ParseObject object = new ParseObject("Fruits");

        object.put("name", "apple");
        object.put("calories", 100);
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e!= null) {
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Object Saved" , Toast.LENGTH_LONG).show();
                }
            }
        });*/

            /*
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits1");
        query.getInBackground("icu4usOVPk", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e!=null) {
                    e.printStackTrace();

                } else {
                    String  objetName = object.getString("name");
                    int objetCalories = object.getInt("calories");
                }
            }
        });*/

        /*

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits");
        query.whereEqualTo("name","banana");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {

                if (e != null) {
                    e.printStackTrace();
                } else {
                    if (objects.size() > 0) {

                        for (ParseObject object : objects) {
                            String objectName = object.getString("name");
                            int objetCalorie = object.getInt("calories");

                            System.out.println("object name" + objectName);
                            System.out.println("object calorie" + objetCalorie);

                        }

                    }
                }
            }
        });

         */

        //USER USER USER
        /*
        ParseUser user = new ParseUser();
        user.setUsername("James");
        user.setPassword("123456");

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e!=null) {
                    e.printStackTrace();
                } else {
                    Toast.makeText(MainActivity.this, "User Signed Up!", Toast.LENGTH_LONG).show();
                }
            }
        });

         */

        ParseUser.logInInBackground("James", "123456", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e != null) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Welcome" + user.getUsername(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}