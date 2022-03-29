package televisores;


public class Control {
    private Tv tv;
    
    
    
    
    public void enlazar(Tv tv) {
        this.tv=tv;
        this.tv.setControl(this);
              
    }
    
    public void turnOn() {
        this.tv.turnOn();
    }
    
    public void turnOff() {
        this.tv.turnOff();
    }
    
    public void canalUp() {
        if (this.tv.estado==true){
            this.tv.canalUp();
        }
    }
    
    public void canalDown() {
        if (this.tv.estado==true){
            this.tv.canalDown();
        }
    }
    
    public void volumenUp() {
        if (this.tv.estado==true){
            this.tv.volumenUp();
        }
    }
    
    public void volumenDown() {
        if (this.tv.estado==true){
            this.tv.volumenDown();
        }
    }
    
    
    public void setCanal(int canal) {
        if (this.tv.estado==true){
            this.tv.setCanal(canal);
        }
    }
    

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }
    
    
}