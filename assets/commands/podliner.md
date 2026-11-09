# TAGLINE

Terminal podcast manager and player

# TLDR

**Launch the podcast player**

```podliner```

Use a specific **audio engine**

```podliner --engine [auto|vlc|mpv|ffplay]```

**Import feeds** from OPML, adding to the existing ones

```podliner --opml-import [feeds.opml] --import-mode add```

**Export feeds** to OPML

```podliner --opml-export [feeds.opml]```

Start in **offline mode**

```podliner --offline```

Start with a **search filter**

```podliner --search "[query]"```

# SYNOPSIS

**podliner** [_options_]

# PARAMETERS

**--engine** _ENGINE_
> Preferred audio engine: auto, vlc, mpv, ffplay or mediafoundation (Windows only).

**--theme** _THEME_
> UI theme, such as base, accent, native, user, light or auto.

**--feed** _URL_
> Preselect a feed at startup.

**--search** _QUERY_
> Apply a search filter at startup.

**--opml-import** _FILE_
> Import feeds from OPML.

**--import-mode** _MODE_
> OPML import behavior: add or replace.

**--opml-export** _FILE_
> Export current feeds to OPML.

**--offline**
> Start in offline mode with no network fetches.

**--ascii**
> Force ASCII glyphs.

**--log-level** _LEVEL_
> Logging level: debug, info, warn or error.

**--log-dir** _DIR_
> Directory for log files.

**--no-file-logs**
> Disable logging to files.

**-h**, **--help**
> Show help.

**-V**, **--version**
> Show the version.

# DESCRIPTION

**podliner** is a terminal-based podcast manager and player. It supports subscribing to podcasts, downloads, queue management, playback speed control, chapters, a sleep timer, gPodder API sync (gpodder.net and Nextcloud), MPRIS on Linux, and OPML import/export. Audio playback uses configurable engines including VLC, mpv, ffplay, Media Foundation, or a built-in MP3 engine. Navigation follows vim-style keybindings, with full mouse support.

Press **:** for the command line and type **:help** to see commands and keys, for example **:add** _url_, **:refresh**, **:sync** or **:q**.

# CONFIGURATION

**$XDG_CONFIG_HOME/podliner/appsettings.json**
> User preferences.

**$XDG_DATA_HOME/podliner/library/library.json**
> Feeds, episodes, queue and history.

# CAVEATS

Needs an interactive terminal; only **--version** and **--help** work with redirected output. Needs an audio engine such as mpv, VLC or ffplay on Linux. ffplay is a fallback with coarse seeking and no live speed or volume control.

# HISTORY

**podliner** was created by **Tim Kicker** (timkicker) and is written in **C#**.

# SEE ALSO

[castero](/man/castero)(1), [mpv](/man/mpv)(1), [vlc](/man/vlc)(1), [ffplay](/man/ffplay)(1)

# RESOURCES

```[Source code](https://github.com/timkicker/podliner)```

<!-- verified: 2026-11-09 -->
