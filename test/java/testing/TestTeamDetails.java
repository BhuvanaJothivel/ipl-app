package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.TeamDetails;

public class TestTeamDetails {
	TeamDetails td = new TeamDetails();
	@Test
	public void testSetInputsMethod() {
		td.setTeamName("SRH");
		td.setScore(178);
		td.setTopScorer("Shreevats Goswami");
		td.setNoOfFours(13);
		td.setNoOfSixes(10);		
		assertEquals("SRH", td.getTeamName());
		assertEquals(10, td.getNoOfSixes());
		try {
			td.setTeamName(null);
			td.setScore(0);
			td.setScore(-10);
			td.setTopScorer(null);
			td.setNoOfFours(0);
			td.setNoOfSixes(0);
			td.setNoOfFours(-10);
			td.setNoOfSixes(-10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
