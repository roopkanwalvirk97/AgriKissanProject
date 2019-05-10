package com.roop.AgriKissan.ui;

import android.graphics.Bitmap;

import com.roop.AgriKissan.model.WeatherData;


public interface MainFragmentView {

    void showProgress();
    void hideProgress();
    void checkSharedPrefs();
    void updateViews(WeatherData weatherData);
    void setImage(Bitmap responseObject);
}
