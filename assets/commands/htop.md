# TAGLINE

interactive process viewer and system monitor, designed as an enhanced

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

**htop** is an interactive, ncurses-based process viewer and system monitor designed as a more capable alternative to the traditional top command. Its full-screen interface displays per-core CPU utilization, memory, and swap usage as color-coded bar meters at the top, followed by a scrollable, sortable table of all running processes. Unlike top, htop supports full mouse interaction and intuitive keyboard shortcuts for everyday tasks.

Users can filter the process list in real time (F4), search for processes by name (F3), and toggle a tree view (F5) that reveals parent-child process hierarchies. Sending signals to processes is straightforward -- pressing F9 presents a menu of signals (SIGTERM, SIGKILL, SIGHUP, etc.) to send to one or more tagged processes. Process priority (nice value) can be adjusted directly, and the setup screen (F2) allows full customization of which columns and meters are displayed, persisted across sessions.

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
