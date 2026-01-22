# TLDR

Display the **status** of the most recent cloud-init run

```cloud-init status```

**Wait** for cloud-init to finish and report status

```cloud-init status --wait```

**List** available top-level metadata keys

```cloud-init query --list-keys```

**Query** cached instance metadata

```cloud-init query [dot_delimited_variable_path]```

**Clean** logs and artifacts to allow cloud-init to rerun

```cloud-init clean```

# SYNOPSIS

**cloud-init** [_options_] _command_ [_arguments_]

# DESCRIPTION

**cloud-init** is the industry standard for cloud instance initialization. It handles early initialization of cloud instances including networking, storage, SSH keys, user accounts, and package installation.

Cloud-init reads configuration from various datasources (cloud provider metadata, user-data) and applies it during boot.

# PARAMETERS

**status**
> Report cloud-init status

**query** _key_
> Query instance metadata

**clean**
> Remove logs and artifacts

**collect-logs**
> Gather debugging information

**schema**
> Validate cloud-config files

# CAVEATS

Primarily useful in cloud/virtual environments with metadata services. Running clean allows cloud-init to run again on next boot, which may reconfigure the system. Some commands require root privileges.

# HISTORY

**cloud-init** was originally developed for Ubuntu by Canonical and has become the de facto standard for cloud instance initialization across most Linux distributions and cloud providers.

# SEE ALSO

[cloud-config](/man/cloud-config)(5), [systemctl](/man/systemctl)(1)
