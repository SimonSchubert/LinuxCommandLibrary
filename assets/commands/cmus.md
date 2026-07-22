# TAGLINE

small, fast console music player

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

# PARAMETERS

**--listen** _ADDR_
> Listen on a UNIX socket or _host:port_ instead of the default location for **cmus-remote**

**--plugins**
> List available input/output plugins and exit

**--show-cursor**
> Always show the cursor (useful for screen readers)

**--help**
> Display usage information and exit

**--version**
> Display version information and exit

# DESCRIPTION

**cmus** is a small, fast, and powerful console music player for Unix-like systems. It supports a wide range of audio formats including Ogg Vorbis, MP3, FLAC, Opus, Musepack, WavPack, WAV, AAC, and MP4 through its plugin-based codec system.

The interface provides seven views accessed via number keys 1-7: library (artist/album tree), sorted library (flat list), playlist, play queue, directory browser, filters, and settings. Navigation uses arrow keys and Enter to select, with vi-style keybindings available throughout.

cmus features gapless playback, ReplayGain support, and can be controlled remotely via the **cmus-remote** command or its socket interface, making it suitable for integration with window managers and status bars.

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

**1-7**
> Switch views (library, sorted, playlist, queue, browser, filters, settings)

**q**
> Quit

**:add** _path_
> Add files to library

**/**_query_
> Search

# CONFIGURATION

**~/.config/cmus/autosave**
> Automatically saved settings, library state, and playback position on exit.

**~/.config/cmus/rc**
> Startup commands executed when cmus launches (keybindings, settings, colors).

# CAVEATS

Terminal-based, requires a capable terminal emulator. Audio output depends on available backends (ALSA, PulseAudio, etc.). Some formats may require additional codec libraries.

# INSTALL

```apt: sudo apt install cmus```

```pacman: sudo pacman -S cmus```

```apk: sudo apk add cmus```

```zypper: sudo zypper install cmus```

```brew: brew install cmus```

```nix: nix profile install nixpkgs#cmus```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cmus-remote](/man/cmus-remote)(1), [ncmpcpp](/man/ncmpcpp)(1), [mpd](/man/mpd)(1)
