package notification.lpbrochu.notificationapp.feature

import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import com.loopj.android.http.RequestParams

/**
 * Created by lpbrochu on 27/11/17.
 */
class HttpUtils(val baseUrl: String) {

    private val client = AsyncHttpClient()

    operator fun get(url: String, params: RequestParams? = null, responseHandler: AsyncHttpResponseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler)
    }

    fun post(url: String, params: RequestParams? = null, responseHandler: AsyncHttpResponseHandler? = null) {
        client.post(getAbsoluteUrl(url), params, responseHandler)
    }

    fun getByUrl(url: String, params: RequestParams, responseHandler: AsyncHttpResponseHandler) {
        client.get(url, params, responseHandler)
    }

    fun postByUrl(url: String, params: RequestParams, responseHandler: AsyncHttpResponseHandler) {
        client.post(url, params, responseHandler)
    }

    private fun getAbsoluteUrl(relativeUrl: String): String {
        return baseUrl + relativeUrl
    }
}

//public class HttpUtils {
//    private static final String BASE_URL = "http://api.twitter.com/1/";
//
//    private static AsyncHttpClient client = new AsyncHttpClient();
//
//    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
//        client.get(getAbsoluteUrl(url), params, responseHandler);
//    }
//
//    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
//        client.post(getAbsoluteUrl(url), params, responseHandler);
//    }
//
//    public static void getByUrl(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
//        client.get(url, params, responseHandler);
//    }
//
//    public static void postByUrl(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
//        client.post(url, params, responseHandler);
//    }
//
//    private static String getAbsoluteUrl(String relativeUrl) {
//        return BASE_URL + relativeUrl;
//    }
//}