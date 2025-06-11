package inheritance;

public class InheritanceClass {
    private String name;
    private int socialSec;
    private String location;

    public InheritanceClass(String name, int socialSec, String location) {
        this.name = name;
        this.socialSec = socialSec;
        this.location = location;
    }
    public static class Person{
        public Person(String name, int socialSec, String location) {
        }
    }
    public static void main(String[] args) {
        class Person{
            String name;
            int socialSec;
            String location;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSocialSec() {
                return socialSec;
            }

            public void setSocialSec(int socialSec) {
                this.socialSec = socialSec;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }
        }
    }
}
