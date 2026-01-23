# TLDR

**Start htop**

```htop```

**Show processes for a specific user**

```htop -u [username]```

**Show only processes containing string**

```htop -F [string]```

**Start with tree view**

```htop -t```

**Sort by memory usage**

```htop -s PERCENT_MEM```

**Monochrome mode**

```htop -C```

**Show help**

```htop -h```

# SYNOPSIS

**htop** [_options_]

# DESCRIPTION

**htop** is an interactive process viewer and system monitor, designed as an enhanced alternative to the traditional top command. It provides a full-screen, colorful display of system processes with intuitive keyboard and mouse controls.

The interface shows CPU, memory, and swap usage with graphical meters, followed by a sortable list of running processes. Users can scroll through the process list, search, filter, and perform operations like sending signals or changing priorities.

htop supports multiple views including tree mode (showing process hierarchy), and allows customization of displayed columns and meters through its setup menu.

# PARAMETERS

**-u** _user_, **--user=** _user_
> Show only processes of specified user.

**-p** _pid_, **--pid=** _pid_
> Show only specified PIDs.

**-t**, **--tree**
> Start in tree view mode.

**-s** _column_, **--sort-key=** _column_
> Sort by specified column.

**-d** _delay_, **--delay=** _delay_
> Update interval in tenths of seconds.

**-C**, **--no-color**
> Monochrome mode.

**-F** _string_, **--filter=** _string_
> Show only processes containing string.

**-H**, **--highlight-changes**
> Highlight new/changed processes.

**--readonly**
> Disable process manipulation.

# KEYBOARD CONTROLS

**F1** / **h**: Help screen
**F2** / **S**: Setup menu
**F3** / **/**: Search
**F4** / **\\**: Filter
**F5** / **t**: Tree view toggle
**F6** / **>**: Sort column menu
**F9** / **k**: Kill process
**F10** / **q**: Quit
**Space**: Tag process
**U**: Untag all
**c**: Tag and children

# CAVEATS

Some features require root privileges (changing priorities, killing other users' processes). High refresh rates may impact system performance. Process information is a snapshot and may change between refreshes.

# HISTORY

**htop** was created by **Hisham Muhammad** in **2004** as a more user-friendly process viewer for Linux. It addressed common complaints about top's interface and lack of interactivity. The project was later forked as **htop-dev** by a community group after maintenance lapsed. htop has become the de facto interactive process viewer on Linux systems.

# SEE ALSO

[top](/man/top)(1), [ps](/man/ps)(1), [pstree](/man/pstree)(1), [atop](/man/atop)(1), [btop](/man/btop)(1)
