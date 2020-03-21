package microservice.demo.training21days.provider.service;

public class Person {
  private String name;

  private Gender gender;

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public Gender getGender() {
    return gender;
  }

  public Person setGender(Gender gender) {
    this.gender = gender;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Person{");
    sb.append("name='").append(name).append('\'');
    sb.append(", gender=").append(gender);
    sb.append('}');
    return sb.toString();
  }
}
