package com.example.ListView;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment41.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView stationeryListView = findViewById(R.id.stationeryListView);

        // Sample data
        ArrayList<ShopItem> items = new ArrayList<>();
        items.add(new ShopItem("Highlighter", "Markers that emphasize key points in books or notes.", R.highlighter));
        items.add(new ShopItem("Study Lamp", "Provides focused lighting for reading or writing in dim settings.\n", R.drawable.StudyLamp));
        items.add(new ShopItem("Sticky Notes", "Small, adhesive papers for reminders or annotations.", R.drawable.StickyNotes));

        // Set adapter
        ShopAdapter adapter = new ShopAdapter(this, items);
        stationeryListView.setAdapter(adapter);
    }
}