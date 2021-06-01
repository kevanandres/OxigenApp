package com.tit.oxigenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Diagrama_Paciente extends AppCompatActivity {
    Button regresarBtn;
    LineChart lineChart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagrama_paciente);

        regresarBtn = findViewById(R.id.regresar_diag_btn);

        lineChart= findViewById(R.id.lineGrafica);
        LineDataSet lineDataSet = new LineDataSet(dataValues1(),"Entradas");
        ArrayList<ILineDataSet> dataSets=new ArrayList<>();
        lineDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSets.add(lineDataSet);

        LineData data = new LineData(dataSets);
        lineChart.setData(data);
        lineChart.invalidate();

        regresarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Patient.class));
            }
        });
    }

    private ArrayList<Entry> dataValues1(){
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry(1,76));
        dataVals.add(new Entry(2,75));
        dataVals.add(new Entry(3,91));
        dataVals.add(new Entry(4,79));
        dataVals.add(new Entry(5,87));
        dataVals.add(new Entry(6,86));
        dataVals.add(new Entry(7,90));
        dataVals.add(new Entry(8,99));
        dataVals.add(new Entry(9,80));
        dataVals.add(new Entry(10,95));
        dataVals.add(new Entry(11,97));
        dataVals.add(new Entry(12,87));
        dataVals.add(new Entry(13,92));
        dataVals.add(new Entry(14,93));
        dataVals.add(new Entry(15,94));
        dataVals.add(new Entry(16,85));
        dataVals.add(new Entry(17,80));
        dataVals.add(new Entry(18,83));
        dataVals.add(new Entry(19,89));
        dataVals.add(new Entry(20,90));
        dataVals.add(new Entry(21,96));
        dataVals.add(new Entry(22,95));
        dataVals.add(new Entry(23,90));

        return dataVals;
    }
}
