package com.example.inclassactiyity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.view.View;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.gson.Gson;


public abstract class MainActivity extends AppCompatActivity {
    public static final String DATA="DATA";
    private int num;
    Book[] books= new Book[num];
    private EditText title;
    private EditText name;
    private EditText page;
    private Button btnadd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void btnsaveOnclick (View view) {

            SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor =prefs.edit();
            Gson gson =new Gson();
            String booksString = gson.toJson(books);

            editor.putString(DATA,booksString);
            editor.commit();
            Toast.makeText(this, "Books Saved :\n" + booksString, Toast.LENGTH_SHORT).show();

        }

        public void btnaddClick(View view){
            title=findViewById(R.id.title);
            name=findViewById(R.id.editname);
            page=findViewById(R.id.editpage);

            books[num]=new Book(title ,name ,page);


        }




        }




