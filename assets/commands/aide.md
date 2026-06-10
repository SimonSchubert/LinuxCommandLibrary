# TAGLINE

Detect file system changes for intrusion detection

# TLDR

**Initialize** the database

```sudo aide -i```

**Check** the database for inconsistencies

```sudo aide -C```

**Compare** two databases according to the config file

```sudo aide -E```

**Update** the database non-interactively

```sudo aide -u```

Define a **config file** to override the default aide.conf

```sudo aide -c [path/to/config_file]```

Use **regex** to limit AIDE to a specific string

```sudo aide -l [regex]```

Set the **log level**

```sudo aide -L [warning] -C```

# SYNOPSIS

**aide** [_parameters_] _command_

# DESCRIPTION

**AIDE** (Advanced Intrusion Detection Environment) is a file and directory integrity checker used for intrusion detection. It builds a database of file attributes including permissions, inode numbers, timestamps, file sizes, link counts, and checksums using algorithms like SHA-256 and SHA-512.

Once an initial database is created, AIDE can compare the current state of the file system against the stored snapshot to detect unauthorized modifications, new files, or deleted files. Rules in the configuration file define which directories to monitor and which attributes to check for each path.

# PARAMETERS

**-i, --init**
> Initialize the database; must be moved to the appropriate place before using --check

**-C, --check**
> Check the database for inconsistencies; requires an initialized database (this is the default command)

**-u, --update**
> Check and update the database non-interactively; input and output databases must be different

**-E, --compare**
> Compare two databases as defined in config file

**-n, --dry-init**
> Traverse the file system and report matched entries without writing a database

**-D, --config-check**
> Stop after reading configuration file to check for errors

**-c, --config file**
> Specify alternate configuration file (use '-' for stdin)

**-l, --limit regex**
> Restrict operations to entries matching a regex pattern

**-L, --log-level level**
> Set the log level, overriding the config file (replaces the removed --verbose option)

**-B, --before**
> Set config parameters before file reading

**-A, --after**
> Set config parameters after file reading

**-v, --version**
> Print version information and exit

# CONFIGURATION

**/etc/aide/aide.conf**
> Main configuration file defining which files to monitor, database locations, and check rules.

# CAVEATS

Exit codes combine: 1 (new files), 2 (removed files), and 4 (changed files). The database must be stored securely, preferably on read-only media. The **-r/--report** and **-V/--verbose** options were removed in AIDE 0.17; use the **report_url** and **report_level** configuration options (or **-L/--log-level**) instead.

# HISTORY

Originally developed as an open-source alternative to proprietary file integrity checkers like Tripwire. Since version 0.17 the report and verbose command-line flags were replaced by configuration directives and the **-L/--log-level** option.

# SEE ALSO

[tripwire](/man/tripwire)(8), [md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1)

# RESOURCES

```[Source code](https://github.com/aide/aide)```

```[Homepage](https://aide.github.io/)```

<!-- verified: 2026-06-11 -->
