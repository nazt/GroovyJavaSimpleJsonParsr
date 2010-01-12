
package NAzT
class GMapsGeoCoder {

    def Query="Thammasat"
    def url 
    def jsonObj

    void setQuery(input)
    {
        this.Query=input
        url="http://maps.google.com/maps/geo?q=${URLEncoder.encode(this.Query)}&output=json&sensor=false&gl=th&key=ABQIAAAAnGpifcTyPEhEhb5IwFOjbhQzGK7OP4Q3pl9UTFdBNJif2Gef4RR-EFDBL13et4wmQaxhqsIS4JBSOw".toURL()
        this.jsonObj=url.text
    }
    ArrayList getLatLon(input)
    {
        input.Placemark.Point.coordinates[0]
    }



}

