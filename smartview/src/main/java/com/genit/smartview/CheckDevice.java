package com.genit.smartview;

import android.os.Build;

public class CheckDevice {
    public  boolean check() {
        return (
                Build.FINGERPRINT.contains("generic") ||
                        Build.FINGERPRINT.contains("unknown") ||
                        Build.MODEL.contains("google_sdk") ||
                        Build.MODEL.contains("Emulator") ||
                        Build.MODEL.contains("Android SDK built for x86") ||
                        Build.MANUFACTURER.contains("Genymotion") ||
                        (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) ||
                        "google_sdk".equals(Build.PRODUCT) ||
                        "sdk".equals(Build.PRODUCT)
        );
    }
}
