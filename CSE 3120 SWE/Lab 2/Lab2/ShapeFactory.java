public class ShapeFactory {
    public Shape createShape(String str){
        if(str==null){
            System.out.println("kicchu nai");
            return null;
        }
        if(str.equalsIgnoreCase("rec")){
            Shape sh=new Rectangle();
            return sh;
        }
        return null;
    }
}
