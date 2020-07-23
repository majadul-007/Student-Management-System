public class MainActivity{
    public static void main(String args[]){
        Student details = new Student("Nashir", "543", "CSE", 3.4f);
        Student details2 = new Student("Kabir", "148-381", "CSE", 3.75f);

        details.showInfo();
        details2.showInfo();
        System.out.println(details.getName());
//        details.getName();
    }

}