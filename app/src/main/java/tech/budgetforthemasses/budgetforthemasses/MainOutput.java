package tech.budgetforthemasses.budgetforthemasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

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


        TextView textboxOne = (TextView)(findViewById(R.id.rent_result));
        textboxOne.setText(rent +"");
        TextView textboxTwo = (TextView)(findViewById(R.id.incomeAfterTax_result));
        textboxTwo.setText(income + "");
        TextView textboxThree = (TextView)(findViewById(R.id.food_result));
        textboxThree.setText(food +"");
        TextView textboxFour = (TextView)(findViewById(R.id.util_result));
        textboxFour.setText(util+"");
        TextView textboxFive = (TextView)(findViewById(R.id.wants_result));
        textboxFive.setText(want+"");
        TextView textboxSix = (TextView)(findViewById(R.id.leftover_result));
        textboxSix.setText(leftover+"");
        TextView textboxSeven = (TextView)(findViewById(R.id.saving_result));
        textboxSeven.setText(saved+"");

    }

}
