package org.snisarg.googleapi.tests;

import java.io.IOException;

import org.snisarg.googleapi.GooglePlaces;
import org.snisarg.googleapi.model.details.Address_components;
import org.snisarg.googleapi.model.details.DetailsWrapper;
import org.snisarg.googleapi.query.DetailsQuery;

import com.google.gson.JsonSyntaxException;

public class TestDetails {

	public static void main(String[] args) {
		GooglePlaces gp = new GooglePlaces("Your key here");
		DetailsWrapper dw;
		try {
			dw = gp.query(new DetailsQuery("CnRwAAAAKKVouLjezXBWYnS5qm-gbpydBcLR1j7VfUA5OJ_O5wI_BYoHc-ea4NmW0HjpVFEkOK4pUR5b8xkeSTB77KWGoVhGpEhbmEd-Qufx8rxnxLhf_eI-WxJ6hgFzrX0FcGQqNZhyRXgalglK24l3bmtFhBIQCK0RuxKzgEo__yp7MvWkNBoUW60gsXqqEqmi5gx_FCjNfCzCa0o"));
			for( Address_components n : dw.getResult().getAddress_components()) {
				System.out.println(n.getShort_name());
			}
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//{
//	   "html_attributions" : [],
//	   "result" : {
//	      "address_components" : [
//	         {
//	            "long_name" : "Kapaswadi",
//	            "short_name" : "Kapaswadi",
//	            "types" : [ "neighborhood", "political" ]
//	         },
//	         {
//	            "long_name" : "Andheri West",
//	            "short_name" : "Andheri West",
//	            "types" : [ "sublocality", "political" ]
//	         },
//	         {
//	            "long_name" : "Mumbai",
//	            "short_name" : "म�?ंबई",
//	            "types" : [ "locality", "political" ]
//	         },
//	         {
//	            "long_name" : "Mumbai Suburban",
//	            "short_name" : "Mumbai Suburban",
//	            "types" : [ "administrative_area_level_2", "political" ]
//	         },
//	         {
//	            "long_name" : "Maharashtra",
//	            "short_name" : "MH",
//	            "types" : [ "administrative_area_level_1", "political" ]
//	         },
//	         {
//	            "long_name" : "India",
//	            "short_name" : "IN",
//	            "types" : [ "country", "political" ]
//	         }
//	      ],
//	      "adr_address" : "\u003cspan class=\"region\"\u003eKapaswadi, Andheri West\u003c/span\u003e, \u003cspan class=\"locality\"\u003eMumbai\u003c/span\u003e, \u003cspan class=\"region\"\u003eMaharashtra\u003c/span\u003e, \u003cspan class=\"country-name\"\u003eIndia\u003c/span\u003e",
//	      "formatted_address" : "Kapaswadi, Andheri West, Mumbai, Maharashtra, India",
//	      "geometry" : {
//	         "location" : {
//	            "lat" : 19.11801560,
//	            "lng" : 72.82754570000002
//	         },
//	         "viewport" : {
//	            "northeast" : {
//	               "lat" : 19.12060790,
//	               "lng" : 72.82982729999999
//	            },
//	            "southwest" : {
//	               "lat" : 19.11607650,
//	               "lng" : 72.82536449999999
//	            }
//	         }
//	      },
//	      "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png",
//	      "id" : "5feceea2b9fb201290345a93234d1d316eec1e18",
//	      "name" : "Kapaswadi",
//	      "reference" : "CqQBkwAAAFpt5fkWg_DsKUiiuLZ1EJI3UcJ5Z9ODYC0Ucmi6fToVU8nYM-hbDhhLlklIvmEyFvT2b5lFeQbGu0lyQenwdcZjlnio_6vD-1El_4QBvGmP3lV2YsInvdIfTXI85hi_gR0-2y-lC24KS21k9v1PmDT0exNBaiPS0CIxqgaFTTjGcyyz05GK4BIA22ieyz2PdgemxzNwDgPH6jfH38NKmCsSENl8MgZb_JlJOydSMSANd0oaFDVUsPcFEp4ai1aWeaJswqEDeYS5",
//	      "types" : [ "neighborhood", "political" ],
//	      "url" : "https://maps.google.com/maps/place?q=Kapaswadi&ftid=0x3be7c9e7634b688d:0x18d5ed137bbe81e7",
//	      "vicinity" : "Andheri West"
//	   },
//	   "status" : "OK"
//	}
