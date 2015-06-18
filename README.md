# Kanner
##一个android图片轮播组件
实现过程其实很简单，主要的问题就在于如何实现图片的循环滚动。
在网上看到一些方法，大多数是用ViewPager来实现的，但是用ViewPager来实现就导致了从最后一张切换回第一张的时候该如何切换的问题。
看到有很多人在重写**PagerAdapter**的时候把**getCount()**的返回值设置为一个很大的整数，来保证图片的循环滚动，很显然这种方法非常不靠谱。
**那应该怎么来实现呢？**
既然从最后一张切换到第一张是存在问题，那就不让它从最后一张切换到第一张了呗，在本来的最后一张图片后面，再添加一张和第一张一样的图片来充当一个缓冲。若此时显示的是眼中的最后一张图片，那么在滚动后，实际上显示出了那张和第一张一样的图片。那么在此刻直接调用**setCurrentItem**将当前item设置为第一张图片，就悄悄地将图片进行了调换，很完美的实现了图片的循环滚动。

**用法：**
1. 在布局文件中引入控件:
```xml
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >

    <krelve.view.Kanner
        android:id="@+id/kanner"
        android:layout_width="match_parent"
        android:layout_height="250dp" />

</RelativeLayout>
```
2. 在代码中设置图片路径:
```java
		kanner = (Kanner) findViewById(R.id.kanner);
		kanner.setImagesUrl(new String[] {
				"http://img04.muzhiwan.com/2015/06/16/upload_557fd293326f5.jpg",
				"http://img03.muzhiwan.com/2015/06/05/upload_557165f4850cf.png",
				"http://img02.muzhiwan.com/2015/06/11/upload_557903dc0f165.jpg",
				"http://img04.muzhiwan.com/2015/06/05/upload_5571659957d90.png",
				"http://img03.muzhiwan.com/2015/06/16/upload_557fd2a8da7a3.jpg" });
```
**或**
```java
		int[] imagesRes = { R.drawable.a, R.drawable.b, R.drawable.c,
				R.drawable.d, R.drawable.e };
		kanner.setImagesRes(imagesRes);
```
运行：
![](http://7xjs0n.com1.z0.glb.clouddn.com/kanner.gif)