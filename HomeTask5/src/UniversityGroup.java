public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;

    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
        this.studentArray = studentArray;
    }

    public void addStudents(String[] students) {
        if (this.studentArray == null) {
            this.studentArray = students;
        }
    }

    public void getGroupDescription(){
        System.out.print(groupName + " (" + startYear + " - " + endYear + ")" + " students: ");
        if (studentArray!= null){
            for (int i = 0; i < studentArray.length; i++) {
                System.out.print(studentArray[i]);
                if (i < studentArray.length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println(".");
                }
            }
        }
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public String[] getStudentArray() {
        return studentArray;
    }
}
