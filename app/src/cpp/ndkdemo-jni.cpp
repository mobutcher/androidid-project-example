/**Write your C source code*/
#include <jni.h>

#include <string>

extern "C" JNIEXPORT jstring JNICALL

Java_com_ndk_ndkdemo1_MainActivity_demo(JNIEnv* env, jobject o){
    
    jstring str = env->NewStringUTF("Androidide Native project Demo");
    
    return str;
}
 
extern "C" JNIEXPORT jint JNICALL 

Java_com_ndk_ndkDemo1_MainActivity_add(JNIEnv* env, jint a,jint b){
 
    
}
