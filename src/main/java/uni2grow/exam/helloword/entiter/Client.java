package uni2grow.exam.helloword.entiter;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENT")

public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@Column(unique = true)
    private String email;

    public Client(){

    }
    public Client(int id, String email){
        this.id=id;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public int getId() {
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
