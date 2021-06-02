package com.yxud.framework;

import android.content.Context;

/**
 * 双重校验锁单例类
 *
 * @author yangxudong
 * @date 2021-05-27
 */
public class Framework {

    private volatile static Framework mFramework;

    public Framework() {
    }

    public static Framework getFramework() {
        if (mFramework == null) {
            synchronized (Framework.class) {
                if (mFramework == null) {
                    mFramework = new Framework();
                }
            }
        }
        return mFramework;
    }

    public void initFramework(Context context) {

    }
}
