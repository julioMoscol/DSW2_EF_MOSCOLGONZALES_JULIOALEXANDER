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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clientesws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clientesws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idclientes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomclientes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apeclientes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dniclientes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telfclientes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="corrclientes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dirclientes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientesws", propOrder = {
    "idclientes",
    "nomclientes",
    "apeclientes",
    "dniclientes",
    "telfclientes",
    "corrclientes",
    "dirclientes"
})
public class Clientesws {

    protected int idclientes;
    @XmlElement(required = true)
    protected String nomclientes;
    @XmlElement(required = true)
    protected String apeclientes;
    @XmlElement(required = true)
    protected String dniclientes;
    @XmlElement(required = true)
    protected String telfclientes;
    @XmlElement(required = true)
    protected String corrclientes;
    @XmlElement(required = true)
    protected String dirclientes;

    /**
     * Obtiene el valor de la propiedad idclientes.
     * 
     */
    public int getIdclientes() {
        return idclientes;
    }

    /**
     * Define el valor de la propiedad idclientes.
     * 
     */
    public void setIdclientes(int value) {
        this.idclientes = value;
    }

    /**
     * Obtiene el valor de la propiedad nomclientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomclientes() {
        return nomclientes;
    }

    /**
     * Define el valor de la propiedad nomclientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomclientes(String value) {
        this.nomclientes = value;
    }

    /**
     * Obtiene el valor de la propiedad apeclientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeclientes() {
        return apeclientes;
    }

    /**
     * Define el valor de la propiedad apeclientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeclientes(String value) {
        this.apeclientes = value;
    }

    /**
     * Obtiene el valor de la propiedad dniclientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDniclientes() {
        return dniclientes;
    }

    /**
     * Define el valor de la propiedad dniclientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDniclientes(String value) {
        this.dniclientes = value;
    }

    /**
     * Obtiene el valor de la propiedad telfclientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelfclientes() {
        return telfclientes;
    }

    /**
     * Define el valor de la propiedad telfclientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelfclientes(String value) {
        this.telfclientes = value;
    }

    /**
     * Obtiene el valor de la propiedad corrclientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrclientes() {
        return corrclientes;
    }

    /**
     * Define el valor de la propiedad corrclientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrclientes(String value) {
        this.corrclientes = value;
    }

    /**
     * Obtiene el valor de la propiedad dirclientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirclientes() {
        return dirclientes;
    }

    /**
     * Define el valor de la propiedad dirclientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirclientes(String value) {
        this.dirclientes = value;
    }

}
