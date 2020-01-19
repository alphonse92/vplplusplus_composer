/**
 * Complete
 * @author JUAN-CELIS;
 * Math.sin(Math.PI-Double.MIN_VALUE)
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
    //No requiere propiedades adicionales, pero es libre de usarlas/

    
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
                if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
                caf=(precioBaseCafe/1000 * 55);
                gana=(int)(caf*0.15);
                preci=gana+caf;
                break;
             
                case 2:
                if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
                caf=(precioBaseCafe/1000 * 55);
                azuc=(int)(caf*0.05);
                gana=(int)((caf+azuc)*0.15);
                preci=caf+azuc+gana;
                break;
             
                case 3:
                if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
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
              if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
              caf=(precioBaseCafe/1000*(55*2));
              gana=(int)(caf*0.15);
              preci=gana+cafe;
              break;
             
              case 2:
              if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
              caf=(precioBaseCafe/1000*(55*2));
              azuc=(int)(caf*0.05);
              gana=(int)((azuc+caf)*0.15);
              preci=caf+azuc+gana;
              break;
             
              case 3:
              if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
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
                 if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
                 caf=(precioBaseCafe/1000*(55*3));
                 gana=(int)(caf*0.15);
                 preci=caf+gana;
                 break;
             
                 case 2:
                 if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
                 caf=(precioBaseCafe/1000*(55*3));
                 azuc=(int)(caf*0.05);
                 gana=(int)((caf+azuc)*0.15);
                 preci=caf+azuc+gana;
            
                 break;
             
                 case 3:
                 if(precioBaseCafe>=1000 && precioBaseCafe<=9999)
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
      if(costoCompraCafe>=0)
      if(this.gananciasNetas>=costoCompraCafe){
        
          if(cantidadCafe>=0){
          this.cafe+=cantidadCafe;
          this.egresos+=costoCompraCafe;
          return true;
        }
        }
      return false;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
      //complete
        if(costoCompraAzucar>=0)
      if(this.gananciasNetas>=costoCompraAzucar){
          if(cantidadAzucar>=0){
          this.azucar+=cantidadAzucar;
          this.egresos+=costoCompraAzucar;
          return true;
        }
        }
      return false;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
      //complete
      if(costoCompraVasos>=0)
      if(this.gananciasNetas>=costoCompraVasos){
         if(cantidadVasos>=0){
          this.vasos+=cantidadVasos;
          this.egresos+=costoCompraVasos;
          return true;
        }
        }
      return false;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
          //complete
       
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


    
    public int getCafe(){
        return this.cafe;
    }//end method getCafe

    
    public void setCafe(int cafe){
        this.cafe = cafe;
    }//end method setCafe

    
    public int getAzucar(){
        return this.azucar;
    }//end method getAzucar

    
    public void setAzucar(int azucar){
        this.azucar = azucar;
    }//end method setAzucar

    
    public int getVasos(){
        return this.vasos;
    }//end method getVasos

    
    public void setVasos(int vasos){
        this.vasos = vasos;
    }//end method setVasos

    
    public int getPrecioBaseCafe(){
        return this.precioBaseCafe;
    }//end method getPrecioBaseCafe

    
    public void setPrecioBaseCafe(int precioBaseCafe){
        this.precioBaseCafe = precioBaseCafe;
    }//end method setPrecioBaseCafe

    
    public int getEgresos(){
        return this.egresos;
    }//end method getEgresos

    
    public void setEgresos(int egresos){
        this.egresos = egresos;
    }//end method setEgresos

    
    public int getIngresos(){
        return this.ingresos;
    }//end method getIngresos

    
    public void setIngresos(int ingresos){
        this.ingresos = ingresos;
    }//end method setIngresos

    
    public int getGananciasBrutas(){
        return this.gananciasBrutas;
    }//end method getGananciasBrutas

    
    public void setGananciasBrutas(int gananciasBrutas){
        this.gananciasBrutas = gananciasBrutas;
    }//end method setGananciasBrutas

    
     public int getImpuestos(){
        return this.impuestos;
    }//end method getImpuestos

    
    public void setImpuestos(int impuestos){
        this.impuestos = impuestos;
    }//end method setImpuestos

    
    public int getGananciasNetas(){
        return this.gananciasNetas;
    }//end method getGananciasNetas

    
    public void setGananciasNetas(int gananciasNetas){
        this.gananciasNetas = gananciasNetas;
    }
}