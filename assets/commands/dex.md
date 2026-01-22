# TLDR

Execute all programs in **autostart folders**

```dex -a```

Execute in **specified folders**

```dex -a -s [path/to/dir1]:[path/to/dir2]```

Preview **GNOME-specific** autostart

```dex -a -e GNOME```

Preview **regular autostart** (dry run)

```dex -a -d```

Preview **desktop entry property**

```dex -p Name [path/to/file.desktop]```

**Create** a desktop entry

```dex -c [path/to/file.desktop]```

Execute in **specific terminal**

```dex --term [terminal] [path/to/file.desktop]```

# SYNOPSIS

**dex** [_options_] [_files_]

# DESCRIPTION

**dex** (DesktopEntry Execution) generates and executes .desktop files. It's commonly used to run XDG autostart programs or launch applications from their desktop entries.

Useful for window managers that don't have built-in autostart support.

# PARAMETERS

**-a, --autostart**
> Run programs in autostart directories

**-s, --search-paths** _paths_
> Colon-separated search paths

**-e, --environment** _env_
> Filter by desktop environment

**-d, --dry-run**
> Preview without executing

**-c, --create** _file_
> Create a desktop entry

**-p, --property** _name_
> Show property value

**--term** _terminal_
> Terminal to use for Terminal=true entries

# CAVEATS

Desktop entries must comply with XDG specification. Some entries may require specific desktop environments. Part of the dex package.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [update-desktop-database](/man/update-desktop-database)(1)
