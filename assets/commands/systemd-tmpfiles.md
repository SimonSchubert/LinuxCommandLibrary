# TAGLINE

Manage temporary files and directories

# TLDR

**Create** files and directories as specified in configuration

```systemd-tmpfiles --create```

**Clean up** files and directories with age parameters

```systemd-tmpfiles --clean```

**Remove** files and directories as specified in configuration

```systemd-tmpfiles --remove```

**Apply** operations for user-specific configurations

```systemd-tmpfiles --create --user```

**Execute** lines marked for early boot

```systemd-tmpfiles --create --boot```

**Apply** only to paths under a specific prefix

```systemd-tmpfiles --create --prefix=[/tmp]```

**Create, clean, and remove** in a single invocation

```systemd-tmpfiles --create --clean --remove```

# SYNOPSIS

**systemd-tmpfiles** [_options_] [_configfile_...]

# PARAMETERS

**--create**
> Create files and directories as configured

**--clean**
> Clean up files older than configured age

**--remove**
> Remove files and directories

**--user**
> Apply user configuration

**--boot**
> Execute boot-time entries

**--purge**
> Delete all files and directories created by the specified configuration files

**--prefix** _path_
> Only apply rules with paths starting with specified prefix (repeatable)

**--exclude-prefix** _path_
> Ignore rules with paths starting with specified prefix (repeatable)

**-E**
> Shortcut for excluding /dev, /proc, /run, and /sys hierarchies

**--root** _path_
> Prefix all paths with the given alternate root directory

**--replace** _path_
> Use command-line arguments instead of the specified configuration file

**--cat-config**
> Print the contents of configuration files to stdout

**--no-pager**
> Do not pipe output into a pager

**-h**, **--help**
> Print help text and exit

# DESCRIPTION

**systemd-tmpfiles** creates, deletes, and cleans up volatile and temporary files and directories. Configuration files in **/etc/tmpfiles.d/**, **/usr/lib/tmpfiles.d/**, and related directories define what actions to take.

The tool is automatically invoked during system boot by systemd services. Manual execution is typically only needed for testing configurations or one-time cleanup operations.

# CAVEATS

Running manually is usually not needed as systemd handles this automatically. It is possible to combine --create, --clean, and --remove in one invocation. Configuration syntax errors may prevent proper cleanup. Age-based cleanup requires properly configured time values. Part of the systemd suite.

# SEE ALSO

[systemctl](/man/systemctl)(1)
