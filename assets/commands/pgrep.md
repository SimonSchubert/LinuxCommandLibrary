# TAGLINE

searches for processes by name or attributes, returning their PIDs

# TLDR

**Find process by name**

```pgrep [nginx]```

**Find with full command line match**

```pgrep -f "[python script.py]"```

**List process names and PIDs**

```pgrep -l [ssh]```

**Find processes by user**

```pgrep -u [username] [process]```

**Find newest matching process**

```pgrep -n [chrome]```

**Find oldest matching process**

```pgrep -o [firefox]```

**Count matching processes**

```pgrep -c [apache]```

**Exact name match**

```pgrep -x [bash]```

# SYNOPSIS

**pgrep** [_-flnoxc_] [_-u user_] [_-g group_] [_-P ppid_] [_pattern_]

# PARAMETERS

**-l**, **--list-name**
> List PID and process name.

**-a**, **--list-full**
> List PID and full command line.

**-f**, **--full**
> Match against full command line.

**-x**, **--exact**
> Match exactly (not substring).

**-n**, **--newest**
> Select newest (most recent) match.

**-o**, **--oldest**
> Select oldest (first) match.

**-c**, **--count**
> Count matches instead of listing.

**-d** _DELIM_, **--delimiter** _DELIM_
> Output delimiter (default: newline).

**-u** _USER_, **--euid** _USER_
> Match effective user ID.

**-U** _USER_, **--uid** _USER_
> Match real user ID.

**-g** _GROUP_, **--pgroup** _GROUP_
> Match process group.

**-G** _GROUP_, **--group** _GROUP_
> Match real group ID.

**-P** _PPID_, **--parent** _PPID_
> Match parent process ID.

**-t** _TERM_, **--terminal** _TERM_
> Match controlling terminal.

**-v**, **--inverse**
> Invert match (negation).

**-i**, **--ignore-case**
> Case-insensitive matching.

# DESCRIPTION

**pgrep** searches for processes by name or attributes, returning their PIDs. It's a more focused alternative to piping ps through grep.

Pattern matching is against the process name by default (executable name). The -f flag extends matching to the full command line including arguments. Regular expressions are supported.

Selection filters narrow results by user, group, terminal, or parent process. These can be combined for precise targeting. The -v flag inverts selection, finding processes that don't match.

Newest (-n) and oldest (-o) options return single matches, useful when multiple instances exist. Count mode (-c) reports how many processes match without listing them.

Output formatting options control delimiter and detail level. These enable integration with shell scripts and other tools.

# CAVEATS

Matches are substring by default - "sh" matches bash, fish, zsh. Use -x for exact matching. Process names may be truncated. Zombie processes may still match. Pattern is a regular expression. pgrep cannot find itself.

# HISTORY

**pgrep** was introduced in **Solaris 7** (1998) and ported to Linux as part of **procps**. It provides a cleaner interface than the traditional `ps aux | grep pattern` approach, avoiding the common "grep matching itself" problem. The tool is part of the procps-ng package on most Linux systems.

# SEE ALSO

[pkill](/man/pkill)(1), [ps](/man/ps)(1), [pidof](/man/pidof)(1), [kill](/man/kill)(1)
