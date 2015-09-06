int startX = 250; 
int startY = 250; 
int endX = 0;
int endY = 150;
PImage img; 
void setup()
{
  strokeWeight(5);
  background(0);
  size(350,350);
  img = loadImage("wario.jpg");

}
void draw()
{
  image(img,0,0);
  stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
  while(endX<350)
  {
    endX = startX + (int)(Math.random()*10);
    endY = startY + (int)(Math.random()*18)-9;
    line(startX,startY,endX,endY);
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
