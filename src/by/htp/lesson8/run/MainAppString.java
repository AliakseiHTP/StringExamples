package by.htp.lesson8.run;

public class MainAppString {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = "abc";
		String s2 = s1 + "def";
		String s3 = s2.replace('e', 'g');
		String s4 = new String("abc");

		String s5 = new String("Hello world");

		String s41 = s4.intern();
		String s42 = "abc";

		String s51 = s5.intern();
		String s52 = "Hello world";
		String s53 = new String("Hello world");
		String s54 = "Hello world";

		StringBuilder strB = new StringBuilder("qwerty");
		strB = strB.append(25);
		System.out.println(strB);

		User user1 = new User(1, "Lesha");
		User user2 = new User(1, "Lesha");
		System.out.println(user1);
		System.out.println(user1.equals(user2));

	}

}

class User {
	private int id;
	private String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
