package com.laioffer.tinnews.common;

import android.os.Bundle;

public interface TinFragmentManager {

   void doFragmentTransaction(TinBasicFragment basicFragment);

    void startActivityWithBundle(Class<?> clazz, boolean isFinished, Bundle bundle);
    //Class<?>它是个通配泛型，?可以代表任何类型，主要用于声明时的限制情况
    //Bundle主要用于传递数据；它保存的数据，是以key-value(键值对)的形式存在的。

    void showSnackBar(String message);
    //Snackbar是Android Support Design Library库中的一个控件，可以在屏幕底部快速弹出消息
}

