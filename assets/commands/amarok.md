# TLDR

**Start** Amarok

```amarok```

Open with **specific file**

```amarok [music.mp3]```

**Enqueue** files to current playlist

```amarok --enqueue [file1.mp3] [file2.mp3]```

**Play/Pause** currently playing track

```amarok --play-pause```

**Skip** to next track

```amarok --next```

Show **previous** track

```amarok --previous```

# SYNOPSIS

**amarok** [_options_] [_files_|_urls_]

# DESCRIPTION

**amarok** is a powerful music player for Linux/KDE with support for many audio formats, podcast management, and integration with online music services. It features a sophisticated collection manager, dynamic playlists, and extensive plugin support.

The player can scan your music library, fetch album art and lyrics, and provides scriptable interfaces for automation.

# PARAMETERS

**--play**
> Start playback

**--play-pause**
> Toggle play/pause

**--pause**
> Pause playback

**--stop**
> Stop playback

**--next**
> Skip to next track

**--previous**
> Go to previous track

**--enqueue** _files_
> Add files to playlist without playing

**--append** _files_
> Append files to playlist

**--load** _files_
> Load and replace playlist

**-s**, **--stop-after-current**
> Stop after current track

**--volume** _percent_
> Set volume level

**--engine** _engine_
> Use specific audio engine

# CAVEATS

Heavy on system resources compared to simpler players. Some features require KDE frameworks. Plugin compatibility varies with version.

# HISTORY

**Amarok** was first released in **2003** as a KDE music player. Version 2.0 in 2008 brought a major rewrite. It was one of the most feature-rich Linux music players, though development has slowed in recent years.

# SEE ALSO

[vlc](/man/vlc)(1), [rhythmbox](/man/rhythmbox)(1), [clementine](/man/clementine)(1)
