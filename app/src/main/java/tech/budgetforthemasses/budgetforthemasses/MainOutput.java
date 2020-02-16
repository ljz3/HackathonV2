package tech.budgetforthemasses.budgetforthemasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainOutput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_output);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent i = getIntent();
        String food = i.getStringExtra("food");
        String rent = i.getStringExtra("rent");
        String util = i.getStringExtra("util");
        String want = i.getStringExtra("want");
        String saved = i.getStringExtra("saved");
        String leftover = i.getStringExtra("leftover");
        String income = i.getStringExtra("income");
        Long formated = Math.round(Double.parseDouble(rent)*100);

        TextView textboxResult = (TextView) (findViewById(R.id.rent_result));
        textboxResult.setText(formated/100+"");
        TextView textboxIncome = (TextView) (findViewById(R.id.incomeAfterTax_result));
        textboxIncome.setText(income);
        TextView textboxFood = (TextView) (findViewById(R.id.food_result));
        textboxFood.setText(food);
        TextView textboxUtilities = (TextView) (findViewById(R.id.util_result));
        textboxUtilities.setText(util);
        TextView textboxWants = (TextView) (findViewById(R.id.wants_result));
        textboxWants.setText(want);
        TextView textboxLeftover = (TextView) (findViewById(R.id.leftover_result));
        textboxLeftover.setText(leftover);
        TextView textboxSavings = (TextView) (findViewById(R.id.saving_result));
        textboxSavings.setText(saved);

    }

    public void MoreTips(View view) {
    }
}
