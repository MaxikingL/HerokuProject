package Collections;

public class User {
    private String login;
    private String password;

    public User(String login, String password){
        this.login=login;
        this.password=password;

    }
    public void setLogin(String login){
        this.login=login;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login);
    }


}
