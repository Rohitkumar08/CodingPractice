import java.util.*;

public class EmployeeShiftData {
    public static Map<Long, List<Shift>> employeeShifts =  new HashMap<>();

    /**
     * pre populate the data
     */
    public static void populateEmployeeData(){
        List<Shift> shiftsList = new ArrayList<>();
        shiftsList.add(new Shift(new ShiftTiming(8, 0), new ShiftTiming(10, 0)));
        shiftsList.add(new Shift(new ShiftTiming(0, 0), new ShiftTiming(19, 0)));
        shiftsList.add(new Shift(new ShiftTiming(14, 0), new ShiftTiming(19, 0)));
        Long employeeId = 123456L;
        employeeShifts.put(employeeId, shiftsList);
    }

    /**
     * returns all shifts timings from db/static data source
     * @param employeeId
     * @return
     */
    public static List<Shift> getAllShiftTimings(Long employeeId){
        return employeeShifts.get(employeeId);
    }

}
