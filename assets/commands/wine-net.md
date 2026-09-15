# TAGLINE

Start, stop, and list Windows services in a Wine prefix

# TLDR

**List currently running services**

```wine net start```

**Start** a service

```wine net start [service_name]```

**Stop** a running service

```wine net stop [service_name]```

**List current network connections** (mapped drives / uses)

```wine net use```

Display **help**

```wine net help```

Help for the **start** subcommand

```wine net help start```

# SYNOPSIS

**wine net** **start** [_service_]

**wine net** **stop** _service_

**wine net** **use**

**wine net** **help** [_start_|_stop_]

# PARAMETERS

**start**
> With no service name, list running Win32 services. With a name, start that service.

**stop** _service_
> Stop the named service, after first stopping any services that depend on it.

**use**
> List current LAN Manager uses (mapped network connections). Wine implements listing only; creating or deleting uses is not supported.

**help**
> Print usage. **help start** and **help stop** print the corresponding subcommand help.

**/y**, **/yes**
> Answer yes to confirmation prompts.

**/n**, **/no**
> Answer no to confirmation prompts.

# DESCRIPTION

**wine net** is Wine's reimplementation of a subset of the Windows **net.exe** command. In a Wine prefix it talks to the Service Control Manager to start, stop, and list services, and can list network uses.

It is a thin wrapper around the same service database that **wine sc** edits. **wine net start** without an argument enumerates **SERVICE_WIN32** services that are currently **SERVICE_ACTIVE**. Stopping a service also walks and stops its active dependents.

The tool operates on the prefix named by **WINEPREFIX** (default **~/.wine**). Windows **net** subcommands such as **user**, **share**, **view**, and **localgroup** are not implemented.

# CAVEATS

Only **help**, **start**, **stop**, and **use** are recognized; anything else prints usage and does nothing. **net use** with extra arguments (to map a drive) returns failure. Service names are those registered in the prefix, not Linux systemd unit names. Starting a service that has no working executable in the prefix will fail even if the name looks familiar from Windows.

# HISTORY

Wine's **net.exe** was added in **2007** by Tim Schwartz. It has stayed a small subset of the Windows command, covering the service and **use** listing operations that Windows programs running under Wine actually call.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```zypper: sudo zypper install wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[wine](/man/wine)(1), [wine-sc](/man/wine-sc)(1), [wineserver](/man/wineserver)(1), [wineboot](/man/wineboot)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-15 -->
