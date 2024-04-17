package Library.Person;

public class Member extends Person {

    private long member_id;
    private MemberType member_type;
    private String date_of_membership;
    private boolean no_books_issued;
    private int max_book_limit;

    private String address;
    private String phone_no;

    public Member(String name, long member_id, MemberType member_type, String date_of_membership, boolean no_books_issued, int max_book_limit, String address, String phone_no) {
        super(name);
        this.member_id = member_id;
        this.member_type = member_type;
        this.date_of_membership = date_of_membership;
        this.no_books_issued = no_books_issued;
        this.max_book_limit = max_book_limit;
        this.address = address;
        this.phone_no = phone_no;
    }

    public long getMember_id() {
        return member_id;
    }

    public void setMember_id(long member_id) {
        this.member_id = member_id;
    }

    public MemberType getMember_type() {
        return member_type;
    }

    public void setMember_type(MemberType member_type) {
        this.member_type = member_type;
    }

    public String getDate_of_membership() {
        return date_of_membership;
    }

    public void setDate_of_membership(String date_of_membership) {
        this.date_of_membership = date_of_membership;
    }

    public boolean isNo_books_issued() {
        return no_books_issued;
    }

    public void setNo_books_issued(boolean no_books_issued) {
        this.no_books_issued = no_books_issued;
    }

    public int getMax_book_limit() {
        return max_book_limit;
    }

    public void setMax_book_limit(int max_book_limit) {
        this.max_book_limit = max_book_limit;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    @Override
    public String whoyouare() {
        return super.whoyouare();
    }
}
