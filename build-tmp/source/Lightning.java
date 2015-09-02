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

int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;
PImage img;
public void setup()
{
  size(300,300);
  strokeWeight(2);
  
  img = loadImage("Donkey.jpg");
  

}
public void draw()
{
  background(0);
  image(img,0,0);
  stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
 while(endY<300)
{
  endY = startY +(int)(Math.random()*10);
  endX = startX +(int)(Math.random()*18)-9;
  line(startX,startY,endX,endY);
  line(startX-100,startY,endX-100,endY);
  line(startX+100,startY,endX+100,endY);
  startX = endX;
  startY = endY;
}
if(endY>280)
{
  startX = 150;
  startY = 0;
  endX = 150;
  endY = 0; 
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
