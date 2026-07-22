# TAGLINE

Explain why a process, port, or container is running

# TLDR

**Explain** a process by name

```witr [name]```

**Explain** what is listening on a port

```witr --port [port]```

**Explain** a process by PID

```witr --pid [pid]```

**Show only the ancestry chain**

```witr [name] --short```

**Show ancestry as a tree**

```witr --pid [pid] --tree```

**Look up a container** by name or image

```witr --container [name]```

**Open interactive TUI** dashboard

```witr -i```

# SYNOPSIS

**witr** [*options*] [*name*...]

# DESCRIPTION

**witr** ("why is this running?") answers the causal question behind a running process: where it came from, how it was started, and what chain of supervisors, shells, services, or containers is keeping it alive. Unlike **ps**, **lsof**, or **systemctl** alone, it correlates those layers into one human-readable explanation (or a tree / JSON view).

Targets can be process names (substring match by default), PIDs, ports, open files, or containers. Container lookup spans Docker, Podman, nerdctl, Kubernetes/crictl, Incus, LXC/LXD, and FreeBSD jails. With no targets, or with **-i**, **witr** opens an interactive TUI.

# PARAMETERS

**-p**, **--pid** *pid*

> Look up one or more process IDs (repeatable).

**-o**, **--port** *port*

> Look up process(es) bound to port(s) (repeatable).

**-f**, **--file** *path*

> Look up the process holding a file open (repeatable).

**-c**, **--container** *name*

> Look up container by name, image, command, or compose labels (repeatable).

**-x**, **--exact**

> Exact process name match (disable substring search).

**-s**, **--short**

> Print only the ancestry chain.

**-t**, **--tree**

> Print ancestry as a tree (includes children of the target).

**-i**, **--interactive**

> Interactive TUI mode.

**--json**

> Machine-readable JSON output.

**--env**

> Include environment variables for the process.

**--verbose**

> Extended process information (mounts, networks, compose metadata for containers).

**--no-color**

> Disable colorized output.

**--warnings**

> Show only warnings.

**-h**, **--help**

> Show help.

**-v**, **--version**

> Show version.

# CAVEATS

Some details (especially containers and remote runtimes) require appropriate privileges and installed client tools. Substring name matching can return multiple hits; re-run with **--pid** or **--exact**. Output quality depends on what the local process tree and supervisors expose.

# INSTALL

```brew: brew install witr```

```nix: nix profile install nixpkgs#witr```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ps](/man/ps)(1), [lsof](/man/lsof)(1), [ss](/man/ss)(8), [systemctl](/man/systemctl)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/pranshuparmar/witr)```

<!-- verified: 2026-07-19 -->
