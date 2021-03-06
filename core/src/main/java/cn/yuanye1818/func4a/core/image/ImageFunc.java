package cn.yuanye1818.func4a.core.image;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

import cn.yuanye1818.func4a.core.R;
import cn.yuanye1818.func4a.global.App;

public class ImageFunc {

    public static void updateAlbum(File file) {
        if (file == null)
            file = Environment.getExternalStorageDirectory();
        App.APP.sendBroadcast(
                new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(file)));
    }

    public static void setImage(ImageView iv, String url) {
        Glide.with(App.APP).load(url).into(iv);
    }

    public static void setAssetsImage(ImageView iv, String url) {
        url = "file:///android_asset/" + url;
        setImage(iv, url);
    }

}
