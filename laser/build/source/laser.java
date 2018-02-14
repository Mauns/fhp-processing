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

public class laser extends PApplet {

public void setup(){
  
  background(0,0,0);
  frameRate(15);
}

// void draw(){
//   background(0,0,0);
//   stroke(mouseX,0,mouseY);
//   line(mouseX, mouseY, 250, 250);
// }


float a = 0.0f;

// TW0_PI -> doppelte Wert von PI
float inc = TWO_PI/width;

public void draw(){

  background(0,0,0);

  for(int i = 0; i < 255; i=i+8){
    stroke(random(255),random(255),127);
    line(0, height/2, (width/2)+sin(a)*400, height);
    a = a + inc;
  }

  for(int g = 0; g < 255; g=g+8){
    stroke(random(255),127,random(255));
    line(width/2, 0, (width/2)+sin(a)*400, height);
    a = a + inc;
  }

  for(int d = 0; d < 255; d=d+8){
    stroke(127,random(255),random(255));
    line(width, height/2, (width/2)+sin(a)*400, height);
    a = a + inc;
  }
  textAlign(CENTER);
  textSize(96);
  // text("Woaaah!", (width/2)+random(width/30), (height/2)+random(height/5));

  if(mousePressed){
    text("Holy Moly!", (width/2)+random(width/30), (height/2)+random(height/5));
  }else{
    text("Woaaah!", (width/2)+random(width/30), (height/2)+random(height/5));
  }
}

  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "laser" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
