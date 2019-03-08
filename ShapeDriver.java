public class ShapeDriver {
    public static void main(String[] args) {
        Shape[] shape = new Shape[(int) (Math.random() * 31) + 20];

        for (int i = 0; i < shape.length; i++) {
            switch ((int) (Math.random() * 4)) {
            case 0:
                shape[i] = new Rectangle((int) (Math.random() * 91) + 10, (int) (Math.random() * 91) + 10);
                System.out.println(shape[i].toString());
                break;
            case 1:
                shape[i] = new Square((int) (Math.random() * 91) + 10);
                System.out.println(shape[i].toString());
                break;
            case 2:
                shape[i] = new RightTriangle((int) (Math.random() * 91) + 10, (int) (Math.random() * 91) + 10);
                System.out.println(shape[i].toString());
                break;
            case 3:
                shape[i] = new Circle((int) (Math.random() * 91) + 10);
                System.out.println(shape[i].toString());
                break;
            }
        }
    }
}