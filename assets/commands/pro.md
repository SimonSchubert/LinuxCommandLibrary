# TLDR

**Attach** system to Ubuntu Pro

```sudo pro attach```

Display **status**

```pro status```

**Fix** a specific vulnerability

```pro fix [CVE-2023-1234]```

Display **security status**

```pro security-status```

List **unavailable** packages

```pro security-status --unavailable```

List **third-party** packages

```pro security-status --thirdparty```

# SYNOPSIS

**pro** [**attach**|**status**|**fix**|**security-status**] [_options_]

# COMMANDS

**attach**
> Connect system to Ubuntu Pro subscription

**detach**
> Disconnect from Ubuntu Pro

**status**
> Show Ubuntu Pro service status

**fix**
> Apply fixes for specific CVEs or USNs

**security-status**
> Show security support status

**enable**
> Enable specific Pro services

**disable**
> Disable specific Pro services

# PARAMETERS

**--unavailable**
> Show packages no longer available

**--thirdparty**
> Show third-party packages

**--format _format_**
> Output format (json, yaml)

# DESCRIPTION

**pro** manages Ubuntu Pro (formerly Ubuntu Advantage) services and subscriptions. It provides extended security maintenance, kernel livepatch, and compliance tools for Ubuntu systems.

The tool can automatically apply security fixes and provides visibility into the security status of installed packages.

# CAVEATS

Requires Ubuntu Pro subscription for most features. Free tier available for personal use. Some services require reboot to activate.

# HISTORY

**pro** replaced the **ubuntu-advantage-tools** command, providing a simpler interface to Ubuntu's commercial support services. It was renamed to align with the Ubuntu Pro branding.

# SEE ALSO

[apt](/man/apt)(8), [unattended-upgrades](/man/unattended-upgrades)(8)
