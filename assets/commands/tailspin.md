# TAGLINE

Log file highlighter with zero configuration

# TLDR

**View a log file with highlighting**

```tspin [application.log]```

**Follow a log file like tail -f**

```tspin -f [/var/log/syslog]```

**Pipe live logs through tailspin**

```kubectl logs -f [pod_name] | tspin```

# SYNOPSIS

**tspin** [_options_] [_file_]

# DESCRIPTION

**tailspin** highlights log files by automatically recognizing patterns like dates, IP addresses, UUIDs, URLs, severity keywords, numbers, and more. It requires no setup and works consistently across any log format. Uses **less** as its pager by default.

# HISTORY

**tailspin** was created by **Ben Sadeh** (bensadeh) and is written in **Rust**.

# SEE ALSO

[lnav](/man/lnav)(1), [ccze](/man/ccze)(1), [multitail](/man/multitail)(1)
