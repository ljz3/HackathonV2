package tech.budgetforthemasses.budgetforthemasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainContent extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Button submit_button = (Button) findViewById(R.id.submit_button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText income_edit = (EditText) findViewById(R.id.income_edit);
                RadioButton time_frame = (RadioButton) findViewById(R.id.radioBiWeekly);
                EditText rent_edit = (EditText) findViewById(R.id.rent_edit);
                EditText gas_edit = (EditText) findViewById(R.id.gas_edit);
                EditText water_edit = (EditText) findViewById(R.id.water_edit);
                EditText electricity_edit = (EditText) findViewById(R.id.electricity_edit);
                EditText phone_bill_edit = (EditText) findViewById(R.id.phone_bill_edit);
                EditText food_cost_edit = (EditText) findViewById(R.id.food_cost_edit);
                EditText entertainment_edit = (EditText) findViewById(R.id.entertainment_edit);
                EditText hobbies_edit = (EditText) findViewById(R.id.hobbies_edit);
                EditText others_edit = (EditText) findViewById(R.id.others_edit);
                EditText savings_edit = (EditText) findViewById(R.id.savings_edit);

                int income = Integer.parseInt(income_edit.getText().toString());
                if (time_frame.isChecked()) {
                    income = income * 2;
                }
                int rent = Integer.parseInt(rent_edit.getText().toString());
                int gas = Integer.parseInt(gas_edit.getText().toString());
                int water = Integer.parseInt(water_edit.getText().toString());
                int electricity = Integer.parseInt(electricity_edit.getText().toString());
                int phone_bill = Integer.parseInt(phone_bill_edit.getText().toString());
                int food_cost = Integer.parseInt(food_cost_edit.getText().toString());
                int entertainment = Integer.parseInt(entertainment_edit.getText().toString());
                int hobbies = Integer.parseInt(hobbies_edit.getText().toString());
                int others = Integer.parseInt(others_edit.getText().toString());
                int savings = Integer.parseInt(savings_edit.getText().toString());


                int utilities = gas + water + electricity + phone_bill;
                int wants = entertainment + hobbies + others;
                int leftover = income - food_cost - rent - utilities - wants - savings;

                float precent_food = ((float) food_cost / (float) income) * 100;
                float precent_rent = ((float) rent / (float) income) * 100;
                float precent_util = ((float) utilities / (float) income) * 100;
                float precent_wants = ((float) wants / (float) income) * 100;
                float precent_saved = ((float) savings / (float) income) * 100;
                float precent_leftover = ((float) leftover / (float) income) * 100;

                Intent move_to_output = new Intent(getApplicationContext(), MainOutput.class);

                startActivity(move_to_output);
                Intent intent = new Intent(MainContent.this, MainOutput.class);
                intent.putExtra("food", precent_food);
                intent.putExtra("rent", precent_rent);
                intent.putExtra("util", precent_util);
                intent.putExtra("want", precent_wants);
                intent.putExtra("saved", precent_saved);
                intent.putExtra("leftover", precent_leftover);
                startActivity(intent);

            }
        });

    }


    public void goOutput(View view) {
        Intent intent = new Intent(MainContent.this, MainOutput.class);
        startActivity(intent);
    }
}
