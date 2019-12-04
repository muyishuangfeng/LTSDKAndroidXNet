package com.sdk.ltgame.net.impl;


import com.sdk.ltgame.core.base.BaseEntry;

public interface OnLoginSuccessListener<T> {

    void onSuccess(BaseEntry<T> result);

    void onFailed(BaseEntry<T> failed);
}
