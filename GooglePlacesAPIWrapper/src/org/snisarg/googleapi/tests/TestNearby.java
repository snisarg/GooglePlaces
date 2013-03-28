package org.snisarg.googleapi.tests;

import java.io.IOException;

import org.snisarg.googleapi.GooglePlaces;
import org.snisarg.googleapi.model.nearby.NearbyWrapper;
import org.snisarg.googleapi.model.nearby.Results;
import org.snisarg.googleapi.query.NearbyQuery;
import org.snisarg.googleapi.query.NearbyQuery.RankBy;

import com.google.gson.JsonSyntaxException;

public class TestNearby {

	public static void main(String[] args) {
		GooglePlaces gp = new GooglePlaces("Your key here");
		System.out.println("Hello!");
		NearbyWrapper nw;
		try {
			nw = gp.query(new NearbyQuery(19.1146857, 72.8310232).setRankby(RankBy.DISTANCE));
			for(Results n : nw.getResults()) {
				System.out.println(n.getName());
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
//	   "html_attributions" : [
//	      "Listings by \u003ca href=\"http://www.indiacom.com/\"\u003eIndiacom Yellow Pages\u003c/a\u003e",
//	      "Listings by \u003ca href=\"http://www.yellowpages.co.in/\"\u003eINFOMEDIA Yellow Pages\u003c/a\u003e"
//	   ],
//	   "next_page_token" : "ClRHAAAA4savx6zF3Lt426RCt6k1DppFU5O5lku5KflPYyG19PoSORdIYqzV1c60qiaazWa1GUyNk3iO_Ehb7j6htz5vvc5R_XRGzwBVoxtDmTypS9YSELumEjTMTdE1ALpI-IMlHlsaFKMhUT0rwqpEERKGux-DnVjjuJZX",
//	   "results" : [
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.11801560,
//	               "lng" : 72.82754570000002
//	            },
//	            "viewport" : {
//	               "northeast" : {
//	                  "lat" : 19.12060790,
//	                  "lng" : 72.82982729999999
//	               },
//	               "southwest" : {
//	                  "lat" : 19.11607650,
//	                  "lng" : 72.82536449999999
//	               }
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png",
//	         "id" : "5feceea2b9fb201290345a93234d1d316eec1e18",
//	         "name" : "Kapaswadi",
//	         "reference" : "CqQBmwAAAOABBKvscrH6nREgKXwFQYFirANbd9y-03xqCPLczbK2Kd4KLTGhfLqxkSfDQoC27I94ZvPO8NyyGdkiySulkH_y7xRF0Jw2A54lDziE0kaQ4P__mXwJeoPYBv5FBr5fz-YvjUvijJn1PSaCVLHriniVahwv5QLnUuf_DeLEu72GiYHEjHeqgqgX-l9p-3Tb9CHCqpTZJV9TfiRmVOPhco8SEFrmUmAwH5bnYDO3WoDjW6IaFHZNvz7xOJ0zUniTajtuERpGA0RI",
//	         "types" : [ "neighborhood", "political" ],
//	         "vicinity" : "Andheri West"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1130770,
//	               "lng" : 72.8262840
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png",
//	         "id" : "8eca1db9c4e5cf791d2dbbbed4be2c904bf4e11d",
//	         "name" : "Iskcon Temple",
//	         "opening_hours" : {
//	            "open_now" : true
//	         },
//	         "photos" : [
//	            {
//	               "height" : 3968,
//	               "html_attributions" : [ "From a Google User" ],
//	               "photo_reference" : "CnRnAAAAVKSZxr8jd36gFAcm3vA5VQopMV7tok_XWM_zqYsoOsduoel7cOe604U55BzkrMZq8DNYxC4XEdsnqy3-6Hqax_NgM1T-peEMLUN_PWCBGjafYV6-sL69ig8SE-a_LmQRlOkusxkIxpVz5D0RjOnPWBIQVO7BGnHS1DYtAkxe2USNExoUods0F43lUp9YHWah0IBTq2wIP4g",
//	               "width" : 2976
//	            }
//	         ],
//	         "rating" : 4.60,
//	         "reference" : "CnRqAAAAStaAQ6PMqZpR4AQC7fPE05f1pGHZ25DF7CGfojsluZZPCVy0gG6M03Btf-2Hed3SiTudgQ5xRnqfIp5DJsaDHZ5avEFBv8kpupG93XOuBO770wCR09z5WAPFBCWUE8dUSzThTzkGiLg7PITddAYGCBIQ9DSz1lx_-qNpUPknTNIsOxoUotFuMFwVQFmd4SJEIUWDp-oG1cc",
//	         "types" : [ "lodging", "hindu_temple", "place_of_worship", "establishment" ],
//	         "vicinity" : "Harekrishna Land, Near Chandan Cinema, Juhu, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1148420,
//	               "lng" : 72.8273780
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/movies-71.png",
//	         "id" : "4a3743d4bbf40c565a6fe1aa839579f706fe25b3",
//	         "name" : "PVR Juhu",
//	         "rating" : 4.30,
//	         "reference" : "CnRmAAAAqwajEBXY8YeugUwR9lkM_ptehsNSCjU2BPdHEPn-uIVlZMsc4dkYXp2QPsqUqBAY3HLob7KMs55sSFRMhcS7xd7L5Vw74DG7Hm8YVLDXnMv8wP8vHS768lxcN5OhLEBtkr7tfMCv_AQVMc4srhLa0hIQ6EEeFScPLt3TSvbgnWc-zhoUci2tZHidMqIYpn-1fKN6tGCqoWo",
//	         "types" : [ "movie_theater", "establishment" ],
//	         "vicinity" : "Dynamix Mall, 5th Floor, Above Shoppers Stop, Near Chandan Cinema, Parulekar Road, Juhu, Mumbai, Maharashtra 400049"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1130420,
//	               "lng" : 72.82625299999999
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/worship_hindu-71.png",
//	         "id" : "50cf99ec8a1172d02f282ad336be68c3399bc1f4",
//	         "name" : "Hare Rama Hare Krishna Temple - Iskcon",
//	         "photos" : [
//	            {
//	               "height" : 480,
//	               "html_attributions" : [ "From a Google User" ],
//	               "photo_reference" : "CnRoAAAAI2AY5QcFP3AbW2UYGvikcEmL_yjGyens-frP4pby0ZdnF6PNkB2TTdEDZ7We3WhSr2U8K24nVkUzWOulYGq6GUvYp1_8AJqTqx06qO5m-Md36mzA97P384Igb-LmTeWd1T0dFT_E8NFQWSp53Oi9FRIQeKOU0qQLRR7J_lzhJC6B9xoUuPabity4v-2uFkDH9eMMl-lpJwk",
//	               "width" : 552
//	            }
//	         ],
//	         "rating" : 4.80,
//	         "reference" : "CpQBgwAAAIu9XI4DUtDaIpeIgyQPVmY5vQHceayKZH0_V1_tUp7rjVkzj6AmVZqLt6tuYyc2HNFGS_W-T8MfgDuetxsHxN88pFjQsLDNR7CI8iyuFrIAKiYVuZfxVJumFoAN00JQU2d7DiQrHAEocJwuv0i73kZi5fDteUyh7RS1gvJWOjxL_a8WUa6du7A9qy92RIjgHhIQNnp-Qr5kkaa2xw1NIGPAwRoUzUWQUpIwDnM3Q8Vt3KHlsVe-qDw",
//	         "types" : [ "hindu_temple", "place_of_worship", "establishment" ],
//	         "vicinity" : "Harekrishna Land, Near Chandan Cinema, Juhu, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1155180,
//	               "lng" : 72.8352680
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "15c589b5215a154d43b178c58aa7126323c34f17",
//	         "name" : "Criticare Multispecialty Hospital and Research Center",
//	         "opening_hours" : {
//	            "open_now" : true
//	         },
//	         "photos" : [
//	            {
//	               "height" : 960,
//	               "html_attributions" : [ "From a Google User" ],
//	               "photo_reference" : "CrQBqQAAAMKQd0eka41GJTLqISHOjyNzmkdAJavkM5fAR9g8rDpCmFasOKOBBl5Fsg0Y_re_fCHnmkw1zgSwUds0tV7lJkOcHB-Z2keDI-36n5upc-aIRfDsOkJf8rUWeCh43RQC81QHN3FJA8zn3T43g95VmgJrHEsTE3GXh51bUQnxv1w5iZXfmbI7OiioQQ8m6fCB7Qi4C9ykQTmOhNb5CM-d8V3cgBpVzG8yhML2cX1iqHMWEhDVIJehAu_vWoRRCyKORzSPGhTYusUexpq7wpYuTuWOix-SBT6_sQ",
//	               "width" : 1280
//	            }
//	         ],
//	         "rating" : 3.20,
//	         "reference" : "CqQBlAAAAAZDlmp_DeJ7093O_gln1oM1eeqsSVO9RxWsk7E6nM3H7AHKf_0AAczf_LBYLc_W7MDjJ01bP2Hsz1tpO30QBJkJICkfKsnbeyHrIF-bo8fMnqi33L5c46AeUOCRDrIDX9VfwRuGoEo6c1M5c48u2x6i9qXlguUQXW6PNxMpGevGNFwHfO1ejSmEydFa1NmwiqLcAAGbQ3NJC-4b9srJtKASEBXKFs1AW2OwZvSZBfvBkSAaFKomX0XQpN_JgdKg8PTtIpX15mT3",
//	         "types" : [ "hospital", "health", "establishment" ],
//	         "vicinity" : "Plot No. 38/39, Main Gulmohar Rd., JVPD Scheme, Juhu, Andheri (W), Mumbai, Maharashtra, 400049"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1121830,
//	               "lng" : 72.828520
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "d3c54956c07fe0edeb4cc4a0c8a5a45335598665",
//	         "name" : "Utpal Sanghvi High School",
//	         "rating" : 4.30,
//	         "reference" : "CoQBdwAAACSSWSd_WDu2wjF5ddZvJRJeK_sW4GgXGZDmLW6RQJaUCFkXseFLO9mmpQZ4lLHSpTUuTbhM3NGiJf_dVCHB3U6uEBKjAA8dp0wnH_Pt0TgSiBMFQl24ZjV-q3Mwx8wl3W3lLTInALuq9RgqChxW5RhFMWtuGhtB0QwkFyZe03GcEhBmBN7GGJk0gMk_4nNWvoQBGhSZAIKYdDLMT2s1ufNZbFCFgKikgg",
//	         "types" : [ "school", "establishment" ],
//	         "vicinity" : "Juhu, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1118610,
//	               "lng" : 72.83213000000001
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/university-71.png",
//	         "id" : "c30876ca77c2963dbdee92383aebcc6a49f27066",
//	         "name" : "Kamla Raheja Vidyanidhi Insitute of Architecture and Environmental Studies",
//	         "rating" : 4.40,
//	         "reference" : "CrQBqQAAAAnI-dSA1hSHZ4KJ2Unknm4hd3MH_NpqBzW0xmet1EKZ6AkPFWlJjBtXbBHHeyjjGtqZZqp5HP71aq5T_035Neb4g6W8ZBN7gwowFbBXNxqjR81e2A-cXVys-NQjtoNzZB8TodWZfSdpaXAABsDwrMjVzhgZ3-TSn9lJwSvaAKVPh3JhkM4ayExx4kyuz3pOrZ_1nZ7rAJir8vHzYKv_rPtFTo0Go97dtUNn3OzvYfaNEhA5s_XSRxrZjpr_jMRuPGEhGhSGzboF80mEFGlnEhPoy6kXdo-Cvg",
//	         "types" : [ "university", "establishment" ],
//	         "vicinity" : "Gulmohar Road, Juhu, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1147850,
//	               "lng" : 72.8268490
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/movies-71.png",
//	         "id" : "005c9266cc7bedff97a5df0010de5924aca00d63",
//	         "name" : "Chandan Cinema",
//	         "rating" : 3.10,
//	         "reference" : "CnRsAAAAREEOR9fPmGMwueAxXUrfXLT1p1k_TBNmyvcnt4SBrclUIxJ1wkk74kKuKtrlt8lXskD_ff9FOb0N0-qaWLmFTM0AHXRk0SvkPYtE-URehPc-qSOoR8yu3RCrv_Uo5tSlb95fWQ_XVDZjWeWldqsyGxIQO9JO-ZhfP9oWkSbIqc76SRoUs2tnFAkAc1Tv06VGfKYD_8aB0oA",
//	         "types" : [ "movie_theater", "establishment" ],
//	         "vicinity" : "S Dnyaneshwar Marg, Near Iskcon Temple, Juhu, Mumbai, Maharashtra, 400049"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1146840,
//	               "lng" : 72.8274720
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "3ef055b93df922b9a17ae7f06ad919e4b28e75ed",
//	         "name" : "Shoppers Stop",
//	         "reference" : "CnRrAAAAA6coAURMIGZXQM6oUR4IwQO_H6RKUAMGmuL04zK-Ujc-hOdqwBFgR8CooD45GKQk9tsPz0MADkeMXt4Y2JshEdrJ1n2eihzAVxj-yWZx2Oxwcx5Y2rwRS4L8FdoNAEnxy4ZI6FV81qXGJ3I3Jr7fDxIQGuK2V4whRaDO3VFOZAwLqxoURMuEi5ehQtxN3YZFhZCR8dME7Tg",
//	         "types" : [ "shopping_mall", "establishment" ],
//	         "vicinity" : "Dynamix Mall, Sant Dhyaneshwar Marg, JVPD Scheme, Mumbai, MH"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1149550,
//	               "lng" : 72.8342840
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "0b1322670fab3724f6aee56dafee358f43579647",
//	         "name" : "Ecole Mondiale World School",
//	         "photos" : [
//	            {
//	               "height" : 1536,
//	               "html_attributions" : [ "From a Google User" ],
//	               "photo_reference" : "CqQBlAAAANG5_JQOhpAg88mHBxOj-fgzYCLaeYjRTTvN3YHsOqDhj4W-VjSSk-e7HNHCr5e4bqiiB2rha1Go0uGrefvb2ggUxMNIw0_4eIrWVNBKOoRrmmoP1by5RYxKkzQjfLFqNGBu1WY1vXseTpYk-uwKHwBbYaNRhtDYQnAJfTAAUxH1Szw57ikmjzacqy5OwX0GE5Da0hIcnlPEhLtuACWnIGoSEKAQGbNXaNHHOA27yFDiXyUaFLJfY8T8Vya5w3eF1eJULlBogOQu",
//	               "width" : 2048
//	            }
//	         ],
//	         "reference" : "CoQBeAAAAClT3aFSSeaXc1X5NCSap_Ktqgt9eDQYmSA5mfXlXLY3K6NPiUh7K8qUQHefmA8_D7RsiFukZCOhkathDIMGewRD4PRxKLJyM7rQHhW5uIBm4gfkxSCgNx7qLIoMyjxh92FAdAg1roP8flwc6kuRFkYGYWzZlWpXNQnkJ_gepCaWEhAKpz-z9gcw72IKhxQ6gR7yGhT5WNCHmdc8GiVKtVGXkbLDbzIxlA",
//	         "types" : [ "establishment" ],
//	         "vicinity" : "Gulmohar Cross, Road No. 9, JVPD Scheme, Juhu, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.11290,
//	               "lng" : 72.833980
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "b2a9ddfafeb0099b9db483d887c718c901edeb91",
//	         "name" : "Ecole Mondiale World School",
//	         "photos" : [
//	            {
//	               "height" : 786,
//	               "html_attributions" : [ "From a Google User" ],
//	               "photo_reference" : "CnRnAAAAIIO-bcgNuW9aVLp7sF09oDJ-kFTXCgPvRjjjS_cxu9QT3cSqcEGqkZZIMOWZ1s0zmxDuWmucGd0OVxktqpB-GM9aFKiMWBmWqHBHBkPJ1o2sdw6aHzr9tMp2ong2SqEXZP-KvJh4LB85dkCCGTDm6hIQw0uFvJnr6s6Xjv0lhBl9khoUCE4gn93pkw14tc665mBaOxi-3Uo",
//	               "width" : 1200
//	            }
//	         ],
//	         "reference" : "CoQBeQAAALkL19aa1tAjzdQ1kWmw3gdIHa_JuNSxkR9MndFP2Ba2Zfz4mlg9psUxh3ShM8Jcxv9pHOomgMeV3GcNY6LjSL5r8n3rnCKwStLDosT6zEsgWXWMC7CmLpozdxSi4Sgi1GE5HIjluotfyepRKli5XCi9uNbFdAJGAl2wXnwD-Pw2EhAB8Y8ZzstUSp6l8QQggRkhGhTu5oKYpeDF4lSzj8BeoDz4svRFvg",
//	         "types" : [ "school", "establishment" ],
//	         "vicinity" : "Gulmohar Cross Road Number 9, JVPD Scheme, Juhu, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1161510,
//	               "lng" : 72.8338950
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "2f1a521ee1095b6368a2863e046fae5fd0401cfe",
//	         "name" : "Sujay Hospital",
//	         "photos" : [
//	            {
//	               "height" : 127,
//	               "html_attributions" : [],
//	               "photo_reference" : "CnRqAAAAKD8WndFYEqWBmAhIqTbEcQcypL1dMK_9X-RYzfbAebEyayDcc3fJkJy8F_H5kypx80rLnqJizL124SHIZPCflJMpC61uTGbFL8UEUYrwYl1HQQS2G-0CF_aRoEQmR3Ez9EdiHSZEwNeVNsnMi2HCvBIQMD8Dzz4eEPax0T1dmd-AmxoUyMCqHEzPEklumv5TbC3ZPU2AS30",
//	               "width" : 162
//	            }
//	         ],
//	         "reference" : "CnRrAAAAC7X7oOy-6DzxnydYASG3Y3YrvOmxf_89rdojaJRV9B-RHjWV3FFPk3_wsFx21OzoubYy_QfnSIVcRotahVNO6qfPoFoTUzFvyKXZsj5TunrGQH1bjy1QaSSungKxTxBZR8dia90J2w_ZtmFiThKEpxIQVSxk8WWoXsG9iicnLLijGhoUUrpTAw4buqXgF8tSIRUGFQ0HKgc",
//	         "types" : [ "hospital", "health", "establishment" ],
//	         "vicinity" : "Gulmohar Park, Next To Talwalkars Gym, Gulmohar Road, Juhu Scheme, 25, CD Barfiwala Road, Andheri West, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1132080,
//	               "lng" : 72.82813299999999
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/electronics-71.png",
//	         "id" : "49a5fbb288118077a51fe10f3d5befdaf3e1cea1",
//	         "name" : "Croma",
//	         "opening_hours" : {
//	            "open_now" : true
//	         },
//	         "photos" : [
//	            {
//	               "height" : 1200,
//	               "html_attributions" : [ "From a Google User" ],
//	               "photo_reference" : "CnRqAAAAaM7dWDn1_veMlPYeqvMRa15P6BA0wTphFW7Ej7cLBsJ5jgNI-uFNmZD4cwCRSCiG9FceNoH4VBamgKAadUaZpz62V1pBcT9FGaS8-h_ogwBqbFr0jFngs6ZlA-aGz8e14PhE5x-jJjjCCvr2oK7YNhIQCS4V2kO7m9Rdg7-tZEwKeBoU5_1_T6PNv_MGuUq7znWu9ne1iVY",
//	               "width" : 1600
//	            }
//	         ],
//	         "rating" : 4.60,
//	         "reference" : "CnRjAAAAg5R3zsIEV0elqT9BmFab0Msmo-La6qXxlhs3KXJzlY32gimnbLosRivkm46J8ic7wwP8USH4v-gQfzy3g7pHzfpLoMzQsj87sB7nZThpS8GK45jbJGrucTygFwtdZfGtUdPWs2CzQBMsKOJFtSLdthIQY7cxUlHwf2juXR_SnoBT2RoU_kpDgv8aYKtWcZcUwq53pVmk0y0",
//	         "types" : [ "electronics_store", "store", "establishment" ],
//	         "vicinity" : "Ground Floor,Vasundhara CHS, Parulekar Road, Vile Parle West, Juhu, Mumbai, Maharashtra 400049"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1102610,
//	               "lng" : 72.82983900000001
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "910ada3ef7547a86b153b2208f8aa038f18da886",
//	         "name" : "Jean-Claude Biguine Juhu Mumbai",
//	         "opening_hours" : {
//	            "open_now" : true
//	         },
//	         "photos" : [
//	            {
//	               "height" : 1224,
//	               "html_attributions" : [ "From a Google User" ],
//	               "photo_reference" : "CpQBgwAAAIUBfCDdqqfzEGj3-FGvkpgweLWPyAqVdE3qhFo6mdH8megfdm1ouTh4VfA1rnJ2tXe0AC0R8CGE_b_bRgPKurmk4vk4i6uKWtEnjTnC2rCT5d5klmK2OWYtTEgOfSPH1dPtttjrK2tRqsK3kqxdsmfSa3RjwJkl8XJPgRaxt3-iiK_iX97n0ueyKHT4GRSMGRIQEU1wdu1lpOw1yAm1eUdsXxoUK8i_gGEka_ncsxedyuGOPLi_IVs",
//	               "width" : 1632
//	            }
//	         ],
//	         "reference" : "CoQBfQAAAG0wjdqyR99LdpRrkQF-4TzF3-GcAM7lly423W4Nu4HIVmyJLdewRN9k2RivJ-MVmDktZI5NC6UbsxVaMTjwFNWRsqNZ3xFu-c2CGPFzuVOgdOYgeurodcgsq72iPN0YT4lMj7kx6UsDTa-_hqi8tSUuJiJp-ipNejWCbq_TPpMjEhBnzrcJjixhiQYQY_zarLZ-GhRf5i9PfKhQSUCgmuXFofrMa5FM1w",
//	         "types" : [ "establishment" ],
//	         "vicinity" : "Ambika Bungalow, Plot 10, Jai Hind CHS,, Guru Nanak Rd, Juhu"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1162490,
//	               "lng" : 72.833530
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/fitness-71.png",
//	         "id" : "d8b7a9960607779cc14d822d68a3be65271ae570",
//	         "name" : "Talwalkars",
//	         "reference" : "CnRoAAAAlLU4eRT5uvVcoJA0or-d0Jg3dFPFatiJt0H4GDTwjqtpZ7IEYxGdQfZfDZJ0TJgvHNGu673VyiJLBsOebsnCUn-4Y7BQw4feZ6DGJSpt8QYTnWqV4htZzjMbGHQB16aJGUm5wmz5ca-64bGLTSCRZxIQkzIic1g1s3BQ4DnfEKiObBoUuUoO7vjGzvl1x7q8U6gnmcY0w10",
//	         "types" : [ "gym", "health", "establishment" ],
//	         "vicinity" : "Soni House, Opp Reliance Web World, 400049, Gulmohar Rd, Juhu, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1139290,
//	               "lng" : 72.8336570
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "b6d035d68e20ac28c5a9533bd71af938ea565f01",
//	         "name" : "Medico Remedies Pvt. Ltd.",
//	         "opening_hours" : {
//	            "open_now" : false
//	         },
//	         "photos" : [
//	            {
//	               "height" : 170,
//	               "html_attributions" : [],
//	               "photo_reference" : "CoQBgAAAAPT1zZaYXDMmaeiDp98m8mlzbcZhd6mlzW4QI_2xlWm6Z9ziZHCluf9ERUP_z4YPXqOr2xME7EKCX5VwmdYeA8Kw7S1ZtVI9iudj3m6oY7PmpV5bs2elAkUpHCI4rCFtlxpKQhMYq3RP2_j3HblJUQk1p14GgJOU8bx_-nT9ILfeEhD_RBPzUfUycEFYv7vv_vCxGhRigUSu-QI0CPWgMXBo5WARj4QiVQ",
//	               "width" : 190
//	            }
//	         ],
//	         "reference" : "CoQBdgAAADLW4ATuPZlmv8jABHjtqO5upZKTyFX3fgcBnNbx4CgjCpL7AzNcrbQepM6ELCjS9tIXjS1aWxm8sXMQkYbxLZd4zx5tWLqx3DItxUJyl6Oc9aH9nw51pViBdNUQR-K21ERz95ggsiOPAdm42OkBZjC3OuVnjJQIq-YQ3EqjS_bwEhDmbi9Cy93v5Idl2TpCoUy5GhQ0t1AeJ9gFUx702yDTORyV4E_enw",
//	         "types" : [ "establishment" ],
//	         "vicinity" : "50, Juhu Supreme Shopping Centre, Gulmohar Cross Road No. 9, Juhu, Mumbai, Maharashtra"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1153420,
//	               "lng" : 72.834130
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "902cfa370ed729920cfc0d599521776495213cbd",
//	         "name" : "Study Overseas",
//	         "reference" : "CnRrAAAApRsylG-GP1O2qhy781zzVYLS-WoIXgD_oxfc7vwDCgutCUImBEp1-jzv43CJfFISeDUZixAQHT5vhs5_DZhBE3MMCj_YWef3BUY15mmElzx-_5cpUmPQW5l7TSsG-sRaUCcXpAQPt_EHRrEhLuIALBIQuB88lK5tF2ozNHr24juSnhoUJfe6RMVfYQLoTG_ysDQ9sMj6Q_4",
//	         "types" : [ "establishment" ],
//	         "vicinity" : "4th floor, Saket, Gulmohar Road JVPD Scheme, Above HDFC Bank Vile Parle(W) Mumbai – 400 049 Maharashtra"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1138230,
//	               "lng" : 72.83558600000001
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png",
//	         "id" : "fca1568834fa83e5dd84363acb2a1d48f8ad99c9",
//	         "name" : "Mangii Ferra Restaurant",
//	         "reference" : "CoQBdQAAAM9hK3Yk1DiNwreidoBTrq7J9MyQCId_VZRTWDjrvSR-I__yuMTR7CQxnZZjBa46Rn-65ZmKOpnoE94PX4KVWbmyDc4eFdCWEiizFaT8cFxac3MqfuVPBR80YLHI3jEsLRs9PuZ2eljcao9gM1shs1WMIw4af7fFyOLBfa_7PqQxEhC7Yf7Fjz6oMUuPP96KXS9NGhRmcl1HXO4TPxmlUflsp6QI8NJYDA",
//	         "types" : [ "restaurant", "food", "establishment" ],
//	         "vicinity" : "Gulmohar Cross Road No. 7, Juhu Scheme, Vile Parle West, Mumbai"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.115310,
//	               "lng" : 72.8267160
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
//	         "id" : "a5434d0001f8572a0ee597e580d8b8c1ebb166e5",
//	         "name" : "Nature Cure Hospital",
//	         "reference" : "CoQBcgAAAPAEuXebA2cvZDLKgh9IAPnAc9yepiF3iA0KXt3ggj6LZqQI3q0pj9QZzNcGtDKtvZmxrnWEj7dwvFxwzsLbQ-2XKW5Ct76vg3Z3DKuzSHZMwNeJBiZeqzUp5ohQhwIEJGTxxflp46bYAY4tVAzVrwGOWhQGk592MQrEmCMTJRLwEhDwf-CNlvF6wA2sriNjZK98GhRBjzudPbXsuEyDKeHXi0Cag0WGlg",
//	         "types" : [ "hospital", "health", "establishment" ],
//	         "vicinity" : "Chandan Cinema, Sanat Dnyaneshwar Road, Opp. Shoppers stop, Vile parle , Juhu, Mumbai, Maharashtra 400049"
//	      },
//	      {
//	         "geometry" : {
//	            "location" : {
//	               "lat" : 19.1180570,
//	               "lng" : 72.82422210
//	            },
//	            "viewport" : {
//	               "northeast" : {
//	                  "lat" : 19.11970970,
//	                  "lng" : 72.82823189999999
//	               },
//	               "southwest" : {
//	                  "lat" : 19.11527250,
//	                  "lng" : 72.8213050
//	               }
//	            }
//	         },
//	         "icon" : "http://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png",
//	         "id" : "332c7ae8f64f0723ba17f8c9753639bfac0441ee",
//	         "name" : "Juhu Vile Parle Development Scheme",
//	         "reference" : "CrQBrAAAALXra1b0n3jSK5cksp8EDFTDQuYsToARJIZXJPtEwUN8PLbY6QOX9MLZk7u1e_mkkyzC93GHqX-Q0tVCYoy97ekVf_PgXF966QVek_auH9NlW7TOrFxMS4a00Ke4lyM3DjJu6ej3wMiAsZA4GPGWUh9dT52yU-1rUeiqNyhvU2oVF_wCyd0ZoJWb79XXlqyHGf7qsP0qDlxduj_9euCM-K5FoG_Q7Q4LN1XDWVnsHwuNEhAN47a0YN5w5tcR_3K2kpvKGhSUUAzIJIyq0QcU6FAQIIFBZPDuoQ",
//	         "types" : [ "neighborhood", "political" ],
//	         "vicinity" : "Juhu"
//	      }
//	   ],
//	   "status" : "OK"
//	}