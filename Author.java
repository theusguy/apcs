public class Author{
    private String name;
    private String email;
    private char gender;
    private int age;
    private int booksPublished;
    
    public Author(String name, char gender){
        this.name = name;
        this.email = "";
        this.gender = gender;
        this.age = 20;
        this.booksPublished = 0;
    }
    
    public void productiveYear(){//passes productive year
        this.age++;
        this.booksPublished += this.booksPublished/7 + 5;
    }
    public void lazyYear(){//passes lazy year
        this.age++;
        this.booksPublished += this.booksPublished/this.age + 1;
    }
    public void changeEmail(String newemail){
        this.email = newemail;
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return 28;
    }
    public char getGender(){
        return gender;
    }
    public int numBooks(){
        return booksPublished;
    }
    
    public String toString(){
        return 
            "[Author| name: " + this.getName() + 
            ", email:"+this.email+
            ", gender:"+this.getGender()+
            ", # of books:"+this.numBooks()+
            ", age:"+this.age+"]";
    }
}