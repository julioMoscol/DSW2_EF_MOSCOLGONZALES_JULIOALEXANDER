//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.22 a las 11:10:49 PM COT 
//


package ejercicio2.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientes" type="{http://www.ejercicio2/ws/objects}clientesws"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientes"
})
@XmlRootElement(name = "postClientesResponse")
public class PostClientesResponse {

    @XmlElement(required = true)
    protected ejercicio2.ws.objects.Clientesws  clientes;

    /**
     * Obtiene el valor de la propiedad clientes.
     * 
     * @return
     *     possible object is
     *     {@link ejercicio2.ws.objects.Clientesws  }
     *     
     */
    public ejercicio2.ws.objects.Clientesws  getClientes() {
        return clientes;
    }

    /**
     * Define el valor de la propiedad clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link ejercicio2.ws.objects.Clientesws  }
     *     
     */
    public void setClientes(ejercicio2.ws.objects.Clientesws  value) {
        this.clientes = value;
    }

}