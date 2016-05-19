package krelve.view.kanner;

import android.app.Activity;
import android.os.Bundle;

import krelve.view.Kanner;

public class MainActivity extends Activity {
    private Kanner kanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kanner = (Kanner) findViewById(R.id.kanner);
        // kanner.setImagesUrl(new String[] {
        // "http://img04.muzhiwan.com/2015/06/16/upload_557fd293326f5.jpg",
        // "http://img03.muzhiwan.com/2015/06/05/upload_557165f4850cf.png",
        // "http://img02.muzhiwan.com/2015/06/11/upload_557903dc0f165.jpg",
        // "http://img04.muzhiwan.com/2015/06/05/upload_5571659957d90.png",
        // "http://img03.muzhiwan.com/2015/06/16/upload_557fd2a8da7a3.jpg" });
        int[] imagesRes = {R.mipmap.a, R.mipmap.b, R.mipmap.c,
                R.mipmap.d, R.mipmap.e};
        kanner.setImagesRes(imagesRes);

    }

    @Override
    protected void onDestroy() {
        kanner.removeCallbacksAndMessages();
        super.onDestroy();
    }
}
