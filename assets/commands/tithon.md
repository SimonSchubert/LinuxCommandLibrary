# TAGLINE

Persistent Jupyter kernel daemon with a host-side CLI

# TLDR

Start the **daemon** in the background

```tithon daemon &```

**Run code** in the default session and print the result

```tithon run -c 'x = 41'```

Run another snippet against the **same kernel state**

```tithon run -c 'x += 1; print(x)'```

Print **daemon and kernel status** as JSON

```tithon status```

Stream a **full snapshot** of journaled output, then exit

```tithon attach --since 0 --once```

Submit code and **return immediately** with the execution id

```tithon run -c '[code]' --no-wait```

**Interrupt** the cell currently running in a session

```tithon interrupt --session [session]```

**Restart** a session's kernel (fresh namespace)

```tithon restart --session [session]```

**Terminate** a session and drop its kernel

```tithon kill --session [session]```

**Stop the daemon** but leave detached kernels running

```tithon shutdown```

# SYNOPSIS

**tithon** _command_ [_options_]

# PARAMETERS

**daemon**
> Run the daemon in the foreground. It owns kernels and serves CLI and VS Code clients over a unix socket.

**--log-level** _LEVEL_
> Logging verbosity for **daemon**: `DEBUG`, `INFO`, `WARNING`, or `ERROR`. Default `INFO`. Always written to `$TITHON_HOME/daemon.log` and echoed to stderr.

**--idle-timeout** _SECONDS_
> Reap a kernel that has been idle this long (no attached client, nothing running or queued). Outputs remain restorable from the journal. `0` or omitted means never. Also read from `TITHON_KERNEL_IDLE_TIMEOUT`.

**run**
> Execute code in a session and stream its output.

**-c** _CODE_, **--code** _CODE_
> Python source to submit. Required for **run**.

**--session** _ID_
> Session id (typically a file URI). Each id has its own kernel. Default `default` for **run**, **attach**, **restart**, and **interrupt**. Required for **kill**. Omit on **status** to print every session.

**--no-wait**
> For **run**: print the execution id and exit without waiting for completion.

**--timeout** _SECONDS_
> For **run**: give up waiting after this many seconds. Default `0` (no limit). Exit status `3` on timeout.

**attach**
> Attach to a session and stream events as NDJSON.

**--since** _N_
> Resume point for **attach**. `0` (default) sends a full folded snapshot then live deltas. A positive `N` replays only events after sequence `N`. `-1` is live-only, ignoring history.

**--once**
> For **attach**: exit after the backlog `sync` marker.

**--until-done**
> For **attach**: exit after the next `done` event.

**status**
> Print session, queue, kernel, and widget-model status as JSON.

**restart**
> Restart a session's kernel with a fresh namespace.

**interrupt**
> Send SIGINT to the running cell.

**kill**
> Terminate one session's kernel and drop the session. History stays in the journal.

**shutdown**
> Stop the daemon. Detached kernels keep running unless **--kill-kernels** is given.

**--kill-kernels**
> With **shutdown**, also kill kernels (for a fresh start, e.g. after switching interpreters).

# DESCRIPTION

**tithon** is a host-side session manager for Jupyter kernels. A long-lived daemon on the machine owns one or more **ipykernel** processes, journals every iopub and shell message, and serves clients over a mode-`0600` unix domain socket. Closing an editor, dropping SSH, or crashing the daemon does not kill the kernel: it is started with **setsid** and re-attaches through a persisted connection file.

Clients (this CLI, or the VS Code extension `rnoro.tithon`) attach with the last sequence number they saw and receive a folded snapshot plus an ordered delta stream. Rich outputs such as images are stored as files referenced by hash rather than base64, and ipywidgets traffic is folded into a `widget-state+json` snapshot so progress bars and sliders restore at their current values.

The CLI is the same protocol the extension uses. `tithon daemon` must be running on the same host as any client; they share `TITHON_HOME` (default `~/.tithon`). Over VS Code Tunnel or Remote-SSH the extension host already runs on that host, so no extra port forwarding is required.

Notebook source is expected as a percent-format `.py` file (`# %%` cell markers). Outputs never write back into that file. Folded display state can be shared as project-local `.tithon/cells/` JSON plus `.tithon/outputs/` image files.

The project is published as **alpha**: it is used in daily work, but the CLI and protocol may still change.

# CONFIGURATION

State lives under **TITHON_HOME** (default `~/.tithon`): unix socket `daemon.sock`, `daemon.log`, and per-session journals at `sessions/<session>/journal.db`.

**TITHON_HOME**
> Root for the socket, log, journal, and artifacts. Default `~/.tithon`.

**TITHON_KERNEL_IDLE_TIMEOUT**
> Default idle-reap timeout in seconds for **daemon --idle-timeout**.

**TITHON_SUB_QUEUE_MAX**
> Max queued events per client before it is dropped (backpressure). Default `10000`.

**TITHON_SEND_TIMEOUT**
> Seconds a client may stall a send before being dropped. Default `10.0`.

**TITHON_WRITE_BUFFER_HIGH**
> Per-connection send-buffer high-water mark in bytes. Default `1048576`.

**TITHON_SOCK_SNDBUF**
> Per-connection kernel socket send buffer in bytes. Default `1048576`.

**TITHON_SUB_POLL**
> Interval in seconds at which a blocked sender re-checks for drop. Default `0.5`.

# CAVEATS

Requires **Python 3.11+** and a Unix-like host (unix domain sockets and **setsid**). Native Windows is not supported; WSL is the documented workaround.

Every subcommand except **daemon** needs a reachable daemon. If the socket is missing or refused, the CLI prints `tithon: cannot reach daemon at ...` and exits `2`.

The daemon binds no TCP port. A laptop-side client talking to a remote daemon must forward the unix socket (SSH `RemoteForward`, **socat**, or equivalent).

**tithon kill** ends automatic restore for that session. Involuntary losses (daemon restart, host reboot, dropped tunnel, idle GC) still restore from the journal.

The software is alpha. Treat it as a daily-driver experiment, not a frozen API.

# HISTORY

**tithon** was created by **rnoro** and first published on PyPI in **August 2026** (0.2.x, MIT). The name plays on Tithonus, the figure granted immortality: the kernel is meant to outlive the client. The execution engine is stock **ipykernel**; Tithon only replaces the session-management layer around it.

# SEE ALSO

[jupyter](/man/jupyter)(1), [ipython](/man/ipython)(1), [jupytext](/man/jupytext)(1), [jupyter-lab](/man/jupyter-lab)(1), [tmux](/man/tmux)(1), [python](/man/python)(1), [code](/man/code)(1)

# RESOURCES

```[Source code](https://github.com/rnoro/tithon)```

```[Homepage](https://rnoro.github.io/tithon/)```

```[Documentation](https://github.com/rnoro/tithon/blob/main/docs/SPEC.md)```

<!-- verified: 2026-09-10 -->
