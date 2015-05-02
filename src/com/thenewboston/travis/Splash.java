package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
public class Splash extends Activity{
MediaPlayer ourSong; 
		protected void onCreate (Bundle TravisloveBacon){
				super.onCreate(TravisloveBacon);
				setContentView(R.layout.splas);
				ourSong = MediaPlayer.create(Splash.this, R.raw.faith);
				
				SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
				boolean music = getPrefs.getBoolean("checkbox", true);
				if(music == true)
				ourSong.start();
				
				Thread timer = new Thread(){
					public void run(){
							try {
								sleep(5000);
							} catch (InterruptedException e) {
								// TODO: handle exception
								e.printStackTrace();
							}finally{
								Intent openStartingPoint = new Intent("com.thenewboston.travis.MENU");
									startActivity(openStartingPoint);
								
							}
						
					}	
					
				};
			timer.start();
		}

		@Override
		protected void onPause() {/**this method is called before stm startActivity(openStartingPoint);*/
			// TODO Auto-generated method stub
			super.onPause();
			ourSong.release();
			
			finish();
		}
		
	
}
