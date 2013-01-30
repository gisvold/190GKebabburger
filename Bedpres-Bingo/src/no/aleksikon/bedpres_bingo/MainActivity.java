package no.aleksikon.bedpres_bingo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import no.aleksikon.bedpres_bingo.BingoWord;

public class MainActivity extends Activity 
{
	
	EditText randomBingoWord1;
	BingoWord randomWord1;
	
	public randomBingoWord(BingoWord randomWord1)
	{
		this.randomWord1 = randomWord1;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		randomBingoWord1 = (EditText)findViewById(R.id.randomWord1);
		randomBingoWord1.setEnabled(false);
		
		randomBingoWord1.setText(randomBingoWord());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
	

}
