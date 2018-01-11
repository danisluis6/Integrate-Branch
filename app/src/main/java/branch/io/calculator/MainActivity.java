package branch.io.calculator;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import org.json.JSONObject;

import butterknife.BindView;
import butterknife.OnClick;
import io.branch.referral.Branch;
import io.branch.referral.BranchError;

public class MainActivity extends BaseActivity {

    private String mOperator;

    @BindView(R.id.edtOperator)
    EditText edtOperator;

    @BindView(R.id.edtResult)
    EditText edtResult;

    @Override
    public void onNewIntent(Intent intent) {
        this.setIntent(intent);
    }

    @Override
    public void onStart() {
        super.onStart();
        Branch branch = Branch.getInstance();

        // Branch init
        Branch.getInstance().initSession(new Branch.BranchReferralInitListener() {
            @Override
            public void onInitFinished(JSONObject referringParams, BranchError error) {
                if (error == null) {
                    Log.i("BRANCH SDK", referringParams.toString());
                } else {
                    Log.i("BRANCH SDK", error.getMessage());
                }
            }
        }, this.getIntent().getData(), this);

    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void activityCreated() {
        mOperator = "";
    }

    @OnClick({R.id.btnOne, R.id.btnTwo, R.id.btnThree, R.id.btnFour, R.id.btnFive,
            R.id.btnSix, R.id.btnSeven, R.id.btnEight, R.id.btnNine, R.id.btnEqual,
            R.id.operaAddition, R.id.operaDivide, R.id.operaMultiply, R.id.operaSubtract})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                mOperator += "1";
                updateExpress(mOperator);
                break;
            case R.id.btnTwo:
                mOperator += "2";
                updateExpress(mOperator);
                break;
            case R.id.btnThree:
                mOperator += "3";
                updateExpress(mOperator);
                break;
            case R.id.btnFour:
                mOperator += "4";
                updateExpress(mOperator);
                break;
            case R.id.btnFive:
                mOperator += "5";
                updateExpress(mOperator);
                break;
            case R.id.btnSix:
                mOperator += "6";
                updateExpress(mOperator);
                break;
            case R.id.btnSeven:
                mOperator += "7";
                updateExpress(mOperator);
                break;
            case R.id.btnEight:
                mOperator += "8";
                updateExpress(mOperator);
                break;
            case R.id.btnNine:
                mOperator += "9";
                updateExpress(mOperator);
                break;
            case R.id.btnEqual:
                viewResult();
                break;
            case R.id.operaAddition:
                mOperator += "+";
                updateExpress(mOperator);
                break;
            case R.id.operaSubtract:
                mOperator += "-";
                updateExpress(mOperator);
                break;
            case R.id.operaMultiply:
                mOperator += "x";
                updateExpress(mOperator);
                break;
            case R.id.operaDivide:
                mOperator += "/";
                updateExpress(mOperator);
                break;
        }
    }

    private void viewResult() {
        /* Using algorithm Ki Pap Ba Lan */
    }

    private void updateExpress(String express) {
        edtOperator.setText(express);
    }
}
