package GameProject;

public class User implements IValidate{
    private String userid;
    private String password;
//    private static List<User> exUsers = new ArrayList<>();

//    public User(String userid,String password) {
//        this.userid = userid;
//        this.password = password;
//    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public void addUser(String userid, String password){
//        User newUser = new User(userid, password);
//        exUsers.add(newUser);

        this.userid = userid;
        this.password = password;
        System.out.println("User added");
    }

    @Override
    public boolean IsAuthenticated(String userid, String password) {
//        IValidate val = (u,p) -> u.userid.equals(userid) && u.password.equals(password);

//        for (User u : exUsers) {
//            if (u.userid.equals(userid) && u.password.equals(password)) {
//                return true;
//            }
//        }
//        return false;

        return (this.getUserid().equals(userid) && this.getPassword().equals(password));
    }
}
