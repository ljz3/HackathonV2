package tech.budgetforthemasses.budgetforthemasses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainOutput extends AppCompatActivity {
    PieChartView pieChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        int food = i.getIntExtra("food", -1);
        int rent = i.getIntExtra("rent", -1);
        int util = i.getIntExtra("util", -1);
        int want = i.getIntExtra("want", -1);
        int saved = i.getIntExtra("saved", -1);
        int leftover = i.getIntExtra("leftover", -1);

        pieChartView = findViewById(R.id.chart);

        List pieData = new ArrayList<>();
        pieData.add(new SliceValue(food, Color.BLUE).setLabel("Food"));
        pieData.add(new SliceValue(rent, Color.GRAY).setLabel("Rent"));
        pieData.add(new SliceValue(util, Color.RED).setLabel("Utilities"));
        pieData.add(new SliceValue(want, Color.GREEN).setLabel("Wants"));
        pieData.add(new SliceValue(saved, Color.MAGENTA).setLabel("Saved"));
        pieData.add(new SliceValue(leftover, Color.WHITE).setLabel("Leftover"));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData.setHasCenterCircle(true).setCenterText1("Your Spending").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView.setPieChartData(pieChartData);
    }

}