package teams.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

import teams.Student;
import teams.Team;

class TeamsTest {

	@Test
	void test() {
		Student alice = new Student();
		assertEquals(null, alice.getTeam());
		
		Team team1 = new Team();
		assertEquals(Set.of(), team1.getStudents());
		
		alice.joinTeam(team1);
		assertEquals(team1, alice.getTeam());
		assertEquals(Set.of(alice), team1.getStudents());
		
		Student ben = new Student();
		ben.joinTeam(team1);
		assertEquals(Set.of(alice, ben), team1.getStudents());
		
		alice.leaveTeam();
		assertEquals(null, alice.getTeam());
		assertEquals(Set.of(ben), team1.getStudents());
	}

}
