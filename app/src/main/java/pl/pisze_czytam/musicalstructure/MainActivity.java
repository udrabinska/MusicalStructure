package pl.pisze_czytam.musicalstructure;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import pl.pisze_czytam.musicalstructure.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding bind;
    ArrayList<MusicItem> allSongs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main);

        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band, "Vicarious", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"Jambi", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"Wings for Marie (Pt 1)", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"10,000 Days (Wings Pt 2)", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"The Pot", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"Lipan Conjuring", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"Lost Keys (Blame Hofmann)", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"Rosetta Stoned", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"Intension", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"Right in Two", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.tool_10000days, R.drawable.tool_band,"Viginti Tres", "10,000 Days", "Tool"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"Menya zovut Shnur", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"May", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"Khuynya", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"Menedzher", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"Razpizdyay", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"K tebe begu", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"Zina", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"Khuyamba", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_dlya_milionov, R.drawable.leningrad_band,"Papa byl prav", "Dlya millionov", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_pirati_21_vek, R.drawable.leningrad_band,"WWW", "Piraty XXI veka", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_pirati_21_vek, R.drawable.leningrad_band,"U menya est vsyo", "Piraty XXI veka", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_pirati_21_vek, R.drawable.leningrad_band,"Novy god", "Piraty XXI veka", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_pirati_21_vek, R.drawable.leningrad_band,"Banany", "Piraty XXI veka", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.leningrad_pirati_21_vek, R.drawable.leningrad_band,"Bez tebya", "Piraty XXI veka", "Leningrad"));
        allSongs.add(new MusicItem(R.drawable.kult_ostateczny_krach, R.drawable.kult_band, "Goopya peezda", "Ostateczny krach systemu korporacji", "Kult"));
        allSongs.add(new MusicItem(R.drawable.kult_ostateczny_krach, R.drawable.kult_band,"Panie Waldku, pan się nie boi, czyli Lewy czerwcowy", "Ostateczny krach systemu korporacji", "Kult"));
        allSongs.add(new MusicItem(R.drawable.kult_ostateczny_krach, R.drawable.kult_band,"Gdy nie ma dzieci", "Ostateczny krach systemu korporacji", "Kult"));
        allSongs.add(new MusicItem(R.drawable.kult_ostateczny_krach, R.drawable.kult_band,"Dziewczyna bez zęba na przedzie", "Ostateczny krach systemu korporacji", "Kult"));
        allSongs.add(new MusicItem(R.drawable.kult_ostateczny_krach, R.drawable.kult_band,"Komu bije dzwon", "Ostateczny krach systemu korporacji", "Kult"));
        allSongs.add(new MusicItem(R.drawable.rammstein_band, R.drawable.rammstein_band,"Du riechst so gut", "Herzeleid", "Rammstein"));

        bind.playImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bind.playImage.setImageDrawable(getResources().getDrawable(R.drawable.button_play_purple));
                Intent playerIntent = new Intent(MainActivity.this, PlayerActivity.class);
                playerIntent.putExtra("clickedItem", getString(R.string.random_song));
                playerIntent.putExtra("flag", "oneSong");
                playerIntent.putParcelableArrayListExtra("allSongs", allSongs);
                startActivity(playerIntent);
            }
        });

        // intent with 2 Parcelable - 1st to operate in the next activity, 2nd to pass to the Player
        bind.songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bind.songsButton.setBackground(getResources().getDrawable(R.drawable.button_background_a_purple));
                bind.songsButton.setTextColor(getResources().getColor(R.color.textColor));
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                songsIntent.putParcelableArrayListExtra("songsToPick", allSongs);
                songsIntent.putParcelableArrayListExtra("allSongs", allSongs);
                startActivity(songsIntent);
            }
        });

        bind.artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bind.artistsButton.setBackground(getResources().getDrawable(R.drawable.button_background_b_purple));
                bind.artistsButton.setTextColor(getResources().getColor(R.color.textColor));
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                artistsIntent.putParcelableArrayListExtra("songsToPick", allSongs);
                artistsIntent.putParcelableArrayListExtra("allSongs", allSongs);
                startActivity(artistsIntent);
            }
        });

        bind.albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bind.albumsButton.setBackground(getResources().getDrawable(R.drawable.button_background_c_purple));
                bind.albumsButton.setTextColor(getResources().getColor(R.color.textColor));
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                albumsIntent.putParcelableArrayListExtra("songsToPick", allSongs);
                albumsIntent.putParcelableArrayListExtra("allSongs", allSongs);
                startActivity(albumsIntent);
            }
        });
    }
}
