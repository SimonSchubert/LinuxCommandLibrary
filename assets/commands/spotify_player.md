# TAGLINE

Feature-rich Spotify client for the terminal

# TLDR

**Start** the player TUI

```spotify_player```

**CLI** playback helpers (see help)

```spotify_player [command] --help```

# SYNOPSIS

**spotify_player** [*command*] [*options*]

# DESCRIPTION

**spotify_player** is a Rust Spotify TUI with streaming, Spotify Connect control, lyrics, audio visualization, and media keys. The binary name uses an underscore. Install via **cargo install spotify_player** or distribution packages.

Requires Spotify authentication (OAuth / session). Many features need Spotify Premium for playback.

# PARAMETERS

Default invocation opens the TUI. Subcommands exist for non-interactive control—run **spotify_player --help**. Config lives under the XDG config directory (see upstream docs for **app.toml** / theme files).

# CAVEATS

Spotify API and ToS constraints apply; features break when Spotify changes APIs. Streaming quality and device limits depend on account type.

# SEE ALSO

[spt](/man/spt)(1), [ncspot](/man/ncspot)(1), [playerctl](/man/playerctl)(1)

# RESOURCES

```[Source code](https://github.com/aome510/spotify-player)```

<!-- verified: 2026-07-19 -->
