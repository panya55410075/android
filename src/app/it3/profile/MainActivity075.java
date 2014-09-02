package app.it3.profile;

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
private TextView t1;
private Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kobboon075);
	saen();
	}
	private void saen() {
		// TODO Auto-generated method stub
		t1 = (TextView) findViewById(R.id.textView1);
		b1 = (Button) findViewById(R.id.button1);
		t1.setText("kobboon panya");
		b1.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId() ){
		case R.id.button1:
			Intent s = new Intent(MainActivity075.this,Images.class);
			startActivity(s);
			
			break;
		case R.id.button2:
			
			break;
		default:
			break;
		}
	}
	
	
}

