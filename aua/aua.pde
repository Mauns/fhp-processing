void setup(){
  fullScreen();
  background(180, 213, 222);
  frameRate(30);
}

int a = 0;

void draw(){

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
