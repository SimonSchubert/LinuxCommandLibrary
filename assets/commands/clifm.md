# TAGLINE

shell-like command-line file manager

# TLDR

**Start file manager**

```clifm```

**Start in specific directory**

```clifm [/path/to/dir]```

**Start with specific profile**

```clifm -P [profile_name]```

**Start in stealth mode**

```clifm -S```

**Show hidden files**

```clifm -a```

# SYNOPSIS

**clifm** [_options_] [_path_]

# DESCRIPTION

**clifm** is a shell-like, command-line terminal file manager that differs fundamentally from TUI file managers like ranger or nnn. Instead of navigating a panel-based interface, users interact through a command prompt, using ELN (Entry List Numbers) to reference files by their displayed index numbers.

Standard shell commands work directly within clifm, and built-in commands provide additional file management capabilities such as bulk renaming, trash support, bookmarks, and directory jumping. The tool supports multiple workspaces, custom profiles, and a plugin system.

clifm runs on Linux, BSD, macOS, and even VT100 terminals, making it one of the most portable file managers available. Its CLI-first approach is particularly suited for users who are already comfortable working in a shell environment.

# PARAMETERS

**-a**, **--show-hidden**
> Show hidden files

**-P** _profile_
> Use specified profile

**-S**, **--stealth-mode**
> Leave no trace

**-p** _path_
> Set starting path

**-c** _cmd_
> Run command and exit

**-w** _workspace_
> Start in workspace

**--no-cd-auto**
> Disable auto-cd

**--disk-usage**
> Show disk usage

# NAVIGATION

**ELN**
> Type number to select file/directory

**b/f**
> Back/forward in history

**j** _pattern_
> Jump to directory

**/pattern**
> Filter entries

# COMMANDS

Standard shell commands work. Built-in commands:
- **sel/desel**: Select/deselect files
- **tr**: Trash files
- **o/open**: Open with default app
- **bulk**: Bulk rename

**help** or **?**
> Show help

# CONFIGURATION

**~/.config/clifm/profiles/<profile>/clifmrc**
> Main configuration file controlling colors, aliases, prompt, and behavior settings.

**~/.config/clifm/profiles/<profile>/keybindings.clifm**
> Custom keyboard shortcuts and key bindings.

# CAVEATS

CLI-based, not TUI. Shell commands work directly. Highly customizable via profiles.

# SEE ALSO

[ranger](/man/ranger)(1), [lf](/man/lf)(1), [nnn](/man/nnn)(1)
