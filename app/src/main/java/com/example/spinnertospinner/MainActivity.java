package com.example.spinnertospinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);

        final List<MerkHpPojo> merkHpPojos = new ArrayList<>();
        merkHpPojos.add(new MerkHpPojo("","-"));
        merkHpPojos.add(new MerkHpPojo("1","Samsung"));
        merkHpPojos.add(new MerkHpPojo("2","Asus"));
        merkHpPojos.add(new MerkHpPojo("3","Xiaomi"));
        merkHpPojos.add(new MerkHpPojo("4","Apple"));

        final List<JenisHpPojo> jenisHpPojos = new ArrayList<>();
        jenisHpPojos.add(new JenisHpPojo("1","1","samsung1"));
        jenisHpPojos.add(new JenisHpPojo("2","1","samsung2"));
        jenisHpPojos.add(new JenisHpPojo("3","1","samsung3"));
        jenisHpPojos.add(new JenisHpPojo("4","1","samsung4"));
        jenisHpPojos.add(new JenisHpPojo("5","1","samsung5"));
        jenisHpPojos.add(new JenisHpPojo("6","2","Asus1"));
        jenisHpPojos.add(new JenisHpPojo("7","2","Asus2"));
        jenisHpPojos.add(new JenisHpPojo("8","2","Asus3"));
        jenisHpPojos.add(new JenisHpPojo("9","2","Asus4"));
        jenisHpPojos.add(new JenisHpPojo("10","2","Asus5"));
        jenisHpPojos.add(new JenisHpPojo("11","3","Xiaomi1"));
        jenisHpPojos.add(new JenisHpPojo("12","3","Xiaomi2"));
        jenisHpPojos.add(new JenisHpPojo("13","3","Xiaomi3"));
        jenisHpPojos.add(new JenisHpPojo("14","3","Xiaomi4"));
        jenisHpPojos.add(new JenisHpPojo("15","3","Xiaomi5"));
        jenisHpPojos.add(new JenisHpPojo("16","4","Apple1"));
        jenisHpPojos.add(new JenisHpPojo("17","4","Apple2"));
        jenisHpPojos.add(new JenisHpPojo("18","4","Apple3"));
        jenisHpPojos.add(new JenisHpPojo("19","4","Apple4"));
        jenisHpPojos.add(new JenisHpPojo("20","4","Apple5"));

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, merkHpPojos);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                List<JenisHpPojo> temp = new ArrayList<>();
                for (JenisHpPojo jenisHpPojo:jenisHpPojos) {
                    if (jenisHpPojo.getIdMerk().equals(merkHpPojos.get(i).getId())){
                        temp.add(jenisHpPojo);
                    }
                }
                ArrayAdapter adapter2 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item, temp);
                adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(adapter2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}
