# TAGLINE

TUI podcast client for the terminal

# TLDR

**Launch** the podcast client interactively

```castero```

**Import** podcast subscriptions from an OPML file

```castero --import [path/to/subscriptions.opml]```

**Export** current subscriptions to an OPML file

```castero --export [path/to/feeds.opml]```

**Show version** information

```castero --version```

# SYNOPSIS

**castero** [**-h**] [**-V**] [**--import** _PATH_] [**--export** _PATH_]

# PARAMETERS

**-h**, **--help**
> Show help message and exit.

**-V**, **--version**
> Display version information and exit.

**--import** _PATH_
> Path to an OPML file of feeds to import; adds subscriptions and exits.

**--export** _PATH_
> Path to save current feeds as an OPML file; exports and exits.

# DESCRIPTION

**castero** is a terminal-based podcast client that lets users subscribe to RSS podcast feeds, browse episodes, download them for offline playback, and play them directly from the terminal. It uses a curses-based TUI with multiple switchable layouts. Playback is delegated to either **VLC** or **mpv** as an external media player backend.

Key capabilities include adding, deleting, and reloading podcast feeds, queuing episodes for playback, adjusting volume and playback speed, seeking within episodes, marking episodes as played or unplayed, and filtering or searching within feeds. Subscriptions can be imported and exported via OPML for portability between podcast clients.

# KEY BINDINGS

```
h    Help              a    Add feed
q    Exit              d    Delete feed
r    Reload all        R    Reload selected
Enter  Play episode    Space  Add to queue
c    Clear queue       n    Next in queue
p/k  Pause/play        f/l  Seek forward
b/j  Seek backward     =/−  Volume up/down
]/[  Speed up/down     m    Mark played
s    Save offline      x    Delete download
/    Filter/search     1-5  Switch layout
```

# CONFIGURATION

Configuration stored at **~/.config/castero/castero.conf** (created on first run). User data and downloads stored at **~/.local/share/castero/**.

Notable options include **player** (mpv or vlc), **default_layout** (1-5), **default_playback_speed**, **default_volume** (0-100), **seek_distance_forward/backward** in seconds, **reload_on_start**, **custom_download_dir**, and proxy settings (**proxy_http**, **proxy_https**). All keybindings and colors are customizable.

# CAVEATS

Requires an external media player (**VLC** or **mpv**) to be installed for audio playback. Python 3.5+ and SQLite3 are required. The project has not seen new releases since 2022 and may not be actively maintained.

# HISTORY

**castero** was created by **Jake Robertson** and first released in **April 2018**. Major milestones include episode downloading (v0.2.0, 2018), mpv backend support (v0.4.0, 2019), SQLite database and played/unplayed tracking (v0.5.0, 2019), and OPML import/export (v0.6.0, 2019). The latest release is v0.9.5.

# SEE ALSO

[mpv](/man/mpv)(1), [vlc](/man/vlc)(1), [newsboat](/man/newsboat)(1), [cmus](/man/cmus)(1)
