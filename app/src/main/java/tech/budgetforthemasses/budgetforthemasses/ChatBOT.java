package tech.budgetforthemasses.budgetforthemasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChatBOT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatbot);

        int count =0;


        Button open_button = (Button) findViewById(R.id.enter_button);
        open_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userInput = (EditText) findViewById(R.id.user_input_text);
                TextView input1 = (TextView)findViewById(R.id.test_input1);
                TextView input2 = (TextView)findViewById(R.id.test_input2);
                TextView input3 = (TextView)findViewById(R.id.test_input3);
                TextView respond1 =(TextView)findViewById(R.id.test_response1);
                TextView respond2 =(TextView)findViewById(R.id.test_response2);
                TextView respond3 =(TextView)findViewById(R.id.test_response3);

                if(input1.getText() == "")
                {
                    if(userInput.getText().toString().contains("help")) {
                        input1.setText(userInput.getText());
                        respond1.setText("What can I help you with, feel free to ask me anything?");
                    }
                    else if (userInput.getText().toString().contains("do")) {
                        input1.setText(userInput.getText());
                        respond1.setText("If you enter your financial information in the given text fields we can provide you with some budgeting advice.");
                    }
                    else if(userInput.getText().toString().contains("advice")) {
                        input1.setText(userInput.getText());
                        respond1.setText("Sorry we cannot answer that question at the moment, please consider looking at http://i.investopedia.com/inv/pdf/tutorials/budgeting-basics.pdf or another website.");
                    }else{
                        input1.setText(userInput.getText());
                        respond1.setText("I don't know how to answer that question");
                    }
                }
                else if(input2.getText() == "")
                {
                    if(userInput.getText().toString().contains("help")) {
                        input2.setText(input1.getText());
                        respond2.setText(respond1.getText());
                        input1.setText(userInput.getText());
                        respond1.setText("What can I help you with, feel free to ask me anything?");
                    }
                    else if (userInput.getText().toString().contains("do")) {
                        input2.setText(input1.getText());
                        respond2.setText(respond1.getText());
                        input1.setText(userInput.getText());
                        respond1.setText("If you enter your financial information in the given text fields we can provide you with some budgeting advice.");
                    }
                    else if(userInput.getText().toString().contains("advice")) {
                        input2.setText(input1.getText());
                        respond2.setText(respond1.getText());
                        input1.setText(userInput.getText());
                        respond1.setText("Sorry we cannot answer that question at the moment, please consider looking at http://i.investopedia.com/inv/pdf/tutorials/budgeting-basics.pdf or another website.");
                    }else{
                        input2.setText(input1.getText());
                        respond2.setText(respond1.getText());
                        input1.setText(userInput.getText());
                        respond1.setText("I don't know how to answer that question");
                    }


                }
                else {
                    if(userInput.getText().toString().contains("help")) {
                        input3.setText(input2.getText());
                        respond3.setText(respond2.getText());
                        input2.setText(input1.getText());
                        respond2.setText(respond1.getText());
                        input1.setText(userInput.getText());
                        respond1.setText("What can I help you with, feel free to ask me anything?");
                    }
                    else if (userInput.getText().toString().contains("do")) {
                        input3.setText(input2.getText());
                        respond3.setText(respond2.getText());
                        input2.setText(input1.getText());
                        respond2.setText(respond1.getText());
                        input1.setText(userInput.getText());
                        respond1.setText("If you enter your financial information in the given text fields we can provide you with some budgeting advice.");
                    }
                    else if(userInput.getText().toString().contains("advice")) {
                        input3.setText(input2.getText());
                        respond3.setText(respond2.getText());
                        input2.setText(input1.getText());
                        respond2.setText(respond1.getText());
                        input1.setText(userInput.getText());
                        respond1.setText("Sorry we cannot answer that question at the moment, please consider looking at http://i.investopedia.com/inv/pdf/tutorials/budgeting-basics.pdf or another website.");
                    }else{
                            input3.setText(input2.getText());
                            respond3.setText(respond2.getText());
                            input2.setText(input1.getText());
                            respond2.setText(respond1.getText());
                            input1.setText(userInput.getText());
                            respond1.setText("I don't know how to answer that question");
                        }
                    }
                }
            
        });
    }
}
