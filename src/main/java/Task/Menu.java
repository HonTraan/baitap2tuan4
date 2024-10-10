package Task;
import java.util.Scanner;
public class Menu {
    String[] tutorials;
    int n=0;
    public Menu(int size)
    {
        if(size<1)
            size=10;
    tutorials=new String[size];
}
public void add(String aTutorial){
    if(n<tutorials.length)
{
    tutorials[n++]=aTutorial;
}
}
public int getChoice()
{
 int ketqua=0;
 if(n>0)
 {
  for(int i=0;i<n;i++)
      System.out.println((i+1)+"-"+tutorials[i]);
      System.out.print("Vui long chon dung trong MENU:");
      Scanner scanner=new Scanner(System.in);
      ketqua=Integer.parseInt(scanner.nextLine());
 }
 return ketqua;
}
}
