# TAGLINE

Cross-platform terminal-based music player and server

# TLDR

**Launch the music player TUI**

```musikcube```

**Start the headless audio server daemon**

```musikcubed```

# SYNOPSIS

**musikcube**

**musikcubed**

# DESCRIPTION

**musikcube** is a fully functional terminal-based music player, library manager, and streaming audio server written in C++. It runs natively on Windows, macOS, and Linux and provides a TUI for browsing and playing your music library.

The companion daemon **musikcubed** runs as a headless audio server that can stream music to remote musikcube clients. The library automatically indexes and organizes music files with metadata.

The interface is keyboard-driven. Press **ESC** to enter command mode, **Ctrl+D** to quit, and **Alt+Enter** to open context menus. Keyboard shortcuts can be customized by editing **~/.musikcube/hotkeys.json**.

# CAVEATS

Requires audio output support on the system. Library indexing may take time for large collections. The application is primarily interactive and does not accept traditional command-line arguments.

# HISTORY

**musikcube** was created by **clangen** as an open-source, cross-platform terminal music player.

# SEE ALSO

[cmus](/man/cmus)(1), [mpd](/man/mpd)(1), [ncmpcpp](/man/ncmpcpp)(1), [mocp](/man/mocp)(1), [termusic](/man/termusic)(1)
