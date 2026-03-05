# TAGLINE

Unix process hierarchy tree for specific processes

# TLDR

**Show the process tree for a command name**

```pgtree [process_name]```

**Show the process tree and send a signal**

```pgtree -s [SIGNAL] [process_name]```

# SYNOPSIS

**pgtree** [_options_] _pattern_

# PARAMETERS

**-s** _SIGNAL_
> Send a signal to matched processes and their children.

# DESCRIPTION

**pgtree** is a Unix process hierarchy tree display that combines pgrep and pstree functionality. It finds processes matching a pattern and displays their full process tree, and can send signals to matched processes and all their children. It works out of the box on any Unix system using the default OS Python installation.

# HISTORY

**pgtree** was created by **joknarf** and is written in **Python**.

# SEE ALSO

[pstree](/man/pstree)(1), [pgrep](/man/pgrep)(1), [ps](/man/ps)(1), [kill](/man/kill)(1)
