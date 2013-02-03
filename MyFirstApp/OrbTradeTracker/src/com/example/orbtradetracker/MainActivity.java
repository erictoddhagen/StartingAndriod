package com.example.orbtradetracker;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.lang.Double;

public class MainActivity extends Activity implements OnClickListener {
	
	private TextView chaostxtresult;
	private TextView alchtxtresult;
	private TextView alchtotal;
    private Button alchbtnadd;
    private Button alchbtnsub;
    private Button chaosbtnadd;
    private Button chaosbtnsub;
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        chaostxtresult=(TextView) findViewById(R.id.chaosTextView);
        alchtxtresult=(TextView) findViewById(R.id.alchTextView);
        alchtotal = (TextView) findViewById(R.id.Total);
        alchbtnadd = (Button) findViewById(R.id.alchButtonAdd);
        alchbtnadd.setOnClickListener(this);
        alchbtnsub = (Button) findViewById(R.id.alchButtonSub);
        alchbtnsub.setOnClickListener(this);
        chaosbtnadd = (Button) findViewById(R.id.chaosButtonAdd);
        chaosbtnadd.setOnClickListener(this);
        chaosbtnsub = (Button) findViewById(R.id.chaosButtonSub);
        chaosbtnsub.setOnClickListener(this);

        
    }
    public void onClick(View v) {
        //method handling button click	
    		if (v.getId()==R.id.alchButtonAdd){
        		  String text = alchtxtresult.getText().toString();
        		  String totaltext = alchtotal.getText().toString();
        		  double result = Double.parseDouble(text.toString());
        		  double total = Double.parseDouble(totaltext.toString());
    			  result = result + 1.0;
    			  total = total + 1.0;
    			  alchtxtresult.setText(Double.toString(result));
    			  alchtotal.setText(Double.toString(total));
    		}
    		if (v.getId()==R.id.alchButtonSub){
      		  String text = alchtxtresult.getText().toString();
      		  String totaltext = alchtotal.getText().toString();
      		  double result = Double.parseDouble(text.toString());
      		  double total = Double.parseDouble(totaltext.toString());
  			  result = result - 1.0;
  			  total = total - 1.0;
  			  alchtxtresult.setText(Double.toString(result));
  			  alchtotal.setText(Double.toString(total));
  		   }
    		if (v.getId()==R.id.chaosButtonAdd){
      		  String text = chaostxtresult.getText().toString();
      		  String totaltext = alchtotal.getText().toString();
      		  double result = Double.parseDouble(text.toString());
      		  double total = Double.parseDouble(totaltext.toString());
  			  result = result + 1.0;
  			  total = total + 3;
  			  chaostxtresult.setText(Double.toString(result));
  			  alchtotal.setText(Double.toString(total));
  		}
  		if (v.getId()==R.id.chaosButtonSub){
    		  String text = chaostxtresult.getText().toString();
    		  String totaltext = alchtotal.getText().toString();
    		  double result = Double.parseDouble(text.toString());
    		  double total = Double.parseDouble(totaltext.toString());
			  result = result - 1.0;
			  total = total - 3;
			  chaostxtresult.setText(Double.toString(result));
			  alchtotal.setText(Double.toString(total));
		   }
    	  
    }
}
