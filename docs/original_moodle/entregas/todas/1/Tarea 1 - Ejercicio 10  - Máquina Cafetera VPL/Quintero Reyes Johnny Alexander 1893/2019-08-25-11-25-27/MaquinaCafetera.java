/**
 * Complete
 * @author (Milton Jesús Vera Contreras - miltonjeussvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class MaquinaCafetera { 

    int cafe;
    int azucar;
    int vasos;
    int precioBaseCafe;
    int egresos;
    int ingresos;
    int gananciasBrutas;
    int impuestos;
    int gananciasNetas;
    /*No requiere propiedades adicionales, pero es libre de usarlas*/

    
    MaquinaCafetera(){
     //complete
     this.cafe=0;
     this.azucar=0;
     this.vasos=0;
     this.precioBaseCafe=0;
     this.egresos=0;
     this.ingresos=0;
     this.gananciasBrutas=0;
     this.impuestos=0;
     this.gananciasNetas=0;
    }
    
    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
     //complete
     this.cafe=cantidadInicialCafe;
     this.azucar=cantidadInicialAzucar;
     this.vasos=cantidadInicialVasos;
    }
    
    //complete metodos GET / SET
     
    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
     //complete
     int azuc=0,preci=0,caf=0,gana=0;
     switch(tipoCafe){
         case 1:
            switch(cantidadAzucar){
                case 1:
                caf=(precioBaseCafe/1000 * 55);
                gana=(int)(caf*0.15);
                preci=gana+caf;
                break;
             
                case 2:
                caf=(precioBaseCafe/1000 * 55);
                azuc=(int)(caf*0.05);
                gana=(int)((caf+azuc)*0.15);
                preci=caf+azuc+gana;
                break;
             
                case 3:
                caf=(precioBaseCafe / 1000 * 55);
                azuc=(int)(caf*0.10);
                gana=(int)((caf+azuc)*0.15);
                preci=caf+azuc+gana;
                break;
            }
            break;
            
         case 2:
          switch(cantidadAzucar){
              case 1:
              caf=(precioBaseCafe/1000*(55*2));
              gana=(int)(caf*0.15);
              preci=gana+cafe;
              break;
             
              case 2:
              caf=(precioBaseCafe/1000*(55*2));
              azuc=(int)(caf*0.05);
              gana=(int)((azuc+caf)*0.15);
              preci=caf+azuc+gana;
              break;
             
              case 3:
              caf=(precioBaseCafe/1000*(55*2));
              azuc=(int)(caf*0.10);
              gana=(int)((azuc+caf)*0.15);
              preci=caf+azuc+gana;
              break;
            }
            break;
            
          case 3:
             switch(cantidadAzucar){
                 case 1:
                 caf=(precioBaseCafe/1000*(55*3));
                 gana=(int)(caf*0.15);
                 preci=caf+gana;
                 break;
             
                 case 2:
                 caf=(precioBaseCafe/1000*(55*3));
                 azuc=(int)(caf*0.05);
                 gana=(int)((caf+azuc)*0.15);
                 preci=caf+azuc+gana;
            
                 break;
             
                 case 3:
                 caf=(precioBaseCafe/1000*(55*3));
                 azuc=(int)(caf*0.10);
                 gana=(int)((azuc+caf)*0.15);
                 preci=caf+azuc+gana;
             
                 break;
            }
        break;
        }
     
        return preci;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
      //complete
      if(this.gananciasNetas>=costoCompraCafe)
      {
          this.cafe+=cantidadCafe;
          this.egresos+=costoCompraCafe*cantidadCafe;
          return true;
        }else
      return false;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
      //complete
      if(this.gananciasNetas>=costoCompraAzucar){
          this.azucar+=cantidadAzucar;
          this.egresos+=costoCompraAzucar;
          return true;
        }else
      return false;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
      //complete
      if(this.gananciasNetas>=costoCompraVasos){
          this.vasos+=cantidadVasos;
          this.egresos+=costoCompraVasos;
        }
      return true;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
          //complete
       if(this.azucar>0 && this.cafe>0 && this.cafe>0 && this.precioBaseCafe>0)
          if(tipoCafe == 1){
                if(cantidadAzucar == 1){
                    if(this.cafe>=55 && this.vasos>=1){
                    this.cafe-=55;
                    this.vasos--;
                    return true;
                }
                }else
                if(cantidadAzucar == 2){
                    if(this.cafe>=5 && this.azucar>=5 && this.vasos>=1){
                    this.cafe-=55;
                    this.azucar-=5;
                    this.vasos--;
                    return true;
                }
                }else{
                    if(this.cafe>=55 && this.azucar>=10 && this.vasos>=1)
                    {
                    this.cafe-=55;
                    this.azucar-=10;
                    this.vasos--;
                    return true;
                }
                }
              
            }else
            if(tipoCafe == 2){
                if(cantidadAzucar==1){
                    if(this.cafe>=110 && this.vasos>=1){
                this.cafe-=110;
                this.vasos--;
                return true;
            }
                }else
                if(cantidadAzucar == 2){
                    if(this.cafe>=110 && this.azucar>=5 && this.vasos>=1){
                    this.cafe-=110;
                    this.azucar-=5;
                    this.vasos--;
                    return true;
            }
            }else{
                if(this.cafe>=110 && this.azucar>=10 && this.vasos>=1){
                this.cafe=-110;
                this.azucar-=10;
                this.vasos--;
                return true;
            }
            }
            }else
            if(tipoCafe==3){
                if(cantidadAzucar == 1){
                    if(this.cafe>=165 && this.vasos>=1){
                    this.cafe-=165;
                    this.vasos--;
                    return true;
                }
                }else
                if(cantidadAzucar == 2){
                    if(this.cafe>=165 && this.azucar>=5 && this.vasos>=1){
                    this.cafe-=165;
                    this.azucar-=5;
                    this.vasos--;
                    return true;
                }
                }else
                {
                    if(this.cafe>=165 && this.azucar>=10 && this.vasos>=1){
                    this.cafe-=165;
                    this.azucar-=10;
                    this.vasos--;
                    return true;
                }
                }
            }
            return false;
    }

    public void registrarFactura(int valorFactura) {
     //complete
     this.ingresos+=valorFactura;
     this.gananciasBrutas=this.ingresos-this.egresos;
     this.impuestos=(int)(this.ingresos*0.16);
     this.gananciasNetas=this.gananciasBrutas-this.impuestos;
     
    }


    //Start GetterSetterExtension Code
    /**Getter method cafe*/
    public int getCafe(){
        return this.cafe;
    }//end method getCafe

    /**Setter method cafe*/
    public void setCafe(int cafe){
        this.cafe = cafe;
    }//end method setCafe

    /**Getter method azucar*/
    public int getAzucar(){
        return this.azucar;
    }//end method getAzucar

    /**Setter method azucar*/
    public void setAzucar(int azucar){
        this.azucar = azucar;
    }//end method setAzucar

    /**Getter method vasos*/
    public int getVasos(){
        return this.vasos;
    }//end method getVasos

    /**Setter method vasos*/
    public void setVasos(int vasos){
        this.vasos = vasos;
    }//end method setVasos

    /**Getter method precioBaseCafe*/
    public int getPrecioBaseCafe(){
        return this.precioBaseCafe;
    }//end method getPrecioBaseCafe

    /**Setter method precioBaseCafe*/
    public void setPrecioBaseCafe(int precioBaseCafe){
        this.precioBaseCafe = precioBaseCafe;
    }//end method setPrecioBaseCafe

    /**Getter method egresos*/
    public int getEgresos(){
        return this.egresos;
    }//end method getEgresos

    /**Setter method egresos*/
    public void setEgresos(int egresos){
        this.egresos = egresos;
    }//end method setEgresos

    /**Getter method ingresos*/
    public int getIngresos(){
        return this.ingresos;
    }//end method getIngresos

    /**Setter method ingresos*/
    public void setIngresos(int ingresos){
        this.ingresos = ingresos;
    }//end method setIngresos

    /**Getter method gananciasBrutas*/
    public int getGananciasBrutas(){
        return this.gananciasBrutas;
    }//end method getGananciasBrutas

    /**Setter method gananciasBrutas*/
    public void setGananciasBrutas(int gananciasBrutas){
        this.gananciasBrutas = gananciasBrutas;
    }//end method setGananciasBrutas

    /**Getter method impuestos*/
    public int getImpuestos(){
        return this.impuestos;
    }//end method getImpuestos

    /**Setter method impuestos*/
    public void setImpuestos(int impuestos){
        this.impuestos = impuestos;
    }//end method setImpuestos

    /**Getter method gananciasNetas*/
    public int getGananciasNetas(){
        return this.gananciasNetas;
    }//end method getGananciasNetas

    /**Setter method gananciasNetas*/
    public void setGananciasNetas(int gananciasNetas){
        this.gananciasNetas = gananciasNetas;
    }//end method setGananciasNetas

    //End GetterSetterExtension Code
//!
}
