Activity: Collaborative Coding with Git and GitHub (25 Members in Each Group)


Objective:
To practice collaborative coding using Git and GitHub branches.
To demonstrate the process of creating branches, making changes, and committing them to a shared repository.
Materials Needed:
Computers with Git installed (or access to an online Git platform).
GitHub accounts for each student (optional).
File: Midterm.java
Branches: 
main: The main branch for the project.
male-group: Branch for male group members.
female-group: Branch for female group members.
final-group: Branch for the final grouping of all members.
TEAM LEADER: SIR JSTJR
GROUP: MALE & FEMALE
URL : https://github.com/jun-tabios/App-Dev-Midterm.git
Instructions:

Individual Member's Task 
Each group member clones the repository to their local machine.

git clone <repository-url>

Navigate into the cloned repository

cd <repository-name>

Open the Midterm.java file in a text editor and add their name to either the maleGroup or femaleGroup array, depending on their gender.

After adding your name, stage, commit, and push your changes to the respective branch (male-group or female-group).

Team Leader's Verification 
Team leaders verify that each group member has added their name to the appropriate array in the code.
They can do this by reviewing the commits in the male-group and female-group branches.

Final Grouping 
Team leaders merge the male-group and female-group branches into the final-group branch.
They resolve any conflicts that may arise during the merge.

Commit Confirmation 
Each group member commits a message confirming that they have added their name to the code.
Commit message example: "Added my name to the code - [Your Name]"

Discussion thru GOOGLE CLASSROOM 
Discuss the challenges faced during the activity.
Highlight the importance of clear communication and coordination in collaborative coding.

TOTAL POINTS = 25


GOOD LUCK!







THE CODE
Midterm.java

public class Midterm {
    public static void main(String[] args) {
        System.out.println("PATEROS TECHNOLOGICAL COLLEGE");
        System.out.println("APPLICATION DEVELOPMENT\n");
        System.out.println("TEAM LEAD: JSTJR\n");


        String[] maleGroup = {
            // Type your name as a members of the male group here
            "Name1", "Name2", "Name3", "Name4", "Name5",
            "Name6", "Name7", "Name8", "Name9", "Name10",
            "Name11", "Name12", "Name13", "Name14", "Name15",
            "Name16", "Name17", "Name18", "Name19", "Name20"
        };


        String[] femaleGroup = {
            // Type your names as a member of the female group here
            "Name1", "Name2", "Name3", "Name4", "Name5",
            "Name6", "Name7", "Name8", "Name9", "Name10",
            "Name11", "Name12", "Name13", "Name14", "Name15",
            "Name16", "Name17", "Name18", "Name19", "Name20"
        };


        System.out.println("MALE GROUP");
        for (String name : maleGroup) {
            System.out.println(name);
        }


        System.out.println("\nFEMALE GROUP");
        for (String name : femaleGroup) {
            System.out.println(name);
        }
    }
}





