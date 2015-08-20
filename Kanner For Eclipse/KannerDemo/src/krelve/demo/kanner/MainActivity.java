package krelve.demo.kanner;

import krelve.view.Kanner;
import android.app.Activity;
import android.os.Bundle;

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
		int[] imagesRes = { R.drawable.a, R.drawable.b, R.drawable.c,
				R.drawable.d, R.drawable.e };
		kanner.setImagesRes(imagesRes);

	}

}
