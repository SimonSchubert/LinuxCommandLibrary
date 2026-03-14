# TAGLINE

ClamAV configuration display and generation tool

# TLDR

**Display all ClamAV configuration** settings

```clamconf```

**Show configuration from a specific directory**

```clamconf -c [/etc/clamav]```

**Generate an example clamd.conf file**

```clamconf -g clamd.conf```

**Generate an example freshclam.conf file**

```clamconf -g freshclam.conf```

**Display only non-default settings**

```clamconf -n```

# SYNOPSIS

**clamconf** [_options_]

# PARAMETERS

**-c** _DIR_, **--config-dir**=_DIR_
> Search for clamd.conf and freshclam.conf in the specified directory.

**-g** _NAME_, **--generate-config**=_NAME_
> Generate example configuration file (clamd.conf or freshclam.conf).

**-n**, **--non-default**
> Only display non-default settings.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**clamconf** is a utility for displaying ClamAV configuration settings, compilation-time values, OS details, and virus database information. It reads the clamd and freshclam configuration files and presents their current values, making it useful for verifying settings and debugging configuration issues.

The tool shows both explicitly set values and default settings, highlighting which options differ from defaults. It also displays information about loaded virus signature databases, including database version, signature count, and build time. The design is inspired by Postfix's **postconf** utility.

System administrators use clamconf to verify ClamAV installations are correctly configured, generate example configuration files for new deployments, and troubleshoot scanning or update issues by examining the active settings.

# CONFIGURATION

**/etc/clamav/clamd.conf**
> ClamAV daemon configuration file.

**/etc/clamav/freshclam.conf**
> Virus database update configuration file.

# CAVEATS

clamconf reads configuration files but does not validate whether clamd or freshclam services are actually running with those settings. Changes to configuration files require restarting the respective services to take effect.

# HISTORY

clamconf was introduced as part of the **ClamAV** suite to simplify configuration management. ClamAV originated in **2001** and clamconf was added later to help administrators manage the increasingly complex configuration options as the antivirus engine evolved.

# SEE ALSO

[clamscan](/man/clamscan)(1), [clamd](/man/clamd)(8), [freshclam](/man/freshclam)(1), [clamav](/man/clamav)(1)
