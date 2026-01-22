# TLDR

**Start ncspot**

```ncspot```

**Search for music**

```ncspot -s "[search query]"```

**Play specific URI**

```ncspot play [spotify:track:...]```

# SYNOPSIS

**ncspot** [_options_]

# PARAMETERS

**-s** _QUERY_
> Search for music.

**play** _URI_
> Play Spotify URI.

**--help**
> Display help information.

# DESCRIPTION

**ncspot** is a terminal Spotify client. It plays music through the Spotify API.

The tool provides ncurses interface. Lightweight alternative to official client.

ncspot is terminal Spotify player.

# CAVEATS

Requires Spotify Premium. Rust-based. Configuration in ~/.config/ncspot.

# HISTORY

ncspot was created as a **lightweight terminal** Spotify client written in Rust using librespot.

# SEE ALSO

[spotify_player](/man/spotify_player)(1), [cmus](/man/cmus)(1), [mpd](/man/mpd)(1)

