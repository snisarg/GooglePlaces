package org.snisarg.googleapi.tests;

import org.snisarg.googleapi.GooglePlaces;
import org.snisarg.googleapi.model.details.Address_components;
import org.snisarg.googleapi.model.details.DetailsWrapper;
import org.snisarg.googleapi.query.DetailsQuery;

public class TestDetails {

	public static void main(String[] args) {
		GooglePlaces gp = new GooglePlaces("Your key here");
		DetailsWrapper dw = gp.query(new DetailsQuery("CmRYAAAAciqGsTRX1mXRvuXSH2ErwW-jCINE1aLiwP64MCWDN5vkXvXoQGPKldMfmdGyqWSpm7BEYCgDm-iv7Kc2PF7QA7brMAwBbAcqMr5i1f4PwTpaovIZjysCEZTry8Ez30wpEhCNCXpynextCld2EBsDkRKsGhSLayuRyFsex6JA6NPh9dyupoTH3g"));
		for( Address_components n : dw.getResult().getAddress_components()) {
			System.out.println(n.getShort_name());
		}
	}

}
