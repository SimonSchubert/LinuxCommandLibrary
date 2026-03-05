# TAGLINE

Neofetch-style music info display for the terminal

# TLDR

**Show current track info**

```mufetch```

**Search for a track**

```mufetch search -t "[track name]"```

**Search for an artist**

```mufetch search -a "[artist name]"```

# SYNOPSIS

**mufetch** [_command_] [_options_]

# DESCRIPTION

**mufetch** is a CLI tool that displays music metadata in your terminal, inspired by neofetch's design aesthetic. It shows track details, album information, and artist metadata with album artwork and artist photos rendered directly in the terminal.

Features include duration, popularity, genres, and follower count metrics, clickable Spotify links, search commands with type filtering (track, album, artist), and adaptive image resizing for terminal display.

# CAVEATS

Requires Spotify API credentials for music data. Image display depends on terminal capabilities.

# HISTORY

**mufetch** was created by **Ashish Kumar** (ashish0kumar) and is written in **Go**.

# SEE ALSO

[neofetch](/man/neofetch)(1), [spotify-tui](/man/spotify-tui)(1)
