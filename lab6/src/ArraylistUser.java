import java.util.ArrayList;
import java.util.List;

class use {
        private String name;
        private Integer age;
        public use(String name,Integer age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

    public static class ArraylistUser{
        public static void main(String[] args) {
            List<use> User=new ArrayList<>();
            User.add(new use("Hoang Ha",18));
            User.add(new use("Xuan Ha",19));
            User.add(new use("Xuan Huy",29));
            User.add(new use("Xuan Quynh",13));
            User.forEach(use -> {
                System.out.println("ten"+use.getName()+"tuoi"+use.getAge());
            });

        }
    }
}
