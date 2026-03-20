# TAGLINE

Interactive TeX Live Manager session

# TLDR

**Start an interactive tlmgr shell**

```tlmgr shell```

**Start a shell and run a command** (e.g., list updates)

```tlmgr shell <<< "update --list"```

**Pipe multiple commands into the shell**

```printf "info [package]\nquit\n" | tlmgr shell```

# SYNOPSIS

**tlmgr shell**

# DESCRIPTION

**tlmgr shell** starts an interactive TeX Live Manager session where you can execute multiple tlmgr commands without restarting the program each time. This is faster for batch operations since the TeX Live package database is loaded only once.

In general, all tlmgr actions that can be given on the command line work as commands in the shell (e.g., `update --list`, `install`, `info`, `search`). Type `quit` or `exit` (or send EOF) to leave the shell. The `protocol` command prints the current protocol version. The shell also supports machine-readable output for scripting by external tools.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [tlmgr-install](/man/tlmgr-install)(1), [tlmgr-update](/man/tlmgr-update)(1)
