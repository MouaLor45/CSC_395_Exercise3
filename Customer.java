/**
 * Customer Class
 */
public class Customer {
    private String name;
    private String email;
    private int id;

    /**
     * The set method for the customer name
     * @param value The customers name
     */
    public void setName(String value){
        name = value;
    }

    /**
     * When called returns the customers name
     * @return The customers name
     */
    public String getName() {
        return name;
    }

    /**
     * The set method for customer email
     * @param custem String of customer email
     */
    public void setEmail(String custEmail){
        email = custEmail;
    }

    /**
     * When called returns the customers email
     * @return The customers email
     */
    public String getEmail() {
        return email;
    }

    /**
     * The set method for customer ID
     * @param num A number representing the customer id
     */
    public void setId(int num){
        id = num;
    }

    /**
     * When called returns the customers ID
     * @return The customers ID
     */
    public int getId() {
        return id;
    }
}
   