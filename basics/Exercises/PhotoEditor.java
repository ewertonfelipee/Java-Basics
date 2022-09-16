package basics;

// Photo editor program using inheritance concepts

public class PhotoEditor {

    protected void draw(){
        System.out.println("Drawning");
    }

    protected  void write(){
        System.out.println("Writing");
    }
}

class Pro extends PhotoEditor{
    protected void useEffects(){
        System.out.println("Using Effects");
    }

    protected void changeResolution(){
        System.out.println("Changing Resolution");
    }
}

class MainPhotoEditor{
    public static void main(String[] args){
        PhotoEditor photo = new PhotoEditor();

        photo.draw();
        photo.write();

        Pro pro = new Pro();

        pro.draw();
        pro.write();
        pro.useEffects();
        pro.changeResolution();
    }
}
