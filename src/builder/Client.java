package builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        Builder builder = Student.getBuilder();
//        builder.setName("Aman");
//        builder.setBatch("Apr23 Tuesday Beginner Morning");
//        builder.setGradYear(2021);
//        builder.setPsp(89.0);
//        builder.setAge(25);
//        builder.setUniversityName("Scaler");
//
////        Student student = new Student(builder);
//        Student student = builder.build();

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
