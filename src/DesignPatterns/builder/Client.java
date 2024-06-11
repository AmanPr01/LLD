package DesignPatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder DesignPatterns.builder = new Builder();
//        Builder DesignPatterns.builder = Student.getBuilder();
//        DesignPatterns.builder.setName("Aman");
//        DesignPatterns.builder.setBatch("Apr23 Tuesday Beginner Morning");
//        DesignPatterns.builder.setGradYear(2021);
//        DesignPatterns.builder.setPsp(89.0);
//        DesignPatterns.builder.setAge(25);
//        DesignPatterns.builder.setUniversityName("Scaler");
//
////        Student student = new Student(DesignPatterns.builder);
//        Student student = DesignPatterns.builder.build();

        Student student = Student.getBuilder()
                                .setName("Krishna")
                                        .setAge(26)
                                                .setBatch("Evening")
                                                        .setPsp(90.9)
                                                                .setUniversityName("Scaler")
                                                                        .setGradYear(2021)
                                                                                .build();


        System.out.println(student);
    }
}
