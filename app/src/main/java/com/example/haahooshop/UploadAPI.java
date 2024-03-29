package com.example.haahooshop;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface  UploadAPI {
    @Multipart
    @POST("api_shop_app/shop_add_product/")
    Call<ResponseBody> uploadImage(@Header("Authorization") String token, @Part MultipartBody.Part[] file, @Part("pdt_name") RequestBody pdt_name, @Part("pdt_cat_id") RequestBody pdt_cat_id, @Part("pdt_spec") RequestBody pdt_spec, @Part("pdt_price") RequestBody pdt_price, @Part("pdt_return_period") RequestBody pdt_return_period, @Part("pdt_discount") RequestBody pdt_discount, @Part("stock") RequestBody stock, @Part("pdt_description") RequestBody pdt_description, @Part("delivery_mode") RequestBody delivery_mode, @Part("distance") RequestBody distance, @Part("type") RequestBody type, @Part("resell") RequestBody resell, @Part("max_price") RequestBody max_price,@Part("subscription") RequestBody subscription,@Part("sub_mode") RequestBody sub_mode,@Part("product_owner") RequestBody product_owner);
    @Multipart
    @POST("api_shop_app/shop_product_update/")
    Call<ResponseBody> uploadImag(@Header("Authorization") String token, @Part("pdt_name") RequestBody pdt_name, @Part("pdt_price") RequestBody pdt_price, @Part("pdt_discount") RequestBody pdt_discount, @Part("stock") RequestBody stock, @Part("pdt_description") RequestBody pdt_description, @Part("id") RequestBody id);

    @Multipart
    @POST("api_shop_app/shop_product_update/")
    Call<ResponseBody> uploadIm(@Header("Authorization") String token, @Part MultipartBody.Part pdt_image,@Part("pdt_name") RequestBody pdt_name, @Part("pdt_price") RequestBody pdt_price, @Part("pdt_discount") RequestBody pdt_discount, @Part("stock") RequestBody stock, @Part("pdt_description") RequestBody pdt_description, @Part("id") RequestBody id);

    @Multipart
    @POST("api_shop_app/branch_registration/")
    Call<ResponseBody> uploadI(@Header("Authorization") String token, @Part MultipartBody.Part shop_image,@Part MultipartBody.Part cover_image, @Part("name") RequestBody name, @Part("gst_no") RequestBody gst_no, @Part("email") RequestBody email, @Part("password") RequestBody password, @Part("phone_no") RequestBody phone_no, @Part("address") RequestBody address, @Part("lat") RequestBody lat, @Part("log") RequestBody log, @Part("category") RequestBody category, @Part("distance") RequestBody distance, @Part("device_id") RequestBody device_id);

}

