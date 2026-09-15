# TAGLINE

Wine kernel daemon that backs each Wine prefix

# TLDR

**Kill** the wineserver for the current prefix, terminating its Wine processes

```wineserver --kill```

**Wait** until the current wineserver has exited

```wineserver --wait```

Keep the server **persistent** so it does not exit when the last client closes

```wineserver --persistent```

Keep the server around for **n seconds** after the last client exits

```wineserver --persistent=[10]```

Start the server in the **foreground** for debugging

```wineserver --foreground --debug```

Display **version**

```wineserver --version```

# SYNOPSIS

**wineserver** [_options_]

# PARAMETERS

**-d**[_n_], **--debug**[=_n_]
> Debug level: **0** (none), **1** (normal, default if _n_ is omitted), **2** (verbose). Output goes to stderr. **wine** turns on normal debugging automatically when **WINEDEBUG** includes **+server**.

**-f**, **--foreground**
> Stay in the foreground (useful when running under a debugger).

**-h**, **--help**
> Display a help message.

**-k**[_n_], **--kill**[=_n_]
> Kill the running wineserver for this **WINEPREFIX**. Sends signal _n_ if given; otherwise **SIGINT** then **SIGKILL**.

**-p**[_n_], **--persistent**[=_n_]
> How long the server stays up after all clients exit, in seconds (default **3**). If _n_ is omitted, the server stays until killed.

**-v**, **--version**
> Display version information and exit.

**-w**, **--wait**
> Wait until the currently running wineserver terminates.

# DESCRIPTION

**wineserver** is a daemon that provides Wine with roughly the same services the Windows kernel provides on Windows: process and thread management, synchronization, registry, and other kernel objects shared by every **wine** process in a prefix.

**wine** starts **wineserver** automatically, so you rarely need to launch it yourself. Explicit use is for shutting a prefix down (**--kill**), waiting for a clean exit (**--wait**), keeping the daemon alive between short-lived programs (**--persistent**), or debugging the server (**--foreground**, **--debug**).

All Wine processes that share a **WINEPREFIX** talk to the same wineserver instance. Distinct prefixes are independent sessions.

# ENVIRONMENT

**WINEPREFIX**
> Directory where this wineserver stores its data (default **$HOME/.wine**). Selects which running instance **--kill** and **--wait** affect.

# FILES

**~/.wine**
> Default prefix directory for user-specific Wine data.

**/tmp/.wine-**_uid_
> Directory holding the server Unix socket and lock file, in a subdirectory derived from the **WINEPREFIX** device and inode.

# CAVEATS

Killing wineserver aborts every Wine process in that prefix. Debug output on stderr can be large at level **2**. Persistence only delays shutdown; it does not replace a running server started by **wine**. The instance **--kill** and **--wait** target is the one for the current **WINEPREFIX**, not every wineserver on the machine.

# HISTORY

The original author of **wineserver** is **Alexandre Julliard**. It is the kernel-side counterpart of **Wine**, which began in **1993** as a Windows API implementation for Unix.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[wine](/man/wine)(1), [wineboot](/man/wineboot)(1), [winedbg](/man/winedbg)(1), [winecfg](/man/winecfg)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-15 -->
