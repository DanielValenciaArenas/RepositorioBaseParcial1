package co.edu.uniquindio.Hotel.parcial1.services;

public interface IPrototype extends Cloneable {
    IPrototype clone();

    //* EJEMPLO DE USO
    // @Override
    //    public IPrototypeCuenta clone() {
    //        CuentaAH cuenta = null;
    //
    //        try {
    //            cuenta  = (CuentaAH) super.clone();
    //        } catch (CloneNotSupportedException e) {
    //            e.printStackTrace();
    //        }
    //        return cuenta;
    //    }
    //
    // *//
}
