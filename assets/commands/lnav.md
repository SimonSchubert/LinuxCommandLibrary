# TAGLINE

advanced log file viewer that leverages semantic information from log files

# TLDR

View **log files**

```lnav path/to/log```

View logs in a **directory**

```lnav /var/log/```

View **remote** log files via SSH

```lnav ssh user@host:/var/log/syslog```

**Validate** log format configuration

```lnav -C path/to/log```

Include **rotated/archived** logs

```lnav -R /var/log/syslog```

Run **headless** with command

```lnav -n -c ":filter-in error" path/to/log```

# SYNOPSIS

**lnav** [**-hHVCnqirRt**] [**-c** _CMD_] [**-f** _PATH_] [**-I** _PATH_] [**-d** _FILE_] [**-w** _FILE_] [_logfile1_ _logfile2_ ...]

# DESCRIPTION

**lnav** is an advanced log file viewer that leverages semantic information from log files. It can interleave messages from multiple files, create time-based histograms, and provides efficient navigation through logs using hotkeys.

# PARAMETERS

**-h**
> Display help information

**-H**
> Show internal help text

**-V**
> Print version details

**-n**
> Run in headless mode without UI

**-c CMD**
> Execute command after loading files

**-f PATH**
> Run commands from a configuration file

**-I PATH**
> Add directory to configuration search path

**-q**
> Quiet mode; suppress messages

**-i**
> Install format files to user directory. Pass 'extra' to install the default set of third-party formats.

**-u**
> Update installed format files from repositories

**-a**
> Load all of the most recent log file types

**-C**
> Validate configuration and log format files

**-d FILE**
> Output debug messages to file

**-r**
> Recursively load files from directories

**-R**
> Include rotated and archived log files

**-t**
> Add timestamps to stdin data

**-w FILE**
> Write stdin content to file

# CONFIGURATION

**~/.lnav/formats/**
> Directory for user-defined log format files (JSON format definitions).

**~/.lnav/configs/**
> Directory for user configuration files.

# CAVEATS

Press "?" for online help while running, and "q" to exit. lnav automatically detects and parses many common log formats (syslog, Apache, strace, etc.). Custom formats can be defined in JSON configuration files. Use ":filter-in" and ":filter-out" commands to filter log lines interactively.

# HISTORY

**lnav** was created to provide an advanced log file navigator with automatic format detection, syntax highlighting, and efficient navigation for system administrators and developers.

# SEE ALSO

[less](/man/less)(1), [tail](/man/tail)(1), [journalctl](/man/journalctl)(1), [multitail](/man/multitail)(1)
