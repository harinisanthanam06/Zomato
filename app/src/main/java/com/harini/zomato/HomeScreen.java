package com.harini.zomato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.harini.zomato.adapter.AsiaFoodAdapter;
import com.harini.zomato.adapter.PopularFoodAdapter;
import com.harini.zomato.model.AsiaFood;
import com.harini.zomato.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);



        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Float Cake Vietnam", "₹100 for one", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstick", "₹50 for one", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "₹200 for one", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Italian Cake", "₹100 for one", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Brownie", "₹300 for one", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Stick", "₹100 for one", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);


        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "₹200", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Brownie", "₹250", R.drawable.asiafood2, "4.2", "Denmark"));
        asiaFoodList.add(new AsiaFood(" Pizza", "₹200", R.drawable.asiafood1, "4.5", "KFC Restaurant"));
        asiaFoodList.add(new AsiaFood("Vanilla Cake", "₹250", R.drawable.asiafood2, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Cake", "₹200", R.drawable.asiafood1, "4.5", "Annapoorna Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "₹250", R.drawable.asiafood2, "4.2", "kannappa Restaurant"));

        setAsiaRecycler(asiaFoodList);

    }


    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {

        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);

    }



}