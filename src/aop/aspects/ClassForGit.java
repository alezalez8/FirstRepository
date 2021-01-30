package aop.aspects;

public class ClassForGit {
    private String myName;
    private String yourName;
    private int myAge;



    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }




    public ClassForGit(String myName, String yourName, int myAge) {
        this.myName = myName;
        this.yourName = yourName;
        this.myAge = myAge;
    }

}
