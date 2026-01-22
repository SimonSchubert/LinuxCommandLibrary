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

**--prefix _path_**
> Only apply to paths with specified prefix

**--exclude-prefix _path_**
> Exclude paths with specified prefix

**-E**
> Ignore configuration errors

# DESCRIPTION

**systemd-tmpfiles** creates, deletes, and cleans up volatile and temporary files and directories. Configuration files in **/etc/tmpfiles.d/**, **/usr/lib/tmpfiles.d/**, and related directories define what actions to take.

The tool is automatically invoked during system boot by systemd services. Manual execution is typically only needed for testing configurations or one-time cleanup operations.

# CAVEATS

Running manually is usually not needed as systemd handles this automatically. Configuration syntax errors may prevent proper cleanup. Age-based cleanup requires properly configured time values. Part of the systemd suite.

# SEE ALSO

[tmpfiles.d](/man/tmpfiles.d)(5), [systemd](/man/systemd)(1)
