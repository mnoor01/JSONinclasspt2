package com.example.c4q.jsoninclassq2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JSONObject jsonObject = new JSONObject();
        //To do this problem I instantiated the JSONObject to a new jasonobject
        //the I created a new class called constant that has all the json object in a json
        // array.
        // the I assigne the instantiated jsonObject into a new JSONObject that will take in the variable
        // that I assigned to to all the json object we are going to parse

        try {
            jsonObject = new JSONObject(Constant.value);//After that I will make the JSONObject parse those values.
//            JSONArray dogList = jsonObject.getJSONArray("message");
            JSONObject dogList = new JSONObject(jsonObject.get("message").toString());
            List<String> dogString = new ArrayList<>();

            for (Iterator<String> it = dogList.keys(); it.hasNext(); ) {//then I will put those values in
                //a arrayList but before that I created a for each loop that will take
                //each object and put it in  the array list.
                String s = it.next();
                dogString.add(s);


            }
            for (int i = 0; i < dogString.size() ; i++) {
                Log.d("onCreate",dogString.get(i));//then I will
                //create a for loop to log every object in the json.
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
