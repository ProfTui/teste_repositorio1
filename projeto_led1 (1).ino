// C++ code
//
void setup()
{
  pinMode(9, OUTPUT);
}

void loop()
{
  digitalWrite(9, HIGH);
  delay(500); // Wait for 500 millisecond(s)
  digitalWrite(9, LOW);
  delay(500); // Wait for 500 millisecond(s)
}