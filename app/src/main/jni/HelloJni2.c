#include <jni.h>
#include "include/com_mukhlis_ndkandroid_HelloJni.h"

JNIEXPORT jstring JNICALL Java_com_icehouse_ndkandroid_HelloJni_getMessageFromAnotherFile
        (JNIEnv *env, jobject thisObj) {
    return (*env)->NewStringUTF(env, "Hello from native code C from another file!");
}