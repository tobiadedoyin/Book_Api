package bemfot.web.api.bemfotbookproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "book_model")
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "book_id")
    private long bookId;
    @Column(name = "book_title")
    private String title;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "author")
    private Author author;
    @Column(name = "book_year")
    private int year;
    @Column(name = "book_price")
    private double price;

}
