package basic.java.unit06.lesson34;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    };
}
