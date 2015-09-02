int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;
PImage img;
void setup()
{
  size(300,300);
  strokeWeight(2);
  
  img = loadImage("Donkey.jpg");
  

}
void draw()
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


