package notification.lpbrochu.notificationapp.feature.handler

import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header

/**
 * Created by lpbrochu on 29/11/17.
 */
class EmptyResponseHandler : AsyncHttpResponseHandler() {
    override fun onFailure(statusCode: Int, headers: Array<out Header>?, responseBody: ByteArray?, error: Throwable?) {
        // Not implemented by design
    }

    override fun onSuccess(statusCode: Int, headers: Array<out Header>?, responseBody: ByteArray?) {
        // Not implemented by design
    }
}