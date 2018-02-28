package io.branch.zaraapplication.app;

import android.app.Application;

import io.branch.referral.Branch;

/**
 * Created by lorence on 30/01/2018.
 * #AppName: BranchApp
 */

public class BranchApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Branch.getAutoInstance(this);
    }

}
