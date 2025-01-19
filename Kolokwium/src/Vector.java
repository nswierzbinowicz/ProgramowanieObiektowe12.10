public class Vector extends ComputerGraphic{
    @Override
    void saveFile() {
        super.width = 1024;
        super.height = 512;
        super.fileName = "Test";
    }

    @Override
    void loadFile() {
        System.out.println("Wysokość: " + height + " Szerokość: " + width + " Nazwa pliku: " + fileName);
    }
}
