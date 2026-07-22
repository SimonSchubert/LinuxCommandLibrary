# TAGLINE

moves print jobs between queues

# TLDR

**Move job to another printer**

```lpmove [job_id] [destination_printer]```

**Move all jobs from printer**

```lpmove [source_printer] [destination_printer]```

**Move specific job**

```lpmove [printer]-[job_id] [destination]```

# SYNOPSIS

**lpmove** [_options_] _job_ _destination_

**lpmove** [_options_] _source_ _destination_

# PARAMETERS

_JOB_
> Job ID number or old destination and job ID (e.g., oldprinter-123).

_SOURCE_
> Source printer name (moves all jobs from this printer).

_DESTINATION_
> Target printer name.

**-E**
> Force encryption when connecting to the server.

**-U _username_**
> Specify an alternate username.

**-h _server[:port]_**
> Specify an alternate server.

# DESCRIPTION

**lpmove** moves print jobs between queues. It transfers jobs from one printer to another.

The tool is useful when a printer fails or needs maintenance. Jobs continue waiting in the new queue.

# CAVEATS

Requires administrative access. Jobs must be pending. CUPS must be running.

# HISTORY

lpmove is part of **CUPS** for moving print jobs between printer queues.

# INSTALL

```apt: sudo apt install cups-client```

```dnf: sudo dnf install cups-client```

```apk: sudo apk add cups-client```

```zypper: sudo zypper install cups-client```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cancel](/man/cancel)(1), [lp](/man/lp)(1), [lpq](/man/lpq)(1), [lpr](/man/lpr)(1), [lprm](/man/lprm)(1), [lpadmin](/man/lpadmin)(8), [lpstat](/man/lpstat)(1)

