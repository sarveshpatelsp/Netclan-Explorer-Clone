package com.example.dummy;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dummy.ui.explore.ExploreFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;

import com.example.dummy.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    BottomNavigationView navView;
    Toolbar toolbar;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        navView = findViewById(R.id.nav_view);
            AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_explore, R.id.navigation_network, R.id.navigation_chat , R.id.navigation_contacts , R.id.navigation_groups)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(binding.navView, navController);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setLogo(R.drawable.menu);

        linearLayout = findViewById(R.id.refine_layout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Refine.class);
                startActivity(intent);
            }
        });
    }
}