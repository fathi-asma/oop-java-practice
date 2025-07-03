package Question05_PartA;
 class ShapeCalculator {

     public double calculateArea(String shapeType, double width, double height, double radius) {
         switch (shapeType.toLowerCase()) {
             case "rectangle":
                 return width * height; // width * height
             case "circle":
                 return Math.PI * radius * radius; // π * radius²
             case "triangle":
                 return 0.5 * width * height; // 0.5 * base * height
             default:
                 return 0;
         }
     }
     public void printShapeInfo(String shapeType, double area) {
         System.out.println(shapeType + " area: " + area);
     }
 }






