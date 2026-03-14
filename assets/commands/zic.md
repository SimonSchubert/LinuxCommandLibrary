# TAGLINE

Compile timezone data files

# TLDR

**Compile timezone data** to default directory

```zic [path/to/tzdata_file]```

**Compile to a specific** output directory

```zic -d [path/to/output_directory] [path/to/tzdata_file]```

**Compile with leap second** information

```zic -L [path/to/leapseconds] [path/to/tzdata_file]```

**Set local timezone** link

```sudo zic -l [America/New_York]```

**Compile with verbose** warnings

```zic -v [path/to/tzdata_file]```

**Read timezone data from stdin**

```zic -d [path/to/output_directory] -```

# SYNOPSIS

**zic** [_OPTIONS_] [_FILE..._]

# PARAMETERS

**-d** _DIRECTORY_
> Output directory for compiled TZif files (default: system timezone directory).

**-l** _timezone_
> Use the given timezone as the local time, creating a localtime link.

**-p** _timezone_
> Use timezone's rules for POSIX-style TZ strings that lack transition rules.

**-L** _leapsecondfile_
> Read leap second information from the specified file.

**-v**
> Report warnings about the input data, including years outside the representable range.

**-b** _(slim|fat)_
> Output backward-compatibility data. "fat" generates extra entries for older software. "slim" keeps files small (default).

**-r** _@lo/@hi_
> Limit output to timestamps in the given range.

**-D**
> Do not create ancestor directories of output files.

**-m** _mode_
> Set file permissions on created TZif files.

**--version**
> Output version information and exit.

# DESCRIPTION

**zic** is the timezone compiler. It reads text files describing timezone rules (zone names, UTC offsets, daylight saving transitions) and produces binary TZif (Time Zone Information Format) files used by the C library's localtime() and related functions.

Input files use a specific format with Rule, Zone, and Link lines that define timezone transitions. The compiled binary files are typically installed in /usr/share/zoneinfo/. The zic compiler is normally run as part of the tzdata package installation.

# CAVEATS

Requires properly formatted timezone source files. Typically run as root when writing to system directories. Incorrect data can break time handling system-wide. The **-y** option for year type commands is obsolete and no longer supported in modern versions.

# SEE ALSO

[zdump](/man/zdump)(8), [tzselect](/man/tzselect)(8)
