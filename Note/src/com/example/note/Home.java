package com.example.note;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		 final Button btn_save = (Button)findViewById(R.id.button1);
	        btn_save.setOnClickListener(new OnClickListener(){
	        	public void onClick(View v){
	        		final TextView username =(TextView)findViewById(R.id.editText1);
	        		final TextView password =(TextView)findViewById(R.id.editText2);
              		String uname = username.getText().toString();
	        		String pass =  password.getText().toString();
	        		
	        		if(uname.equals("christine") && pass.equals("123"))
	        			startActivity(new Intent(Home.this,NoteList.class).putExtra("usr",(CharSequence)uname));
	        		 else 
	        			Toast.makeText(Home.this,"Invalid UserName or Password", Toast.LENGTH_LONG).show();
	        		
	        	}
	        });
	        
	        
	        Button buttoncreate = (Button) findViewById (R.id.buttoncreate);
	        buttoncreate.setOnClickListener(new OnClickListener() {
	        		
	        		public void onClick(View v) {
	        			
	        			Intent intent = new Intent (v.getContext(), login.class);
	        			startActivityForResult(intent,0);
	        		}
	        		
	        });
	        

	        
	        
	        
	    }

	}