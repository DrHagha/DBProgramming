import java.util.Objects;

public class sampleDTO {
    private String firstName;
    private String lastName;
    private int age;
    private int grade;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof sampleDTO)) return false;
        sampleDTO sampleDTO = (sampleDTO) o;
        return age == sampleDTO.age && grade == sampleDTO.grade && Objects.equals(firstName, sampleDTO.firstName) && Objects.equals(lastName, sampleDTO.lastName) && Objects.equals(address, sampleDTO.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, grade, address);
    }

    public sampleDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
