# TAGLINE

stop printer from processing jobs

# TLDR

**Disable a printer**

```cupsdisable [printer_name]```

**Disable with reason**

```cupsdisable -r "[maintenance]" [printer_name]```

**Disable and cancel all jobs**

```cupsdisable -c [printer_name]```

# SYNOPSIS

**cupsdisable** [**-E**] [**-U** _user_] [**-c**] [**-h** _server_[:_port_]] [**-r** _reason_] [**--hold**] _destination_...

# PARAMETERS

**-c**
> Cancel all jobs queued on the destination after disabling it.

**-r** _reason_
> Reason message attached to the stopped state and reported by **lpstat**.

**-E**
> Force encryption of the connection to the CUPS server.

**-U** _user_
> Authenticate as _user_ instead of the current login.

**-h** _server_[:_port_]
> Connect to a specific CUPS server (default: $CUPS_SERVER, then localhost:631).

**--hold**
> Hold all remaining queued jobs once the current one finishes — useful for performing maintenance after the in-flight job completes.

# DESCRIPTION

**cupsdisable** stops a CUPS printer or class from processing further jobs. By default, the in-progress job continues to print but new jobs queue up until the destination is re-enabled with **cupsenable**. With **-c**, all jobs are cancelled; with **--hold**, the current job finishes and remaining jobs are placed on hold (release them later with **cupsenable --release**).

Requires CUPS administrator privileges (member of the **lpadmin** group or root).

# CAVEATS

In CUPS 1.5+ the same binary is also installed as **cupsdisable** for backwards compatibility with the historical Berkeley **disable** command — in fact the canonical name is **cupsdisable**. Some distributions ship it only under that name.

# INSTALL

```apt: sudo apt install cups-client```

```dnf: sudo dnf install cups-client```

```apk: sudo apk add cups-client```

```zypper: sudo zypper install cups-client```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cupsenable](/man/cupsenable)(1), [cupsaccept](/man/cupsaccept)(1), [cupsreject](/man/cupsreject)(1)
