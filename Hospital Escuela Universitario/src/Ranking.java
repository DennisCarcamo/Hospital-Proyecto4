
import scala.Serializable;

public class Ranking implements Serializable {

    private String name;
    private int value;

    public Ranking() {
    }

    public Ranking(String name) {
        this.name = name;
        if (name.equals("A")) {
            value = 4;
        } else if (name.equals("B")) {
            value = 3;
        } else if (name.equals("C")) {
            value = 2;
        } else if (name.equals("D")) {
            value = 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
    

}
