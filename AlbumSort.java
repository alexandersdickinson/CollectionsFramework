import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class AlbumSort{
	
	public static void main(String[] args){
		List<Album> albums = new ArrayList<>();
		List<Album> favs = new ArrayList<>();
		for(int i = 0; i < 25; i++){
			StringBuilder randNameBuilder = new StringBuilder();
			for(int j = 0; j < 5; j++){
				randNameBuilder.append((char)((int)(Math.random()*26) + 'A'));
			}
			String randName = randNameBuilder.toString();
			boolean isFave;
			if (Math.random() * 2 == 0)
				isFave = true;
			else
				isFave = false;
			int trackCount = (int)(Math.random() * 5) + 5;
			Track[] randTrackList = new Track[trackCount];
			for(int k = 0; k < trackCount; k++){
				randTrackList[k] = new Track(((int)Math.random() * 5) + 1);
			}
			albums.add(new Album(randName, randTrackList));
		}
		favs = albums.stream().filter(album -> {
			boolean isFav = false;
			for(int i = 0; i < album.tracks.length; i++){
				if (album.tracks[i].rating >= 4)
					isFav = true;
			}
			return isFav;}).sorted((a1, a2) -> a1.name.compareTo(a2.name)).collect(Collectors.toList());
			favs.stream().forEach(a -> System.out.println(a));
		// for (Album a : albums) {
// 		    boolean hasFavorite = false;
// 		    for (Track t : a.tracks) {
// 		        if (t.rating >= 4) {
// 		            hasFavorite = true;
// 		            break;
// 		        }
// 		    }
// 		    if (hasFavorite)
// 		        favs.add(a);
// 		}
// 		Collections.sort(favs, new Comparator<Album>() {
// 		                           public int compare(Album a1, Album a2) {
// 		                               return a1.name.compareTo(a2.name);
// 		                           }});
	}
	
	private static class Album{
		
		private String name;
		private Track[] tracks;
		
		public Album(String name, Track[] tracks){
			this.name = name;
			this.tracks = tracks;
		}
		
		private String getName(){
			return name;
		}
		
		public String toString(){
			return name;
		}
		
	}
	
	private static class Track{
		
		private final int[] SCALE = {1, 2, 3, 4, 5};
		private int rating;
		
		public Track(int rating){
			boolean onScale = false;
			for(int i:SCALE){
				if(i == rating){
					onScale = true;
					break;
				}
			}
			if(onScale == false)
				throw new IllegalArgumentException();
			this.rating = rating;
		}
		
	}
	
}