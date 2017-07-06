
#include <MFRC522.h>

#include <Key.h>
#include <Keypad.h>
#include <SPI.h>
/*
   MFRC522 - Library to use ARDUINO RFID MODULE KIT 13.56 MHZ WITH TAGS SPI W AND R BY COOQROBOT.
   The library file MFRC522.h has a wealth of useful info. Please read it.
   The functions are documented in MFRC522.cpp.

   Based on code Dr.Leong   ( WWW.B2CQSHOP.COM )
   Created by Miguel Balboa (circuitito.com), Jan, 2012.
   Rewritten by Søren Thing Andersen (access.thing.dk), fall of 2013 (Translation to English, refactored, comments, anti collision, cascade levels.)
   Released into the public domain.

   Sample program showing how to read data from a PICC using a MFRC522 reader on the Arduino SPI interface.
  ----------------------------------------------------------------------------- empty_skull
   Aggiunti pin per arduino Mega
   add pin configuration for arduino mega
   http://mac86project.altervista.org/
  ----------------------------------------------------------------------------- Nicola Coppola
   Pin layout should be as follows:
   Signal     Pin              Pin               Pin
              Arduino Uno      Arduino Mega      MFRC522 board
   ------------------------------------------------------------
   Reset      9                5                 RST
   SPI SS     10               53                SDA
   SPI MOSI   11               51                MOSI
   SPI MISO   12               50                MISO
   SPI SCK    13               52                SCK

   The reader can be found on eBay for around 5 dollars. Search for "mf-rc522" on ebay.com.
*/
#define SS_PIN 10
#define RST_PIN 9
MFRC522 mfrc522(SS_PIN, RST_PIN);

const byte ROWS = 4; // Four rows
const byte COLS = 4; // Three columns
// Define the Keymap
char keys[ROWS][COLS] = {
  {'1','2','3','A'},
  {'4','5','6','B'},
  {'7','8','9','C'},
  {'*','0','#','D'}
};
// Connect keypad ROW0, ROW1, ROW2 and ROW3 to these Arduino pins.
byte rowPins[ROWS] = { A2, A3, A4, A5 };
// Connect keypad COL0, COL1 and COL2 to these Arduino pins.
byte colPins[COLS] = { 7,6,5,4 }; 

// Create the Keypad
Keypad kpd = Keypad( makeKeymap(keys), rowPins, colPins, ROWS, COLS );

//#define ledpin 13

void setup()
{
 // pinMode(ledpin,OUTPUT);
//  digitalWrite(ledpin, HIGH);
  Serial.begin(9600); 
  SPI.begin();      // Init SPI bus
  mfrc522.PCD_Init(); // Init MFRC522 card
}

void loop()
{
  char key = kpd.getKey();
  if(key)  // Check for a valid key.
  {
     Serial.println(key);
    
  }

    if ( ! mfrc522.PICC_IsNewCardPresent()) {
      return;
    }

    // Select one of the cards
    if ( ! mfrc522.PICC_ReadCardSerial()) {
      return;
    }
    else{
    getUID();
    }

  // Dump debug info about the card. PICC_HaltA() is automatically called.
  //mfrc522.PICC_DumpToSerial(&(mfrc522.uid));
     
}

void getUID(){
  String UID;
  for (byte i = 0; i < mfrc522.uid.size; i++) {
   Serial.print(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " ");
    Serial.print(mfrc522.uid.uidByte[i], HEX);
  } 
  Serial.println();
  delay(2000);
}

