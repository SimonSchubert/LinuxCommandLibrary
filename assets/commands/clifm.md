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

**clifm** is a shell-like, command-line terminal file manager. Unlike TUI file managers, it uses CLI principles with ELN (Entry List Numbers) for file selection. Runs on Linux, BSD, macOS, and even VT100 terminals.

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

# CAVEATS

CLI-based, not TUI. Shell commands work directly. Highly customizable via profiles.

# SEE ALSO

[ranger](/man/ranger)(1), [lf](/man/lf)(1), [nnn](/man/nnn)(1)
