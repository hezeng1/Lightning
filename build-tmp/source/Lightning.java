import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 250; 
int startY = 250; 
int endX = 0;
int endY = 150;
PImage img; 
public void setup()
{
  strokeWeight(5);
  background(0);
  size(350,350);
  img = loadImage("wario.jpg");

}
public void draw()
{
  image(img,0,0);
  stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
  while(endX<350)
  {
    endX = startX + (int)(Math.random()*10);
    endY = startY + (int)(Math.random()*18)-9;
    line(startX,startY,endX,endY);
    line(startX,startY-50,endX,endY);
    startX = endX;
    startY = endY; 
  } 
if(endX>300)
{
  startX = 250;
  startY = 250;
  endX = 0;
  endY = 150;
}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
