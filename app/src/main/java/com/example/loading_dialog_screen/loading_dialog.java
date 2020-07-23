package com.example.loading_dialog_screen;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class loading_dialog {
    private static Activity activity;
   private static AlertDialog alertDialog;
    loading_dialog(Activity myActivity){
        activity = myActivity;
    }
    public void  beginLoadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog_box,null));
        builder.setCancelable(true);
        alertDialog=builder.create();
        alertDialog.show();
    }
}
