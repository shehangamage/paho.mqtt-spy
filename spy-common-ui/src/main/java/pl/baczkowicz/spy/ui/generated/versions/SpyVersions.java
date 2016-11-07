//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.07 at 09:01:15 AM GMT 
//


package pl.baczkowicz.spy.ui.generated.versions;

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
 * <p>Java class for SpyVersions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpyVersions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReleaseStatuses" type="{http://baczkowicz.pl/spy-versions}ReleaseStatuses"/&gt;
 *         &lt;element name="LatestReleases" type="{http://baczkowicz.pl/spy-versions}LatestReleases"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpyVersions", propOrder = {
    "releaseStatuses",
    "latestReleases"
})
public class SpyVersions
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "ReleaseStatuses", required = true)
    protected ReleaseStatuses releaseStatuses;
    @XmlElement(name = "LatestReleases", required = true)
    protected LatestReleases latestReleases;

    /**
     * Gets the value of the releaseStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseStatuses }
     *     
     */
    public ReleaseStatuses getReleaseStatuses() {
        return releaseStatuses;
    }

    /**
     * Sets the value of the releaseStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseStatuses }
     *     
     */
    public void setReleaseStatuses(ReleaseStatuses value) {
        this.releaseStatuses = value;
    }

    /**
     * Gets the value of the latestReleases property.
     * 
     * @return
     *     possible object is
     *     {@link LatestReleases }
     *     
     */
    public LatestReleases getLatestReleases() {
        return latestReleases;
    }

    /**
     * Sets the value of the latestReleases property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestReleases }
     *     
     */
    public void setLatestReleases(LatestReleases value) {
        this.latestReleases = value;
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
        {
            ReleaseStatuses theReleaseStatuses;
            theReleaseStatuses = this.getReleaseStatuses();
            strategy.appendField(locator, this, "releaseStatuses", buffer, theReleaseStatuses);
        }
        {
            LatestReleases theLatestReleases;
            theLatestReleases = this.getLatestReleases();
            strategy.appendField(locator, this, "latestReleases", buffer, theLatestReleases);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SpyVersions)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SpyVersions that = ((SpyVersions) object);
        {
            ReleaseStatuses lhsReleaseStatuses;
            lhsReleaseStatuses = this.getReleaseStatuses();
            ReleaseStatuses rhsReleaseStatuses;
            rhsReleaseStatuses = that.getReleaseStatuses();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseStatuses", lhsReleaseStatuses), LocatorUtils.property(thatLocator, "releaseStatuses", rhsReleaseStatuses), lhsReleaseStatuses, rhsReleaseStatuses)) {
                return false;
            }
        }
        {
            LatestReleases lhsLatestReleases;
            lhsLatestReleases = this.getLatestReleases();
            LatestReleases rhsLatestReleases;
            rhsLatestReleases = that.getLatestReleases();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestReleases", lhsLatestReleases), LocatorUtils.property(thatLocator, "latestReleases", rhsLatestReleases), lhsLatestReleases, rhsLatestReleases)) {
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
        int currentHashCode = 1;
        {
            ReleaseStatuses theReleaseStatuses;
            theReleaseStatuses = this.getReleaseStatuses();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseStatuses", theReleaseStatuses), currentHashCode, theReleaseStatuses);
        }
        {
            LatestReleases theLatestReleases;
            theLatestReleases = this.getLatestReleases();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestReleases", theLatestReleases), currentHashCode, theLatestReleases);
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
        if (draftCopy instanceof SpyVersions) {
            final SpyVersions copy = ((SpyVersions) draftCopy);
            if (this.releaseStatuses!= null) {
                ReleaseStatuses sourceReleaseStatuses;
                sourceReleaseStatuses = this.getReleaseStatuses();
                ReleaseStatuses copyReleaseStatuses = ((ReleaseStatuses) strategy.copy(LocatorUtils.property(locator, "releaseStatuses", sourceReleaseStatuses), sourceReleaseStatuses));
                copy.setReleaseStatuses(copyReleaseStatuses);
            } else {
                copy.releaseStatuses = null;
            }
            if (this.latestReleases!= null) {
                LatestReleases sourceLatestReleases;
                sourceLatestReleases = this.getLatestReleases();
                LatestReleases copyLatestReleases = ((LatestReleases) strategy.copy(LocatorUtils.property(locator, "latestReleases", sourceLatestReleases), sourceLatestReleases));
                copy.setLatestReleases(copyLatestReleases);
            } else {
                copy.latestReleases = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SpyVersions();
    }

}
