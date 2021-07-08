package rusha.x;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> rus = new ArrayList<>();
        List<Integer> zar = new ArrayList<>();
        Integer n = scanner.nextInt();

        Integer index = 0;
        while (index < n) {
            Integer rusTrack = scanner.nextInt();
            rus.add(rusTrack);
            index = index + 1;
        }

        index = 0;
        while (index < n) {
            Integer zarTrack = scanner.nextInt();
            zar.add(zarTrack);
            index = index + 1;
        }

        List<Integer> playlist = new ArrayList<>();

        index = 0;
        while (index < n) {
            Integer track = rus.get(index);
            playlist.add(track);

            Integer track2 = zar.get(index);
            playlist.add(track2);

            index = index + 1;
        }

        List<String> playlistStrings = new ArrayList<>();
        for (Integer playlistTrack : playlist) {
            playlistStrings.add(playlistTrack.toString());
        }
        String output = String.join(" ", playlistStrings);
        System.out.println(output);
    }
}
