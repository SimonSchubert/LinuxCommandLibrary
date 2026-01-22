# TLDR

**Display all ClamAV configuration** settings

```clamconf```

**Show configuration for a specific** config file

```clamconf -c [path/to/clamd.conf]```

**Display freshclam configuration** settings

```clamconf -f [path/to/freshclam.conf]```

**Generate example configuration** files

```clamconf -g [clamd.conf|freshclam.conf]```

**Show database information** only

```clamconf -n```

# SYNOPSIS

**clamconf** [_options_]

# PARAMETERS

**-c** _FILE_, **--config-file**=_FILE_
> Read clamd configuration from the specified file.

**-f** _FILE_, **--freshclam-file**=_FILE_
> Read freshclam configuration from the specified file.

**-g** _NAME_, **--generate-config**=_NAME_
> Generate example configuration file (clamd.conf or freshclam.conf).

**-n**, **--non-default**
> Only display non-default settings.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**clamconf** is a utility for displaying ClamAV configuration settings and virus database information. It reads the clamd and freshclam configuration files and presents their current values, making it useful for verifying settings and debugging configuration issues.

The tool shows both explicitly set values and default settings, highlighting which options differ from defaults. It also displays information about loaded virus signature databases, including database version, signature count, and build time.

System administrators use clamconf to verify ClamAV installations are correctly configured, generate example configuration files for new deployments, and troubleshoot scanning or update issues by examining the active settings.

# CAVEATS

clamconf reads configuration files but does not validate whether clamd or freshclam services are actually running with those settings. Changes to configuration files require restarting the respective services to take effect.

# HISTORY

clamconf was introduced as part of the **ClamAV** suite to simplify configuration management. ClamAV originated in **2001** and clamconf was added later to help administrators manage the increasingly complex configuration options as the antivirus engine evolved.

# SEE ALSO

[clamscan](/man/clamscan)(1), [clamd](/man/clamd)(8), [freshclam](/man/freshclam)(1), [clamav](/man/clamav)(1)
