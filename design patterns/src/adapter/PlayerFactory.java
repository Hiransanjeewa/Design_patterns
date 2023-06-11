package adapter;

import adapter.ExtranalSourse.ImgPlayer;

public class PlayerFactory {
    public Player getInstance(String filepath) {
        Player player = null;
        if (filepath.endsWith(".mp3")) {
            player = new Mp3Player();

        } else if (filepath.endsWith(".mp4")) {
            // if filename mp4 we need to call Mp4player.play method
            player = new Mp4Player();
        } else if (filepath.endsWith(".mkv")) {
            // if filename mkv we need to call Mp4player.play method
            player = new MkvPlayer();
        } else if (filepath.endsWith((".jpg"))) {
            // we cannot call player = new ImgPlayer();
            player=new ImageAdapter(new ImgPlayer());
        }
        return player;
    }

}
