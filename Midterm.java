public class Midterm1 {
    public static void main(String[] args) {
        System.out.println("PATEROS TECHNOLOGICAL COLLEGE");
        System.out.println("APPLICATION DEVELOPMENT\n");
        System.out.println("TEAM LEAD: SIR JSTJR\n");

        String[] maleGroup = {
            // Type the names of the 20 male group members here
            "Name1", "Name2", "Name3", "Name4", "Name5",
            "Name6", "Name7", "Name8", "Name9", "Name10",
            "Name11", "Name12", "Name13", "Dan Vantari Das L. Ma�aol", "Name15",
            "Name16", "Vergel Omadto", "Fallarme Alvin C.", "Vincent Avinales", "Francisco Santos"
        };

        String[] femaleGroup = {
            // Type the names of the 20 female group members here
            "Dumaran,Laira-Ann M. ", "Valerie Clair Avinales", "Rizza Servano", "Joan Obediente", "Name5",
            "Name6", "Name7", "Name8", "Name9", "Name10",
            "Name11", "Name12", "Name13", "Name14", "Name15",
            "Name16", "Name17", "Montenegro Jamie", "Name19", "Name20"
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
