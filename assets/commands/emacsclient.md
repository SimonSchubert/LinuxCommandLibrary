# TAGLINE

connect to running Emacs server for fast editing

# TLDR

**Open file** in existing Emacs frame

```emacsclient [file.txt]```

**Open file** in terminal (no window)

```emacsclient -nw [file.txt]```

**Open file** in new frame

```emacsclient -c [file.txt]```

**Open file** without waiting for edit to finish

```emacsclient -n [file.txt]```

**Evaluate Emacs Lisp** expression

```emacsclient -e "(message \"Hello\")"```

**Start alternate editor** if no server

```emacsclient -a "" [file.txt]```

**Create new frame** and don't wait

```emacsclient -cn [file.txt]```

**Connect to specific socket**

```emacsclient -s [server_name] [file.txt]```

# SYNOPSIS

**emacsclient** [_options_] [_files_...]

# DESCRIPTION

**emacsclient** connects to an existing Emacs server process to open files or evaluate Lisp expressions. This allows quick file editing without starting a new Emacs instance, dramatically reducing startup time.

The Emacs server must be started first with M-x server-start or by adding (server-start) to the init file. emacsclient then communicates with this server to open files in existing or new frames.

This workflow is common for using Emacs as an external editor for other programs (git, crontab) or as a quick command-line editor while maintaining a persistent Emacs session.

# PARAMETERS

**-n**, **--no-wait**
> Return immediately, don't wait for editing.

**-c**, **--create-frame**
> Create a new graphical frame.

**-nw**, **-t**, **--tty**
> Open in terminal, not graphical frame.

**-e**, **--eval**
> Evaluate argument as Emacs Lisp.

**-a** _editor_, **--alternate-editor=** _editor_
> Use editor if no server (empty string starts daemon).

**-s** _name_, **--socket-name=** _name_
> Connect to named server socket.

**-f** _file_, **--server-file=** _file_
> Use server file for TCP connection.

**-q**, **--quiet**
> Don't display messages.

**--version**
> Display version information.

**--help**
> Display help information.

# CONFIGURATION

**~/.emacs.d/server/**
> Server socket and authentication files for Emacs server connections.

# CAVEATS

Requires Emacs server to be running (or use -a to start daemon). Terminal mode (-nw) requires appropriate terminal. Socket permissions may prevent access from different users. Server file needed for TCP connections.

# HISTORY

**emacsclient** has been part of **GNU Emacs** since the early versions, with the server/client architecture designed by **Richard Stallman** and contributors. The Emacs server mode was introduced to allow external programs to request editing and to reduce the overhead of starting Emacs repeatedly. The feature has evolved to support both Unix sockets and TCP connections.

# SEE ALSO

[emacs](/man/emacs)(1), [vim](/man/vim)(1), [nano](/man/nano)(1)
