package thepunkprogrammer.kotlindelegates

import android.app.Notification
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