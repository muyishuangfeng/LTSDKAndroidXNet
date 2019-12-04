package com.sdk.ltgame.net.impl;


import com.sdk.ltgame.core.exception.LTGameError;

public interface OnAutoCheckLoginListener {

    void onCheckedSuccess(String result);

    void onCheckedFailed(String failed);

    void onCheckedException(LTGameError ex);
}
