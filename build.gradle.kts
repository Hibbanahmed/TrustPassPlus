// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.3.1'
        classpath 'com.google.gms:google-services:4.2.0'



        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}