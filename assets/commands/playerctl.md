# TLDR

**Toggle** play/pause

```playerctl play-pause```

Skip to **next** track

```playerctl next```

Go to **previous** track

```playerctl previous```

**List** all players

```playerctl -l```

Control **specific** player

```playerctl -p [player_name] [command]```

Control **all** players

```playerctl -a [command]```

Display **metadata**

```playerctl metadata -f "Now playing: {{artist}} - {{title}}"```

# SYNOPSIS

**playerctl** [**-p** _player_] [**-a**] [**-l**] _command_

# COMMANDS

**play-pause**
> Toggle playback

**play**
> Start playback

**pause**
> Pause playback

**stop**
> Stop playback

**next**
> Next track

**previous**
> Previous track

**position**
> Get or set position

**volume**
> Get or set volume

**status**
> Get playback status

**metadata**
> Get track metadata

# PARAMETERS

**-p, --player _player_**
> Target specific player

**-a, --all-players**
> Control all players

**-l, --list-all**
> List available players

**-f, --format _format_**
> Output format template

# DESCRIPTION

**playerctl** controls media players that implement the MPRIS D-Bus specification. It provides a unified command-line interface for controlling Spotify, VLC, Firefox, and many other media applications.

The tool is commonly used for keyboard shortcuts and scripts to control media playback without focusing the player window.

# CAVEATS

Requires MPRIS-compatible player. Some players have limited MPRIS support. Player must be running to be controlled. Metadata availability varies by player.

# HISTORY

**playerctl** was created by **Tony Crisci** to provide a simple, reliable way to control media players from scripts and keybindings. It's widely adopted in tiling window manager setups.

# SEE ALSO

[pactl](/man/pactl)(1), [mpc](/man/mpc)(1)
