package com.wj.baseutils.presenter;

import android.content.Context;
import android.content.Intent;

import com.wj.base.base.BaseListener;
import com.wj.base.utils.BaseUtils;
import com.wj.baseutils.contract.MineContract;
import com.wj.baseutils.ui.activity.GalleryActivity;
import com.wj.baseutils.ui.activity.MyBalanceActivity;
import com.wj.baseutils.ui.activity.ShopCarActivity;

/**
 * Created by wj on 2018/3/26.
 */

public class MinePresenterImpl extends MineContract.MinePresenter {

    @Override
    public void setData() {
        MineContract.MineView mView = getView();
        if (mView == null) return;
        mModel.setData(new BaseListener<Object>() {
            @Override
            public void onSuccess(Object result) {
                mView.setBackgroundBlur();
            }

            @Override
            public void onError(String msg) {

            }
        });
    }

    @Override
    public void setMineBalanceClick(Context mContext) {
        MyBalanceActivity.show(mContext);
    }

    @Override
    public void setOnScoreClick(Context context) {
        BaseUtils.toAppMarketScre(context);
    }

    @Override
    public void setOnShopCarClick(Context context) {
        ShopCarActivity.show(context);
    }

    @Override
    public void setGalleryClick(Context context) {
        GalleryActivity.show(context);
    }


}
