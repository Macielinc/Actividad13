package uia.com.apirest.decorador;

public abstract class ASolicitudOrdenCompra implements ISolicitudOrdenCompra {
    protected int id;
    protected String name;
    protected String codigo;
    protected String unidad;
    protected int cantidad;
    protected int vendedor;
    protected int clasificacionVendedor;

    public ASolicitudOrdenCompra(int id, String name, String codigo, String unidad) {
        this.id = id;
        this.name = name;
        this.codigo = codigo;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.vendedor = vendedor;
        this.clasificacionVendedor = clasificacionVendedor;
    }

    public ASolicitudOrdenCompra() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int getVendedor() {
        return vendedor;
    }

    @Override
    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public int getClasificacionVendedor() {
        return clasificacionVendedor;
    }

    public void setClasificacionVendedor(int clasificacionVendedor) {
        this.clasificacionVendedor = clasificacionVendedor;
    }
}

