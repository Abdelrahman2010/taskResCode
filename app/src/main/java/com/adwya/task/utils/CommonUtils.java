package com.adwya.task.utils;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.adwya.task.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;



/**
 * Created by Aya Mohamed on 11/17/2019.
 */
public final class CommonUtils {

    private static AlertDialog alertDialog;

    //method to convert the selected image to base64 encoded string

//    public static void downloadFile(Context context, String DownloadUrl, String fileName) {
//        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
//        request.setDescription(fileName);   //appears the same in Notification bar while downloading
//        request.setTitle(fileName);
//        request.setVisibleInDownloadsUi(false);
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            request.allowScanningByMediaScanner();
//            //request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
//            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
//            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//        }
//        //request1.setDestinationInExternalFilesDir(context.getApplicationContext(), "/", fileName);
//        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,
//                fileName);
//
//        DownloadManager manager1 = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
//        Objects.requireNonNull(manager1).enqueue(request);
//        if (DownloadManager.STATUS_SUCCESSFUL == 8) {
//            //DownloadSuccess();
//            Log.w("download", "success");
//            //CommonUtils.showAlterDialogStyled(context, context.getString(R.string.download_done), AppConstants.SUCCESS_MESSAGE);
//
//        }
//    }
//
//    public static String ConvertBitmapToString(Bitmap bitmap){
//        String encodedImage = "";
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
//        encodedImage= Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.DEFAULT);
//        return encodedImage;
//    }
//
//    public static void changeLanguage(Activity activity, String currentLang){
//        Resources res = activity.getResources();
//        // Change locale settings in the app.
//        DisplayMetrics dm = res.getDisplayMetrics();
//        android.content.res.Configuration conf = res.getConfiguration();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1){
//            conf.setLocale(new Locale(currentLang.toLowerCase()));
//            // API 17+ only.
//            // Use conf.locale = new Locale(...) if targeting lower versions
//        } else {
//            conf.locale = new Locale(currentLang.toLowerCase());
//        }
//        res.updateConfiguration(conf, dm);
//
//        activity.getApplication().getBaseContext().getResources().updateConfiguration(conf,
//                activity.getBaseContext().getResources().getDisplayMetrics());
//    }
//
//    public static void showCities(Activity context, ArrayList<City.Data>Cities){
//
//        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context, R.style.AlertDialogCustom);
//        LayoutInflater inflater = context.getLayoutInflater();
//                final View dialogView = inflater.inflate(R.layout.city_dialog, null);
//
//
//
//
//
//
//
//        dialogBuilder.setView(dialogView);
//        alertDialog = dialogBuilder.create();
//        WindowManager.LayoutParams params = alertDialog.getWindow().getAttributes();
//        params.width = 600;
//        params.height =Cities.size() * 200;
//        params.dimAmount=0.7f;
//        alertDialog.setCanceledOnTouchOutside(false);
//        alertDialog.getWindow().setAttributes((WindowManager.LayoutParams) params);
//        alertDialog.getWindow().setLayout(600, Cities.size() * 200);
//        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0x00000000));
//        alertDialog.getWindow().setGravity(Gravity.CENTER);
//        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//        alertDialog.show();
//
//
//        generateCities(Cities,context,dialogView.findViewById(R.id.res_cities),alertDialog);
//
//
//    }
//
//    public static void mainAlert(Activity context, String Type,String Message){
//
//        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context, R.style.AlertDialogCustom);
//        LayoutInflater inflater = context.getLayoutInflater();
//        final View dialogView = inflater.inflate(R.layout.main_alert_dialog, null);
//
//
//
//
//        dialogBuilder.setView(dialogView);
//        alertDialog = dialogBuilder.create();
//        WindowManager.LayoutParams params = alertDialog.getWindow().getAttributes();
//        params.width = 600;
//        params.height =  700;
//        params.dimAmount=0.7f;
//        alertDialog.setCanceledOnTouchOutside(false);
//        alertDialog.getWindow().setAttributes((WindowManager.LayoutParams) params);
//        alertDialog.getWindow().setLayout(600,  700);
//        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0x00000000));
//        alertDialog.getWindow().setGravity(Gravity.CENTER);
//        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//
//        ImageView choosenImage = dialogView.findViewById(R.id.choosenImage);
//        LinearLayout changed_background = dialogView.findViewById(R.id.changed_background);
//        TextView first_text =dialogView.findViewById(R.id.first_text);
//        TextView second_text =dialogView.findViewById(R.id.second_text);
//
//
//
//        if(Type.equals(AppConstants.NOCONNECTION)){
//
//            changed_background.setBackground(context.getResources().getDrawable(R.drawable.no_net_back));
//            choosenImage.setImageDrawable(context.getResources().getDrawable(R.drawable.group_385));
//
//            first_text.setText(context.getResources().getText(R.string.wrong_connection));
//            second_text.setText(context.getResources().getText(R.string.wrong_connectiontext));
//
//
//
//        }else if(Type.equals("Normal")){
//
//            changed_background.setBackground(context.getResources().getDrawable(R.drawable.normal_back));
//            choosenImage.setImageDrawable(context.getResources().getDrawable(R.drawable.group_379));
//
//
//        }else if(Type.equals(AppConstants.SUCCESS_MESSAGE)){
//
//            changed_background.setBackground(context.getResources().getDrawable(R.drawable.sucsess_back));
//            choosenImage.setImageDrawable(context.getResources().getDrawable(R.drawable.group_387));
//            first_text.setText(Message);
//            second_text.setVisibility(View.INVISIBLE);
//
//
//        }else if(Type.equals(AppConstants.ERROR_MESSAGE)){
//
//            changed_background.setBackground(context.getResources().getDrawable(R.drawable.no_net_back));
//            choosenImage.setImageDrawable(context.getResources().getDrawable(R.drawable.group_385));
//            first_text.setText(Message);
//            second_text.setVisibility(View.INVISIBLE);
//
//        }
//        else if(Type.equals(AppConstants.CART)){
//
//            changed_background.setBackground(context.getResources().getDrawable(R.drawable.no_net_back));
//            choosenImage.setImageDrawable(context.getResources().getDrawable(R.drawable.group_385));
//            first_text.setText(Message);
//            second_text.setVisibility(View.INVISIBLE);
//        }
//
//        Button ok_dialog = dialogView.findViewById(R.id.ok_dialog);
//        ok_dialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                alertDialog.dismiss();
//
//            }
//        });
//
//        alertDialog.show();
//
//    }
//
//    public static void LoginDialog(Activity context){
//
//        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context, R.style.AlertDialogCustom);
//        LayoutInflater inflater = context.getLayoutInflater();
//        final View dialogView = inflater.inflate(R.layout.login_alert_dialog, null);
//
//
//
//
//        dialogBuilder.setView(dialogView);
//        alertDialog = dialogBuilder.create();
//        WindowManager.LayoutParams params = alertDialog.getWindow().getAttributes();
//        params.width = 600;
//        params.height =  700;
//        params.dimAmount=0.7f;
//        alertDialog.setCanceledOnTouchOutside(false);
//        alertDialog.getWindow().setAttributes((WindowManager.LayoutParams) params);
//        alertDialog.getWindow().setLayout(600,  700);
//        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0x00000000));
//        alertDialog.getWindow().setGravity(Gravity.CENTER);
//        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//
//        ImageView choosenImage = dialogView.findViewById(R.id.choosenImage);
//        LinearLayout changed_background = dialogView.findViewById(R.id.changed_background);
//        TextView first_text =dialogView.findViewById(R.id.first_text);
//        TextView second_text =dialogView.findViewById(R.id.second_text);
//
//
//
//
//
//        Button ok_dialog = dialogView.findViewById(R.id.ok_dialog);
//        ok_dialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(context, LoginActivity.class);
//                context.startActivity(intent);
//                context.finish();
//
//                alertDialog.dismiss();
//
//            }
//        });
//
//        alertDialog.show();
//
//    }
//
//
//     static void generateCities(ArrayList<City.Data> cities, Context context, RecyclerView CityRecycular, AlertDialog alertDialog) {
//
//        CityAdapter chatAdapter = new CityAdapter(context, cities, (CityAdapterClick) context,alertDialog);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
//
//        CityRecycular.setLayoutManager(layoutManager);
//
//        CityRecycular.setAdapter(chatAdapter);
//
//    }
//
//
//    public static void showAlterDialogStyled(Activity context, String message, String messageType) {
////        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context, R.style.AlertDialogCustom);
////        LayoutInflater inflater = context.getLayoutInflater();
////
////        final View dialogView = inflater.inflate(R.layout.alert_dialog, null);
////        ((TextView) dialogView.findViewById(R.id.tv_message)).setText(message);
////        if (messageType.equals(AppConstants.FORGET_PWD)) {
////            ((ImageView) dialogView.findViewById(R.id.iv_alert))
////                    .setImageDrawable(context.getResources().getDrawable(R.drawable.group_495));
////            ((TextView) dialogView.findViewById(R.id.tv_message)).setTextColor(context.getResources()
////                    .getColor(R.color.green));
////        } else if (messageType.equals(AppConstants.ERROR_MESSAGE)) {
////            ((TextView) dialogView.findViewById(R.id.tv_message))
////                    .setTextColor(context.getResources().getColor(R.color.red));
////            ((ImageView) dialogView.findViewById(R.id.iv_alert))
////                    .setImageDrawable(context.getResources().getDrawable(R.drawable.group_494));
////        } else if (messageType.equals(AppConstants.SUCCESS_MESSAGE)) {
////            ((TextView) dialogView.findViewById(R.id.tv_message)).setTextColor(context.getResources()
////                    .getColor(R.color.green));
////            ((ImageView) dialogView.findViewById(R.id.iv_alert))
////                    .setImageDrawable(context.getResources().getDrawable(R.drawable.group_495));
////        }else if(messageType.equals(AppConstants.RE_LOGIN) || messageType.equals(AppConstants.GUEST)){
////            ((TextView) dialogView.findViewById(R.id.tv_message)).setTextColor(context.getResources()
////                    .getColor(R.color.mediumjunglegreen));
////            ((ImageView) dialogView.findViewById(R.id.iv_alert))
////                    .setImageDrawable(context.getResources().getDrawable(R.drawable.login));
////            ((Button) dialogView.findViewById(R.id.btn_dismiss))
////                    .setText(context.getResources().getString(R.string.sign_in));
////        }
////        ((Button) dialogView.findViewById(R.id.btn_dismiss)).setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                if (messageType.equals(AppConstants.FORGET_PWD)) {
////                    context.startActivity(Login.newIntent(context));
////                    context.finishAffinity();
////                }else if (messageType.equals(AppConstants.LOGIN) || messageType.equals(AppConstants.GUEST)){
////                    context.startActivity(Login.newIntent(context));
////                    if (messageType.equals(AppConstants.LOGIN)){
////                        context.finish();
////                    }
////                }else if (messageType.contains(AppConstants.REGISTER)){
////                    // todo: nav to activation screen
////                    context.finish();
////                }else if (messageType.contains(AppConstants.RE_LOGIN)){
////                    context.startActivity(Home.newIntent(context));
////                    context.finishAffinity();
////                }else if (messageType.contains(AppConstants.CHANGE_PASSWORD)){
////
////                    context.onBackPressed();
////                }
////                alertDialog.dismiss();
////            }
////        });
////        dialogBuilder.setView(dialogView);
////        alertDialog = dialogBuilder.create();
////        WindowManager.LayoutParams params = alertDialog.getWindow().getAttributes();
////        params.width = 600;
////        params.height = 400;
////        params.dimAmount=0.7f;
////        alertDialog.setCanceledOnTouchOutside(false);
////        alertDialog.getWindow().setAttributes((WindowManager.LayoutParams) params);
////        alertDialog.getWindow().setLayout(600, 500);
////        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0x00000000));
////        alertDialog.getWindow().setGravity(Gravity.CENTER);
////        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
////        alertDialog.show();
//    }
//
//    private CommonUtils() {
//        // This utility class is not publicly instantiable
//    }



}
