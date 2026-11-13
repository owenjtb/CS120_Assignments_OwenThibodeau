public class Athlete {
    //private for encapsulation 
    private String firstName;
    private String lastName;
    private int goals;
    private int assists;

    //el constructor
    public Athlete(String first, String last, int g, int a) {
        firstName = first;
        lastName = last;
        goals = g;
        assists = a;
    }

    //accessor
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getPoints() {
        return goals + assists;
    }

    public void addGoal() {
        goals++;
    }

    public void display() {
        System.out.printf("%s: %d Goals %d Assists = %d pts\n",
                getFullName(), goals, assists, getPoints());
        
    }
}

