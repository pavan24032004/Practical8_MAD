package com.example.p8_75_5b6
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import com.pavanpatel.p8_75_5b6.R

abstract class AlarmService:Service()
{
    var mp:MediaPlayer?=null
    override fun onStartCommand(intent:Intent,flags:Int,startId:Int):Int{
        if(intent!=null){
            mp=MediaPlayer.create(this,R.raw.alarm)
            mp?.start()
        }
        return START_STICKY
    }
    fun onDestory(){
        mp?.stop()
        super.onDestroy()
    }


    fun onbind(intent:Intent?):IBinder?{
        TODO("NOt yet implemented")
    }
}