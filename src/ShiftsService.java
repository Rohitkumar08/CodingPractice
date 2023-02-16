import java.util.*;

/**
 * [09:08] Sinha, Arunava
 *     Tesco has around 3200 stores and more than 10% of the stores have around 800 colleagues each.
 * In a store, a colleague can work for multiple departments. Here are shifts of a colleague in various departments:
 * In Bakery department: From 8 to 10
 * In Checkout department: From 10 to 12
 * In Diary department: From 14 to 19
 * Given the above split of shifts, provide an API/method to return the different shifts of a colleague for the day after merging contiguous shifts. This will be exposed to the colleague in different UI and help them plan their day accordingly.
 * His shift timings in this case are 8 to 12 and 14 to 19
 */
public class ShiftsService {

    static EmployeeShiftData employeeShiftData;

    //we need to create a method to get the employees shifts by employeeId
    public List<Shift> getMergedEmployeeShifts(Long employeeId){
        //fetch the employeeShiftData first

        List<Shift> shifts = employeeShiftData.getAllShiftTimings(employeeId);

        //merge all the shifts together

        //sort the list
        Collections.sort(shifts, Comparator.comparingInt(o -> o.inTime.hour));

        LinkedList<Shift> mergedShift = new LinkedList<>();

        for(Shift shift : shifts){
            if(mergedShift.isEmpty() || mergedShift.getLast().outTime.hour < shift.inTime.hour){
                mergedShift.add(shift);
            }else{
                mergedShift.getLast().outTime.hour = Math.max(mergedShift.getLast().outTime.hour, shift.outTime.hour);
            }
        }

        return new ArrayList<>(mergedShift);
    }

    public static void main(String[] args) {
        ShiftsService shiftsService = new ShiftsService();
        employeeShiftData = new EmployeeShiftData();
        EmployeeShiftData.populateEmployeeData();
        for(Shift shift : shiftsService.getMergedEmployeeShifts(123456L)){
            System.out.println(shift.inTime.hour + " "+ shift.outTime.hour);
        }
    }

}
