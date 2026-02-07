# TAGLINE

modular log colorizer

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

# SYNOPSIS

**ccze** [_options_]

# DESCRIPTION

**ccze** is a modular log colorizer written in C for high performance. It reads log data from standard input and outputs colorized text using ANSI escape codes or HTML, making log files much easier to scan visually.

The tool uses a plugin architecture to recognize and colorize different log formats including syslog, Apache httpd, Postfix, Squid, Exim, fetchmail, procmail, and vsftpd. Each plugin understands the structure of its target log format and applies appropriate colors to timestamps, hostnames, severity levels, and other fields.

Output defaults to ncurses mode but the `-A` flag produces raw ANSI output suitable for piping to `less -R` or other tools.

# PARAMETERS

**-A**, **--raw-ansi**
> Generate raw ANSI output

**-c** _key=color_
> Set color for key

**-C**, **--convert-date**
> Convert UNIX timestamps to readable format

**-h**, **--html**
> Generate HTML output

**-l**, **--list-plugins**
> List available plugins

**-p** _plugin_
> Load specific plugin

**-o** _option_
> Set option (e.g., nolookups)

# CONFIGURATION

**/etc/cczerc**
> System-wide configuration

**~/.cczerc**
> User configuration

# PLUGINS

Located in /usr/lib/ccze and ~/.ccze. Support for:
- syslog, httpd, postfix
- squid, exim, fetchmail
- procmail, vsftpd, xferlog
- ulogd, apm

# CAVEATS

Use -o nolookups for faster processing of long logs. Lookups resolve usernames and services but slow down colorization.

# SEE ALSO

[tail](/man/tail)(1), [less](/man/less)(1), [multitail](/man/multitail)(1)
