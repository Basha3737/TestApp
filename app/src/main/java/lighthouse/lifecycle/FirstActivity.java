package lighthouse.lifecycle;

import android.app.SearchManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button Buttonobject;
    EditText EdittextObject;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    TextView Text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Buttonobject=(Button)findViewById(R.id.pref);
        EdittextObject=(EditText)findViewById(R.id.editext1);
        Text1=(TextView)findViewById(R.id.text);

        sharedPreferences=getApplicationContext().getSharedPreferences("Mypref",MODE_PRIVATE);
        editor=sharedPreferences.edit();

        Text1.setText(sharedPreferences.getString("Text1",""));





        Buttonobject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("Text1",""+EdittextObject.getText().toString());
                editor.apply();
                editor.commit();

                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });






    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(getApplicationContext(),"OnStart Called",Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(getApplicationContext(),"OnResume Called",Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(getApplicationContext(),"OnPause Called",Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(getApplicationContext(),"Application Minimized",Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(getApplicationContext(),"Application Restarted",Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(getApplicationContext(),"Application Destroyed",Toast.LENGTH_LONG).show();
//    }
}
