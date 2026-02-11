# TAGLINE

Qt-based audio player with Winamp skins

# TLDR

**Open qmmp**

```qmmp```

**Play files**

```qmmp [file1.mp3] [file2.ogg]```

**Enqueue files**

```qmmp --enqueue [files]```

**Play and exit**

```qmmp --play [file.mp3]```

**Pause playback**

```qmmp --pause```

**Stop playback**

```qmmp --stop```

**Next track**

```qmmp --next```

# SYNOPSIS

**qmmp** [_options_] [_files_]

# PARAMETERS

**--enqueue**
> Add to queue.

**--play**
> Start playback.

**--pause**
> Pause playback.

**--stop**
> Stop playback.

**--next**
> Next track.

**--previous**
> Previous track.

**--toggle-visibility**
> Show/hide window.

**--volume-up**
> Increase volume.

**--volume-down**
> Decrease volume.

# DESCRIPTION

**Qmmp** is a Qt-based audio player. Its interface resembles Winamp/XMMS classic skins.

Multiple audio formats are supported including MP3, FLAC, OGG, and APE. Plugin architecture extends capabilities.

Winamp skins provide customization. Classic 2.x skins work directly.

Visualization plugins show audio analysis. Spectrum analyzers and oscilloscopes included.

Queue management handles playlists. Shuffle, repeat, and sorting options available.

# CAVEATS

Qt dependencies required. Some skins may not work. Plugin availability varies.

# HISTORY

**Qmmp** started as a Qt-based alternative to XMMS and Audacious. It preserves the classic Winamp interface style in a modern media player.

# SEE ALSO

[audacious](/man/audacious)(1), [mpv](/man/mpv)(1), [vlc](/man/vlc)(1), [cmus](/man/cmus)(1)
