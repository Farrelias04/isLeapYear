public class Day
{
    private int year;
    private int month;
    private int day;

    public Day(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters
    public int getDay()
    {
        return this.day;
    }
    //replacecs, for example, damage = dmg to this.damage

    //setters

    public void setDay(int day)
    {
        this.day = day;
    }
    // replaces the current day from Day(int day, int month, int year)

    //other methods
    public String toString()
    {
        return  day + ", " + month + ", " + year;
    }

    //New Year()
    public boolean newYear()
    {
        return (day == 1) && (month == 1);
    }

    public boolean isCentury()
    {
        return (year % 100 == 0);
    }

    public boolean LeapYear()
    {
        if(this.isCentury())
        {
            return (year % 400 == 0 );
        }
        else
        {
            return (year % 4 == 0);
        }

    }

    /*public String dayofWeek()
    {
        String result = "unknown";*/

}


// if we compile and run this, it doesnt display anything since we dont have/call main source (from other java source, for example, in Week3