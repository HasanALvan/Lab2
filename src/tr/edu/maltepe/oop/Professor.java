package tr.edu.maltepe.oop;

public class Professor extends Person{


    Professor(String name,String surname)
    {
        setname(name);
        setsurname(surname);
    }

    void teach()
    {
        System.out.println("Professor "+getname()+" teaches "+getclass_name());
    }


}