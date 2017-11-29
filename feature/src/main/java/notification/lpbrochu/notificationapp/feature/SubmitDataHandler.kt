package notification.lpbrochu.notificationapp.feature

import com.loopj.android.http.AsyncHttpResponseHandler
import notification.lpbrochu.notificationapp.feature.handler.EmptyResponseHandler

/**
 * Created by lpbrochu on 27/11/17.
 */
class SubmitDataHandler(val defaultHttpResponseHandler: AsyncHttpResponseHandler = EmptyResponseHandler()) {

    private val httpUtils = HttpUtils(baseUrl = "http://localhost:5000")

    fun submitData(responseHandler: AsyncHttpResponseHandler = defaultHttpResponseHandler) {

        val test = httpUtils.get(url ="/users/2323/notifications", responseHandler = responseHandler)
        print(test)
    }
}