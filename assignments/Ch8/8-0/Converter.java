public class Converter {
    public int HTD(int hours){
        int days = hours / 24;
        return days;
    }
    public int RemainderHours(int hours, int days){
        int rH = hours - (days*24);
        return rH;
    }
    public int DTH(int days){
        int hours = days * 24;
        return hours;
    }
}
