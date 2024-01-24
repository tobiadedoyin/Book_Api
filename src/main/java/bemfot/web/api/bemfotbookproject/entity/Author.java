package bemfot.web.api.bemfotbookproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Table(name = "author")
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) @Column(name = "author_id")
    private  long authorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private  String lastName;
    @Column(name = "age")
    private  int age;
    @Column(name = "nationanlity")
    private String nationality;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    @JsonIgnore
    private List<Book> books;
}
