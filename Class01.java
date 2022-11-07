abstract class CShape               // 定義抽象類別CShape
{
   protected String color;       // 資料成員
   public CShape() {
   }
   public CShape(String str) {
	   color=str;
   }
   public void setColor(String str)    // 一般的函數
   {
      color=str;
   }
   public abstract void show(); // 抽象函數，只有定義名稱，沒有定義處理方式
}

class CRectangle extends CShape    // 定義子類別CRectangle
{
   protected int width,height;
   public CRectangle(String str,int w,int h)
   {
	  super(str);
      width=w;
      height=h;
   }
   public void show()      // 明確定義繼承自抽象類別的show() method
   {
      System.out.print("color="+color+",  ");
      System.out.println("area="+width*height);
   }
}
class CCircle extends CShape     // 定義子類別CCircle
{
   protected double radius;
   public CCircle(String str,double r)
   {
	  super(str);
      radius=r;
   }
   public void show()     // 明確定義繼承自抽象類別的show() method
   {
      System.out.print("color="+color+",  ");
      System.out.println("area="+3.14*radius*radius);
   }
}
public class Class01
{
   public static void main(String args[])
   {
      CRectangle rect=new CRectangle("Yellow",5,10);
      rect.show();         // 呼叫CRectangle類別裡的show() method

      CCircle cir=new CCircle("Green",2.0);
      cir.show();             // 呼叫CCircl類別裡的show() method
   }
}