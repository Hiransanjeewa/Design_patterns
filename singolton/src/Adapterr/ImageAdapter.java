package Adapterr;

public class ImageAdapter implements Player{

    @Override
    public void play(String filepath) {
        // Call the ImageViewer  - > show(filepath) method here

        ImageViewer imageViewer=new ImageViewer();
        imageViewer.show(filepath);

        // No adding to the main class when adding new player types
    }
}
