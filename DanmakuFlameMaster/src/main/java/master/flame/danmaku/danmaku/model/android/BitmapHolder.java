
package master.flame.danmaku.danmaku.model.android;

import android.graphics.Bitmap;

import master.flame.danmaku.danmaku.model.ICanvas.IBitmapHolder;

public class BitmapHolder implements IBitmapHolder<android.graphics.Bitmap> {

    private android.graphics.Bitmap mBitmap;
    
    @Override
    public void attach(Bitmap t) {
        mBitmap = t;
    }

    @Override
    public android.graphics.Bitmap data() {
        return mBitmap;
    }

    @Override
    public void detach() {
        mBitmap = null;
    }

}
