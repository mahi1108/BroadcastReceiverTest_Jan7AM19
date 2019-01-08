package cubex.mahesh.broadcastreceivertest_jan7am19

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var filter = IntentFilter( )
        filter.addAction(Intent.ACTION_HEADSET_PLUG)
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        filter.addAction(Intent.ACTION_SCREEN_ON)
        filter.addAction(Intent.ACTION_SCREEN_OFF)
        filter.addAction(Intent.ACTION_POWER_CONNECTED)
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        filter.addAction(Intent.ACTION_BATTERY_LOW)
        filter.addAction(Intent.ACTION_BATTERY_OKAY)
        filter.addAction("nit.and.ouraction")
        registerReceiver(MyReceiver(tv1),filter)

        b1.setOnClickListener {
                var i = Intent( )
                i.setAction("nit.and.ouraction")
                sendBroadcast(i)
        }


    }  // onCreate( )
}
