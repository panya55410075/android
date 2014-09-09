package app.it3.profile;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity075 extends Activity implements OnClickListener {
	private TextView t1 ,t2 ,t3,t4,t5,t6;
	private Button b1,b2;
	private string d1,d2,d3,d4,d5,d6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kobboon075);
	saen();
	}
	private void saen() {
		// TODO Auto-generated method stub
		t1 = (TextView) findViewById(R.id.textVie1);
		t2 = (TextView) findViewById(R.id.arg1);
		t3 = (TextView) findViewById(R.id.birthday1);
		t4 = (TextView) findViewById(R.id.heiht1);
		t5 = (TextView) findViewById(R.id.weiht1);
		t6 = (TextView) findViewById(R.id.email);
		
		b1 = (Button) findViewById(R.id.button11);
		b2 = (Button) findViewById(R.id.button22);
		
	
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		
		
		String d1 = getIntent().getStringExtra("s1");
		String d2 = getIntent().getStringExtra("s2");
		String d3 = getIntent().getStringExtra("s3");
		String d4 = getIntent().getStringExtra("s4");
		String d5 = getIntent().getStringExtra("s5");
		String d6 = getIntent().getStringExtra("s6");
		
		
		if (t1 != null){
		t1.setText("kobboon panya");
		t2.setText("21");
		t3.setText("22/08/36");
		t4.setText("168cm");
		t5.setText("50kg");
		t6.setText("lovelovesaen@gmail.com");
		}
		if(d1!=null ){
		t1.setText(d1);
		t2.setText(d2);
		t3.setText(d3);
		t4.setText(d4);
		t5.setText(d5);
		t6.setText(d6);
		}
	}//&& d2!=null && d3!=null&& d4!=null&& d5!=null&& d6!=null
	@Override
	public void onClick(View v) {
		
		switch (v.getId() ){
		case R.id.button11:
			Intent s = new Intent(MainActivity075.this,Images.class);
			startActivity(s);
			
			break;
		case R.id.button22:
			Intent e = new Intent(MainActivity075.this,EDIT.class);
			startActivity(e);
			break;
		default:
			break;
		}
	}
	
	
}

