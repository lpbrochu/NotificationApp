package notification.lpbrochu.notificationapp.feature

/**
 * Created by lpbrochu on 27/11/17.
 */
class SubmitDataHandler {

    private val httpUtils = HttpUtils(baseUrl = "http://localhost:5000")

    fun submitData() {

        val test = httpUtils.get(url ="/users/2323/notifications")
        print(test)
    }
}