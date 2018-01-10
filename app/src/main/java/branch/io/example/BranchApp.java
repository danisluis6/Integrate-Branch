package branch.io.example;

import android.app.Application;

import io.branch.referral.Branch;

/**
 * Created by lorence on 10/01/2018.
 *
 */

public final class BranchApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Branch logging for debugging
        Branch.enableLogging();

        // Initialize the Branch object
        Branch.getAutoInstance(this);

    }
}