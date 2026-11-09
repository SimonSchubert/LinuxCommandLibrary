# TAGLINE

Interactive TeX Live Manager session

# TLDR

**Start an interactive tlmgr shell**

```tlmgr shell```

**Start a shell and run a command** (e.g., list updates)

```tlmgr shell <<< "update --list"```

**Pipe multiple commands into the shell**

```printf "info [package]\nquit\n" | tlmgr shell```

**Use machine-readable output** from a script

```printf "set machine-readable 1\nupdate --list\nquit\n" | tlmgr shell```

# SYNOPSIS

**tlmgr shell**

# PARAMETERS

**protocol**
> Print the current protocol version.

**help**
> Print pointers to the documentation.

**version**
> Print tlmgr version information.

**quit**, **end**, **bye**, **byebye**
> Leave the shell. EOF does the same.

**restart**
> Restart the shell with the original command line.

**load** [_local_|_remote_]
> Explicitly load the local or remote TLPDB.

**save**
> Save the local TLPDB.

**get** [_var_]
> Print a variable: debug-translation, machine-readable, no-execute-actions, require-verification, verify-downloads, repository or prompt.

**set** [_var_ [_val_]]
> Set one of those variables. All are booleans (0 or 1) except repository and prompt.

# DESCRIPTION

**tlmgr shell** starts an interactive TeX Live Manager session where you can execute multiple tlmgr commands without restarting the program each time. The TeX Live package database is loaded the first time it is needed and reused for the rest of the session, which makes batch operations faster.

The first line of output is **protocol 1**. In general, all tlmgr actions that can be given on the command line work as commands in the shell (e.g., `update --list`, `install`, `info`, `search`). The shell is also usable for scripting by external tools.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [tlmgr-install](/man/tlmgr-install)(1), [tlmgr-update](/man/tlmgr-update)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

```[Source code](https://www.tug.org/texlive/svn/)```

<!-- verified: 2026-11-09 -->
