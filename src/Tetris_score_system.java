int lane1 = 20;
int lane2 = 50;
int lane3 = 80;
int lane4 = 120;
int score = 0;
int mScore;


if(elimination == 1){ // if 1 lane is eliminated then add points
  mScore = score + lane1;
}

if(elimination == 2){
  mScore = score + lane2;
}

if(elimination == 3){
  mScore = score + lane3;
}

if(elimination == 4){
  mScore = score + lane4;
}

score = mScore;


JTextField wScore = new JTextField("Score: " + score ,30); //(import JTextField() library), Shows score an undefined place





}
