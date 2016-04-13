# ndk-android
Ndk-Android with C code.

## Create header file interface
in folder include :
javah -classpath ../../../../build/intermediates/classes/debug:/Users/yahyamukhlis/Library/Android/sdk/platforms/android-23/android.jar 
-o com_mukhlis_ndkandroid_HelloJni.h com.mukhlis.ndkandroid.HelloJni

## Ndk-build
/Users/yahyamukhlis/android-ndk-r10e/ndk-build -C /Users/yahyamukhlis/repository/NdkAndroid/app/src/main/jni

## References
http://www3.ntu.edu.sg/home/ehchua/programming/android/android_ndk.html
