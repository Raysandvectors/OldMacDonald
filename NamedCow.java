class NamedCow extends Cow {
  private String myName;
  private String mySound;      
public NamedCow(String name, String type, String sound)
{
  super(type, sound);
  myName = name;
  }
}
