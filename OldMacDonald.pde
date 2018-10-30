
void setup()
{
	Cow Ben = new Cow("Cow", "Meow");
  Farm Bob = new Farm();
  Bob.animalSounds();
  System.out.println(Ben.getType() + " goes " + Ben.getSound());
}
