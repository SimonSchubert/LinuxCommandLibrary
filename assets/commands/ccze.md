# TAGLINE

A robust log colorizer

# TLDR

**Colorize log file**

```cat [/var/log/syslog] | ccze```

**Follow log with colors**

```tail -f [/var/log/syslog] | ccze```

**Raw ANSI output for less**

```cat [logfile] | ccze -A | less -R```

**HTML output**

```cat [logfile] | ccze -h > [output.html]```

**Disable lookups for speed**

```cat [logfile] | ccze -A -o nolookups | less -R```

**List available plugins**

```ccze -l```

**Colorize using only a specific plugin**

```cat [logfile] | ccze -p [httpd]```

**Use an alternate configuration file**

```cat [logfile] | ccze -F [~/.my_cczerc] -A```

# SYNOPSIS

**ccze** [_options_]

# DESCRIPTION

**ccze** is a robust log colorizer written in C, designed as a drop-in replacement for **colorize** with better performance and lower resource usage. It reads log data from standard input and outputs colorized text using ncurses, raw ANSI escape codes, or HTML.

The tool uses a plugin architecture to recognize and colorize different log formats including syslog, Apache httpd, Postfix, Squid, Exim, fetchmail, procmail, and vsftpd. Each plugin understands the structure of its target log format and applies appropriate colors to timestamps, hostnames, severity levels, and other fields.

Output defaults to ncurses mode but the `-A` flag produces raw ANSI output suitable for piping to `less -R` or other tools.

# PARAMETERS

**-a** _PLUGIN=ARGUMENTS_, **--argument** _PLUGIN=ARGUMENTS_
> Pass whitespace-separated arguments to the specified plugin.

**-A**, **--raw-ansi**
> Generate raw ANSI color sequences instead of using ncurses.

**-c** _KEY=COLOR_, **--color** _KEY=COLOR_
> Set the color of a keyword, as in configuration files.

**-C**, **--convert-date**
> Convert UNIX timestamps to human-readable date format (e.g. in squid or oops logs).

**-F** _rcfile_, **--rcfile** _rcfile_
> Read the specified file as configuration instead of the defaults.

**-h**, **--html**
> Generate HTML output instead of console colors.

**-l**, **--list-plugins**
> List all available (loaded) plugins with their type and description.

**-m** _mode_, **--mode** _mode_
> Set output mode: _curses_, _ansi_, or _html_.

**-o** _option_, **--options** _option_
> Toggle a feature. Available options: **scroll**, **wordcolor**, **lookups**, **transparent**, **cssfile**. Prefix with "no" to disable (e.g., **nolookups**). All are enabled by default except cssfile.

**-p** _plugin_, **--plugin** _plugin_
> Load only the specified plugin(s) for a slight speedup.

**-r**, **--remove-facility**
> Remove syslog-ng facility level information from log lines.

**-V**, **--version**
> Display version information.

**--help**
> Display usage summary and exit.

# CONFIGURATION

**/etc/cczerc**
> System-wide configuration.

**~/.cczerc**
> Per-user configuration.

# PLUGINS

Located in /usr/lib/ccze and ~/.ccze. Support for:
- syslog, httpd, postfix
- squid, exim, fetchmail
- procmail, vsftpd, xferlog
- ulogd, apm

# CAVEATS

Use **-o nolookups** for faster processing of long logs. When enabled (the default), lookups resolve usernames and service names but slow down colorization significantly.

# SEE ALSO

[tail](/man/tail)(1), [less](/man/less)(1), [multitail](/man/multitail)(1), [journalctl](/man/journalctl)(1)
