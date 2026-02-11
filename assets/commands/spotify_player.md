# TAGLINE

Terminal-based Spotify TUI client

# TLDR

**Start player**

```spotify_player```

**With config directory**

```spotify_player -C [~/.config/spotify-player]```

**Daemon mode**

```spotify_player -d```

**Verbose logging**

```spotify_player -v```

# SYNOPSIS

**spotify_player** [_-C dir_] [_-d_] [_options_]

# PARAMETERS

**-C** _DIR_
> Config directory.

**-d**
> Daemon mode.

**-v**
> Verbose output.

**--theme** _NAME_
> Color theme.

**--help**
> Show help.

# DESCRIPTION

**spotify_player** is a terminal-based Spotify client that provides a full-featured TUI (Text User Interface) for browsing, searching, and playing music from a Spotify Premium account. It uses vim-style keybindings and a modal interface for efficient keyboard-driven navigation.

The player supports Spotify Connect, allowing it to control playback on other devices or act as a playback target. Features include library browsing, playlist management, search, lyrics display, and artist/album exploration. A daemon mode enables headless operation for use as a Spotify Connect receiver.

Built on the **librespot** library for Spotify protocol support, it stores configuration and cache data in **~/.config/spotify-player/**. Custom themes and keybindings can be configured through TOML configuration files.

# CONFIGURATION

**~/.config/spotify-player/app.toml**
> Main configuration file controlling playback settings, keybindings, theme, default device, and UI layout.

**~/.config/spotify-player/theme.toml**
> Custom color theme definitions for the TUI interface.

**~/.cache/spotify-player/**
> Cache directory for audio data and Spotify session tokens.

# CAVEATS

Spotify Premium required. Authentication needed. librespot backend.

# HISTORY

**spotify_player** is a terminal-based Spotify client built on librespot, providing a TUI for Spotify Premium users.

# SEE ALSO

[spotifyd](/man/spotifyd)(1), [ncspot](/man/ncspot)(1), [cmus](/man/cmus)(1)
