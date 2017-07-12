import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import gtv.jar.latestmovies.LatestMovies;
import gtv.jar.latestmovies.Movie;

public class Test {

	public static void main(String[] args) {
		String content = "";
		try {
			content = new String(Files.readAllBytes(Paths.get("content.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<Movie> list = LatestMovies.getMovies(content);
		for (Movie m : list) {
			System.err.println(m.getMovieName());
			Set<String> set = m.getMap().keySet();
			for (String s : set) {
				System.err.println(s + "  " + m.getMap().get(s));
			}
			System.err.println("==========================================");
		}

	}

}
