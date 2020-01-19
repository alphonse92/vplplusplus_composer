/**
 * Complete
 * @author (Milton Jesús Vera Contreras - miltonjeussvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class MaquinaCafetera 
{ 
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
    MaquinaCafetera()
    {

    }

    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos)
    {
        this.cafe=cantidadInicialCafe;
        this.azucar=cantidadInicialAzucar;
        this.vasos=cantidadInicialVasos;
    }

    public void setPrecioBaseCafe(int precioBaseCafe)
    {
        this.precioBaseCafe=(precioBaseCafe/1000);
    }

    public int getPrecioBaseCafe()
    {
        return this.precioBaseCafe;
    }

    public int getCafe()
    {
        return this.cafe;
    }

    public int getAzucar()
    {
        return this.azucar;
    }

    public int getVasos()
    {
        return this.vasos;
    }

    public void setEgresos(int egresos) 
    {
        this.egresos = egresos;
    }

    public int getEgresos()
    {
        return this.egresos;
    }

    public void setGananciasBrutas(int gananciasBrutas) 
    {
        this.gananciasBrutas = gananciasBrutas;
    }

    public int getGananciasBrutas()
    {
        return this.gananciasBrutas;
    }

    public void setImpuestos(int impuestos) 
    {
        this.impuestos = impuestos;
    }

    public int getImpuestos()
    {
        return this.impuestos;
    }

    public void setIngresos(int ingresos)
    {
        this.ingresos=ingresos;
    }

    public int getIngresos()
    { 
        return this.ingresos;
    }

    public void setGananciasNetas(int gananciasNetas)
    {
        this.gananciasNetas = gananciasNetas;
    }

    public int getGananciasNetas()
    {
        return this.gananciasNetas;
    }

    public int calcularPrecio(int tipoCafe, int cantidadAzucar) 
    {
        int precio =0;
        int precioBase;

        if(tipoCafe==1)
        {
            precioBase=this.precioBaseCafe*55;
            if(cantidadAzucar==1)
            {
                precio=precioBase;
            }
            if(cantidadAzucar==2)
            {
                precio=precioBase+(precioBase*5/100);
            }
            if(cantidadAzucar==3)
            {
                precio=precioBase+(precioBase*10/100);
            }
        }
        if(tipoCafe==2)
        {
            precioBase=this.precioBaseCafe*110;
            if(cantidadAzucar==1)
            {
                precio=precioBase;
            }
            if(cantidadAzucar==2)
            {
                precio=precioBase+(precioBase*5/100);
            }
            if(cantidadAzucar==3)
            {
                precio=precioBase+(precioBase*10/100);
            }
        }
        if(tipoCafe==3)
        {
            precioBase=this.precioBaseCafe*165;
            if(cantidadAzucar==1)
            {
                precio=precioBase;
            }
            if(cantidadAzucar==2)
            {
                precio=precioBase+(precioBase*5/100);
            }
            if(cantidadAzucar==3)
            {
                precio=precioBase+(precioBase*10/100);
            }
        }
        precio += precio * 15/100;
        return precio;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) 
    {
        boolean recargarCafe=false;
        if (this.gananciasNetas>=costoCompraCafe)
        {
            recargarCafe=true;
            this.cafe+=cantidadCafe;
            this.egresos+=costoCompraCafe;
            this.gananciasBrutas=this.ingresos-this.egresos;
            this.impuestos=(this.ingresos*16/100);
            this.gananciasNetas=this.gananciasBrutas-this.impuestos;
        }
        return recargarCafe;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) 
    {
        boolean recargarAzucar=false;
        if (this.gananciasNetas>=costoCompraAzucar)
        {
            recargarAzucar=true;
            this.azucar+=cantidadAzucar;
            this.egresos+=costoCompraAzucar;
            this.gananciasBrutas=this.ingresos-this.egresos;
            this.impuestos=(this.ingresos*16/100);
            this.gananciasNetas=this.gananciasBrutas-this.impuestos;
        }
        return recargarAzucar;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) 
    {
        boolean recargarVasos=false;
        if (this.gananciasNetas>=costoCompraVasos)
        {
            recargarVasos=true;
            this.vasos+=cantidadVasos;
            this.egresos+=costoCompraVasos;
            this.gananciasBrutas=this.ingresos-this.egresos;
            this.impuestos=(this.ingresos*16/100);
            this.gananciasNetas=this.gananciasBrutas-this.impuestos;
        }
        return recargarVasos;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) 
    {
        boolean prepararCafe=false;
            if((tipoCafe==1 && cantidadAzucar==1) && (this.cafe>=55 && this.vasos>0))
            {
                prepararCafe=true;
                this.cafe-=55;
                this.vasos--;
            }
            if((tipoCafe==1 && cantidadAzucar==2) && (this.cafe>=55 && this.azucar>=5 && this.vasos>0))
            {
                prepararCafe=true;
                this.cafe-=55;
                this.azucar-=5;
                this.vasos--;
            }
            if((tipoCafe==1 && cantidadAzucar==3) && (this.cafe>=55 && this.azucar>=10 && this.vasos>0))
            {
                prepararCafe=true;
                this.cafe-=55;
                this.azucar-=10;
                this.vasos--;
            }
        return prepararCafe;
    }

    public void registrarFactura(int valorFactura) 
    {
        this.ingresos+=valorFactura;
        this.gananciasBrutas=this.ingresos-this.egresos;
        this.impuestos=this.ingresos*16/100;
        this.gananciasNetas=this.gananciasBrutas-this.impuestos;
    }
}

