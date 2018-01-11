package branch.io.calculator.app;

import android.app.Application;

import io.branch.referral.Branch;

/**
 * Created by lorence on 10/01/2018.
 *
 */

public final class EMApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the Branch object
        Branch.getAutoInstance(this);
    }
}