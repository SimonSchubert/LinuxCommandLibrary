# TAGLINE

cross-platform system monitoring tool

# TLDR

**Start glances**

```glances```

**Web server mode**

```glances -w```

**Client mode**

```glances -c [server-ip]```

**Export to CSV**

```glances --export csv --export-csv-file [output.csv]```

**Per-CPU stats** with 5-second refresh

```glances -1 -t 5```

**Server mode** on a custom port

```glances -s -p [61210]```

**Quiet mode**

```glances -q```

# SYNOPSIS

**glances** [_options_]

# PARAMETERS

**-w**, **--webserver**
> Start web server.

**-c** _SERVER_, **--client** _SERVER_
> Connect to server.

**-s**, **--server**
> Start server mode.

**-t** _SECONDS_
> Refresh time.

**--export** _FORMAT_
> Export to format.

**-p** _PORT_, **--port** _PORT_
> TCP port for client/server/web mode (default: 61209).

**-1**, **--percpu**
> Display per-CPU stats instead of aggregated.

**-b**, **--byte**
> Display network I/O in bytes per second instead of bits.

**-q**, **--quiet**
> No display, background.

**--disable-plugin** _PLUGIN_
> Disable a specific plugin (e.g., docker, gpu).

**--stdout** _STATS_
> Display stats to stdout (comma-separated list).

**--help**
> Display help information.

# DESCRIPTION

**glances** is a cross-platform system monitoring tool. It displays real-time CPU, memory, disk, network, and process information in a comprehensive terminal interface.

The tool provides more information than top or htop in a single view. It supports client-server mode, a web interface, and exports to various formats for monitoring and analysis.

# CONFIGURATION

**~/.config/glances/glances.conf**
> Main configuration file for thresholds, display options, and export settings.

# CAVEATS

Requires Python and psutil. Some features (web mode, Docker, GPU monitoring) need optional dependencies. Web mode requires a browser and the bottle/fastapi module. High refresh rates may increase CPU usage.

# HISTORY

glances was created by **Nicolas Hennion** as a comprehensive system monitoring solution that goes beyond traditional tools like top.

# SEE ALSO

[htop](/man/htop)(1), [top](/man/top)(1), [iotop](/man/iotop)(1), [nmon](/man/nmon)(1), [vmstat](/man/vmstat)(8)
