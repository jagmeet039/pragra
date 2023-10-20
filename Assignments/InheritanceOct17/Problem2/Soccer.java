package Assignments.InheritanceOct17.Problem2;

public class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    void getNumberOfTeamMembers(int num){
        System.out.println("Each team has " + num +  " players in " + getName());
    }


}
