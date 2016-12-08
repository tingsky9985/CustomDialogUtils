package com.example.lost.customdialog;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lost on 2016/12/8.
 */

public class DialogUtils {

    /**
     * 提示用户，用户点击知道，关闭窗口，
     * 传入标题和内容
     */
    public static void showPromptDialog(Context context, String title, String content) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.prompt_dialog, null);
        TextView titleView = (TextView) view.findViewById(R.id.prompt_dialog_title);
        TextView contentView = (TextView) view.findViewById(R.id.prompt_dialog_content);
        Button button = (Button) view.findViewById(R.id.prompt_dialog_ok);
        titleView.setText("title");
        contentView.setText("content");
        button.setText("ok");
        builder.setView(view);
        builder.create().show();

    }

    /**
     * 用户需要选择确定，取消
     * 传入标题和内容
     */
    public void showSelectDialog(String title, String content) {

    }
}
