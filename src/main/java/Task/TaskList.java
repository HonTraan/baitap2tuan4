package Task;
import java.util.Scanner;
public class TaskList {
   private Quanlidanhsach[] list=null;
   private int count=0;
   public TaskList(int size)
{
    if(size<10)
        size=10;
    list=new Quanlidanhsach[size];
}
int find(String aId){
    for(int i=0;i<count;i++)
    {
        if(aId.equals(list[i].getId()))
        {
            return i;
        }
    }
    return -1;
}
public void add(){
    if(count==list.length)
    {
        System.out.println("Danh sach cong viec da day!!!");
    }else 
    {
        int newId;
        String newDescription;
        String newStatus=null;
        Scanner scanner=new Scanner(System.in);
        int pos;
        do{
            System.out.print("Nhap ma cong viec(ID):");
            newId=Integer.parseInt(scanner.nextLine());
            pos=find(newStatus);
            if(pos>=0)
            {
                System.out.println("\tMa cong viec nay ton tai!!");
            }
        }while (pos>=0);
            System.out.print("Nhap mo ta cong viec:");
            newDescription=scanner.nextLine();
            System.out.print("Nhap trang thai cong viec:");
            newStatus=scanner.nextLine();
            list[count++]=new Quanlidanhsach(newId,newDescription,newStatus);
            System.out.println("Cong viec moi da duoc them.");
        }
    }
public void remove()
    {
        if(count==0)
        {
            System.out.println("Danh sach trong");
            return;
        }
        String removeId;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap ma cong viec de xoa:");
        removeId = scanner.nextLine().toUpperCase();
        int pos=find(removeId);
        if(pos<0){
            System.out.println("Cong viec nay khong ton tai");
        }
else {
for(int i=pos;i<count-1;i++)
        {
                list[i]=list[i+1];
        }
        count--;
        System.out.println("Cong viec"+removeId+"da bi xoa!!!");
    }
}
    public void update()
    {
        if(count==0)
        {
            System.out.println("Danh sach trong");
            return;
        }
        String newId;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap ma can duoc cap nhat:");
        newId=scanner.nextLine().toUpperCase();
        int pos=find(newId);
        if(pos<0){
            System.out.println("Cong viec nay khong ton tai.");
        }else {
            String newDescription;
            String newStatus;
            System.out.print("Nhap mo ta moi:");
            newDescription=scanner.nextLine();
            System.out.print("Nhap trang thai moi:");
            newStatus=scanner.nextLine();
            list[pos].setDescription(newDescription);
            list[pos].setStatus(newStatus);
            System.out.println("Cong viec"+newId+"da duoc cap nhat.");
        }
    }
    public void print(){
        if(count==0)
        {
            System.out.println("Danh sach trong");
            return;
        }
        System.out.println("Danh sach cac cong viec:");
        for(int i=0;i<count;i++)
        {
            System.out.println(list[i]);
        }
    }
    public void sort()
    {
        if(count==0)
        {
            return;
        }
        for(int i=0;i<count-1;i++)
            for(int j=count-1;j>i;j++)
            if(list[j].getId()>list[j-1].getId())
            {
                Quanlidanhsach p=list[j];
                list[j]=list[j-1];
                list[j-1]=p;
            }
    }
   }
