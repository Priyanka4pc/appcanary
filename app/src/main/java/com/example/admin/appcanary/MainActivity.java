package com.example.admin.appcanary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView box1, box2, box_unit, sup1, sup, CO2, pressure_unit, temp_unit;
    private LinearLayout pm1, pm2, pm10, co2, voc, temp, pressure;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        box1 = (TextView) findViewById(R.id.box1);
        box1.setText(R.string.pm1Value);
        box1.setVisibility(View.VISIBLE);
        box2 = (TextView) findViewById(R.id.box);
        box2.setText(R.string.co2Value);
        box_unit = (TextView) findViewById(R.id.pm_unit);
        box2.setVisibility(View.VISIBLE);
        pm1 = (LinearLayout) findViewById(R.id.linearLayout10);
        pm2 = (LinearLayout) findViewById(R.id.linearLayout11);
        pm10 = (LinearLayout) findViewById(R.id.linearLayout12);
        co2 = (LinearLayout) findViewById(R.id.linearLayout6);
        voc = (LinearLayout) findViewById(R.id.linearLayout7);
        temp = (LinearLayout) findViewById(R.id.linearLayout8);
        pressure_unit=(TextView) findViewById(R.id.pressure_unit);
        pressure_unit.setVisibility(View.GONE);
        temp_unit=(TextView) findViewById(R.id.temp_unit);
        temp_unit.setVisibility(View.GONE);
        pressure = (LinearLayout) findViewById(R.id.linearLayout9);
        sup1=(TextView) findViewById(R.id.pm_unit1);
        sup1.setText("μ/m\u00B3");
        sup=(TextView) findViewById(R.id.pm_unit);
        sup.setText("μ/m\u00B3");
        CO2=(TextView) findViewById(R.id.CO2);
        CO2.setText("CO\u2082");

    }

    public void pm1(View view){
        box1.setText(R.string.pm1Value);
        box1.setVisibility(View.VISIBLE);
        pm1.setBackgroundResource(R.drawable.layout_main_display);
        pm1.setVisibility(View.VISIBLE);
        pm2.setBackgroundResource(R.drawable.layout_small_boxes);
        pm2.setVisibility(View.VISIBLE);
        pm10.setBackgroundResource(R.drawable.layout_small_boxes);
        pm10.setVisibility(View.VISIBLE);


    }
    public void pm2(View view) {
        box1.setText(R.string.pm2Value);
        box1.setVisibility(View.VISIBLE);
        pm1.setBackgroundResource(R.drawable.layout_small_boxes);
        pm1.setVisibility(View.VISIBLE);
        pm2.setBackgroundResource(R.drawable.layout_main_display);
        pm2.setVisibility(View.VISIBLE);
        pm10.setBackgroundResource(R.drawable.layout_small_boxes);
        pm10.setVisibility(View.VISIBLE);

    }
    public void pm10(View view) {
        box1.setText(R.string.pm10Value);
        box1.setVisibility(View.VISIBLE);
        pm1.setBackgroundResource(R.drawable.layout_small_boxes);
        pm1.setVisibility(View.VISIBLE);
        pm2.setBackgroundResource(R.drawable.layout_small_boxes);
        pm2.setVisibility(View.VISIBLE);
        pm10.setBackgroundResource(R.drawable.layout_main_display);
        pm10.setVisibility(View.VISIBLE);

    }
    public void co2(View view) {
        box2.setText(R.string.co2Value);
        box2.setVisibility(View.VISIBLE);
        co2.setBackgroundResource(R.drawable.layout_main_display);
        co2.setVisibility(View.VISIBLE);
        voc.setBackgroundResource(R.drawable.layout_small_boxes);
        voc.setVisibility(View.VISIBLE);
        temp.setBackgroundResource(R.drawable.layout_small_boxes);
        temp.setVisibility(View.VISIBLE);
        pressure.setBackgroundResource(R.drawable.layout_small_boxes);
        pressure.setVisibility(View.VISIBLE);
        box_unit.setVisibility(View.VISIBLE);
        pressure_unit.setVisibility(View.GONE);
        temp_unit.setVisibility(View.GONE);

    }
    public void voc(View view) {
        box2.setText(R.string.vocValue);
        box2.setVisibility(View.VISIBLE);
        co2.setBackgroundResource(R.drawable.layout_small_boxes);
        co2.setVisibility(View.VISIBLE);
        voc.setBackgroundResource(R.drawable.layout_main_display);
        voc.setVisibility(View.VISIBLE);
        temp.setBackgroundResource(R.drawable.layout_small_boxes);
        temp.setVisibility(View.VISIBLE);
        pressure.setBackgroundResource(R.drawable.layout_small_boxes);
        pressure.setVisibility(View.VISIBLE);
        box_unit.setVisibility(View.VISIBLE);
        pressure_unit.setVisibility(View.GONE);
        temp_unit.setVisibility(View.GONE);

    }
    public void temperature(View view) {
        box2.setText(R.string.tempValue);
        box2.setVisibility(View.VISIBLE);
        co2.setBackgroundResource(R.drawable.layout_small_boxes);
        co2.setVisibility(View.VISIBLE);
        voc.setBackgroundResource(R.drawable.layout_small_boxes);
        voc.setVisibility(View.VISIBLE);
        temp.setBackgroundResource(R.drawable.layout_main_display);
        temp.setVisibility(View.VISIBLE);
        pressure.setBackgroundResource(R.drawable.layout_small_boxes);
        pressure.setVisibility(View.VISIBLE);
        box_unit.setVisibility(View.GONE);
        pressure_unit.setVisibility(View.GONE);
        temp_unit.setVisibility(View.VISIBLE);

    }
    public void pressure(View view) {
        box2.setText(R.string.pressureValue);
        box2.setVisibility(View.VISIBLE);
        co2.setBackgroundResource(R.drawable.layout_small_boxes);
        co2.setVisibility(View.VISIBLE);
        voc.setBackgroundResource(R.drawable.layout_small_boxes);
        voc.setVisibility(View.VISIBLE);
        temp.setBackgroundResource(R.drawable.layout_small_boxes);
        temp.setVisibility(View.VISIBLE);
        pressure.setBackgroundResource(R.drawable.layout_main_display);
        pressure.setVisibility(View.VISIBLE);
        box_unit.setVisibility(View.GONE);
        pressure_unit.setVisibility(View.VISIBLE);
        temp_unit.setVisibility(View.GONE);


    }

}
