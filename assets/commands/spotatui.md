# TAGLINE

Terminal music player for Spotify and other sources

# TLDR

**Open** the player

```spotatui```

**Play or pause** the current Spotify device

```spotatui playback --toggle```

**Show** what that device is playing

```spotatui pb --status```

**Skip** to the next Spotify track

```spotatui pb --next```

**Set** the device volume

```spotatui pb --volume [40]```

**Search** Spotify for tracks

```spotatui search --tracks "[query]"```

**Play** the first Spotify track matching a name

```spotatui play --track --name "[name]"```

**Play** a Spotify URI on a chosen device

```spotatui play --device "[device]" --uri spotify:track:[id]```

**Queue** a track instead of playing it now

```spotatui play --track --queue --name "[name]"```

**List** Spotify Connect devices

```spotatui list --devices```

Write a **listening recap** for the last 30 days

```spotatui history recap --period 30d -o [path]```

**Preview** a playlist sync

```spotatui sync --dry-run```

Play a **local file** as the player starts

```spotatui --play-file [path]```

Print **shell completions**

```spotatui --completions bash```

# SYNOPSIS

**spotatui** [_options_] [_command_]

# DESCRIPTION

**spotatui** is a terminal music player written in Rust. With no command it opens a full-screen interface. Press **?** inside the player for the key list, and **q** to go back or quit.

Spotify is optional. The same player can use local files, a Subsonic or Navidrome server, internet radio, YouTube, Qobuz, and, on macOS, Apple Music. Press **d** to switch source or pick a Spotify Connect device.

Spotify audio comes from one of three places: spotatui itself, registered as its own Connect device; the official Spotify app; or **spotifyd**. A Spotify login needs a Premium account. No developer client id is required. Local files, Subsonic, radio, YouTube, and Qobuz play through spotatui's own audio engine. Apple Music plays through the Music app.

**playback**, **play**, **search**, and **list** are separate Spotify commands. They use the cached login and do not need the full-screen player to be open. File, YouTube, Qobuz, Subsonic, radio, and Apple Music items play from inside the running player.

# PARAMETERS

**-c, --config** _PATH_

> Read this configuration file instead of the default.

**-t, --tick-rate** _MS_

> UI refresh interval in milliseconds. Animated views keep their own rate.

**--reconfigure-auth**

> Forget the cached Spotify login and sign in again.

**--play-file** _PATH_

> Play a local audio file on startup. Needs a build with the local-files feature. Release binaries include it.

**--completions** _SHELL_

> Print completions for **bash**, **zsh**, **fish**, **powershell**, or **elvish**. **power-shell** is accepted as an old spelling.

**--debug**

> Log at debug level, including the Spotify user id and playlist ids. **SPOTATUI_LOG=debug** does the same. **SPOTATUI_LOG=trace** also records API response bodies, which include the account country. Access tokens and request headers are not logged.

**-U, --no-update**

> Skip the startup update check on builds that include the updater. The check is also skipped when **SPOTATUI_SKIP_UPDATE** is set, or when **behavior.disable_auto_update** is true.

**--help**

> Show help. Add it after a command to show that command.

# PLAYBACK

**spotatui playback** (alias **pb**) controls a Spotify device. With no action it prints the current playback, and it prints the updated playback after every action. **--format** changes that line. The default is `%f %s %t - %a`.

Placeholders: **%a** artist, **%b** album, **%t** track, **%p** playlist, **%h** show, **%f** shuffle, repeat, and like flags, **%s** play or pause, **%v** volume, **%d** device, **%u** URI, **%r** progress.

**-d, --device** _DEVICE_

> Spotify device to use.

**-t, --toggle**

> Pause or resume.

**-s, --status**

> Print status. This is the default.

**-n, --next**

> Skip forward one track. Repeat the flag to skip further: `spotatui pb -nnn` skips three.

**-p, --previous**

> Once jumps to the start of the current track. Twice (`-pp`) goes to the previous track.

**--seek** _±SECONDS_

> `+10` seeks forward, `-10` seeks backward, and `10` seeks to that second of the track.

**-v, --volume** _0-100_

> Set the device volume.

**--shuffle**

> Toggle shuffle.

**--repeat**

> Cycle repeat modes.

**--like**

> Save the current track when Spotify allows it.

**--dislike**

> Remove that save.

**--transfer** _DEVICE_

> Move playback to another device.

**--share-track**

> Print the open.spotify.com URL of the current track. Use it alone.

**--share-album**

> Print the URL of its album. Use it alone.

**--next** and **--previous** stand alone. **--toggle**, **--status**, **--transfer**, **--volume**, **--like**, **--dislike**, **--shuffle**, and **--repeat** can be combined.

# PLAY

