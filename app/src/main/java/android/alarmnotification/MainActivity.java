package android.alarmnotification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Calendar calendar=Calendar.getInstance();
                int min=calendar.get(Calendar.MINUTE)+1;
                int hr=calendar.get(Calendar.HOUR_OF_DAY);
                calendar.set(calendar.HOUR_OF_DAY,hr);
                calendar.set(calendar.MINUTE,min);

                Toast.makeText(MainActivity.this, hr+":"+min+"set 5" +
                        "", Toast.LENGTH_SHORT).show();


                Intent intent=new Intent(getApplicationContext(),BoradCaster.class);
                PendingIntent pIntent=PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                AlarmManager aManager=(AlarmManager)getSystemService(ALARM_SERVICE);
                aManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),60000,pIntent);*/
                Toast.makeText(getApplicationContext(), "Alarm Set for current time", Toast.LENGTH_SHORT).show();
                NotificationEventReceiver.setupAlarm(getApplicationContext());

                //60000  AlarmManager.INTERVAL_DAY
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
