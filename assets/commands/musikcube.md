# TAGLINE

Cross-platform terminal-based music player and server

# TLDR

**Launch the music player**

```musikcube```

**Start the audio server** in headless mode

```musikcubed```

# SYNOPSIS

**musikcube** [_options_]

**musikcubed** [_options_]

# DESCRIPTION

**musikcube** is a fully functional terminal-based music player, library manager, and streaming audio server. It runs natively on Windows, macOS, and Linux and provides a TUI for browsing and playing your music library.

The companion daemon **musikcubed** runs as a headless audio server that can stream music to remote musikcube clients. The library automatically indexes and organizes music files with metadata.

# CAVEATS

Requires audio output support on the system. Library indexing may take time for large collections.

# HISTORY

**musikcube** was created by **clangen** and is written in **C++**.

# SEE ALSO

[cmus](/man/cmus)(1), [mpd](/man/mpd)(1), [ncmpcpp](/man/ncmpcpp)(1)
