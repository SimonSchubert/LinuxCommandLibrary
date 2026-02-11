# TAGLINE

Terminal music player with vim bindings

# TLDR

Open to **specific** directory

```termusic [path/to/directory]```

Disable **album cover**

```termusic -c [path/to/file]```

Display **help**

```termusic --help```

# SYNOPSIS

**termusic** [_OPTIONS_] [_PATH_]

# PARAMETERS

**-c**
> Disable showing album cover

**--help**
> Display help information

# DESCRIPTION

**termusic** is a terminal music player written in Rust featuring vim-like key bindings. It supports various audio formats and provides a TUI (terminal user interface) for browsing and playing music.

Configuration is stored in `~/.config/termusic/config.toml` where default directories and preferences can be set.

# KEY BINDINGS

**j/k** - Navigate up/down

**Enter** - Play selected

**Space** - Pause/resume

**n/p** - Next/previous track

**q** - Quit

# CAVEATS

Album cover display requires a compatible terminal. Some audio formats may need additional codec support.

# HISTORY

**termusic** is a modern terminal music player developed by **tramhao**, inspired by vim's modal editing philosophy and designed for keyboard-driven music playback.

# SEE ALSO

[cmus](/man/cmus)(1), [ncmpcpp](/man/ncmpcpp)(1), [mpv](/man/mpv)(1)
