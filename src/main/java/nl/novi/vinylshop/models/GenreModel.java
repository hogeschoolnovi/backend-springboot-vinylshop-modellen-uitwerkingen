package nl.novi.vinylshop.models;


public class GenreModel extends BaseModel {

    private String name;
    private String description;

    public GenreModel() {
        super(-1L);
    }
    public GenreModel(Long id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
