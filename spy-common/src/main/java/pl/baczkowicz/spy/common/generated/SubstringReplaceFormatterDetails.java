//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.07 at 09:01:08 AM GMT 
//


package pl.baczkowicz.spy.common.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SubstringReplaceFormatterDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstringReplaceFormatterDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://baczkowicz.pl/spy/common}SubstringFormatterDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReplaceWith" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstringReplaceFormatterDetails", propOrder = {
    "replaceWith"
})
public class SubstringReplaceFormatterDetails
    extends SubstringFormatterDetails
    implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ReplaceWith", required = true)
    protected String replaceWith;

    /**
     * Default no-arg constructor
     * 
     */
    public SubstringReplaceFormatterDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubstringReplaceFormatterDetails(final String startTag, final String endTag, final boolean keepTags, final String replaceWith) {
        super(startTag, endTag, keepTags);
        this.replaceWith = replaceWith;
    }

    /**
     * Gets the value of the replaceWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceWith() {
        return replaceWith;
    }

    /**
     * Sets the value of the replaceWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceWith(String value) {
        this.replaceWith = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            String theReplaceWith;
            theReplaceWith = this.getReplaceWith();
            strategy.appendField(locator, this, "replaceWith", buffer, theReplaceWith);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SubstringReplaceFormatterDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SubstringReplaceFormatterDetails that = ((SubstringReplaceFormatterDetails) object);
        {
            String lhsReplaceWith;
            lhsReplaceWith = this.getReplaceWith();
            String rhsReplaceWith;
            rhsReplaceWith = that.getReplaceWith();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replaceWith", lhsReplaceWith), LocatorUtils.property(thatLocator, "replaceWith", rhsReplaceWith), lhsReplaceWith, rhsReplaceWith)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theReplaceWith;
            theReplaceWith = this.getReplaceWith();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replaceWith", theReplaceWith), currentHashCode, theReplaceWith);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof SubstringReplaceFormatterDetails) {
            final SubstringReplaceFormatterDetails copy = ((SubstringReplaceFormatterDetails) draftCopy);
            if (this.replaceWith!= null) {
                String sourceReplaceWith;
                sourceReplaceWith = this.getReplaceWith();
                String copyReplaceWith = ((String) strategy.copy(LocatorUtils.property(locator, "replaceWith", sourceReplaceWith), sourceReplaceWith));
                copy.setReplaceWith(copyReplaceWith);
            } else {
                copy.replaceWith = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SubstringReplaceFormatterDetails();
    }

}
