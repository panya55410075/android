package app.it3.profile;
import android.R.string;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.UrlQuerySanitizer.ValueSanitizer;
import android.renderscript.Sampler.Value;
import android.util.Log;


public class DBcontrol075 extends SQLiteOpenHelper{
	String strName,strBrithday,strEmail, intAge,intHeight,intWeight;
	private static final String DATABASE_NAME ="db075";
	private static final  String TABLE_REGITER="regiter";
	private static final int DATABASE_VERSION= 1 ;

	public DBcontrol075(Context context) {
		super(context, TABLE_REGITER, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	} 

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE "+ TABLE_REGITER 
		+"(RegiterID INTEGER  PRIMARY KEY AUTOINCREMENT,"+"Name TEXT(100),"
		+"Age INTEGER,"+"Brithday TEXT(100),"+"height INTEGER,"
		+"weight INTEGER,"+"email TEXT(100));");

		Log.d("CREATE TABLE", "Create  Table Successfully");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS  "+TABLE_REGITER );
		onCreate(db);
	}
	//Insert Data
	public long insertData(String strName,String strBrithday,String strEmail
			,String intAge,String intHeight,String intWeight){
		try {
			SQLiteDatabase db;
			db=this.getWritableDatabase();
			ContentValues s = new ContentValues();
			s.put("Name", strName);
			s.put("Age", intAge);
			s.put("Brithday", strBrithday);
			s.put("height", intHeight);
			s.put("weight", intWeight);
			s.put("email",strEmail);
			
			long k = db.insert(TABLE_REGITER, null,s);
			db.close();
			return k ;
			
		} catch (Exception e) {
			// TODO: handle exception
			return -1 ;
		}
		
	}
	
	
}
