package hart.numericsolver;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;


public class NumericSolver extends Activity {

	private int[] mCurrent = {0,0,0,0,0,
								  0,0,0,0,0,
								  0,0,0,0,0,
								  0,0,0,0,0,
								  0,0,0,0,0,
								  0,0,0,0,0,
								  0,0,0,0,0,
								  0};
	private int[] mGameStart = {0,0,0,0,0,
			 						0,0,0,0,0,
			 						0,0,0,0,0,
			 						0,0,0,0,0,
			 						0,0,0,0,0,
			 						0,0,0,0,0,
			 						0,0,0,0,0,
			 						0};
	private int mGameNumber = 0;
	private TextView mPT11;
	private TextView mPT12;
	private TextView mPT13;
	private TextView mPT14;
	private TextView mPT15;
	private TextView mPT16;
	private TextView mPT21;
	private TextView mPT22;
	private TextView mPT23;
	private TextView mPT24;
	private TextView mPT25;
	private TextView mPT26;
	private TextView mPT31;
	private TextView mPT32;
	private TextView mPT33;
	private TextView mPT34;
	private TextView mPT35;
	private TextView mPT36;
	private TextView mPT41;
	private TextView mPT42;
	private TextView mPT43;
	private TextView mPT44;
	private TextView mPT45;
	private TextView mPT46;
	private TextView mPT51;
	private TextView mPT52;
	private TextView mPT53;
	private TextView mPT54;
	private TextView mPT55;
	private TextView mPT56;
	private TextView mPT61;
	private TextView mPT62;
	private TextView mPT63;
	private TextView mPT64;
	private TextView mPT65;
	private TextView mPT66;
	private Button mRestartButton;
	private Button mSkipButton;
	private TextView mNumGames;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_numeric_solver);
		mPT11 = (TextView)findViewById(R.id.pt11);
		mPT12 = (TextView)findViewById(R.id.pt12);
		mPT13 = (TextView)findViewById(R.id.pt13);
		mPT14 = (TextView)findViewById(R.id.pt14);
		mPT15 = (TextView)findViewById(R.id.pt15);
		mPT16 = (TextView)findViewById(R.id.pt16);
		mPT21 = (TextView)findViewById(R.id.pt21);
		mPT22 = (TextView)findViewById(R.id.pt22);
		mPT23 = (TextView)findViewById(R.id.pt23);
		mPT24 = (TextView)findViewById(R.id.pt24);
		mPT25 = (TextView)findViewById(R.id.pt25);
		mPT26 = (TextView)findViewById(R.id.pt26);
		mPT31 = (TextView)findViewById(R.id.pt31);
		mPT32 = (TextView)findViewById(R.id.pt32);
		mPT33 = (TextView)findViewById(R.id.pt33);
		mPT34 = (TextView)findViewById(R.id.pt34);
		mPT35 = (TextView)findViewById(R.id.pt35);
		mPT36 = (TextView)findViewById(R.id.pt36);
		mPT41 = (TextView)findViewById(R.id.pt41);
		mPT42 = (TextView)findViewById(R.id.pt42);
		mPT43 = (TextView)findViewById(R.id.pt43);
		mPT44 = (TextView)findViewById(R.id.pt44);
		mPT45 = (TextView)findViewById(R.id.pt45);
		mPT46 = (TextView)findViewById(R.id.pt46);
		mPT51 = (TextView)findViewById(R.id.pt51);
		mPT52 = (TextView)findViewById(R.id.pt52);
		mPT53 = (TextView)findViewById(R.id.pt53);
		mPT54 = (TextView)findViewById(R.id.pt54);
		mPT55 = (TextView)findViewById(R.id.pt55);
		mPT56 = (TextView)findViewById(R.id.pt56);
		mPT61 = (TextView)findViewById(R.id.pt61);
		mPT62 = (TextView)findViewById(R.id.pt62);
		mPT63 = (TextView)findViewById(R.id.pt63);
		mPT64 = (TextView)findViewById(R.id.pt64);
		mPT65 = (TextView)findViewById(R.id.pt65);
		mPT66 = (TextView)findViewById(R.id.pt66);
		mRestartButton = (Button)findViewById(R.id.restartButton);
		mSkipButton = (Button)findViewById(R.id.skipButton);
		mNumGames = (TextView)findViewById(R.id.numGames);
		mPT11.setOnClickListener(mPT11Listener);
		mPT12.setOnClickListener(mPT12Listener);
		mPT13.setOnClickListener(mPT13Listener);
		mPT14.setOnClickListener(mPT14Listener);
		mPT15.setOnClickListener(mPT15Listener);
		mPT16.setOnClickListener(mPT16Listener);
		mPT21.setOnClickListener(mPT21Listener);
		mPT22.setOnClickListener(mPT22Listener);
		mPT23.setOnClickListener(mPT23Listener);
		mPT24.setOnClickListener(mPT24Listener);
		mPT25.setOnClickListener(mPT25Listener);
		mPT26.setOnClickListener(mPT26Listener);
		mPT31.setOnClickListener(mPT31Listener);
		mPT32.setOnClickListener(mPT32Listener);
		mPT33.setOnClickListener(mPT33Listener);
		mPT34.setOnClickListener(mPT34Listener);
		mPT35.setOnClickListener(mPT35Listener);
		mPT36.setOnClickListener(mPT36Listener);
		mPT41.setOnClickListener(mPT41Listener);
		mPT42.setOnClickListener(mPT42Listener);
		mPT43.setOnClickListener(mPT43Listener);
		mPT44.setOnClickListener(mPT44Listener);
		mPT45.setOnClickListener(mPT45Listener);
		mPT46.setOnClickListener(mPT46Listener);
		mPT51.setOnClickListener(mPT51Listener);
		mPT52.setOnClickListener(mPT52Listener);
		mPT53.setOnClickListener(mPT53Listener);
		mPT54.setOnClickListener(mPT54Listener);
		mPT55.setOnClickListener(mPT55Listener);
		mPT56.setOnClickListener(mPT56Listener);
		mPT61.setOnClickListener(mPT61Listener);
		mPT62.setOnClickListener(mPT62Listener);
		mPT63.setOnClickListener(mPT63Listener);
		mPT64.setOnClickListener(mPT64Listener);
		mPT65.setOnClickListener(mPT65Listener);
		mPT66.setOnClickListener(mPT66Listener);
		mRestartButton.setOnClickListener(mRestartButtonListener);
		mSkipButton.setOnClickListener(mSkipButtonListener);
		checkState();						
	}
	
	private void randomGame() {
		clearMCurrent();
		Random r = new Random();
		int number1 = r.nextInt(36)+1;
		int number2 = r.nextInt(36)+1;
		int number3 = r.nextInt(36)+1;
		int number4 = r.nextInt(36)+1;
		int number5 = r.nextInt(36)+1;
		int number6 = r.nextInt(36)+1;
		int number7 = r.nextInt(36)+1;
		int number8 = r.nextInt(36)+1;
		int number9 = r.nextInt(36)+1;
		int number10 = r.nextInt(36)+1;
		int number11 = r.nextInt(36)+1;
		int number12 = r.nextInt(36)+1;
		int number13 = r.nextInt(36)+1;
		int number14 = r.nextInt(36)+1;
		int number15 = r.nextInt(36)+1;
		int number16 = r.nextInt(36)+1;
		int number17 = r.nextInt(36)+1;
		int number18 = r.nextInt(36)+1;
		int number19 = r.nextInt(36)+1;
		int number20 = r.nextInt(36)+1;
		addGameState(getRowForMCurrent(number1-1),getColForMCurrent(number1-1));
		addGameState(getRowForMCurrent(number2-1),getColForMCurrent(number2-1));
		addGameState(getRowForMCurrent(number3-1),getColForMCurrent(number3-1));
		addGameState(getRowForMCurrent(number4-1),getColForMCurrent(number4-1));
		addGameState(getRowForMCurrent(number5-1),getColForMCurrent(number5-1));
		addGameState(getRowForMCurrent(number6-1),getColForMCurrent(number6-1));
		addGameState(getRowForMCurrent(number7-1),getColForMCurrent(number7-1));
		addGameState(getRowForMCurrent(number8-1),getColForMCurrent(number8-1));
		addGameState(getRowForMCurrent(number9-1),getColForMCurrent(number9-1));
		addGameState(getRowForMCurrent(number10-1),getColForMCurrent(number10-1));
		addGameState(getRowForMCurrent(number11-1),getColForMCurrent(number11-1));
		addGameState(getRowForMCurrent(number12-1),getColForMCurrent(number12-1));
		addGameState(getRowForMCurrent(number13-1),getColForMCurrent(number13-1));
		addGameState(getRowForMCurrent(number14-1),getColForMCurrent(number14-1));
		addGameState(getRowForMCurrent(number15-1),getColForMCurrent(number15-1));
		addGameState(getRowForMCurrent(number16-1),getColForMCurrent(number16-1));
		addGameState(getRowForMCurrent(number17-1),getColForMCurrent(number17-1));
		addGameState(getRowForMCurrent(number18-1),getColForMCurrent(number18-1));
		addGameState(getRowForMCurrent(number19-1),getColForMCurrent(number19-1));
		addGameState(getRowForMCurrent(number20-1),getColForMCurrent(number20-1));
		loadMGameStart(mCurrent);
	}
		
	private void loadMGameStart (int[] integer) {
		int x=0; 
		while (x<=35) {
			mGameStart[x] = integer[x];
			x++;
		}
	}
	private void loadMCurrent (int[] integer) {
		int x=0;
		while (x<=35) {
			mCurrent[x] = integer[x];
			x++;
		}
	}
	private void clearMCurrent () {
		int x=0;
		while (x<=35) {
			mCurrent[x] = 0;
			x++;
		}
	}	
	private void setGameStates(int[] integer) {
		mPT11.setText(String.valueOf(integer[0]));
		mPT12.setText(String.valueOf(integer[1]));
		mPT13.setText(String.valueOf(integer[2]));
		mPT14.setText(String.valueOf(integer[3]));
		mPT15.setText(String.valueOf(integer[4]));
		mPT16.setText(String.valueOf(integer[5]));
		mPT21.setText(String.valueOf(integer[6]));
		mPT22.setText(String.valueOf(integer[7]));
		mPT23.setText(String.valueOf(integer[8]));
		mPT24.setText(String.valueOf(integer[9]));
		mPT25.setText(String.valueOf(integer[10]));
		mPT26.setText(String.valueOf(integer[11]));
		mPT31.setText(String.valueOf(integer[12]));
		mPT32.setText(String.valueOf(integer[13]));
		mPT33.setText(String.valueOf(integer[14]));
		mPT34.setText(String.valueOf(integer[15]));
		mPT35.setText(String.valueOf(integer[16]));
		mPT36.setText(String.valueOf(integer[17]));
		mPT41.setText(String.valueOf(integer[18]));
		mPT42.setText(String.valueOf(integer[19]));
		mPT43.setText(String.valueOf(integer[20]));
		mPT44.setText(String.valueOf(integer[21]));
		mPT45.setText(String.valueOf(integer[22]));
		mPT46.setText(String.valueOf(integer[23]));
		mPT51.setText(String.valueOf(integer[24]));
		mPT52.setText(String.valueOf(integer[25]));
		mPT53.setText(String.valueOf(integer[26]));
		mPT54.setText(String.valueOf(integer[27]));
		mPT55.setText(String.valueOf(integer[28]));
		mPT56.setText(String.valueOf(integer[29]));
		mPT61.setText(String.valueOf(integer[30]));
		mPT62.setText(String.valueOf(integer[31]));
		mPT63.setText(String.valueOf(integer[32]));
		mPT64.setText(String.valueOf(integer[33]));
		mPT65.setText(String.valueOf(integer[34]));
		mPT66.setText(String.valueOf(integer[35]));
	}
	
	View.OnClickListener mPT11Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT11Handler.removeCallbacks(mPT11Runnable);
            mPT11Handler.post(mPT11Runnable);
        }
    };
    Handler mPT11Handler = new Handler();
    Runnable mPT11Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(1,1);
        	checkState();
        }
    };
	View.OnClickListener mPT12Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT12Handler.removeCallbacks(mPT12Runnable);
            mPT12Handler.post(mPT12Runnable);
        }
    };
    Handler mPT12Handler = new Handler();
    Runnable mPT12Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(1,2);
        	checkState();
        }
    };
	View.OnClickListener mPT13Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT13Handler.removeCallbacks(mPT13Runnable);
            mPT13Handler.post(mPT13Runnable);
        }
    };
    Handler mPT13Handler = new Handler();
    Runnable mPT13Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(1,3);
        	checkState();
        }
    };
	View.OnClickListener mPT14Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT14Handler.removeCallbacks(mPT14Runnable);
            mPT14Handler.post(mPT14Runnable);
        }
    };
    Handler mPT14Handler = new Handler();
    Runnable mPT14Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(1,4);
        	checkState();
        }
    };
    View.OnClickListener mPT15Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT15Handler.removeCallbacks(mPT15Runnable);
            mPT15Handler.post(mPT15Runnable);
        }
    };
    Handler mPT15Handler = new Handler();
    Runnable mPT15Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(1,5);
        	checkState();
        }
    };
    View.OnClickListener mPT16Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT16Handler.removeCallbacks(mPT16Runnable);
            mPT16Handler.post(mPT16Runnable);
        }
    };
    Handler mPT16Handler = new Handler();
    Runnable mPT16Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(1,6);
        	checkState();
        }
    };
	View.OnClickListener mPT21Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT21Handler.removeCallbacks(mPT21Runnable);
            mPT21Handler.post(mPT21Runnable);
        }
    };
    Handler mPT21Handler = new Handler();
    Runnable mPT21Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(2,1);
        	checkState();
        }
    };
	View.OnClickListener mPT22Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT22Handler.removeCallbacks(mPT22Runnable);
            mPT22Handler.post(mPT22Runnable);
        }
    };
    Handler mPT22Handler = new Handler();
    Runnable mPT22Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(2,2);
        	checkState();
        }
    };
	View.OnClickListener mPT23Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT23Handler.removeCallbacks(mPT23Runnable);
            mPT23Handler.post(mPT23Runnable);
        }
    };
    Handler mPT23Handler = new Handler();
    Runnable mPT23Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(2,3);
        	checkState();
        }
    };
	View.OnClickListener mPT24Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT24Handler.removeCallbacks(mPT24Runnable);
            mPT24Handler.post(mPT24Runnable);
        }
    };
    Handler mPT24Handler = new Handler();
    Runnable mPT24Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(2,4);
        	checkState();
        }
    };
    View.OnClickListener mPT25Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT25Handler.removeCallbacks(mPT25Runnable);
            mPT25Handler.post(mPT25Runnable);
        }
    };
    Handler mPT25Handler = new Handler();
    Runnable mPT25Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(2,5);
        	checkState();
        }
    };
    View.OnClickListener mPT26Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT26Handler.removeCallbacks(mPT26Runnable);
            mPT26Handler.post(mPT26Runnable);
        }
    };
    Handler mPT26Handler = new Handler();
    Runnable mPT26Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(2,6);
        	checkState();
        }
    };     
	View.OnClickListener mPT31Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT31Handler.removeCallbacks(mPT31Runnable);
            mPT31Handler.post(mPT31Runnable);
        }
    };
    Handler mPT31Handler = new Handler();
    Runnable mPT31Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(3,1);
        	checkState();
        }
    };
	View.OnClickListener mPT32Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT32Handler.removeCallbacks(mPT32Runnable);
            mPT32Handler.post(mPT32Runnable);
        }
    };
    Handler mPT32Handler = new Handler();
    Runnable mPT32Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(3,2);
        	checkState();
        }
    };
	View.OnClickListener mPT33Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT33Handler.removeCallbacks(mPT33Runnable);
            mPT33Handler.post(mPT33Runnable);
        }
    };
    Handler mPT33Handler = new Handler();
    Runnable mPT33Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(3,3);
        	checkState();
        }
    };
	View.OnClickListener mPT34Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT34Handler.removeCallbacks(mPT34Runnable);
            mPT34Handler.post(mPT34Runnable);
        }
    };
    Handler mPT34Handler = new Handler();
    Runnable mPT34Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(3,4);
        	checkState();
        }
    };
    View.OnClickListener mPT35Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT35Handler.removeCallbacks(mPT35Runnable);
            mPT35Handler.post(mPT35Runnable);
        }
    };
    Handler mPT35Handler = new Handler();
    Runnable mPT35Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(3,5);
        	checkState();
        }
    };
    View.OnClickListener mPT36Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT36Handler.removeCallbacks(mPT36Runnable);
            mPT36Handler.post(mPT36Runnable);
        }
    };
    Handler mPT36Handler = new Handler();
    Runnable mPT36Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(3,6);
        	checkState();
        }
    };
	View.OnClickListener mPT41Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT41Handler.removeCallbacks(mPT41Runnable);
            mPT41Handler.post(mPT41Runnable);
        }
    };
    Handler mPT41Handler = new Handler();
    Runnable mPT41Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(4,1);
        	checkState();
        }
    };
	View.OnClickListener mPT42Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT42Handler.removeCallbacks(mPT42Runnable);
            mPT42Handler.post(mPT42Runnable);
        }
    };
    Handler mPT42Handler = new Handler();
    Runnable mPT42Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(4,2);
        	checkState();
        }
    };
	View.OnClickListener mPT43Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT43Handler.removeCallbacks(mPT43Runnable);
            mPT43Handler.post(mPT43Runnable);
        }
    };
    Handler mPT43Handler = new Handler();
    Runnable mPT43Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(4,3);
        	checkState();
        }
    };
	View.OnClickListener mPT44Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT44Handler.removeCallbacks(mPT44Runnable);
            mPT44Handler.post(mPT44Runnable);
        }
    };
    Handler mPT44Handler = new Handler();
    Runnable mPT44Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(4,4);
        	checkState();
        }
    };
    View.OnClickListener mPT45Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT45Handler.removeCallbacks(mPT45Runnable);
            mPT45Handler.post(mPT45Runnable);
        }
    };
    Handler mPT45Handler = new Handler();
    Runnable mPT45Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(4,5);
        	checkState();
        }
    };
    View.OnClickListener mPT46Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT46Handler.removeCallbacks(mPT46Runnable);
            mPT46Handler.post(mPT46Runnable);
        }
    };
    Handler mPT46Handler = new Handler();
    Runnable mPT46Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(4,6);
        	checkState();
        }
    };
    View.OnClickListener mPT51Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT51Handler.removeCallbacks(mPT51Runnable);
            mPT51Handler.post(mPT51Runnable);
        }
    };
    Handler mPT51Handler = new Handler();
    Runnable mPT51Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(5,1);
        	checkState();
        }
    };
	View.OnClickListener mPT52Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT52Handler.removeCallbacks(mPT52Runnable);
            mPT52Handler.post(mPT52Runnable);
        }
    };
    Handler mPT52Handler = new Handler();
    Runnable mPT52Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(5,2);
        	checkState();
        }
    };
	View.OnClickListener mPT53Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT53Handler.removeCallbacks(mPT53Runnable);
            mPT53Handler.post(mPT53Runnable);
        }
    };
    Handler mPT53Handler = new Handler();
    Runnable mPT53Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(5,3);
        	checkState();
        }
    };
	View.OnClickListener mPT54Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT54Handler.removeCallbacks(mPT54Runnable);
            mPT54Handler.post(mPT54Runnable);
        }
    };
    Handler mPT54Handler = new Handler();
    Runnable mPT54Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(5,4);
        	checkState();
        }
    };
    View.OnClickListener mPT55Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT55Handler.removeCallbacks(mPT55Runnable);
            mPT55Handler.post(mPT55Runnable);
        }
    };
    Handler mPT55Handler = new Handler();
    Runnable mPT55Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(5,5);
        	checkState();
        }
    };
    View.OnClickListener mPT56Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT56Handler.removeCallbacks(mPT56Runnable);
            mPT56Handler.post(mPT56Runnable);
        }
    };
    Handler mPT56Handler = new Handler();
    Runnable mPT56Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(5,6);
        	checkState();
        }
    };
    View.OnClickListener mPT61Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT61Handler.removeCallbacks(mPT61Runnable);
            mPT61Handler.post(mPT61Runnable);
        }
    };
    Handler mPT61Handler = new Handler();
    Runnable mPT61Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(6,1);
        	checkState();
        }
    };
	View.OnClickListener mPT62Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT62Handler.removeCallbacks(mPT62Runnable);
            mPT62Handler.post(mPT62Runnable);
        }
    };
    Handler mPT62Handler = new Handler();
    Runnable mPT62Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(6,2);
        	checkState();
        }
    };
	View.OnClickListener mPT63Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT63Handler.removeCallbacks(mPT63Runnable);
            mPT63Handler.post(mPT63Runnable);
        }
    };
    Handler mPT63Handler = new Handler();
    Runnable mPT63Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(6,3);
        	checkState();
        }
    };
	View.OnClickListener mPT64Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT64Handler.removeCallbacks(mPT64Runnable);
            mPT64Handler.post(mPT64Runnable);
        }
    };
    Handler mPT64Handler = new Handler();
    Runnable mPT64Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(6,4);
        	checkState();
        }
    };
    View.OnClickListener mPT65Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT65Handler.removeCallbacks(mPT65Runnable);
            mPT65Handler.post(mPT65Runnable);
        }
    };
    Handler mPT65Handler = new Handler();
    Runnable mPT65Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(6,5);
        	checkState();
        }
    };
    View.OnClickListener mPT66Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	mPT66Handler.removeCallbacks(mPT66Runnable);
            mPT66Handler.post(mPT66Runnable);
        }
    };
    Handler mPT66Handler = new Handler();
    Runnable mPT66Runnable = new Runnable() {
        @Override
        public void run() {
        	subtractGameState(6,6);
        	checkState();
        }
    };
    
    View.OnClickListener mRestartButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	 mRestartButtonHandler.removeCallbacks(mRestartButtonRunnable);
        	 mRestartButtonHandler.post(mRestartButtonRunnable);
        }
    };
    Handler  mRestartButtonHandler = new Handler();
    Runnable  mRestartButtonRunnable = new Runnable() {
        @Override
        public void run() {
        	restartGame();
        }
    };
    View.OnClickListener mSkipButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        	 mSkipButtonHandler.removeCallbacks(mSkipButtonRunnable);
        	 mSkipButtonHandler.post(mSkipButtonRunnable);
        }
    };
    Handler  mSkipButtonHandler = new Handler();
    Runnable  mSkipButtonRunnable = new Runnable() {
        @Override
        public void run() {
        	randomGame();
        }
    };
    
    private void restartGame() {
   	 	loadMCurrent(mGameStart);
   	 	setGameStates(mCurrent);
    }
    
    private void addGameState(int row, int col) {
     	if (row == 1) {
    		mCurrent[getIndexForMCurrent(2,col)] = mCurrent[getIndexForMCurrent(2,col)]+1;
    	}
    	if (row == 2) {
    		mCurrent[getIndexForMCurrent(1,col)] = mCurrent[getIndexForMCurrent(1,col)]+1;
    		mCurrent[getIndexForMCurrent(3,col)] = mCurrent[getIndexForMCurrent(3,col)]+1;
    	}
    	if (row == 3) {
    		mCurrent[getIndexForMCurrent(2,col)] = mCurrent[getIndexForMCurrent(2,col)]+1;
    		mCurrent[getIndexForMCurrent(4,col)] = mCurrent[getIndexForMCurrent(4,col)]+1;
    	}    	
    	if (row == 4) {
    		mCurrent[getIndexForMCurrent(3,col)] = mCurrent[getIndexForMCurrent(3,col)]+1;
    		mCurrent[getIndexForMCurrent(5,col)] = mCurrent[getIndexForMCurrent(5,col)]+1;
    	}
    	if (row == 5) {
    		mCurrent[getIndexForMCurrent(4,col)] = mCurrent[getIndexForMCurrent(4,col)]+1;
    		mCurrent[getIndexForMCurrent(6,col)] = mCurrent[getIndexForMCurrent(6,col)]+1;
    	}
    	if (row == 6) {
    		mCurrent[getIndexForMCurrent(5,col)] = mCurrent[getIndexForMCurrent(5,col)]+1;
    	}
    	if (col == 1) {
    		mCurrent[getIndexForMCurrent(row,2)] = mCurrent[getIndexForMCurrent(row,2)]+1;
    	}
    	if (col == 2) {
    		mCurrent[getIndexForMCurrent(row,1)] = mCurrent[getIndexForMCurrent(row,1)]+1;
    		mCurrent[getIndexForMCurrent(row,3)] = mCurrent[getIndexForMCurrent(row,3)]+1;
    	}
    	if (col == 3) {
    		mCurrent[getIndexForMCurrent(row,2)] = mCurrent[getIndexForMCurrent(row,2)]+1;
    		mCurrent[getIndexForMCurrent(row,4)] = mCurrent[getIndexForMCurrent(row,4)]+1;
    	}    	
    	if (col == 4) {
    		mCurrent[getIndexForMCurrent(row,3)] = mCurrent[getIndexForMCurrent(row,3)]+1;
    		mCurrent[getIndexForMCurrent(row,5)] = mCurrent[getIndexForMCurrent(row,5)]+1;
    	}    	
    	if (col == 5) {
    		mCurrent[getIndexForMCurrent(row,4)] = mCurrent[getIndexForMCurrent(row,4)]+1;
    		mCurrent[getIndexForMCurrent(row,6)] = mCurrent[getIndexForMCurrent(row,6)]+1;
    	}    	
    	if (col == 6) {
    		mCurrent[getIndexForMCurrent(row,5)] = mCurrent[getIndexForMCurrent(row,5)]+1;
    	}
    	mCurrent[getIndexForMCurrent(row,col)] = mCurrent[getIndexForMCurrent(row,col)]+1;
    	setGameStates(mCurrent);
    }
    
    private void subtractGameState(int row, int col) {
     	if (row == 1) {
    		mCurrent[getIndexForMCurrent(2,col)] = mCurrent[getIndexForMCurrent(2,col)]-1;
    	}
    	if (row == 2) {
    		mCurrent[getIndexForMCurrent(1,col)] = mCurrent[getIndexForMCurrent(1,col)]-1;
    		mCurrent[getIndexForMCurrent(3,col)] = mCurrent[getIndexForMCurrent(3,col)]-1;
    	}
    	if (row == 3) {
    		mCurrent[getIndexForMCurrent(2,col)] = mCurrent[getIndexForMCurrent(2,col)]-1;
    		mCurrent[getIndexForMCurrent(4,col)] = mCurrent[getIndexForMCurrent(4,col)]-1;
    	}    	
    	if (row == 4) {
    		mCurrent[getIndexForMCurrent(3,col)] = mCurrent[getIndexForMCurrent(3,col)]-1;
    		mCurrent[getIndexForMCurrent(5,col)] = mCurrent[getIndexForMCurrent(5,col)]-1;
    	}
    	if (row == 5) {
    		mCurrent[getIndexForMCurrent(4,col)] = mCurrent[getIndexForMCurrent(4,col)]-1;
    		mCurrent[getIndexForMCurrent(6,col)] = mCurrent[getIndexForMCurrent(6,col)]-1;
    	}
    	if (row == 6) {
    		mCurrent[getIndexForMCurrent(5,col)] = mCurrent[getIndexForMCurrent(5,col)]-1;
    	}
    	if (col == 1) {
    		mCurrent[getIndexForMCurrent(row,2)] = mCurrent[getIndexForMCurrent(row,2)]-1;
    	}
    	if (col == 2) {
    		mCurrent[getIndexForMCurrent(row,1)] = mCurrent[getIndexForMCurrent(row,1)]-1;
    		mCurrent[getIndexForMCurrent(row,3)] = mCurrent[getIndexForMCurrent(row,3)]-1;
    	}
    	if (col == 3) {
    		mCurrent[getIndexForMCurrent(row,2)] = mCurrent[getIndexForMCurrent(row,2)]-1;
    		mCurrent[getIndexForMCurrent(row,4)] = mCurrent[getIndexForMCurrent(row,4)]-1;
    	}    	
    	if (col == 4) {
    		mCurrent[getIndexForMCurrent(row,3)] = mCurrent[getIndexForMCurrent(row,3)]-1;
    		mCurrent[getIndexForMCurrent(row,5)] = mCurrent[getIndexForMCurrent(row,5)]-1;
    	}    	
    	if (col == 5) {
    		mCurrent[getIndexForMCurrent(row,4)] = mCurrent[getIndexForMCurrent(row,4)]-1;
    		mCurrent[getIndexForMCurrent(row,6)] = mCurrent[getIndexForMCurrent(row,6)]-1;
    	}    	
    	if (col == 6) {
    		mCurrent[getIndexForMCurrent(row,5)] = mCurrent[getIndexForMCurrent(row,5)]-1;
    	}
    	mCurrent[getIndexForMCurrent(row,col)] = mCurrent[getIndexForMCurrent(row,col)]-1;
    	setGameStates(mCurrent);
    }
    
    private void checkState() {
    	if (mCurrent[0]==0&
        		mCurrent[1]==0&
        		mCurrent[2]==0&
        		mCurrent[3]==0&
        		mCurrent[4]==0&
        		mCurrent[5]==0&
        		mCurrent[6]==0&
        		mCurrent[7]==0&
        		mCurrent[8]==0&
        		mCurrent[9]==0&
        		mCurrent[10]==0&
        		mCurrent[11]==0&
        		mCurrent[12]==0&
        		mCurrent[13]==0&
        		mCurrent[14]==0&
        		mCurrent[15]==0&
        		mCurrent[16]==0&
        		mCurrent[17]==0&
        		mCurrent[18]==0&
        		mCurrent[19]==0&
        		mCurrent[20]==0&
        		mCurrent[21]==0&
        		mCurrent[22]==0&
        		mCurrent[23]==0&
        		mCurrent[24]==0&
        		mCurrent[25]==0&
        		mCurrent[26]==0&
        		mCurrent[27]==0&
        		mCurrent[28]==0&
        		mCurrent[29]==0&
        		mCurrent[30]==0&
        		mCurrent[31]==0&
        		mCurrent[32]==0&
        		mCurrent[33]==0&
        		mCurrent[34]==0&
        		mCurrent[35]==0) {
        	 	mGameNumber++;
        	 	randomGame();
        	 	mNumGames.setText(String.valueOf(mGameNumber-1));
        	} else if (mCurrent[0]==-1|
            		mCurrent[1]==-1|
            		mCurrent[2]==-1|
            		mCurrent[3]==-1|
            		mCurrent[4]==-1|
            		mCurrent[5]==-1|
            		mCurrent[6]==-1|
            		mCurrent[7]==-1|
            		mCurrent[8]==-1|
            		mCurrent[9]==-1|
            		mCurrent[10]==-1|
            		mCurrent[11]==-1|
            		mCurrent[12]==-1|
            		mCurrent[13]==-1|
            		mCurrent[14]==-1|
            		mCurrent[15]==-1|
            		mCurrent[16]==-1|
            		mCurrent[17]==-1|
            		mCurrent[18]==-1|
            		mCurrent[19]==-1|
            		mCurrent[20]==-1|
            		mCurrent[21]==-1|
            		mCurrent[22]==-1|
            		mCurrent[23]==-1|
            		mCurrent[24]==-1|
            		mCurrent[25]==-1|
            		mCurrent[26]==-1|
            		mCurrent[27]==-1|
            		mCurrent[28]==-1|
            		mCurrent[29]==-1|
            		mCurrent[30]==-1|
            		mCurrent[31]==-1|
            		mCurrent[32]==-1|
            		mCurrent[33]==-1|
            		mCurrent[34]==-1|
            		mCurrent[35]==-1) {
            	restartGame();
        	}
    }
    
    private int getIndexForMCurrent(int row,int col) {
    	if (row==1) {
    		return (col-1);
    	}
    	if (row==2) {
    		return (col+5);
    	}
    	if (row==3) {
    		return (col+11);
    	}
    	if (row==4) {
    		return (col+17);
    	}
    	if (row==5) {
    		return (col+23);
    	}
    	if (row==6) {
    		return (col+29);
    	}
    	return 0;
    }
    private int getRowForMCurrent(int index) {
    	if (index >= 0 & index <= 5) {
    		return 1;
    	}
    	if (index >= 6 & index <= 11) {
    		return 2;
    	}
    	if (index >= 12 & index <= 17) {
    		return 3;
    	}
    	if (index >= 18 & index <= 23) {
    		return 4;
    	}
    	if (index >= 24 & index <= 29) {
    		return 5;
    	}
    	if (index >= 30 & index <= 35) {
    		return 6;
    	}
    	return 0;    	
    }
    private int getColForMCurrent(int index) {
    	int row=getRowForMCurrent(index);
    	return index-6*(row-1)+1;
    }    
}
