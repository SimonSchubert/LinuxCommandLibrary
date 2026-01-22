# TLDR

**Start glances**

```glances```

**Web server mode**

```glances -w```

**Client mode**

```glances -c [server-ip]```

**Export to CSV**

```glances --export csv --export-csv-file [output.csv]```

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

**-q**, **--quiet**
> No display, background.

**--help**
> Display help information.

# DESCRIPTION

**glances** is a cross-platform system monitoring tool. It displays real-time CPU, memory, disk, network, and process information in a comprehensive terminal interface.

The tool provides more information than top/htop in a single view. It supports client-server mode, web interface, and exports to various formats for monitoring.

glances offers comprehensive system monitoring.

# CAVEATS

Python tool. Some features need optional dependencies. Web mode needs browser.

# HISTORY

glances was created by **Nicolas Hennion** as a comprehensive system monitoring solution that goes beyond traditional tools like top.

# SEE ALSO

[htop](/man/htop)(1), [top](/man/top)(1), [iotop](/man/iotop)(1)
