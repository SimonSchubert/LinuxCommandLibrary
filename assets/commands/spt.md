# TAGLINE

Terminal UI client for Spotify

# TLDR

**Open** the interactive UI

```spt```

**Play** a playlist by name

```spt play --name "[Playlist]" --playlist```

**Toggle** playback

```spt playback --toggle```

**Search** tracks

```spt search "[query]" --tracks```

**Print** shell completions

```spt --completions [zsh]```

# SYNOPSIS

**spt** [*options*] [*command*]

# DESCRIPTION

**spt** is the binary name for **spotify-tui**, a Rust terminal client for Spotify. With no arguments it opens a multi-pane TUI (press **?** for keys). It also exposes a CLI for play/pause, search, library listing, and completions without entering the UI.

Requires Spotify API credentials (client id/secret) configured on first run; config lives under **~/.config/spotify-tui/** (**config.yml** for UI, client credentials file for auth).

# PARAMETERS

**spt**

> Launch the TUI.

**play** **--name** *title* **--track**|**--playlist**|**--album**|**--artist** [**--random**]

> Start playback matching a name.

**playback** [**--toggle**] [**--like**] [**--shuffle**] ...

> Control the active player.

**list** [**--liked**] [**--limit** *n*]

> List library items.

**search** *query* **--tracks**|**--playlists**|... [**--format** *fmt*] [**--limit** *n*]

> Search the catalog.

**--completions** *shell*

> Emit completion script.

# CONFIGURATION

**~/.config/spotify-tui/config.yml** controls theme colors, seek step, volume increment, and related UI behavior. Authentication tokens are stored separately after the OAuth device/browser flow.

# CAVEATS

Spotify has repeatedly restricted third-party API access; features may break without upstream updates. A Premium account is required for many playback controls. Official maintenance status has varied—check the GitHub repo before relying on it.

# INSTALL

```aur: yay -S spt```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[spotify](/man/spotify)(1), [ncspot](/man/ncspot)(1), [playerctl](/man/playerctl)(1)

# RESOURCES

```[Source code](https://github.com/Rigellute/spotify-tui)```

<!-- verified: 2026-07-19 -->
