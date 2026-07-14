# TAGLINE

query dpkg database information

# TLDR

**List** all installed packages

```dpkg-query -l```

List packages **matching pattern**

```dpkg-query -l '[libc6*]'```

List **files** installed by a package

```dpkg-query -L [libc6]```

Show package **information**

```dpkg-query -s [libc6]```

**Search** for packages owning files

```dpkg-query -S [/etc/ld.so.conf.d]```

Print packages in a **custom format**, one per line

```dpkg-query -W -f='${Package} ${Version}\n'```

List the **largest installed packages** by size

```dpkg-query -W -f='${Installed-Size}\t${Package}\n' | sort -rn | head```

Find **packages left over** after removal (config files still present)

```dpkg-query -W -f='${db:Status-Abbrev} ${Package}\n' | grep '^rc'```

# SYNOPSIS

**dpkg-query** _action_ [_options_] [_pattern_|_package_]

# DESCRIPTION

**dpkg-query** queries the dpkg database for information about installed packages on Debian-based systems. It provides a read-only interface to the package database, allowing you to search for packages, inspect their metadata, and determine file ownership.

The tool is essential for system administration tasks like verifying package installations, troubleshooting file conflicts, and generating package inventories. Unlike dpkg itself, dpkg-query only reads information and never modifies the package database, making it safe to use without elevated privileges.

Its custom output formatting capabilities make it particularly useful in scripts and automation workflows.

# PARAMETERS

**-l**, **--list** [_pattern_...]
> List packages matching the pattern, with a one-line status, version, architecture, and description each.

**-L**, **--listfiles** _package_...
> List the files installed by a package.

**-s**, **--status** _package_...
> Show the full status entry: version, dependencies, description, and maintainer.

**-S**, **--search** _pattern_...
> Find which package owns the files matching the pattern.

**-p**, **--print-avail** _package_...
> Show details from the *available* packages file rather than the installed status.

**-W**, **--show** [_pattern_...]
> Show packages using the format given by **--showformat**. This is the scripting interface.

**-f**, **--showformat**=_format_
> Custom output format. Fields are referenced as `${Package}`, `${Version}`, `${Architecture}`, `${Installed-Size}`, `${binary:Summary}`, `${db:Status-Abbrev}`, and so on; `\n` and `\t` are honoured.

**-c**, **--control-list** _package_
> List the control files belonging to a package.

**--control-show** _package_ _control-file_
> Print the contents of one control file, such as `conffiles` or `md5sums`.

**--control-path** _package_ [_control-file_]
> Print the path to a package's control files.

**--no-pager**
> Do not pipe the output through a pager.

**--admindir**=_dir_
> Use a different dpkg database directory instead of `/var/lib/dpkg`.

# CAVEATS

The **-l** columns are truncated to the terminal width, which quietly cuts off long package names and versions; parse **-W** with an explicit **--showformat** instead of scraping **-l**.

Patterns are **shell globs**, not regular expressions, and an unquoted `*` will be expanded by the shell before dpkg-query ever sees it: always quote them, as in `dpkg-query -l 'libc6*'`.

This queries only what dpkg knows about, meaning packages installed on this system. It says nothing about what is available in the repositories, which is `apt-cache`'s job. **-S** also matches only files recorded in a package's file list, so files created at runtime by maintainer scripts, and anything under `/usr/local`, will not be found and are correctly reported as belonging to no package.

Note that a package listed by **-l** is not necessarily installed: the leading status characters matter, and `rc` means removed but with configuration files still on disk.

# SEE ALSO

[dpkg](/man/dpkg)(1), [dpkg-deb](/man/dpkg-deb)(1), [apt-cache](/man/apt-cache)(8), [apt-file](/man/apt-file)(1), [aptitude](/man/aptitude)(8)

# RESOURCES

```[Source code](https://git.dpkg.org/cgit/dpkg/dpkg.git/)```

```[Homepage](https://wiki.debian.org/Teams/Dpkg)```

<!-- verified: 2026-07-14 -->

