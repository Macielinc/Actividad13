package uia.com.apirest.decorador;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import uia.com.apirest.compras.PeticionOrdenCompra;
import uia.com.apirest.compras.SolicitudOrdenCompra;

public class SolicitidOrdenCompraConcreta<items> extends ASolicitudOrdenCompra{
    private int vendedor=-1;

    @JsonCreator
    public SolicitidOrdenCompraConcreta(@JsonProperty("id")int id, @JsonProperty("name")String name,
                                @JsonProperty("codigo")String codigo, @JsonProperty("unidad")String unidad,
                                @JsonProperty("cantidad")int cantidad, @JsonProperty("vendedor")int vendedor,
                                        @JsonProperty("clasificacionProveedor")int clasificacionVendedor) {
        super(id, name, codigo, unidad);
        this.vendedor = vendedor;
    }
    public  SolicitidOrdenCompraConcreta(){
        super();

    }

    @Override
    public void SolicitudOrdenCompra() {

    }

    @Override
    public int getVendedor() {
        return 0;
    }

    @Override
    public void setVendedor(int vendedor) {

    }
}
