package televisores;


public class TV {
    
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    public boolean estado;
    private int volumen = 1;
    private Control control;
   
    public static int NumTV;
    
    
    
    public TV(Marca marca, boolean estado){
      TV.NumTV ++;
      this.marca = marca;
      this.estado = estado;
        
        
    }
    
    
    
    public void setMarca(Marca marca) {
        this.marca=marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal<121){
            if (canal>0){
                if (estado==true){
                    this.canal = canal;
                }
            }
        
        }
    }
    
        

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (estado==true){
            if (volumen<8){
                if (volumen>0){
                    this.volumen = volumen;
                }
            }
            
        }
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }
    
    public Marca getMarca() {
        return marca;
        
    }
    
    public void turnOff() {
        this.estado = false;
    }
    
    public void turnOn() {
        this.estado = true;
    }

    public boolean getEstado() {
        return estado;
    }
    
    public void canalUp() {
        if ((canal + 1)<121){
            if (estado==true){
                this.canal ++;
            }
        }
    }
    
    
    public void canalDown() {
        if ((canal - 1)>0){
            if (estado==true){
                this.canal --;
            }
        }
    }
    
    
    public void volumenUp() {
        if ((volumen + 1)<8){
            if (estado==true){
                this.volumen ++;
            }
        }
    }
    
    public void volumenDown() {
        if ((volumen - 1)>0){
            if (estado==true){
                this.volumen --;
            }
        }
    }
    
    public static int getNumTV() {
        return NumTV;
    }
        
    public static void setNumTV(int num) {
         TV.NumTV=num;
    }
 
    
}