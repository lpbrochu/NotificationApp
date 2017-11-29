package notification.lpbrochu.notificationapp.feature.handler

import android.app.Activity
import android.widget.Toast
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header


/**
 * Created by lpbrochu on 29/11/17.
 */
class ToastMessageHandler(val targetActivity: Activity) : AsyncHttpResponseHandler() {
    override fun onSuccess(statusCode: Int, headers: Array<out Header>?, responseBody: ByteArray?) {
        val toast = Toast.makeText(targetActivity.getApplicationContext(), "send success",  Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onFailure(statusCode: Int, headers: Array<out Header>?, responseBody: ByteArray?, error: Throwable?) {
        val toast = Toast.makeText(targetActivity.getApplicationContext(), "sending failure!",  Toast.LENGTH_LONG)
        toast.show()
    }
}