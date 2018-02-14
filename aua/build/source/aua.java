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

public class aua extends PApplet {

public void setup(){
  
  background(180, 213, 222);
  frameRate(30);
}

int a = 0;

public void draw(){

  if(mousePressed){
    background(180, 213, 222);
    textSize(56);
    text("mhhm!",mouseX ,mouseY);
  }else{
    if(a % 5 == 0){
        background(random(255), random(255), random(255));
    }
    textSize(56);
    text("AUA!",random(width) ,random(height));
  }

  a++;
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "aua" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
