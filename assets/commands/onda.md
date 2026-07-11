# TAGLINE

Privacy-minded internet radio terminal UI

# TLDR

**Launch the radio browser**

```onda```

**Play the selected station**

```enter```

**Search stations by name, country, or genre**

```/```

**Toggle favorite on selected station**

```f```

**Stop playback**

```s```

**Open settings**

```,```

# SYNOPSIS

**onda**

# PARAMETERS

**/** 
> Open search (live by default; results as you type).

**f**
> Toggle favorite on the selected station.

**F**
> Show favorites list.

**s**
> Stop playback.

**+** / **-**
> Volume up / down.

**b**
> Browse by country, genre, or language.

**p**
> Show popular (top-voted) stations.

**r**
> Recently played (when history is enabled).

**a**
> Add a custom station.

**,**
> Open settings.

**q**
> Quit.

# DESCRIPTION

**onda** is a terminal UI for browsing and listening to internet radio stations. Inspired by Radio Garden, it connects directly to broadcaster stream URLs with no recording, proxying, or rebroadcast. Playback uses **mpv** on your PATH.

Stations come from the public-domain Radio Browser directory plus a bundled CC0 starter list. Browse by place, search locally or online, save favorites, and add custom stations. Popularity tracking defaults to **never** — no telemetry leaves your machine unless you opt in.

Requires **mpv** installed separately. Runs on Linux, macOS, and Windows.

# CONFIGURATION

Config and data live under the OS config directory:

> Linux: **~/.config/onda/**
> macOS: **~/Library/Application Support/onda/**
> Windows: **%AppData%\onda\**

**config.toml** keys include **quality** (highest|balanced|lowest), **tracking** (never|opt-in|opt-out), **history_enabled**, **theme**, **update_check**, **live_search**, **volume**, and **normalize**. Favorites and custom stations are stored as JSON alongside the config. The local station cache lives under the OS cache directory (for example **~/.cache/onda/** on Linux).

# CAVEATS

Region-locked streams fail without geo-unblocking. Radio Browser has no canonical station IDs, so duplicate entries are merged heuristically. Bundled station data is a small starter set; the full directory download is opt-in (~30 MB).

# SEE ALSO

[mpv](/man/mpv)(1)

# RESOURCES

```[Source code](https://github.com/pedrosousa13/onda)```

<!-- verified: 2026-07-11 -->