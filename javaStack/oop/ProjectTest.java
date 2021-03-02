public class ProjectTest {
	public static void main(String[] args) {
		Project test = new Project();
		test.setName("New Project");
		test.setDescription("New Description");
		System.out.println(test.elevatorPitch());

		Project test2 = new Project("name", "description");
		System.out.println(test2.elevatorPitch());
	}
}