package com.sdk.ltgame.net.impl;


public interface OnWeChatAccessTokenListener<T> {

    void onWeChatSuccess(T t);

    void onWeChatFailed(String failed);
}
