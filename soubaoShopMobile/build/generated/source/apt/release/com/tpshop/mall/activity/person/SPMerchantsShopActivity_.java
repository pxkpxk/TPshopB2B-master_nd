//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.tpshop.mall.activity.person;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tpshop.mall.R.id;
import com.tpshop.mall.R.layout;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SPMerchantsShopActivity_
    extends SPMerchantsShopActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_spmerchants_shop);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static SPMerchantsShopActivity_.IntentBuilder_ intent(Context context) {
        return new SPMerchantsShopActivity_.IntentBuilder_(context);
    }

    public static SPMerchantsShopActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new SPMerchantsShopActivity_.IntentBuilder_(fragment);
    }

    public static SPMerchantsShopActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new SPMerchantsShopActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        storeDistrictTv = ((TextView) hasViews.findViewById(id.store_district_tv));
        linearLayout1 = ((LinearLayout) hasViews.findViewById(id.linearLayout1));
        photoImg = ((ImageView) hasViews.findViewById(id.photo_img));
        backBtn = ((Button) hasViews.findViewById(id.back_btn));
        btnNext = ((Button) hasViews.findViewById(id.btn_next));
        registEt2 = ((EditText) hasViews.findViewById(id.regist_et2));
        linearLayout2 = ((LinearLayout) hasViews.findViewById(id.linearLayout2));
        storeTypeRl = ((RelativeLayout) hasViews.findViewById(id.store_type_rl));
        merchantsBtnImg = ((ImageView) hasViews.findViewById(id.merchants_btn_img));
        merchantsTxt2 = ((TextView) hasViews.findViewById(id.merchants_txt2));
        merchantsTxt4 = ((TextView) hasViews.findViewById(id.merchants_txt4));
        closeImg = ((ImageView) hasViews.findViewById(id.close_imgv));
        timeValidityEnd = ((RelativeLayout) hasViews.findViewById(id.time_validity_end));
        scrollView3 = ((ScrollView) hasViews.findViewById(id.scrollView3));
        storeNameEt = ((EditText) hasViews.findViewById(id.store_name_et));
        sallerTypeTv = ((TextView) hasViews.findViewById(id.saller_type_tv));
        addressDetailEt = ((EditText) hasViews.findViewById(id.address_detail_et));
        timeEndTxt = ((TextView) hasViews.findViewById(id.time_end_txt));
        btnSubmit = ((Button) hasViews.findViewById(id.btn_submit));
        storeLoginEt = ((EditText) hasViews.findViewById(id.store_login_et));
        storeAddressRl = ((RelativeLayout) hasViews.findViewById(id.store_address_rl));
        relativeLayout4 = ((RelativeLayout) hasViews.findViewById(id.relativeLayout4));
        timeStartTxt = ((TextView) hasViews.findViewById(id.time_start_txt));
        merchantsImg3 = ((ImageView) hasViews.findViewById(id.merchants_img3));
        storeTypeTv = ((TextView) hasViews.findViewById(id.store_type_tv));
        merchantsImg4 = ((ImageView) hasViews.findViewById(id.merchants_img4));
        merchantsImg2 = ((ImageView) hasViews.findViewById(id.merchants_img2));
        merchantsTxt3 = ((TextView) hasViews.findViewById(id.merchants_txt3));
        btnNext2 = ((Button) hasViews.findViewById(id.btn_next2));
        storePhoneEt = ((EditText) hasViews.findViewById(id.store_phone_et));
        sallerTypeRl = ((RelativeLayout) hasViews.findViewById(id.saller_type_rl));
        registEt1 = ((EditText) hasViews.findViewById(id.regist_et1));
        sallerNameEt = ((EditText) hasViews.findViewById(id.saller_name_et));
        agreeImg = ((ImageView) hasViews.findViewById(id.agree_img));
        merchantsNoticeLl = ((LinearLayout) hasViews.findViewById(id.merchants_notice_ll));
        timeValidityStart = ((RelativeLayout) hasViews.findViewById(id.time_validity_start));
        storeNameImg = ((ImageView) hasViews.findViewById(id.store_name_img));
        init();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<SPMerchantsShopActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, SPMerchantsShopActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), SPMerchantsShopActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), SPMerchantsShopActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode, lastOptions);
                } else {
                    if (context instanceof Activity) {
                        Activity activity = ((Activity) context);
                        ActivityCompat.startActivityForResult(activity, intent, requestCode, lastOptions);
                    } else {
                        context.startActivity(intent, lastOptions);
                    }
                }
            }
        }

    }

}
