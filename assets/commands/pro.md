# TAGLINE

Manage Ubuntu Pro services and subscriptions

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

**refresh**
> Refresh contract and service information

**cve** _id_
> Show information about a CVE

**cves**
> List CVEs that affect the system

**collect-logs**
> Collect logs and relevant system information

**api**
> Call the Client API endpoints

# PARAMETERS

**--unavailable**
> Show packages no longer available

**--thirdparty**
> Show third-party packages

**--esm-infra**, **--esm-apps**
> Show packages from the respective ESM archive (with security-status)

**--dry-run**
> Show what **fix** would do without applying it

**--no-related**
> Do not fix related USNs (with fix)

**--format _format_**
> Output format (json, yaml or others, depending on the command)

# DESCRIPTION

**pro** manages Ubuntu Pro (formerly Ubuntu Advantage) services and subscriptions. It provides extended security maintenance, kernel livepatch, and compliance tools for Ubuntu systems.

The tool can automatically apply security fixes and provides visibility into the security status of installed packages.

# CAVEATS

Requires Ubuntu Pro subscription for most features. Free tier available for personal use. Some services require reboot to activate.

# HISTORY

**pro** replaced the older **ua** command from the **ubuntu-advantage-tools** package, and was renamed to align with the Ubuntu Pro branding.

# SEE ALSO

[apt](/man/apt)(8), [unattended-upgrades](/man/unattended-upgrades)(8)

# RESOURCES

```[Source code](https://github.com/canonical/ubuntu-pro-client)```

```[Documentation](https://ubuntu.com/pro-client/docs/en/latest/)```

<!-- verified: 2026-11-08 -->
