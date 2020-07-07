package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon> mypoke = new ArrayList<>();
        pokemon poke1 = new pokemon("Charmander",R.drawable.poke1,52,43,309);
        pokemon poke2 = new pokemon("Moltres ",R.drawable.poke2,100,90,580);
        mypoke.add(poke1);
        mypoke.add(poke2);


        RecyclerView rv = findViewById(R.id.RV);





        ///
    }
}