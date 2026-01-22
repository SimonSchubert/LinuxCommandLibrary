# TLDR

**Open** cmus in a specific directory

```cmus [path/to/directory]```

**Add** file or directory to library

```:add [path/to/file_or_directory]```

**Refresh** the metadata of songs in library

```:update-cache```

**Search** for songs, albums, or artists

```/[something]```

**Pause/unpause** current song

```c```

Toggle **shuffle** mode

```s```

**Quit** cmus

```q```

# SYNOPSIS

**cmus** [_options_] [_directory_]

# DESCRIPTION

**cmus** is a small, fast, and powerful console music player. It supports various audio formats and features a library view, playlist, play queue, and directory browser.

Navigation uses arrow keys, Enter to select, and number keys 1-8 to switch between views.

# KEYBINDINGS

**c**
> Pause/unpause playback

**s**
> Toggle shuffle

**r**
> Toggle repeat

**b**
> Next track

**z**
> Previous track

**1-8**
> Switch views (library, sorted, playlist, queue, browser, filters, settings)

**q**
> Quit

**:add** _path_
> Add files to library

**/**_query_
> Search

# CAVEATS

Terminal-based, requires a capable terminal emulator. Audio output depends on available backends (ALSA, PulseAudio, etc.). Some formats may require additional codec libraries.

# SEE ALSO

[cmus-remote](/man/cmus-remote)(1), [ncmpcpp](/man/ncmpcpp)(1), [mpd](/man/mpd)(1)
