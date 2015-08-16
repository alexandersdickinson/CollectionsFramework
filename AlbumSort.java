public class AlbumSort{
	
	public static void main(String[] args){
		List<Album> favs = new ArrayList<>();
		for(int i; i < 25; i++){
			StringBuilder randName = new StringBuilder();
			for(int j = 0; j < 5; j++){
				randName.append((char)((int)(Math.random()*26) + 'A'));
			}
			boolean isFave;
			if Math.random() * 2 == 0
				isFave = true;
			else
				isFave = false;
			trackCount = (int)(Math.random() * 5) + 5;
			Track[] randTrackList = new Track[trackCount];
			for(int i = 0; i < trackCount; i++){
				randTrackList[i] = new Track(((int)Math.random() * 5) + 1);
			}
		}
		
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
		
	}
	
	private static class Track{
		
		private final int[] SCALE = [1, 2, 3, 4, 5];
		private int rating;
		
		public Track(int rating){
			boolean onScale = false;
			for(int i:SCALE){
				if(i != rating)
					throw new IllegalArgumentException();
			}
			this.rating = rating;
		}
		
	}
	
}