int eerste;
int tweede;
int derde;
String in = "111";
int x = 0;

void setup() {
  pinMode(3, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(11, OUTPUT);
  Serial.begin(9600); 

}

void loop() {
 /*eersteMotor();
 tweedeMotor(); 
 derdeMotor();*/
    in = Serial.readStringUntil('@');
    
    if(in.length() > 0){
    //  String string = "123";
       x = in.toInt();
      eerste = x/100;
       tweede = x%100/10;
       derde = x%10;

       for(int i=0;i<eerste;i++){
          eersteMotor();
       }
       for(int i=0;i<tweede;i++){
          tweedeMotor();
       }
       for(int i=0;i<derde;i++){
          derdeMotor();
       }
      
   }

}

 void eersteMotor()
{
  digitalWrite(9, LOW);
  analogWrite(3,150);
  delay(1500);

  digitalWrite(3, LOW);
  analogWrite(9,0);
  delay(1000);
  
  digitalWrite(3, LOW);
  analogWrite(9,250);
  delay(550);
 
  digitalWrite(3, LOW);
  analogWrite(9,0);
  delay(1000);

  digitalWrite(9, LOW);
  analogWrite(3,150);
  delay(1200);

  digitalWrite(3, LOW);
  analogWrite(9,0);
  delay(300);
  
}
  
  void tweedeMotor()
{
  digitalWrite(10, LOW);
  analogWrite(5,150);
  delay(1500);

  digitalWrite(5, LOW);
  analogWrite(10,0);
  delay(1000);
  
  digitalWrite(5, LOW);
  analogWrite(10,250);
  delay(500);
 
  digitalWrite(5, LOW);
  analogWrite(10,0);
  delay(1000);

  digitalWrite(10, LOW);
  analogWrite(5,150);
  delay(1200);

  digitalWrite(5, LOW);
  analogWrite(10,0);
  delay(300);
  
}

  void derdeMotor()
{
  digitalWrite(11, LOW);
  analogWrite(6,150);
  delay(1300);

  digitalWrite(6, LOW);
  analogWrite(11,0);
  delay(1000);
  
  digitalWrite(6, LOW);
  analogWrite(11,250);
  delay(550);
 
  digitalWrite(6, LOW);
  analogWrite(11,0);
  delay(1000);

  digitalWrite(11, LOW);
  analogWrite(6,150);
  delay(700);

  digitalWrite(6, LOW);
  analogWrite(11,0);
  delay(300);
}
