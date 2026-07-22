# TAGLINE

CalDAV-compatible todo list manager

# TLDR

**List tasks**

```todoman list```

**Add task**

```todoman new "[task description]"```

**Complete task**

```todoman done [id]```

**Edit task**

```todoman edit [id]```

**Delete task**

```todoman delete [id]```

**Show task**

```todoman show [id]```

# SYNOPSIS

**todoman** _command_ [_options_] [_args_]

# PARAMETERS

**list**
> List tasks.

**new**
> Create task.

**done**
> Complete task.

**edit**
> Modify task.

**delete**
> Remove task.

**--list** _NAME_
> Specify list.

# DESCRIPTION

**todoman** is a command-line todo list manager that stores tasks in the standard iCalendar VTODO format. This makes it compatible with CalDAV servers and other calendar applications that support the iCalendar standard.

When paired with **vdirsyncer**, todoman can sync tasks with CalDAV servers like Nextcloud, Radicale, or other compatible services. It supports multiple lists, recurring tasks, due dates, and priorities, all stored in standard .ics files on disk.

# CONFIGURATION

**~/.config/todoman/todoman.conf**
> Main configuration file specifying calendar paths, date formats, default list, and display settings.

# CAVEATS

Requires configured calendars. vdirsyncer recommended. Python-based.

# HISTORY

**todoman** was created for managing todo items in iCalendar format, with CalDAV server support via vdirsyncer.

# INSTALL

```pacman: sudo pacman -S todoman```

```brew: brew install todoman```

```nix: nix profile install nixpkgs#todoman```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[vdirsyncer](/man/vdirsyncer)(1), [khal](/man/khal)(1), [task](/man/task)(1)
