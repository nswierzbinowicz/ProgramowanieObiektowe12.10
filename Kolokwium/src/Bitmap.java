public class Bitmap extends ComputerGraphic{
    @Override
    void saveFile() {
        super.width = 210;
        super.height = 220;
        super.fileName = "Test";
    }

    @Override
    void loadFile() {
        System.out.println("Wysokość: " + height + " Szerokość: " + width + " Nazwa pliku: " + fileName);
    }
}
