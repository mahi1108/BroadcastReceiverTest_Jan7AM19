package cubex.mahesh.broadcastreceivertest_jan7am19

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(val t:TextView) :BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {

            t.text = p1?.action
    }

}