object ApplicationId{
    const val id = "sattayapong.testPattern"
}

object Modules{
    const val app = ":app"
    const val navigation = ":navigation"
    const val commonRes = ":common-res"
}

object Releases{
    const val versionCode = 1
    const val versionName = "1.0"
    const val compileSdk = 32
    const val minSdk = 26
    const val targetSdk = 32

}

object Versions {
    const val androidGradle = "4.0.1"
    const val kotlin = "1.7.0"
    const val appCompat = "1.5.1"
    const val material = "1.7.0"
    const val constraintLayout = "1.7.0"
    const val jUnit = "1.1.3"
    const val espresso = "3.4.0"
    const val jvmTarget = "1.8"
    const val navigation = "2.5.3"

}

object Deps {
    const val coreKtx = "androidx.core:core-ktx:${Versions.kotlin}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

    //nav
    const val nav_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val nav_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val nav_safe_args = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val nav_compose = "androidx.navigation:navigation-compose:${Versions.navigation}"

}

object TestDeps {

    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val junit = "androidx.test.ext:junit:${Versions.jUnit}"
}