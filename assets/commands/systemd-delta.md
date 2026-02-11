# TAGLINE

Find overridden configuration files

# TLDR

Show **all** overridden configuration files

```systemd-delta```

Show only **specific types**

```systemd-delta -t [masked|equivalent|redirected|overridden|extended|unchanged]```

Show overrides in specific **directory**

```systemd-delta [/etc|/run|/usr/lib]```

Show overrides for specific **category**

```systemd-delta [tmpfiles.d|sysctl.d|systemd/system]```

# SYNOPSIS

**systemd-delta** [_OPTIONS_] [_PREFIX_|_PREFIX/SUFFIX_|_SUFFIX_...]

# PARAMETERS

**-t, --type=** _TYPE_
> Filter by difference type (masked, equivalent, redirected, overridden, extended, unchanged)

**--diff=** _BOOL_
> Toggle diff display for modified files (default: true)

**--no-pager**
> Suppress pagination of output

**-h, --help**
> Display help

# DESCRIPTION

**systemd-delta** identifies and compares configuration files that override other configuration files. It helps understand configuration precedence across system directories.

The priority hierarchy places `/etc/` highest, `/run/` second, and `/usr/lib/` lowest. Files can be overridden by placing identically-named files in higher-priority directories. Drop-in directories with `.d` suffix can extend configuration files.

# DIFFERENCE TYPES

**masked** - Files in higher-priority locations completely hide lower ones (symlink to /dev/null)

**equivalent** - Identical content in multiple locations

**redirected** - Symlink pointing elsewhere

**overridden** - File in higher-priority location replaces lower one

**extended** - Drop-in files augment the original

**unchanged** - No overrides present

# CAVEATS

Only shows differences for systemd-managed configuration types (unit files, tmpfiles.d, sysctl.d, etc.). Does not analyze arbitrary configuration files. The diff output can be verbose for heavily customized systems.

# HISTORY

**systemd-delta** is part of the **systemd** project. It addresses the common administrative challenge of understanding which configuration files are in effect when multiple sources provide overlapping configuration.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd](/man/systemd)(1)
