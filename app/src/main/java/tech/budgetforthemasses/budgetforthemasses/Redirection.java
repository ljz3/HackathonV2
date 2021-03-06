package tech.budgetforthemasses.budgetforthemasses;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Redirection extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extra_tips);


        Button open_button = (Button) findViewById(R.id.additionalResources);
        open_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW", Uri.parse("https://www.investopedia.com/articles/personal-finance/123115/best-ways-invest-500-5000.asp"));
                startActivity(viewIntent);
            }
        });
    }

}