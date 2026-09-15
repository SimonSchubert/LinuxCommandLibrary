# TAGLINE

Create, query, and control Windows services in a Wine prefix

# TLDR

**Query** the status of a service

```wine sc query [service_name]```

**Create** a service from an executable (space after **binpath=** is conventional)

```wine sc create [service_name] binpath= '[C:\path\to\service.exe]'```

**Start** or **stop** a service

```wine sc start [service_name]```

**Set the description** of a service

```wine sc description [service_name] '[description text]'```

**Delete** a service

```wine sc delete [service_name]```

Display **usage**

```wine sc /?```

# SYNOPSIS

**wine sc** _command_ _servicename_ [_parameter=_ _value_ ...]

# PARAMETERS

**query** _service_
> Print type, state, and exit codes for the named service.

**create** _service_ **binpath=** _path_ [_options_]
> Create a service. **binpath=** is required. Optional create keys: **displayname=**, **type=** (own, share, kernel, filesys, rec, interact), **start=** (boot, system, auto, demand, disabled), **error=** (normal, severe, critical, ignore), **group=**, **depend=**, **obj=**, **password=**.

**start** _service_ [_args_...]
> Start the service, then print its status. Extra arguments are passed to the service.

**stop** _service_
> Stop the service, then print its status.

**description** _service_ [_text_]
> Set (or clear) the service description.

**failure** _service_ [_reset=_ _n_] [_reboot=_ _msg_] [_command=_ _cmd_] [_actions=_ _list_]
> Set failure actions.

**delete** _service_
> Remove the service from the service database.

# DESCRIPTION

**wine sc** is Wine's reimplementation of the Windows **sc.exe** service-control tool. It talks to the Service Control Manager in the current Wine prefix to create, query, start, stop, describe, and delete services.

Create/config parameters use the Windows **name= value** form. A space after the equals sign is the documented Windows syntax (**binpath= C:\foo.exe**); current Wine also accepts **binpath=C:\foo.exe** with no space.

The tool operates on the prefix named by **WINEPREFIX** (default **~/.wine**). It is the counterpart of **wine net**, which only starts, stops, and lists running services. Remote-server syntax (**\\\\server**) is not implemented.

# CAVEATS

Wine implements a subset of Windows **sc**: **create**, **query**, **start**, **stop**, **delete**, **description**, and **failure**. Other Windows verbs (config, qc, sdshow, ...) are not available. Creating a service only writes a database entry; the **binpath=** executable must actually exist in the prefix or **start** will fail. If the service is running, **delete** marks it for deletion until it stops.

# HISTORY

Wine's **sc.exe** was added in **2010** by Hans Leidekker so Windows installers that register services through **sc** can run under Wine. Parsing of **name=value** (no space) was fixed in **2022**.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```zypper: sudo zypper install wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[wine](/man/wine)(1), [wine-net](/man/wine-net)(1), [wineserver](/man/wineserver)(1), [wineboot](/man/wineboot)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-15 -->
