# TAGLINE

Trace X11 protocol communication between client and server

# TLDR

**Trace an X11 client** and print all protocol messages

```xtrace [xeyes]```

**Forward to a specific** real display

```xtrace --display [:0] [firefox]```

**Set a custom fake** display name

```xtrace --fakedisplay [:42] [xclock]```

**Keep xtrace running** after the launched client exits

```xtrace --keeprunning [xterm]```

**Wait for a later client** to connect before exiting

```xtrace --waitforclient --fakedisplay [:42]```

**Write trace output** to a file

```xtrace --outfile [trace.log] [xeyes]```

**Show relative timestamps** for each protocol message

```xtrace --relative-timestamps [xclock]```

# SYNOPSIS

**xtrace** [_options_] [_command_ [_arguments_ ...]]

# PARAMETERS

**-d**, **--display** _DISPLAY_
> Real X server to forward connections to (defaults to **$DISPLAY**).

**-D**, **--fakedisplay** _DISPLAY_
> Fake display name xtrace listens on (default **:9**).

**-k**, **--keeprunning**
> Keep running after the launched client disconnects.

**-s**, **--stopwhendone**
> Terminate when all clients have disconnected (default behavior).

**-W**, **--waitforclient**
> Do not exit even if the launched program terminates without connecting.

**-c**, **--copyauthentication**
> Copy X authentication cookies from the real display (default).

**-n**, **--nocopyauthentication**
> Do not copy authentication data to the fake display.

**-f** _file_
> Read authentication data from _file_.

**-F** _file_
> Write generated authentication data to _file_.

**-o**, **--outfile** _FILE_
> Write trace output to _FILE_ instead of stdout.

**-b**, **--buffered**
> Buffer trace output for higher performance.

**-w**, **--readwritedebug**
> Include byte counts for every read and write operation.

**--timestamps**
> Prefix each entry with an absolute wall-clock timestamp.

**--relative-timestamps**
> Prefix each entry with time elapsed since the previous entry.

**--monotonic-timestamps**
> Prefix each entry with a monotonic timestamp source.

# DESCRIPTION

**xtrace** is a debugging tool that inspects the X11 wire protocol traffic between an X client (such as a GUI application) and an X server (such as **Xorg** or **Xwayland**). It starts a fake X server on a chosen display number, forwards every connection to the real X server pointed to by **$DISPLAY** (or **--display**), and prints a human-readable log of each request, reply, event, and error that flows across the wire.

The launched program has its **$DISPLAY** environment variable rewritten to the fake display, so it transparently connects through xtrace. This makes it possible to see, for example, which X requests an application issues on startup, what events the server delivers, and where protocol errors occur — without modifying the application itself.

When no command is given (typically combined with **--waitforclient**), xtrace simply listens on the fake display and logs any client that later connects to it, which is useful for attaching to applications that are started by other means.

# CAVEATS

xtrace traces only the X11 protocol; it does not see GLX, DRI3, shared-memory (**MIT-SHM**) buffers, or other channels that bypass the wire. Output can be very verbose — buffering (**-b**) and targeted runs are recommended. Under Wayland, only XWayland clients are traceable.

# HISTORY

**xtrace** was written by **Bernhard R. Link** and is packaged in Debian and Ubuntu as the **xtrace** package. It is commonly used by X11 developers and package maintainers to debug protocol-level issues in clients and toolkits.

# SEE ALSO

[xauth](/man/xauth)(1), [Xorg](/man/Xorg)(1), [xdpyinfo](/man/xdpyinfo)(1), [xev](/man/xev)(1), [strace](/man/strace)(1)
