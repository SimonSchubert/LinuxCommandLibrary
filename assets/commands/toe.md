# TLDR

**List all terminal types**

```toe```

**List all entries including incomplete**

```toe -a```

**List with directory headers**

```toe -h```

**Show only primary names**

```toe -s```

**Scan specific directory**

```toe [/usr/share/terminfo]```

**List entries from multiple directories**

```toe [/usr/share/terminfo] [~/.terminfo]```

# SYNOPSIS

**toe** [_options_] [_directory_...]

# PARAMETERS

**-a**
> List all entries, including incomplete ones.

**-h**
> Display directory header as each directory is entered.

**-s**
> Short list: show only the first alias for each entry.

**-u** _file_
> Write report to file with sorted list of dependencies.

**-v**
> Display version and exit.

**-V**
> Display version and settings, then exit.

# DESCRIPTION

**toe** (Table Of Entries) lists terminal type descriptions available in the terminfo database. It's part of the ncurses package and helps identify what terminal capabilities are installed on a system.

The terminfo database contains compiled descriptions of terminal capabilities used by applications to properly interact with different terminal types. Each entry describes features like cursor movement, color support, function keys, and other terminal-specific behaviors.

Without arguments, toe scans the default terminfo directory. With directory arguments, it scans those directories instead. The output shows terminal type names with brief descriptions.

# CAVEATS

Only lists entries in terminfo format, not old termcap files. The default directory location varies by distribution. Some minimal installations may have limited terminfo entries. Not portable to non-ncurses systems.

# HISTORY

**toe** was developed as part of the ncurses library, which is a free software emulation of curses. The command name is a developer's pun: tic, tac (now tack), toe, forming the classic game reference. The terminfo system replaced the older termcap database to overcome size limitations and improve performance.

# SEE ALSO

[tic](/man/tic)(1), [infocmp](/man/infocmp)(1), [tput](/man/tput)(1), [terminfo](/man/terminfo)(5), [tset](/man/tset)(1)
