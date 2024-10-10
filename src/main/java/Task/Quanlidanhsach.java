package Task;
import java.util.Scanner;
public class Quanlidanhsach {
        private int id;
        private String description;
        private String status;
public Quanlidanhsach(int id,String d,String s){       
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id:");
        id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap mo ta:");
        description=scanner.nextLine();
        System.out.println("Nhap trang thai:");
        status=scanner.nextLine();
    }   
     public String toString(){
      return id+","+description+","+status;             //nhap y chang v moi ra duoc danh sach
     } 
    }
