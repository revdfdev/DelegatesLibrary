package thepunkprogrammer.kotlindelegates

import android.accounts.AccountManager
import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.*
import android.app.admin.DevicePolicyManager
import android.app.job.JobScheduler
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothAdapter
import android.content.ClipboardManager
import android.content.Context
import android.content.RestrictionsManager
import android.content.pm.LauncherApps
import android.hardware.ConsumerIrManager
import android.hardware.SensorManager
import android.hardware.camera2.CameraManager
import android.hardware.display.DisplayManager
import android.hardware.input.InputManager
import android.hardware.usb.UsbManager
import android.location.LocationManager
import android.media.AudioManager
import android.media.MediaRouter
import android.media.projection.MediaProjectionManager
import android.media.session.MediaSessionManager
import android.media.tv.TvInputManager
import android.net.ConnectivityManager
import android.net.nsd.NsdManager
import android.net.wifi.WifiManager
import android.net.wifi.p2p.WifiP2pManager
import android.nfc.NfcManager
import android.os.*
import android.os.storage.StorageManager
import android.print.PrintManager
import android.service.wallpaper.WallpaperService
import android.support.annotation.RequiresApi
import android.telephony.TelephonyManager
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.accessibility.CaptioningManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager

/**
 * Created by webcubictech2 on 9/10/17.
 */
    fun Context.getAccesibilityManager(): AccessibilityManager = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager

    fun Context.getAccountManager(): AccountManager = getSystemService(Context.ACCOUNT_SERVICE) as AccountManager

    fun Context.getActivityManager(): ActivityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

    fun Context.getAlarmManager(): AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.getAppWidgetManager(): AppWidgetManager = getSystemService(Context.APPWIDGET_SERVICE) as AppWidgetManager

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun Context.getAppOpsManager(): AppOpsManager = getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager

    fun Context.getAudioManager(): AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.getBatteryManager(): BatteryManager = getSystemService(Context.BATTERY_SERVICE) as BatteryManager

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @SuppressLint("ServiceCast")
    fun Context.getBluetoothAdapter(): BluetoothAdapter = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothAdapter

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.getCameraManager(): CameraManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun Context.getCaptionManager(): CaptioningManager = getSystemService(Context.CAPTIONING_SERVICE) as CaptioningManager

    fun Context.getClipboardManager(): ClipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

    fun Context.getConnectivityService(): ConnectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun Context.getConsumerIrManager(): ConsumerIrManager = getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager

    fun Context.devicePolicyManager(): DevicePolicyManager = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    fun Context.displayManager(): DisplayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager

    fun Context.downloadManager(): DownloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

    fun Context.dropBoxManager(): DropBoxManager = getSystemService(Context.DROPBOX_SERVICE) as DropBoxManager

    fun Context.inputMethodManager(): InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    fun Context.inputManager(): InputManager = getSystemService(Context.INPUT_SERVICE) as InputManager

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.jobScheduler(): JobScheduler = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler

    fun Context.keyGuardManager(): KeyguardManager = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.launcherApp(): LauncherApps = getSystemService(Context.LAUNCHER_APPS_SERVICE) as LauncherApps

    fun Context.layoutInflator(): LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    fun Context.locationManager(): LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.mediaProgectionManager(): MediaProjectionManager = getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    fun Context.mediaRouter(): MediaRouter = getSystemService(Context.MEDIA_ROUTER_SERVICE) as MediaRouter

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.mediaSessionManager(): MediaSessionManager = getSystemService(Context.MEDIA_SESSION_SERVICE) as MediaSessionManager

    fun Context.nfcManager(): NfcManager = getSystemService(Context.NFC_SERVICE) as NfcManager

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    fun Context.nsdManager(): NsdManager = getSystemService(Context.NSD_SERVICE) as NsdManager

    fun Context.poerManager(): PowerManager = getSystemService(Context.POWER_SERVICE) as PowerManager

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun Context.printService(): PrintManager = getSystemService(Context.PRINT_SERVICE) as PrintManager

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.restictionManager(): RestrictionsManager = getSystemService(Context.RESTRICTIONS_SERVICE) as RestrictionsManager

    fun Context.getSearchManager(): SearchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager

    fun Context.getSensorManager(): SensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

    fun Context.getStorageManager(): StorageManager =getSystemService(Context.STORAGE_SERVICE) as StorageManager

    fun Context.getTelephonyManager(): TelephonyManager =getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

    fun Context.getTextServicesManager(): TextServicesManager = getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE) as TextServicesManager

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    fun Context.getTvInputManager(): TvInputManager =getSystemService(Context.TV_INPUT_SERVICE) as TvInputManager

    fun Context.getUiModeManager(): UiModeManager = getSystemService(Context.UI_MODE_SERVICE) as UiModeManager

    fun Context.getUsbManager(): UsbManager = getSystemService(Context.USB_SERVICE) as UsbManager

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    fun Context.getUserManager(): UserManager = getSystemService(Context.USER_SERVICE) as UserManager

    fun Context.getVibrator(): Vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

    @SuppressLint("ServiceCast")
    fun Context.getWallpaperService(): WallpaperService = getSystemService(Context.WALLPAPER_SERVICE) as WallpaperService

    fun Context.getWifiP2pManager(): WifiP2pManager = getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager

    @SuppressLint("WifiManagerLeak")
    fun Context.getWifiManager(): WifiManager = getSystemService(Context.WIFI_SERVICE) as WifiManager

    fun Context.getWindowService(): WindowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager