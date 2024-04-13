package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;

public class FacturaVenta {
    private Date fechaFacturacion;
    private int numeroComprobante;
    private Enum FormaPago;
    private BigDecimal subTotal;
    private BigDecimal descuento;
    private BigDecimal gastosEnvio;
    private BigDecimal totalVenta;
}
