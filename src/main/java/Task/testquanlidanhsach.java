package Task;
import java.util.Scanner;
public class testquanlidanhsach {
    public static void main(String[] args) {
        Menu menu=new Menu(5);
        menu.add("Them cong viec moi");
        menu.add("Xoa cong viec");
        menu.add("Cap nhat trang thai");
        menu.add("Hien thi danh sach cong viec");
        menu.add("Thoat");
        int choice;
        TaskList list= new TaskList(500);
        do{
            System.out.println("\nQuan li cong viec");
            choice = menu.getChoice();
            switch(choice)
            {
                case 1:list.add();
                break;
                case 2:list.remove();
                break;
                case 3:list.update();
                break;
                case 4:list.sort();
                       list.print();
                        break;
            }
        }while(choice>=1&&choice<5);
        }
    }
    
