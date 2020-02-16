package tech.budgetforthemasses.budgetforthemasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

                double income = Integer.parseInt(income_edit.getText().toString());
                if (time_frame.isChecked()) {
                    income = income * 12 / 13;
                }
                double yearlyIncome = income * 13;
                if (yearlyIncome < 48535) {
                    income = ((float) income) / (1.15 + 0.0505);
                } else if (yearlyIncome < 97069) {
                    income = 3733 / (1.15 + 0.0505) + 3733 / (1.205 + 0.0915);
                } else if (yearlyIncome < 150473) {
                    income = 3733 / (1.15 + 0.0505) + 3733 / (1.205 + 0.0915) + 4108 / (1.26 + 0.1116);
                } else if (yearlyIncome < 214368) {
                    income = 3733 / (1.15 + 0.0505) + 3733 / (1.205 + 0.0915) + 4108 / (1.26 + 0.1116) + 4915 / (1.29 + 0.1216);
                } else {
                    income = 3733 / (1.15 + 0.0505) + 3733 / (1.205 + 0.0915) + 4108 / (1.26 + 0.1116) + 4915 / (1.29 + 0.1216) + (yearlyIncome / 13 - 16489) / (1.33 + 0.1316);
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
                double leftover = income - food_cost - rent - utilities - wants - savings;

                float percent_food = ((float) food_cost / (float) income) * 100;
                Log.d("myTag", (percent_food + ""));
                float percent_rent = ((float) rent / (float) income) * 100;
                float percent_util = ((float) utilities / (float) income) * 100;
                float percent_wants = ((float) wants / (float) income) * 100;
                float percent_saved = ((float) savings / (float) income) * 100;
                float percent_leftover = ((float) leftover / (float) income) * 100;


                boolean rentingTip = percent_rent < 30;
                boolean foodTip = percent_food < 9;
                boolean savedTip = percent_saved < 10;

                String tips = "";
                if (!rentingTip) {
                    tips = tips + "- You spend more than 30% of your income on housing, it is worthwhile looking for somewhere cheaper to live.\n\n";
                }
                if (!foodTip) {
                    tips = tips + "- You spend more than 10% of your income on food, it is recommended that you learn how to cook and you should eat out less.\n\n";

                }
                if (!savedTip) {
                    tips = tips + "- You put more than 10% of your income in the bank, you should start looking into investing your money.\n\n";
                }


                Intent intent = new Intent(MainContent.this, MainOutput.class);
                intent.putExtra("food", percent_food + "");
                intent.putExtra("rent", percent_rent + "");
                intent.putExtra("util", percent_util + "");
                intent.putExtra("want", percent_wants + "");
                intent.putExtra("saved", percent_saved + "");
                intent.putExtra("leftover", percent_leftover + "");
                intent.putExtra("income", income + "");
                intent.putExtra("tips", tips);

                startActivity(intent);


            }
        });

    }


}
