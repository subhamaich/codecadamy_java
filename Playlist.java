import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Calipso");
    desertIslandPlaylist.add("Con Calma");
    desertIslandPlaylist.add("The Unforgiven II");
    desertIslandPlaylist.add("The Day That Never Comes");
    desertIslandPlaylist.add("T.N.T");
    desertIslandPlaylist.add("Bad Guy");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Bad Guy");
    System.out.println(desertIslandPlaylist);

    int indexA = desertIslandPlaylist.indexOf("Calipso");
    int indexB = desertIslandPlaylist.indexOf("T.N.T");

    String tempA = "T.N.T";
    String tempB = "Calipso";

    desertIslandPlaylist.set(indexA, tempA);
    desertIslandPlaylist.set(indexB, tempB);

    System.out.println(desertIslandPlaylist);

  }
  
}
