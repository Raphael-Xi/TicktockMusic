package com.freedom.lauzy.ticktockmusic.contract;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import com.freedom.lauzy.ticktockmusic.base.IBaseView;
import com.freedom.lauzy.ticktockmusic.model.SongEntity;

/**
 * Desc :
 * Author : Lauzy
 * Date : 2017/9/7
 * Blog : http://www.jianshu.com/u/e76853f863a9
 * Email : freedompaladin@gmail.com
 */
public interface PlayContract {
    interface View extends IBaseView {
        Context getContext();

//        void setCoverBitmap(Bitmap bitmap);

        void setCoverBackground(Bitmap background);

        void addFavoriteSong();

        void deleteFavoriteSong();

        void isFavoriteSong(boolean isFavorite);

        void setViewBgColor(int paletteColor);
    }

    interface Presenter {
        void setCoverImgUrl(Object url);

        void addFavoriteSong(SongEntity entity);

        void deleteFavoriteSong(long songId);

        void isFavoriteSong(long songId);
    }
}
