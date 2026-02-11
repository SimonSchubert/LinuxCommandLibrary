# TAGLINE

Dump utmp and wtmp login accounting files

# TLDR

**Dump** wtmp file to stdout

```utmpdump /var/log/wtmp```

Dump **btmp** file (failed logins)

```utmpdump /var/log/btmp```

**Follow** file for new entries

```utmpdump -f /var/log/wtmp```

Write output to **file**

```utmpdump -o output.txt /var/log/wtmp```

**Reverse** (load) edited dump back to file

```utmpdump -r dumpfile > /var/log/wtmp```

# SYNOPSIS

**utmpdump** [_options_] [_filename_]

# DESCRIPTION

**utmpdump** dumps UTMP and WTMP files in raw format for examination and debugging. It can also reverse the process to write edited login information back to the accounting files.

# PARAMETERS

**-f, --follow**
> Output appended data as the file grows

**-o, --output FILE**
> Write output to specified file instead of stdout

**-r, --reverse**
> Undump; write edited login information back to utmp/wtmp files

**-h, --help**
> Display help text and exit

**-V, --version**
> Print version and exit

# CAVEATS

This tool is designed for debugging purposes. The -r option should be used with extreme caution as incorrect usage can corrupt login accounting files. Timestamps use millisecond-precision ISO-8601 format in UTC-0 timezone.

# HISTORY

**utmpdump** is part of the **util-linux** package, providing utilities for examining and repairing corrupted utmp and wtmp entries.

# SEE ALSO

[last](/man/last)(1), [who](/man/who)(1), [utmp](/man/utmp)(5), [wtmp](/man/wtmp)(5)
