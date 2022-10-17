package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Integer>carList1=new ArrayList<>();
    private ArrayList<String>carList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

       carList1.add(R.drawable.cae);
       carList.add("Rolls-Royce Dawn Drophead 1949");
       carList1.add(R.drawable.chevroletcorvette1963);
        carList.add("Chevrolet Corvette 1963");
       carList1.add(R.drawable.jaguaretype1961);
        carList.add("Jaguar E Type 1961");
       carList1.add(R.drawable.astonmartin1964);
        carList.add("Aston Martin 1964");
       carList1.add(R.drawable.bmwcsl1972);
        carList.add("BMW CSL 1972");
       carList1.add(R.drawable.britishmotorcorporation1959);
        carList.add("British Motor Corporation 1959");
       carList1.add(R.drawable.bugatti57atlantic1938);
        carList.add("Bugatti 57 Atlantic 1938");
       carList1.add(R.drawable.detomasopantera1970);
        carList.add("Detomaspantera 1970");
       carList1.add(R.drawable.jaguarxjs1989);
        carList.add("Jaguar XJS 1989");
       carList1.add(R.drawable.fordmodelt1908);
        carList.add("Ford Model T 1908");
       carList1.add(R.drawable.dodgeviper1991);
        carList.add("Dodge Viper 1991");
       carList1.add(R.drawable.ferrari250gto1962);
        carList.add("Ferrari 250 G TO 1962");
       carList1.add(R.drawable.fordmustangshelbygt3501965);
        carList.add("Ford Mustang Shelby GT 350 21965");
       carList1.add(R.drawable.chevroletelcaminoss1970);
        carList.add("Chevrolete el camino SS 1970");
        carList1.add(R.drawable.fordthunderbird1971);
       carList.add("Ford thunderbird 1971");



        RVAdapter rvAdapter = new RVAdapter(carList1,carList);
        recyclerView.setAdapter(rvAdapter);
    }

}