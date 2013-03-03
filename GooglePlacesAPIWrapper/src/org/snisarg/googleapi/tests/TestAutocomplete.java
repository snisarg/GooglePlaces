package org.snisarg.googleapi.tests;

import org.snisarg.googleapi.GooglePlaces;
import org.snisarg.googleapi.model.autocomplete.AutocompleteWrapper;
import org.snisarg.googleapi.model.autocomplete.Predictions;
import org.snisarg.googleapi.query.AutocompleteQuery;

public class TestAutocomplete {

	public static void main(String[] args) {
		GooglePlaces gp = new GooglePlaces("Your key here");
		AutocompleteWrapper aw = gp.query(new AutocompleteQuery("kapa").setLatitude(19.1146857).setLongitude(72.8310232).setRadius(90000).setComponents("country:in"));
		for(Predictions p : aw.getPredictions()) {
			System.out.println(p.getDescription());
		}
	}

}

//{
//	   "predictions" : [
//	      {
//	         "description" : "Kapaswadi, Mumbai Suburban, Maharashtra, India",
//	         "id" : "5feceea2b9fb201290345a93234d1d316eec1e18",
//	         "matched_substrings" : [
//	            {
//	               "length" : 4,
//	               "offset" : 0
//	            }
//	         ],
//	         "reference" : "CnRwAAAAKKVouLjezXBWYnS5qm-gbpydBcLR1j7VfUA5OJ_O5wI_BYoHc-ea4NmW0HjpVFEkOK4pUR5b8xkeSTB77KWGoVhGpEhbmEd-Qufx8rxnxLhf_eI-WxJ6hgFzrX0FcGQqNZhyRXgalglK24l3bmtFhBIQCK0RuxKzgEo__yp7MvWkNBoUW60gsXqqEqmi5gx_FCjNfCzCa0o",
//	         "terms" : [
//	            {
//	               "offset" : 0,
//	               "value" : "Kapaswadi"
//	            },
//	            {
//	               "offset" : 11,
//	               "value" : "Mumbai Suburban"
//	            },
//	            {
//	               "offset" : 28,
//	               "value" : "Maharashtra"
//	            },
//	            {
//	               "offset" : 41,
//	               "value" : "India"
//	            }
//	         ],
//	         "types" : [ "neighborhood", "political", "geocode" ]
//	      },
//	      {
//	         "description" : "Kapadia Nagar, CST Road, Mumbai, Maharashtra, India",
//	         "id" : "4f03b132f50aa20b8c3936ba9ff2fcdd32f96049",
//	         "matched_substrings" : [
//	            {
//	               "length" : 4,
//	               "offset" : 0
//	            }
//	         ],
//	         "reference" : "CnRrAAAAPf3LNrU4eUN7vLUD-S63XQSM6gFcQKwp81koT6gMrHTErF2V5eHKo76Hyl1vel2-NgPDZEVzDqwMJESObuLYn42CQrlGIyfgP8Oibv6IJEocui1ty179Ps-lSraBo9-jRxm9YBaUh5S7O2S-ottiUBIQsyuw9MXr7LoomFXNGT8TPxoUzRSJDh_WTHjvx3oxdwOXXqpPkKQ",
//	         "terms" : [
//	            {
//	               "offset" : 0,
//	               "value" : "Kapadia Nagar"
//	            },
//	            {
//	               "offset" : 15,
//	               "value" : "CST Road"
//	            },
//	            {
//	               "offset" : 25,
//	               "value" : "Mumbai"
//	            },
//	            {
//	               "offset" : 33,
//	               "value" : "Maharashtra"
//	            },
//	            {
//	               "offset" : 46,
//	               "value" : "India"
//	            }
//	         ],
//	         "types" : [
//	            "bus_station",
//	            "bus_station",
//	            "transit_station",
//	            "establishment",
//	            "geocode"
//	         ]
//	      },
//	      {
//	         "description" : "Kapadia Nagar, Kurla, Maharashtra, India",
//	         "id" : "bff5dff52ffb5b66d48195ed69b92dd4461554d5",
//	         "matched_substrings" : [
//	            {
//	               "length" : 4,
//	               "offset" : 0
//	            }
//	         ],
//	         "reference" : "CnRhAAAASJzGQy1mztu8vMYq3GCsnAHo8H9RR01x19lES5JVhWzESsfIyrS4m-6roIevCfp3Yk9wLgEL8l4x_Y_2ad4wnHQXMK6kEI_nzx1PaeRcupcFt228LJlbrlOlMuHyJaaUe-_gvnyl1zXlNSEUm5KcfhIQDdYrLxrMheaJmbQOIGzvOhoUOez71OpktkvuvMcwEXL8oqpaybE",
//	         "terms" : [
//	            {
//	               "offset" : 0,
//	               "value" : "Kapadia Nagar"
//	            },
//	            {
//	               "offset" : 15,
//	               "value" : "Kurla"
//	            },
//	            {
//	               "offset" : 22,
//	               "value" : "Maharashtra"
//	            },
//	            {
//	               "offset" : 35,
//	               "value" : "India"
//	            }
//	         ],
//	         "types" : [
//	            "bus_station",
//	            "bus_station",
//	            "transit_station",
//	            "establishment",
//	            "geocode"
//	         ]
//	      },
//	      {
//	         "description" : "Kapadvanj, Gujarat, India",
//	         "id" : "bd0003b92f3aacf32ad4c09970ff923efbddfbe1",
//	         "matched_substrings" : [
//	            {
//	               "length" : 4,
//	               "offset" : 0
//	            }
//	         ],
//	         "reference" : "CmRbAAAAgbGouwwQld0o4iroGQ48FoKsxp9FOyhZOyWG5ky1X8KxM9MNNdx3d8uXegB8LEL5dOKigifU05Fqp3HHrAYVMdm46ds9sKXJyJgPk6N6M4tcODOImBb_rwXtHpqwkWGIEhBp7WB81HHU3FIt7FaXoWFeGhQIxzgv_n1-Mrk1W8cV-9A9dhrSqA",
//	         "terms" : [
//	            {
//	               "offset" : 0,
//	               "value" : "Kapadvanj"
//	            },
//	            {
//	               "offset" : 11,
//	               "value" : "Gujarat"
//	            },
//	            {
//	               "offset" : 20,
//	               "value" : "India"
//	            }
//	         ],
//	         "types" : [ "locality", "political", "geocode" ]
//	      },
//	      {
//	         "description" : "Kapashera, New Delhi, Delhi, India",
//	         "id" : "448a563a5e20ff81e8d5bd2ff08843750b955b6e",
//	         "matched_substrings" : [
//	            {
//	               "length" : 4,
//	               "offset" : 0
//	            }
//	         ],
//	         "reference" : "CnRkAAAAQU51B-_Oev6kjzM6Q21xQZ7NI4I3wFmLqkDPD2-Kx2E5rO0T2kg_A04Jw6VMSnTh4zg03rxj059VpZWxBaNkHy1b_wk6U1wIVN_AxztB3JE7geZZdLIARExlsJ-1kL6BVasVXUvIp1Toz2TJk8rg5xIQUuSQTuFMhAyl5V7tJCEToxoUCSmiRJNVa6p_wMGCKBg0J-Qx1F0",
//	         "terms" : [
//	            {
//	               "offset" : 0,
//	               "value" : "Kapashera"
//	            },
//	            {
//	               "offset" : 11,
//	               "value" : "New Delhi"
//	            },
//	            {
//	               "offset" : 22,
//	               "value" : "Delhi"
//	            },
//	            {
//	               "offset" : 29,
//	               "value" : "India"
//	            }
//	         ],
//	         "types" : [ "sublocality", "political", "geocode" ]
//	      }
//	   ],
//	   "status" : "OK"
//	}