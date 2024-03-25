package com.benny.openlauncher.model;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import android.support.v4.content.ContextCompat;

import com.benny.openlauncher.R;
import com.benny.openlauncher.manager.Setup;

import java.util.List;

public class AppRecommend extends App {


    public static AppRecommend getAppFromItem(Item item) {
        if (item == null) {
            return null;
        }
        AppRecommend app = new AppRecommend();
        app.setIcon(item.getIcon());
        app._label = item.getLabel();
        return app;
    }

    @Override
    public Drawable getIcon() {
        return ContextCompat.getDrawable(Setup.appContext(), R.drawable.item_drawer);
    }

    public String getComponentName() {
        return "";
    }


    public String getPackageName() {
        return "";
    }

    public String getClassName() {
        return "";
    }

}
