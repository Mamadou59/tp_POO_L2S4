package rental;
/** a YearFilter allows to select a Vehicle for a given limit Year
*/

public class YearFilter implements VehicleFilter {

    //public static final int YEAR = 2010;
    private int yearLimite;
    /**
     *  @param yearLimite the required limit year 
     *  */
    public YearFilter(int yearLimite) {
        this.yearLimite = yearLimite;
    }
    /** @return <code>true</code> if v's year is the same than the required limit production year 
     *  @see VehicleFilter#accept(Vehicle) */
    public boolean accept(Vehicle v) {
        return v.getProductionYear() >= this.yearLimite;
    }
}
