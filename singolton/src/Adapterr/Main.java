package Adapterr;

public class Main {
    public static void main(String[] args) {

        String filepath=args[0];

        // If the filename end with mp3 call mp3player.play method

        // If the filename end with mp4 call mp4player.play method
        PlayerFactory playerFactory=new PlayerFactory();
        Player player =playerFactory.getInstance(filepath);
        if (player!=null){
            player.play(filepath);
        }else {
            System.out.println("The file format is not supported");
        }


        //Adapter design pattern
        // Used most of the time when using someone else's code in our project ,
        // also libraries and external apis those might be not compatible with our code

        // Assume that we are going to create an application to play video/audio files
        // Mp3,Mp4,Mkv files
        // Filename is given as a commandline argument to the program



        // After a while we get a requirement to add image viewing option to the player
        // You have a library for this exact feature written by someone else to display images

        // Adapter pattern is used to make an incompatible interface/class compatible with the code

    }
}
