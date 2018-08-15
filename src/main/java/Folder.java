import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folder")
public class Folder {

    private int id;
    private String title;
    private List<File> contents;

    public Folder(){
    }

    public Folder(String title){
        this.title = title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToMany(mappedBy = "folder", fetch = FetchType.EAGER)
    public List<File> getContents() {
        return contents;
    }

    public void setContents(List<File> contents) {
        this.contents = contents;
    }
}