package io.branch.zaraapplication.app;

import android.app.Application;

import io.branch.referral.Branch;

/**
 * Created by lorence on 30/01/2018.
 * #AppName: ZaraApplication
 */

public class ZaraApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Branch.getAutoInstance(this);
    }

}
