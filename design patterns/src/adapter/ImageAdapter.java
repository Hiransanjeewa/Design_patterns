package adapter;

import adapter.ExtranalSourse.ImgPlayer;

public class ImageAdapter implements Player{

    private ImgPlayer imgPlayer;

    public ImageAdapter(ImgPlayer imgPlayer) {
        this.imgPlayer = imgPlayer;
    }

    @Override
    public void play(String filename) {
        // Call the ImagePlayer-> show(filepath) method
        ImgPlayer imgPlayer =new ImgPlayer();
        imgPlayer.Show(filename);
    }
}

// Used to make a un - compatible class , Interface comapatible with a existing interface