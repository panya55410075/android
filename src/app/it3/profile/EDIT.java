package app.it3.profile;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import app.it3.profile.R.string;

public class EDIT extends Activity implements OnClickListener {
	 EditText E1,E2,E3,E4,E5,E6;
	 TextView tv1,tv2,tv3,tv4,tv5,tv6;
	 Button B1;
//	 TextView ttt1 ,ttt2,ttt3,ttt4,ttt5,ttt6;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.edit);
	kobboon();
	
}
private void kobboon() {
	// TODO Auto-generated method stub
	E1= (EditText) findViewById(R.id.editText1);
	E2= (EditText) findViewById(R.id.editText2);
	E3= (EditText) findViewById(R.id.editText3);
	E4= (EditText) findViewById(R.id.editText4);
	E5= (EditText) findViewById(R.id.editText5);
	E6= (EditText) findViewById(R.id.editText6);

	tv1 = (TextView) findViewById(R.id.textView1115);
	tv2 = (TextView) findViewById(R.id.textView1);
	tv3 = (TextView) findViewById(R.id.textView2);
	tv4 = (TextView) findViewById(R.id.textView3);
	tv5 = (TextView) findViewById(R.id.textView4);
	tv6 = (TextView) findViewById(R.id.textView5);
	
	B1 = (Button) findViewById(R.id.e1);
	B1.setOnClickListener(this);
	
	
}
@Override
public void onClick(View arg0) {
	// TODO Auto-generated method stub
	
	save();
	switch (arg0.getId()) {
	case R.id.e1 :
		
		Intent f = new Intent(EDIT.this,MainActivity075.class);
		
		
		String name = E1.getText().toString();
		String name1 = E2.getText().toString();
		String name2 = E3.getText().toString();
		String name3 = E4.getText().toString();
		String name4 = E5.getText().toString();
		String name5 = E6.getText().toString();
		
		
	//	ttt.setText(name);
	
		f.putExtra( "s1",name);
		f.putExtra( "s2",name1);
		f.putExtra( "s3",name2);
		f.putExtra( "s4",name3);
		f.putExtra( "s5",name4);
		f.putExtra( "s6",name5);
		
		startActivity(f);
		
		break;

	default:
		break;
	}

	}

	public boolean save() {
	// TODO Auto-generated method stub
	
	final AlertDialog.Builder ab = new AlertDialog.Builder(this);
	AlertDialog vv = ab.create();
	
	if(E1.getText().length()==0){
		vv.setMessage("Please input Name");
		E1.requestFocus();
		return false;
	}
	if(E2.getText().length()==0){
		vv.setMessage("Please input Age");
		E2.requestFocus();
		return false;
	}
	if(E3.getText().length()==0){
		vv.setMessage("Please input Brithday");
		E3.requestFocus();
		return false;
	}
	if(E4.getText().length()==0){
		vv.setMessage("Please input height");
		E4.requestFocus();
		return false;
	}
	if(E5.getText().length()==0){
		vv.setMessage("Please input Weight");
		E5.requestFocus();
		return false;
	}
	if(E6.getText().length()==0){
		vv.setMessage("Please input Email");
		E6.requestFocus();
		return false;
	}

	
	DBcontrol075 dbclass = new DBcontrol075(this);
	long savedata = dbclass.insertData(E1.getText().toString(),E2.getText().toString(),E3.getText().toString()
			,E4.getText().toString(),E5.getText().toString(),E6.getText().toString());
			
	if (savedata <= 0) {
		vv.setMessage("Error !!!!");
		vv.show();
		return false;
	}		
			
	Toast.makeText(getApplicationContext(), "Add Data Successfully",Toast.LENGTH_SHORT).show();
	return true;
}

}
