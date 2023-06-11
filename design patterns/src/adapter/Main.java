package adapter;

public class Main {
    public static void main(String[] args) {
        String filename=args[0];

        // Using factory design pattern
        PlayerFactory playerFactory=new PlayerFactory();
        Player player=playerFactory.getInstance(filename);

        if (player!=null){
            player.play(filename);
        }else {
            System.out.println("Unsupported file format");
        }

        // if filename mp3 we need to call Mp3player.play method

     //   if (filename.endsWith(".mp3")){
    //        Mp3Player mp3Player=new Mp3Player();
     //       mp3Player.play("C://Songs/somemovie.mp3");
     //   } else if (filename.endsWith(".mp4")) {
     //       // if filename mp4 we need to call Mp4player.play method
      //      Mp4Player mp4Player=new Mp4Player();
      //      mp4Player.play("C://Videos/somemovie.mp4");
     //   }
        // If we add more to this we violate open close principle


    }
}
// Adapter design pattern (Converting)
// Filename is given as a command line argument to the program

// What are the changes need to do to run Mkv file in the player

//Running this app for a while
// New requirement for play images
// someone else created class, Library, api for play images
// That files not easy to understand but that will do the work for us


// ***** Adapter pattern -> used to make an uncompatible interface/class compatible with the existing interface