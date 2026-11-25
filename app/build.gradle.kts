plugins {
    id("com.android.application")
}
android {
    namespace = "com.yaway.wubzoo"
    compileSdk = 35
    buildToolsVersion = "35.0.0"
    defaultConfig {
        applicationId = "com.yaway.wubzoo"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    signingConfigs.getByName("debug") {
        storeFile = file("../debug-signing/wubzoo-debug.jks")
        storePassword = "android"
        keyAlias = "androiddebugkey"
        keyPassword = "android"
    }
}
dependencies {
    implementation("androidx.webkit:webkit:1.12.1")
}
