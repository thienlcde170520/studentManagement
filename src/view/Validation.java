
package view;

import Model.Report;
import Model.Student;
import java.util.ArrayList;


public class Validation {
    
    public boolean checkReport(ArrayList<Report> list_Rp, int id, String courseName) {
        for (Report rp : list_Rp) {
            if (id == rp.getId() && courseName.equalsIgnoreCase(rp.getCourseName())) {
                return false;
            }
        }
        return true;
    }
}
