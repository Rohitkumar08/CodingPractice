public class Shift{

    ShiftTiming inTime;
    ShiftTiming outTime;

    public ShiftTiming getOutTime() {
        return outTime;
    }

    public void setOutTime(ShiftTiming outTime) {
        this.outTime = outTime;
    }

    public ShiftTiming getInTime() {
        return inTime;
    }

    public Shift(ShiftTiming inTime, ShiftTiming outTime) {
        this.inTime = inTime;
        this.outTime = outTime;
    }

    public void setInTime(ShiftTiming inTime) {
        this.inTime = inTime;
    }
}