plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.victorious.recovery"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.victorious.recovery"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "0.0.1-experimental"
    }

    // The debug APK is signed with this project's OWN fixed debug keystore.
    // The keystore is NEVER committed. CI decodes it from the KEYSTORE_BASE64
    // Actions secret and passes its location and passwords through env vars.
    // Without those env vars (local builds) the default Android debug key is used.
    val ksFile = System.getenv("VR_KEYSTORE_FILE")
    signingConfigs {
        if (ksFile != null) {
            create("victorDebug") {
                storeFile = file(ksFile)
                storePassword = System.getenv("VR_KEYSTORE_PASSWORD")
                keyAlias = System.getenv("VR_KEY_ALIAS")
                keyPassword = System.getenv("VR_KEY_PASSWORD")
            }
        }
    }

    buildTypes {
        debug {
            if (ksFile != null) signingConfig = signingConfigs.getByName("victorDebug")
        }
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
}
