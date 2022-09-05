public class AboutGroup {
    public static void main(String[] args) {
        //about group
        UniversityGroup gr1 = new UniversityGroup("GR-1", 2010, new String[]{"Alex", "Nataliia", "Vlad"});
        UniversityGroup gr2 = new UniversityGroup("GR-2", 2012);

        String[] studentArray = new String[]{"Olga", "Kostya", "Vladimir", "Petya"};

        gr1.addStudents(studentArray);
        gr2.addStudents(studentArray);

        gr1.getGroupDescription();
        gr2.getGroupDescription();
    }
}
