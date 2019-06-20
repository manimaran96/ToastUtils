package coopon.manimaran.toastutils;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class ToastUtils {

    private static final int ERROR = 0;
    private static final int WARNING = 1;
    private static final int SUCCESS = 2;
    private static final int NORMAL = 3;
    private static final int INFO = 4;

    public static void showToast(Context context, String msg, int duration, int type) {
        Toast toast = Toast.makeText(context, msg, duration);
        View view = toast.getView();

        int bgColor = R.color.toast_normal;
        switch (type) {
            case NORMAL:
                bgColor = R.color.toast_normal;
                break;
            case ERROR:
                bgColor = R.color.toast_error;
                break;
            case WARNING:
                bgColor = R.color.toast_warning;
                break;
            case SUCCESS:
                bgColor = R.color.toast_success;
                break;
            case INFO:
                bgColor = R.color.toast_info;
                break;
        }
        //Gets the actual oval background of the Toast then sets the colour filter
        view.getBackground().setColorFilter(ContextCompat.getColor(context, bgColor), PorterDuff.Mode.SRC_IN);

        //Gets the TextView from the Toast so it can be editted
        //TextView text = view.findViewById(android.R.id.message);
        //text.setTextColor(YOUR_TEXT_COLOUR);
        toast.show();
    }

    public static void showLong(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, NORMAL);
    }

    public static void showShort(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_SHORT, NORMAL);
    }

    public static void showError(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, ERROR);
    }

    public static void showWarning(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, WARNING);
    }

    public static void showSuccess(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, SUCCESS);
    }

    public static void showInfo(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, INFO);
    }

    public static void showNormal(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, NORMAL);
    }
}
