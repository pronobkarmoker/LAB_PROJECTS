public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(int month, int day) {
        this.month = month;
        this.day = day;
        this.year = 2023;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void displayDate(int month, int day, int year){
        System.out.println(day+"/"+month+"/"+year);
    }

    void displayDate(int month, int day){
        System.out.println(month + "." + day + "." + year);
    }


}
