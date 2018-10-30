class Farm {
  private Animal[] MacD;

  public Farm()
  {
 MacD = new Animal[4];
 MacD[0] = new Cow("Roast me","meow");
 MacD[1] = new Chick("Fry me","BOK BOK");
 MacD[2] = new Pig("Make me bacon", "NOM NOM");
 MacD[3] = new NamedCow("Fat Cow", "Eat me", "011011010110111101101111");
  }
   public void animalSounds()    {       
     for (int i=0; i < MacD.length; i++)  
     { 
       
       System.out.println( MacD[i].getType() + " goes " + MacD[i].getSound());       
     }    
   } 
}
