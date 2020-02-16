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
                TextView input1 = (TextView)findViewById(R.id.text_input1);
                TextView input2 = (TextView)findViewById(R.id.text_input2);
                TextView input3 = (TextView)findViewById(R.id.text_input3);

                if(text)
            }
        });
    }
}
