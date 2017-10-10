package thepunkprogrammer.kotlindelegates

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat

/**
 * Created by webcubictech2 on 9/10/17.
 */

inline fun notification(context: Context, func: NotificationCompat.Builder.() -> Unit): Notification {
    val builder = NotificationCompat.Builder(context)
    builder.func()
    return builder.build()
}

@RequiresApi(Build.VERSION_CODES.O)
inline fun channelNotification(context: Context, channelId: String, func: NotificationCompat.Builder.() -> Unit): Notification {
    val notification = NotificationCompat.Builder(context, channelId)
    notification.func()
    return notification.build()
}


/**
 * Use for sending a notification
 * @param context, noticationId.
 * pass all the notification builder methods here
 * including pendingIntent and taskstackbuilder if needed
 * @Deprecated in api 26
 */
@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
@Deprecated("Deprecated in api 26, for api 26 Use notification.displayNotification(context, id, channelId) instead", level = DeprecationLevel.WARNING)
inline fun Notification.Builder.sendNotification(context: Context,notificationId: Int,  func: Notification.Builder.() -> Unit) {
    func()
    val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    notificationManager.notify(notificationId, this.build())
}

/**
 * Use for sending notification
 * @param context, notificationId, channelId
 * pass all the method except setChannelId the method
 * handles it for you
 * use it instead of sendNotification if you are supporting
 * @api 26
 */
@RequiresApi(Build.VERSION_CODES.O)
inline fun Notification.Builder.displayNotification(context: Context, notificationId: Int, channelId: String, func: Notification.Builder.() -> Unit) {
    func()
    this.setChannelId(channelId)
    val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    notificationManager.notify(notificationId, this.build())
}