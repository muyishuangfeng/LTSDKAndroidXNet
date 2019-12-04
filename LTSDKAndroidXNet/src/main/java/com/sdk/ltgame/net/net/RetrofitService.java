package com.sdk.ltgame.net.net;



import com.sdk.ltgame.core.base.BaseEntry;
import com.sdk.ltgame.core.model.ResultModel;
import com.sdk.ltgame.net.model.AuthWXModel;
import com.sdk.ltgame.net.model.WeChatAccessToken;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitService {


    /**
     * 微信登录
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-wechat")
    Observable<BaseEntry<ResultModel>> weChatLogin(@Header("LT-AppID") String LTAppID,
                                                   @Header("LT-Token") String LTToken,
                                                   @Header("LT-T") int LTTime,
                                                   @Body Map<String, Object> map);

    /**
     * QQ登录
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-qq")
    Observable<BaseEntry<ResultModel>> qqLogin(@Header("LT-AppID") String LTAppID,
                                               @Header("LT-Token") String LTToken,
                                               @Header("LT-T") int LTTime,
                                               @Body Map<String, Object> map);

    /**
     * 获取验证码
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @GET("/api/auth/send-code")
    Observable<BaseEntry<ResultModel>> getAuthenCode(@Header("LT-AppID") String LTAppID,
                                                     @Header("LT-Token") String LTToken,
                                                     @Header("LT-T") int LTTime,
                                                     @Query("phone") String phone);


    /**
     * 注册
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/register-phone")
    Observable<BaseEntry<ResultModel>> register(@Header("LT-AppID") String LTAppID,
                                                @Header("LT-Token") String LTToken,
                                                @Header("LT-T") int LTTime,
                                                @Body Map<String, Object> map);

    /**
     * 获取设备信息
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/other/join")
    Observable<BaseEntry<ResultModel>> getDeviceInfo(@Header("LT-AppID") String LTAppID,
                                                     @Header("LT-Token") String LTToken,
                                                     @Header("LT-T") int LTTime,
                                                     @Body Map<String, Object> map);

    /**
     * 登录
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-phone")
    Observable<BaseEntry<ResultModel>> login(@Header("LT-AppID") String LTAppID,
                                             @Header("LT-Token") String LTToken,
                                             @Header("LT-T") int LTTime,
                                             @Body Map<String, Object> map);

    /**
     * 更改密码
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/reset-password")
    Observable<BaseEntry<ResultModel>> updatePassword(@Header("LT-AppID") String LTAppID,
                                                      @Header("LT-Token") String LTToken,
                                                      @Header("LT-T") int LTTime,
                                                      @Body Map<String, Object> map);

    /**
     * google登录
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-google")
    Observable<BaseEntry<ResultModel>> googleLogin(@Header("LT-AppID") String LTAppID,
                                                   @Header("LT-Token") String LTToken,
                                                   @Header("LT-T") int LTTime,
                                                   @Body Map<String, Object> map);

    /**
     * facebook登录
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-facebook")
    Observable<BaseEntry<ResultModel>> faceBookLogin(@Header("LT-AppID") String LTAppID,
                                                     @Header("LT-Token") String LTToken,
                                                     @Header("LT-T") int LTTime,
                                                     @Body Map<String, Object> map);


    /**
     * 创建订单
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/p/order")
    Observable<BaseEntry<ResultModel>> createOrder(@Header("LT-AppID") String LTAppID,
                                                   @Header("LT-Token") String LTToken,
                                                   @Header("LT-T") int LTTime,
                                                   @Body RequestBody requestBody);

    /**
     * 创建订单
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/p/order")
    Observable<BaseEntry<ResultModel>> createOrder(@Header("LT-AppID") String LTAppID,
                                                   @Header("LT-Token") String LTToken,
                                                   @Header("LT-T") int LTTime,
                                                   @Header("Authorization") String Authorization,
                                                   @Body RequestBody requestBody);

    /**
     * google
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/p/google")
    Observable<BaseEntry<ResultModel>> googlePlay(@Header("LT-AppID") String LTAppID,
                                                  @Header("LT-Token") String LTToken,
                                                  @Header("LT-T") int LTTime,
                                                  @Body RequestBody requestBody);

    /**
     * oneStore
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/p/one-store")
    Observable<BaseEntry<ResultModel>> oneStorePlay(@Header("LT-AppID") String LTAppID,
                                                    @Header("LT-Token") String LTToken,
                                                    @Header("LT-T") int LTTime,
                                                    @Body RequestBody requestBody);

    /**
     * 自动登录验证
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-check")
    Observable<BaseEntry> autoLogin(@Header("LT-AppID") String LTAppID,
                                    @Header("LT-Token") String LTToken,
                                    @Header("LT-T") int LTTime,
                                    @Body RequestBody requestBody);

    /**
     * 获取微信AccessToken
     */
    @POST("/oauth2/access_token")
    Observable<WeChatAccessToken> getWXAccessToken(@Query("appid") String appid,
                                                   @Query("secret") String secret,
                                                   @Query("code") String code,
                                                   @Query("grant_type") String grant_type);


    /**
     * 刷新微信AccessToken
     */
    @POST("/oauth2/refresh_token")
    Observable<WeChatAccessToken> refreshWXAccessToken(@Query("appid") String appid,
                                                       @Query("grant_type") String grant_type,
                                                       @Query("refresh_token") String refresh_token);

    /**
     * 验证微信AccessToken
     */
    @POST
    Observable<AuthWXModel> authToken(@Query("access_token") String access_token);

    /**
     * 游客登录验证
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-visitors")
    Observable<BaseEntry<ResultModel>> guestLogin(@Header("LT-AppID") String LTAppID,
                                                  @Header("LT-Token") String LTToken,
                                                  @Header("LT-T") int LTTime,
                                                  @Body Map<String, Object> map);

    /**
     * 绑定账户
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-visitors-bind")
    Observable<BaseEntry<ResultModel>> bindAccount(@Header("LT-AppID") String LTAppID,
                                                   @Header("LT-Token") String LTToken,
                                                   @Header("LT-T") int LTTime,
                                                   @Body Map<String, Object> map);

}
