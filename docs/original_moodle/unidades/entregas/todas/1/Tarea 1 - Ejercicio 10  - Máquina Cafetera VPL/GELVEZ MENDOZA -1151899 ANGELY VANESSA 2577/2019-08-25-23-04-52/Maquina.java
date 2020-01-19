public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        boolean siRecarga = false;
        if (cantidadCafe > 0 && gananciasNetas >= costoCompraCafe){
            siRecarga = true;
            cafe += cantidadCafe;
            egresos += costoCompraCafe;
            registrarFactura(0);
        }
        return siRecarga;
      //complete
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        boolean siRecarga = false;
        if (cantidadAzucar > 0 && gananciasNetas >= costoCompraAzucar){
            siRecarga = true;
            azucar += cantidadAzucar;
            egresos += costoCompraAzucar;
            registrarFactura(0);
        }
        return siRecarga;
      //complete
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        boolean siRecarga = false;
        if (cantidadVasos > 0 && gananciasNetas >= costoCompraVasos){
            siRecarga = true;
            vasos += cantidadVasos;
            egresos += costoCompraVasos;
            registrarFactura(0);
        }
        return siRecarga;
      //complete
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        boolean siHayInsumos = false;
        if (cafe >= tipoCafe*55 && azucar >= (5*(cantidadAzucar-1)) && vasos > 0){
            siHayInsumos = true;
            cafe -= tipoCafe*55;
            azucar -= 5*(cantidadAzucar-1);
            --vasos;
        }
        return siHayInsumos;
      //complete
    }

    public void registrarFactura(int valorFactura) {
        ingresos += valorFactura;
        gananciasBrutas = ingresos - egresos;
        impuestos += ingresos * 16 / 100;
        gananciasNetas = gananciasBrutas - impuestos;
     //complete
    }