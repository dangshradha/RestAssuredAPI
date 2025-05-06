package api.payload;

public class AddressClass {
	
	private String city;
    private String street;
    private int number;
    private String zipcode;

   

    public AddressClass(String city,String street,int number,String zipcode){
        this.city=city;
        this.street=street;
        this.number=number;
        this.zipcode=zipcode;
    }

	public AddressClass() {
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

}


