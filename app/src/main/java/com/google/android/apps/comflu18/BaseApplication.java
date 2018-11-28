package com.google.android.apps.comflu18;

import android.app.Application;
import android.graphics.Bitmap;

import com.google.android.apps.comflu18.utils.ImageManager;
import com.squareup.picasso.Transformation;

public class BaseApplication extends Application {

    /**
     * A {@link com.squareup.picasso.Transformation} to crop
     * and round the speakers' pictures.
     */
    public Transformation mPicassoTransformation;

    @Override
    public void onCreate() {
        super.onCreate();

        mPicassoTransformation = new Transformation(){
            @Override
            public Bitmap transform(Bitmap source) {
                Bitmap bp = ImageManager.cropBitmapToCircle(source, BaseApplication.this);
                if (bp != source) {
                    source.recycle();
                }
                return bp;
            }

            @Override
            public String key() {
                return "rounded";
            }
        };


    }
}
