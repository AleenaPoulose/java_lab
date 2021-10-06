import java.io.*;
import java.util.scanner;
class product
{
int p_code;
string p_nama;
int price;

void read() throws IOException
{
scanner po = new scanner(system.in);
system.out.print("\n Enter the product code:" );
int p_code = po.nextInt();
system.out.print("\n Enter the product name:");
string p_name = po.next();
system.out.print("\n Enter the price:");
int price = po.nextInt();
}

void display() throws IOException
{
system.out.print("\n The product code is:" +p_code);
system.out.print("\n The product name is:" + p_name);
system.out.print("\n The product price is:"+price);
}

public static void main string (argu[]) throws IOException
{
int n;
int p;
product p[]= new product(n);
for (int i=1;i<=n;i++)
{
 product p[]= new product(i);
 p.read(i);
 }
 min=1;
 for (int i=1;i<=n;i++)
 {
  if(  p[min].price<p[i].price)
  {
  system.out.print("\n the lowest price is:" );
  p[min].display();
  }
  else
  system.out.print("\n error");
    }
 }
 
 class validation
 {
 void read() throws userException
 {
 scanner s= new scanner();
 system.out.print("\n the length of item code" +p_code(length));
 int p_code=s.nextInt();
 system.out.print("\n the length of name is" +p_name(length));
 string p_name= s.next();
 }
 
 void display() throws userException
 {
 system.out.print("\n the length of item code" +p_code(length));
 system.out.print("\n the length of product name:"  char (+p_name(length)));
 }
 public static void main string(argu[])UserException
 {
 int m=4;
 if (p_code(length)>m)
 {
 object obj= new object();
 obj.read();
 }
 else
 {
 obj.show();
 }
if (p_name(length)<=15)
{ 
object.read();
}
else
{
obj.show(); 
}
class UserException implements Exception
{
system.out.print("\n the code length is:"+p_code(length));
system.out.print("\n the name length is:"+p_name(length));
obj.display();
 }
 }
 }
 
