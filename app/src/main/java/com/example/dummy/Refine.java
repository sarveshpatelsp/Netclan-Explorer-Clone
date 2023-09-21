package com.example.dummy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.chip.Chip;

public class Refine extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] availability = { "Available", "Stay Away", "SOS", "Busy",
            "Right Now in GYM", "Talk you within half an hour" };
    Spinner spinner;
    Chip chip1,chip2,chip3,chip4,chip5,chip6,chip7,chip8;
    SeekBar seekBar;
    TextView seekBarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        chip1 = findViewById(R.id.refine_chip1);
        chip2 = findViewById(R.id.refine_chip2);
        chip3 = findViewById(R.id.refine_chip3);
        chip4 = findViewById(R.id.refine_chip4);
        chip5 = findViewById(R.id.refine_chip5);
        chip6 = findViewById(R.id.refine_chip6);
        chip7 = findViewById(R.id.refine_chip7);
        chip8 = findViewById(R.id.refine_chip8);

        seekBar = findViewById(R.id.refine_seekbar);
        seekBarText = findViewById(R.id.refine_seekbar_text);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekBarText.setText(i+" / "+"100 Km");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        spinner = findViewById(R.id.refine_spinner);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter ad =
                new ArrayAdapter(this, android.R.layout.simple_spinner_item, availability);

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(ad);

        chip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip1.setChecked(true);
                chip1.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_500)));
                chip1.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
            }
        });
        chip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip2.setChecked(true);
                chip2.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_500)));
                chip2.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
            }
        });
        chip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip3.setChecked(true);
                chip3.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_500)));
                chip3.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
            }
        });
        chip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip4.setChecked(true);
                chip4.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_500)));
                chip4.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
            }
        });
        chip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip5.setChecked(true);
                chip5.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_500)));
                chip5.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
            }
        });
        chip6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip6.setChecked(true);
                chip6.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_500)));
                chip6.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
            }
        });
        chip7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip7.setChecked(true);
                chip7.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_500)));
                chip7.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
            }
        });
        chip8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip8.setChecked(true);
                chip8.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_500)));
                chip8.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}