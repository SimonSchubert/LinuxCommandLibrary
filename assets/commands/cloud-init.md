# TAGLINE

cloud instance initialization and configuration

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

**cloud-init** is the industry standard for cloud instance initialization across all major cloud providers and Linux distributions. It handles early initialization of cloud instances including networking configuration, storage setup, SSH key injection, user account creation, and package installation.

Cloud-init reads configuration from various datasources including cloud provider metadata services, user-data scripts, and local configuration files. It runs during the boot process in multiple stages to ensure proper ordering of system configuration tasks.

The tool supports cloud-config YAML for declarative configuration, shell scripts for imperative setup, and can be extended with custom modules. It provides commands for querying instance metadata, validating configurations, and troubleshooting initialization issues.

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

# CONFIGURATION

**/etc/cloud/cloud.cfg**
> Main configuration file controlling modules, datasources, and default settings.

**/etc/cloud/cloud.cfg.d/*.cfg**
> Drop-in configuration files merged with the main config.

# CAVEATS

Primarily useful in cloud/virtual environments with metadata services. Running clean allows cloud-init to run again on next boot, which may reconfigure the system. Some commands require root privileges.

# HISTORY

**cloud-init** was originally developed for Ubuntu by Canonical and has become the de facto standard for cloud instance initialization across most Linux distributions and cloud providers.

# SEE ALSO

[cloud-config](/man/cloud-config)(5), [systemctl](/man/systemctl)(1)
