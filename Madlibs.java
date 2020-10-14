public class MadLibs {
  /*
  Your description here
  This program generates a mad libbed story.
  Author: Bong
  Date: 2/19/1049
  */
  	public static void main(String[] args){
      String name1 = "Cat";
      String adjective1 = "gloomy";
      String adjective2 = "hectic";
      String adjective3 = "afraid";
      String noun1 = "rat";
      String noun2 = "grains";
      String verb1 = "sing";
      String noun3 = "Hallowed be thy name";
      String noun4 = "resident";
      String name2 = "Dog";
      String place1 = "Mountain";
      String noun5 = "mud";
      int number = 3049;
      String noun6 = "Mice";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+" ruled the world.";

      System.out.println(story);
    }       
}
