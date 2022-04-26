package newClasswork;

public @interface Producer {
int startYear();
String country() default "Belarus";
String founderFullName();
}
