package GameProject;

import java.util.Scanner;

public class DigitalcomProcess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GameService gs = new GameService();
        User us = new User();
        boolean val = true;

        while (val){
            System.out.println("Main Menu---");
            System.out.println("1. Register User");
            System.out.println("2. View Games");
            System.out.println("3. searchByName");
            System.out.println("4. Exit");

            System.out.println("Enter option: ");
            int option = sc.nextInt();

//            if (option == 1){
//                System.out.println("Enter Userid and password");
//                String uid = sc.nextLine();
//                String pd = sc.nextLine();
//                if (!us.IsAuthenticated(uid,pd))
//                    us.addUser(uid,pd);
//                else
//                    System.out.println("User already exists");
//                break;
//            }

            switch (option) {
                case 1: {
                    System.out.println("Enter Userid: ");
                    us.addUser(sc.next(),sc.next());
                    break;
                }
                case 2:{
                    System.out.println("Enter USerID and password to Login:");
                    if (us.IsAuthenticated(sc.next(),sc.next())){
                        while (true) {
                            System.out.println("3. To View all Game:");
                            System.out.println("4. To search a Game:");
                            System.out.println("5. To Exit:");
                            int ch1 = sc.nextInt();
                            switch (ch1) {
                                case 3: {
//                                for (Game g : gs.viewAll())
//                                    System.out.println(g.getGameName() + " " + g.getAuthorName() +" "+ g.getPrice());
                                    gs.viewAll().forEach(g -> System.out.println(g));
                                }
                                case 4: {
                                    System.out.print("Enter Author Name: ");
                                    String author = sc.nextLine();
                                    System.out.println(gs.authorSearch(author));
                                    break;
                                }
                                case 5: {
                                    return;
                                }
                                default:
                                    System.out.println("Invalid choice");
                            }
                        }
                    } else {
                        System.out.println("Wrong UserId and Password");
                    }
                }
                case 3:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
