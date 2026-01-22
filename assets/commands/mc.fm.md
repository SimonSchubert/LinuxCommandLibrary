# TLDR

**Start file manager**

```mc```

**Navigate directories**

```mc [/path/to/dir]```

**Open two directories**

```mc [left_dir] [right_dir]```

**View internal viewer**

```mc -v [file]```

**Edit with internal editor**

```mc -e [file]```

# SYNOPSIS

**mc** [_options_] [_path1_] [_path2_]

# PARAMETERS

_PATH1_ _PATH2_
> Directories for panels.

**-v** _FILE_
> View file only.

**-e** _FILE_
> Edit file only.

**-b**
> Black and white.

**-c**
> Color mode.

**--help**
> Display help information.

# DESCRIPTION

**mc** is Midnight Commander's file manager mode. It provides dual-pane file navigation.

The tool supports keyboard-driven operations, archive browsing, and remote filesystem access.

mc.fm is Midnight Commander file manager.

# CAVEATS

Terminal-based. Function keys needed. Same as mc command.

# HISTORY

Midnight Commander file manager was created by **Miguel de Icaza** as a Norton Commander clone.

# SEE ALSO

[mc](/man/mc)(1), [ranger](/man/ranger)(1), [nnn](/man/nnn)(1)

