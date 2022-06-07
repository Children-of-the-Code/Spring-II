package HeroProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
What we'll be using here instead of JDBC is something called an ORM - object relational mapping
objects in java are mapped to tables in our database and we can interact with data in the database
as if we're directly manipulating that table
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Hero {
    @Id
    @Column
    private int hero_ID;
    @Column
    private String name;
    @Column
    private int power;
}
