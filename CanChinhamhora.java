package week1;

/**
 * Can goods
 * @author Rumbi Chinhamhora
 * @version 1.0
 */
public class CanChinhamhora {
    // data members
    private String company;
    private String content;
    private double size;
    private double price;

    /**
     * Default constructor
     */
    public CanChinhamhora() {}

    /**
     * Non-default constructor
     * @param company : String
     * @param content : String
     * @param size : double
     * @param price : double
     */
    public CanChinhamhora( String company, String content, double size, double price ) {
        this.company = company;
        this.content = content;
        this.size = size;
        this.price = price;
    }

    /**
     * Returns company
     * @return company : String
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets company
     * @param company : String
     */
    public void setCompany( String company ) {
        this.company = company;
    }

    /**
     * Returns content
     * @return content : String
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content
     * @param content : String
     */
    public void setContent( String content ) {
        this.content = content;
    }

    /**
     * Returns can size
     * @return size : double
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets can size
     * @param size : double
     */
    public void setSize( double size ) {
        this.size = size;
    }

    /**
     * Returns can price
     * @return price : double
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets can price
     * @param price : double
     */
    public void setPrice( double price ) {
        this.price = price;
    }

    /* *
     * Return a string of this object's values
     * @return : String
     */
    @Override
    public String toString() {
        return "Can [" +
            "Company=" + company +
            ", Content=" + content +
            ", Size=" + String.format("%.1f",size) +
            ", Price=" + String.format("%.2f",price) +
            ']';
    }
}
