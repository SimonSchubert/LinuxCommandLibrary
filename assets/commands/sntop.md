# TAGLINE

Simple network top for monitoring host connectivity

# TLDR

**Monitor hosts defined in the default config**

```sntop```

**Poll hosts from a custom config every 10 seconds**

```sntop -r 10 -f [/path/to/hosts.conf]```

**Generate an HTML status page**

```sntop -w -e [/var/www/status.html]```

# SYNOPSIS

**sntop** [**-d**] [**-o**] [**-c**] [**-r** _time_] [**-f** _file_] [**-a** _file_] [**-l** _file_]

# PARAMETERS

**-r** _TIME_
> Set the polling interval in seconds.

**-f** _FILE_
> Use a custom hosts configuration file.

**-w**
> Enable HTML output mode.

**-d**
> Run in daemon mode.

# DESCRIPTION

**sntop** is an ncurses-based console utility that polls a list of hosts at regular intervals using fping or ping and displays their online/offline status in a top-like table. It supports HTML generation, daemon mode, alarm script execution on host status changes, and color output.

# HISTORY

**sntop** was created by **Robert M. Love** and **Chris M. Rivera** and is written in **C**.

# SEE ALSO

[fping](/man/fping)(1), [ping](/man/ping)(1), [trippy](/man/trippy)(1)
