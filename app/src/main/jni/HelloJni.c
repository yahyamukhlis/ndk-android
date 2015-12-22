#include <jni.h>
#include "include/com_mukhlis_ndkandroid_HelloJni.h"

JNIEXPORT jstring JNICALL Java_com_mukhlis_ndkandroid_HelloJni_getMessage
        (JNIEnv *env, jobject thisObj) {
    return (*env)->NewStringUTF(env, "Hello from native code C!");
}