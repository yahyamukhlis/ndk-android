LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := app
LOCAL_SRC_FILES := HelloJNI.c HelloJNI2.c

include $(BUILD_SHARED_LIBRARY)