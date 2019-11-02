package mockncipserver


class NcipController {

  def index() { 
    def response = null;

    if ( request.XML ) {
      log.debug("Got xml");
      if ( request.XML.NCIPMessage ) {
        log.debug("Got NCIPMessage");
        if ( request.XML.NCIPMessage.LookupUser ) {
          log.debug("LookupUser")
          render(contentType: 'text/xml') {
            NCIPMessagei('xmlns':'http://www.niso.org/2008/ncip',
                         'xmlns:ncip2': 'http://www.niso.org/schemas/ncip/v2_0/imp1/xsd/ncip_v2_0.xsd') {
              LookupUserResponse {
                ResponseHeader {
                  FromAgencyId {
                    AgencyId('TR_INTEGRATION_INST')
                  }
                  ToAgencyId {
                    AgencyId('TR_INTEGRATION_INST')
                  }
                }
                UserId {
                  UserIdentifierValue('100002')
                }
              }
            }
          }
        }
      }
      else {
        log.warn("Not XML");
      }
    }
    else {
      log.warn("Not XML");
    }
  }
}
