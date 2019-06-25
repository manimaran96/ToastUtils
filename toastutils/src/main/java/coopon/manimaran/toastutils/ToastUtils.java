package coopon.manimaran.toastutils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import static androidx.core.view.ViewCompat.setBackground;

public class ToastUtils {

    private static final int ERROR = 0;
    private static final int WARNING = 1;
    private static final int SUCCESS = 2;
    private static final int NORMAL = 3;
    private static final int INFO = 4;


    public static void showToast(Context context, String msg, int duration, int type) {

        int bgColor = R.color.toast_normal;
        int icon = R.drawable.ic_success;
        switch (type) {
            case NORMAL:
                bgColor = R.color.toast_normal;
                icon = 0;
                break;
            case ERROR:
                bgColor = R.color.toast_error;
                icon = R.drawable.ic_error;
                break;
            case WARNING:
                bgColor = R.color.toast_warning;
                icon = R.drawable.ic_warning;
                break;
            case SUCCESS:
                bgColor = R.color.toast_success;
                icon = R.drawable.ic_success;
                break;
            case INFO:
                bgColor = R.color.toast_info;
                icon = R.drawable.ic_info;
                break;
        }

        // Toast view
        Toast currentToast = Toast.makeText(context, "", duration);
        View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.custom_toast, null);
        ImageView toastIcon = toastLayout.findViewById(R.id.toast_icon);
        TextView toastTextView = toastLayout.findViewById(R.id.toast_text);

        //Gets the actual oval background of the Toast then sets the colour filter
        toastLayout.getBackground().setColorFilter(ContextCompat.getColor(context, bgColor), PorterDuff.Mode.SRC_IN);

        if(icon != 0)
            toastIcon.setImageResource(icon);
        else
            toastIcon.setVisibility(View.GONE);

        toastTextView.setText(msg);
        toastTextView.setTextColor(Color.WHITE);
        toastTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        currentToast.setView(toastLayout);

        // Show Toast
        currentToast.show();

    }

    /**
     * Normal
     */

    public static void showShort(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_SHORT, NORMAL);
    }

    public static void showLong(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, NORMAL);
    }

    public static void showCustom(Context context, String msg, int duration) {
        showToast(context, msg, duration, NORMAL);
    }


    /**
     * Short
     */

    public static void showInfoShort(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_SHORT, INFO);
    }

    public static void showSuccessShort(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_SHORT, SUCCESS);
    }

    public static void showWarningShort(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_SHORT, WARNING);
    }

    public static void showErrorShort(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_SHORT, ERROR);
    }


    /**
     * Long
     */

    public static void showInfoLong(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, INFO);
    }

    public static void showSuccessLong(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, SUCCESS);
    }

    public static void showWarningLong(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, WARNING);
    }

    public static void showErrorLong(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_LONG, ERROR);
    }

    /**
     * Custom
     */

    public static void showInfoCustom(Context context, String msg, int duration) {
        showToast(context, msg, duration, INFO);
    }

    public static void showSuccessCustom(Context context, String msg,int duration) {
        showToast(context, msg, duration, SUCCESS);
    }

    public static void showWarningCustom(Context context, String msg, int duration) {
        showToast(context, msg, duration, WARNING);
    }

    public static void showErrorCustom(Context context, String msg, int duration) {
        showToast(context, msg, duration, ERROR);
    }

}
