package no.aleksikon.alkoholformel;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	private Button calculateButton;
	private static final String TAG = MainActivity.class.getSimpleName();	
	public int nrOfDays = 0;
    public int alcoholAmount = 0;
    EditText alcoholInput;
    EditText dayInput;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpListeners();
        
        alcoholInput = (EditText)findViewById(R.id.alcohol_amount);
        dayInput = (EditText)findViewById(R.id.nr_of_days);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		int vid = v.getId();
		Log.d(TAG, "pressed button: " + v.getId());
		if(vid == R.id.calculateButton)
		{
			alcoholCalculator(nrOfDays, alcoholAmount);
		}		
	}
	
	private void setUpListenerForButton(Button b, int id)
	{
		b = (Button) findViewById(id);
		b.setOnClickListener(this);
		Log.d(TAG, "Set up listener for: " + id);
	}
	
	private void setUpListeners()
	{
		setUpListenerForButton(calculateButton, R.id.calculateButton);
	}
	
	
	public int alcoholCalculator(int nrOfDays, int alcoholAmount)
	{
		
		if(nrOfDays == 0)
		{
			return 0;
		}
		else if (nrOfDays == 1) {
			return (alcoholAmount*2);
		}
		else
			return alcoholCalculator((nrOfDays-1), alcoholAmount)*2;
	}
}