**spotatui play** (alias **p**) starts the first Spotify match, or a Spotify URI. The first hit plays with no confirmation prompt.

**-u, --uri** _URI_

> Play a `spotify:track:`, `spotify:album:`, `spotify:artist:`, `spotify:playlist:`, or `spotify:show:` URI. Web URLs and every other scheme are rejected.

**-n, --name** _NAME_

> Play the first hit of this name. Requires one of the type flags below.

**-t, --track**

> Search tracks.

**-b, --album**

> Search albums.

**-a, --artist**

> Search artists.

**-p, --playlist**

> Search playlists.

**-w, --show**

> Search shows.

**-q, --queue**

> Append a track to the queue instead of playing it. Tracks only.

**-r, --random**

> Play a random track from a playlist.

**-d, --device** _DEVICE_

> Target device.

**-f, --format** _FORMAT_

> Status line after the action. Same placeholders as **playback**. The default is `%f %s %t - %a`.

# SEARCH

**spotatui search** (alias **s**) searches Spotify. The query is a required positional argument, and exactly one type flag is required. **--limit** accepts 1 to 10.

```spotatui search --albums "[query]"```

**-t, --tracks**

> Search tracks. Default format `%t - %a (%u)`.

**-b, --albums**

> Search albums. Default format `%b - %a (%u)`.

**-a, --artists**

> Search artists. Default format `%a (%u)`.

**-p, --playlists**

> Search playlists. Default format `%p (%u)`.

**-w, --shows**

> Search shows. Default format `%h - %a (%u)`.

**-f, --format** _FORMAT_

> One line per hit. Same placeholders as **playback**.

**--limit** _N_

> Maximum number of results, from 1 to 10.

# LIST

**spotatui list** (alias **l**) prints Spotify devices, playlists, or liked songs. Exactly one of those flags is required. **--limit** accepts 1 to 50.

**--devices**

> List devices. Default format `%v% %d`.

**--playlists**

> List playlists. Default format `%p (%u)`.

**--liked**

> List liked songs. Default format `%t - %a (%u)`.

**--limit** _N_

> Maximum number of results, from 1 to 50.

**-f, --format** _FORMAT_

> One line per item.

# OTHER COMMANDS

**history recap**

> Write an HTML page from the local listening history. **--period** is `7d`, `30d` (the default), `month`, `year`, or `all`. **-o** sets the output path. The default file is `spotatui-recap.html` in the working directory.

**sync**

> Mirror playlists that were linked inside the player. Runs without probing for a Spotify device. **--link** _NAME_ limits the run to one master playlist name or id. **--dry-run** prints the changes and writes nothing.

**plugin**

> Install Lua plugins with git into the config directory. **add** takes `owner/repo` or a git URL, and **-f** reinstalls an existing copy. **list** (alias **ls**) shows what is installed. **update** refreshes every plugin, or the named one. **remove** (alias **rm**) deletes one. **new** scaffolds a plugin, and **-f** overwrites a directory of the same name. Restart the player after installing. Plugins load at startup and are not sandboxed.

**mcp**

> Speak the Model Context Protocol on stdin and stdout so a client can drive a running player. Bare `spotatui mcp` is the server and blocks, waiting for JSON-RPC. **mcp status** checks the setup and exits. **mcp status --json** prints JSON. The player must already be running with `behavior.mcp_enabled: true`.

**update**

> Check for a new release. **--install** downloads and installs it. Present on builds that include the updater, including the release binaries.

# KEYBINDINGS

Defaults. Rebind them under `keybindings` in the config file. Press **?** for the full list. The help menu hides actions the current source cannot perform.

**Space**

> Play or pause.

**n** / **p**

> Next track, or previous track. **P** forces the previous track and skips restoring the play position.

**<** / **>**

> Seek. The step is `behavior.seek_milliseconds` (default 5000).

**+** / **-**

> Volume, in steps of `behavior.volume_increment` (default 10).

