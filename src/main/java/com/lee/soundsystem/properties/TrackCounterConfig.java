package com.lee.soundsystem.properties;

import com.lee.soundsystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd=new BlankDisc();
        cd.setTitle("this is title");
        cd.setArtist("this is artist");
        List<String> tracks=new ArrayList<>();
        tracks.add("1 d");
        tracks.add("2 d");
        tracks.add("3 d");
        tracks.add("4 d");
        //..更多磁道
        cd.setTracks(tracks);
        return cd;
    }
    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }

}
