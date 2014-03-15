package com.example.note;

	import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.view.View.OnClickListener;
	import android.widget.Button;

	public class login extends Activity {
		
		 @Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.layout2);
		        
		        

		        Button button2 = (Button) findViewById (R.id.button2);
		        button2.setOnClickListener(new OnClickListener() {
		        		
		        		public void onClick(View v) {
		        			
		        			Intent intent = new Intent (v.getContext(), Home.class);
		        			startActivityForResult(intent,0);
		        		}
		        		
		        });

		 }
	}

