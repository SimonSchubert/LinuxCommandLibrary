# TLDR

**Start** Banshee music player

```banshee```

**Play** specific file

```banshee [music.mp3]```

**Import** media

```banshee --import [/path/to/music]```

# SYNOPSIS

**banshee** [_options_] [_files_]

# DESCRIPTION

**banshee** is a cross-platform music player and media management application for Linux. It supports audio and video playback, library management, podcasts, Internet radio, and syncing with portable media devices.

The application uses Mono and GTK+ to provide a feature-rich media experience.

# PARAMETERS

**--import** _path_
> Import media from directory

**--play**
> Start playback

**--pause**
> Pause playback

**--next**
> Skip to next track

**--previous**
> Previous track

**--volume** _level_
> Set volume (0-100)

**--show-import-media**
> Show import dialog

# FEATURES

- Music library management
- Smart playlists
- Podcast subscriptions
- Internet radio
- iPod/Android sync
- Album artwork
- Last.fm scrobbling
- Extensions support

# CAVEATS

Development slowed significantly. Many distributions no longer package it. Mono dependency can be large. Some hardware sync features may not work. Consider alternatives like Rhythmbox or Clementine.

# HISTORY

**Banshee** was created by Aaron Bockover in **2005** and became GNOME's default music player for several years before being replaced by GNOME Music.

# SEE ALSO

[rhythmbox](/man/rhythmbox)(1), [clementine](/man/clementine)(1), [audacious](/man/audacious)(1)
