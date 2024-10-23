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
 * <p>Clase Java para animalws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="animalws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idanimal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descanimal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "animalws", propOrder = {
    "idanimal",
    "descanimal"
})
public class Animalws {

    protected int idanimal;
    @XmlElement(required = true)
    protected String descanimal;

    /**
     * Obtiene el valor de la propiedad idanimal.
     * 
     */
    public int getIdanimal() {
        return idanimal;
    }

    /**
     * Define el valor de la propiedad idanimal.
     * 
     */
    public void setIdanimal(int value) {
        this.idanimal = value;
    }

    /**
     * Obtiene el valor de la propiedad descanimal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescanimal() {
        return descanimal;
    }

    /**
     * Define el valor de la propiedad descanimal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescanimal(String value) {
        this.descanimal = value;
    }

}
