package com.lee.soundsystem.properties;
import org.springframework.beans.factory.annotation.Autowired;

import com.lee.soundsystem.CompactDisc;
import com.lee.soundsystem.MediaPlayer;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