**/**

> Search.

**d**

> Switch source or choose a playback device.

**z**

> Add the selected item to the queue. **Q** shows the queue. **x** removes an entry.

**F**

> Like or save the track.

**v**

> Audio visualization. **V** switches style and cannot be rebound.

**B**

> Lyrics. **T** opens the mini player. **G** opens cover art on builds that include it. Release binaries include cover art.

**Ctrl-s** / **Ctrl-r**

> Shuffle and repeat.

**j** **k** **h** **l**

> Move through lists. The arrow keys do the same.

**q**

> Back, or quit from the top screen.

**Alt-,**

> Open settings. On macOS the default is **Ctrl-,**. **Alt-s** saves them.

A few keys stay fixed: **,** opens the sort menu, **s** saves the selected track, **w** adds a track to a playlist, **{** **}** resize the sidebar, **(** **)** resize the playbar, and **|** resets the layout.

# CONFIGURATION

The file is `$XDG_CONFIG_HOME/spotatui/config.yml` when that variable is an absolute path, and `~/.config/spotatui/config.yml` otherwise. **--config** replaces it. Every field is optional.

Runtime state (volume, shuffle, active source, saved Spotify device, pane sizes, saved radio stations, and listening history) is `$XDG_STATE_HOME/spotatui/state.yml`, or `~/.local/state/spotatui/state.yml`. The Spotify login and the streaming audio cache live under `$XDG_CACHE_HOME/spotatui/`, or `~/.cache/spotatui/`.

A bad value usually logs a warning and falls back to the default. YAML that cannot be parsed stops startup. So do a few numbers outside their range, including `volume_increment` outside 0–100 and a tick rate outside 1–999 ms.

Each run writes a log at `spotatui_logs/spotatuilog` plus the process id, under the system temp directory. The path is printed at startup. A panic also writes `spotatui_panic.log` in the state directory.

```
behavior:
  enable_streaming: true
  streaming_device_name: spotatui
  streaming_bitrate: 320
  local_music_path: "[/path/to/Music]"
  seek_milliseconds: 5000
  volume_increment: 10
keybindings:
  toggle_playback: " "
  back: "q"
```

`streaming_bitrate` is 96, 160, or 320. A change to streaming settings applies after a restart. `enable_streaming` registers spotatui as a Connect device.

`local_music_path` is used as written. A leading `~` is not expanded. An empty string turns off the default music folder. Each directory that directly holds audio becomes a playlist. The scan goes eight levels deep, skips names that start with a dot, and reads MP3, FLAC, OGG, M4A, AAC, and WAV.

Subsonic uses `subsonic_url` (include `http://` or `https://`), `subsonic_username`, and `subsonic_password`. The password is stored in plaintext. `SPOTATUI_SUBSONIC_PASSWORD` overrides the file for a normal connection.

YouTube runs `yt-dlp` from `PATH`. Set `behavior.ytdlp_path` to call a binary by another path.

Qobuz signs in through the browser and stores the token in `qobuz_credentials.yml` next to the config file. `qobuz_quality` requests MP3 320 (`5`), FLAC 16/44.1 (`6`), FLAC 24/96 (`7`), or FLAC 24/192 (`27`). A track can arrive at a lower quality than requested.

`startup_route` opens one screen at launch: `home` (the default), `recently_played`, `podcasts`, `discover`, `artists`, `album_list`, or `stats`. An unknown value falls back to `home`.

# CAVEATS

The Spotify login refuses a free account. Premium is required for the Spotify source. Playback still needs native streaming, the official app, or spotifyd to produce the audio.

`play --uri` accepts only the five Spotify URI kinds listed above. `file:`, `youtube:`, `qobuz:`, `subsonic:`, `radio:`, and `applemusic:` URIs, and `https://open.spotify.com` links, are rejected there.

`cargo install --locked spotatui` leaves out local files, Subsonic, radio, YouTube, Qobuz, and Apple Music unless those Cargo features are turned on. The release binaries, the one-line installer, and `cargo binstall` include them. Apple Music exists only on macOS.

The system-wide visualizer reads a loopback of all system audio. Linux uses a PipeWire or PulseAudio monitor. macOS needs a virtual audio device set as the input. While a Spotify track plays, **v** opens Spotify's own pitch view, which needs no loopback.

A release build looks for an update at startup and can replace its own binary. **--no-update** skips that check.

Lua plugins run with the player's privileges, including the filesystem and the network. Installing one clones a git repository and runs its `main.lua` on the next start. There is no permission prompt.

**--debug** logs can contain a Spotify user id and playlist ids. Read the file before attaching it to a public report.

# HISTORY

spotatui is a community-maintained fork of **spotify-tui**, whose command is **spt**. The fork adds a built-in Spotify Connect client and playback from local files, Subsonic, internet radio, YouTube, Qobuz, and Apple Music on macOS. It is released under the MIT license. The GitHub repository was published in November 2025.

# INSTALL

```aur: yay -S spotatui```

```nix: nix profile install nixpkgs#spotatui```

<!-- packages: 2026-10-13 -->

# SEE ALSO

[ncspot](/man/ncspot)(1), [spotify_player](/man/spotify_player)(1), [spt](/man/spt)(1), [spotifyd](/man/spotifyd)(1), [cmus](/man/cmus)(1), [yt-dlp](/man/yt-dlp)(1)

# RESOURCES

```[Source code](https://github.com/LargeModGames/spotatui)```

```[Homepage](https://spotatui.com)```

```[Documentation](https://github.com/LargeModGames/spotatui/wiki)```

<!-- verified: 2026-10-13 -->
