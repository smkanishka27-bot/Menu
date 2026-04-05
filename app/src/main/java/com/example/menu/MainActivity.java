package com.example.menu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFile = findViewById(R.id.btnFile);

        btnFile.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnFile);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();

                if (id == R.id.menu_new) {
                    Toast.makeText(MainActivity.this, "New clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.menu_open) {
                    Toast.makeText(MainActivity.this, "Open clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }

                return false;
            });

            popupMenu.show();
        });
    }
}