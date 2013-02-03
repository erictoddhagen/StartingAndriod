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
	private TextView chromtxtresult;
	private TextView altertxtresult;
	private TextView alchtotal;
    private Button alchbtnadd;
    private Button alchbtnsub;
    private Button chaosbtnadd;
    private Button chaosbtnsub;
    private Button chrombtnadd;
    private Button chrombtnsub;
    private Button alterbtnadd;
    private Button alterbtnsub;

    
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        chaostxtresult=(TextView) findViewById(R.id.chaosTextView);
        alchtxtresult=(TextView) findViewById(R.id.alchTextView);
        chromtxtresult=(TextView) findViewById(R.id.chromTextView);
        altertxtresult=(TextView) findViewById(R.id.alterTextView);
        alchtotal = (TextView) findViewById(R.id.alchTotal);
        alchbtnadd = (Button) findViewById(R.id.alchButtonAdd);
        alchbtnadd.setOnClickListener(this);
        alchbtnsub = (Button) findViewById(R.id.alchButtonSub);
        alchbtnsub.setOnClickListener(this);
        chaosbtnadd = (Button) findViewById(R.id.chaosButtonAdd);
        chaosbtnadd.setOnClickListener(this);
        chaosbtnsub = (Button) findViewById(R.id.chaosButtonSub);
        chaosbtnsub.setOnClickListener(this);
        chrombtnadd = (Button) findViewById(R.id.chromButtonAdd);
        chrombtnadd.setOnClickListener(this);
        chrombtnsub = (Button) findViewById(R.id.chromButtonSub);
        chrombtnsub.setOnClickListener(this);
        alterbtnadd = (Button) findViewById(R.id.alterButtonAdd);
        alterbtnadd.setOnClickListener(this);
        alterbtnsub = (Button) findViewById(R.id.alterButtonSub);
        alterbtnsub.setOnClickListener(this);

        
    }
    public void onClick(View v) {
        //method handling button click
		String totaltext = alchtotal.getText().toString();
		double total = Double.parseDouble(totaltext.toString());
    	if(v.getId()==R.id.alchButtonAdd || v.getId()==R.id.alchButtonSub) {
  		  String text = alchtxtresult.getText().toString();
  		  double result = Double.parseDouble(text.toString());
    		if (v.getId()==R.id.alchButtonAdd){
    			  result = result + 1.0;
    			  total = total + 1.0;
    			  alchtxtresult.setText(Double.toString(result));
    			  alchtotal.setText(Double.toString(total));
    		}
    		else{
  			  result = result - 1.0;
  			  total = total - 1.0;
  			  alchtxtresult.setText(Double.toString(result));
  			  alchtotal.setText(Double.toString(total));
  		   }
    	}
    	if(v.getId()==R.id.chaosButtonAdd || v.getId()==R.id.chaosButtonSub) {
    		String text = chaostxtresult.getText().toString();
    		double result = Double.parseDouble(text.toString());
      		if (v.getId()==R.id.chaosButtonAdd){
      			  result = result + 1.0;
      			  total = total + 3.0;
      			  chaostxtresult.setText(Double.toString(result));
      			  alchtotal.setText(Double.toString(total));
      		}
      		else{
    			  result = result - 1.0;
    			  total = total - 3.0;
    			  chaostxtresult.setText(Double.toString(result));
    			  alchtotal.setText(Double.toString(total));
    		   }
      	}
    	if(v.getId()==R.id.chromButtonAdd || v.getId()==R.id.chromButtonSub) {
    		  String text = chromtxtresult.getText().toString();
    		  double result = Double.parseDouble(text.toString());
      		if (v.getId()==R.id.chromButtonAdd){
      			  result = result + 1.0;
      			  total = total + (double) 1/10;
      			  chromtxtresult.setText(Double.toString(result));
      			  alchtotal.setText(Double.toString(total));
      		}
      		else{
    			  result = result - 1.0;
    			  total = total - (double) 1/10;
    			  chromtxtresult.setText(Double.toString(result));
    			  alchtotal.setText(Double.toString(total));
    		   }
      }
    	if(v.getId()==R.id.alterButtonAdd || v.getId()==R.id.alterButtonSub) {
    		  String text = altertxtresult.getText().toString();
    		  double result = Double.parseDouble(text.toString());
      		if (v.getId()==R.id.alterButtonAdd){
      			  result = result + 1.0;
      			  total = total + (double) 1/8;
      			  altertxtresult.setText(Double.toString(result));
      			  alchtotal.setText(Double.toString(total));
      		}
      		else{
    			  result = result - 1.0;
    			  total = total - (double) 1/8;
    			  altertxtresult.setText(Double.toString(result));
    			  alchtotal.setText(Double.toString(total));
    		   }
      	}
    }
}
