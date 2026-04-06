# TAGLINE

Pretty fancy and modern terminal file manager

# TLDR

**Launch the file manager**

```spf```

**Open in a specific directory**

```spf [/path/to/dir]```

**Open multiple panels at given paths**

```spf [/path/one] [/path/two]```

**Print configuration and data file paths**

```spf path-list```

**Use a custom config file**

```spf --config-file [/path/to/config.toml]```

**Use a custom hotkey file**

```spf --hotkey-file [/path/to/hotkeys.toml]```

**Print version**

```spf --version```

# SYNOPSIS

**spf** [_options_] [_PATH_...]

**spf** **path-list** [**--lastdir-file**]

# PARAMETERS

**--config-file**, **-c** _PATH_
> Use a different configuration file.

**--hotkey-file**, **-hf** _PATH_
> Use a different hotkey configuration file.

**--chooser-file**, **-cf** _PATH_
> Write the path of opened files to this file and exit.

**--print-last-dir**, **-pld**
> Print the last directory to stdout on exit (for cd-on-quit integration).

**--fix-hotkeys**, **-fh**
> Add any missing hotkeys to the hotkey config file.

**--fix-config-file**, **-fch**
> Add any missing fields to the config file.

**--debug-info**, **-di**
> Print debug information.

**--version**, **-v**
> Print version.

**path-list**, **pl**
> Print paths to configuration, hotkeys, log, and data directories.

# DESCRIPTION

**superfile** is a terminal-based file manager featuring multiple panels for viewing directories simultaneously, customizable themes, Vim keybindings, a clipboard viewer, and a process list. Available on Linux, macOS, and Windows.

Panels can be split and navigated with Tab. Press **>** to open the built-in command prompt for SPF-mode commands such as `split` and `open <PATH>`.

# HISTORY

**superfile** was created by **yorukot** and is written in **Go** using the Bubble Tea framework.

# SEE ALSO

[ranger](/man/ranger)(1), [lf](/man/lf)(1), [nnn](/man/nnn)(1), [yazi](/man/yazi)(1), [vifm](/man/vifm)(1)
