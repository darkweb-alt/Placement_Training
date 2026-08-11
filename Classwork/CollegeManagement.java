class Management {

    String managementName = "Management";

    void showManagement() {
        System.out.println("This is Management");
    }
}




class Schools extends Management {

    String schoolName = "School";

    void showSchool() {
        System.out.println("This is School");
    }
}


class College extends Management {

    String collegeName = "College";

    void showCollege() {
        System.out.println("This is College");
    }
}


class Placement extends Management {

    String placementName = "Placement";

    void showPlacement() {
        System.out.println("This is Placement");
    }
}


// ================= SCHOOL CHILDREN =================

class Teachers extends Schools {

    void showTeachers() {
        System.out.println("Teachers belong to School");
    }
}


class Workers extends Schools {

    void showWorkers() {
        System.out.println("Workers belong to School");
    }
}


class SchoolStudents extends Schools {

    void showSchoolStudents() {
        System.out.println("Students belong to School");
    }
}


// ================= COLLEGE CHILDREN =================

class Professors extends College {

    void showProfessors() {
        System.out.println("Professors belong to College");
    }
}


class Transport extends College {

    void showTransport() {
        System.out.println("Transport belongs to College");
    }
}


class CollegeStudents extends College {

    void showCollegeStudents() {
        System.out.println("Students belong to College");
    }
}


// ================= PLACEMENT CHILDREN =================

class Staffs extends Placement {

    void showStaffs() {
        System.out.println("Staffs belong to Placement");
    }
}


class Company extends Placement {

    void showCompany() {
        System.out.println("Company belongs to Placement");
    }
}


class Training extends Placement {

    void showTraining() {
        System.out.println("Training belongs to Placement");
    }
}


class PlacementStudents extends Placement {

    void showPlacementStudents() {
        System.out.println("Students belong to Placement");
    }
}


// ================= MAIN CLASS =================

public class CollegeManagement {

    public static void main(String[] args) {

        // School Student

        SchoolStudents s1 = new SchoolStudents();

        s1.showManagement();
        s1.showSchool();
        s1.showSchoolStudents();

        System.out.println();


        // College Student

        CollegeStudents c1 = new CollegeStudents();

        c1.showManagement();
        c1.showCollege();
        c1.showCollegeStudents();

        System.out.println();


        // Professor

        Professors p1 = new Professors();

        p1.showManagement();
        p1.showCollege();
        p1.showProfessors();

        System.out.println();


        // Placement Student

        PlacementStudents ps1 = new PlacementStudents();

        ps1.showManagement();
        ps1.showPlacement();
        ps1.showPlacementStudents();

    }
}