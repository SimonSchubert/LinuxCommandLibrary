# TAGLINE

Control the systemd system update service

# TLDR

**Check** for updates

```updatectl check```

**Update** to latest version

```updatectl update```

Update a target to a **specific version**

```updatectl update [target]@[version]```

**List** update targets

```updatectl list```

Show **target** data

```updatectl list [target]```

List target **offline**

```updatectl --offline list [target]```

Update and **reboot**

```updatectl --reboot update [target]```

**Clean up** old versions

```updatectl vacuum [target]```

List optional **features**

```updatectl features```

**Enable** a feature and apply it immediately

```updatectl enable --now [feature]```

# SYNOPSIS

**updatectl** [_OPTIONS_] _COMMAND_ [_TARGET_...]

# COMMANDS

**list** [_TARGET_[@_VERSION_]]
> Show targets, the versions of a target, or details about one version

**check** [_TARGET_...]
> Check for available updates; all targets if none are given

**update** [_TARGET_[@_VERSION_]...]
> Update to the given or latest version; all targets if none are given

**vacuum** [_TARGET_...]
> Clean up old versions; all targets if none are given

**features** [_FEATURE_]
> List optional features, or show details about one

**enable** _FEATURE_..., **disable** _FEATURE_...
> Enable or disable optional features on the host

# PARAMETERS

**--offline**
> With **list**, use local data only, without fetching metadata from the network

**--reboot**
> With **update**, reboot after updates finish applying; with **enable**/**disable --now**, reboot after they finish

**--now**
> With **enable**, download and install features immediately; with **disable**, delete their downloaded resources

**-H**, **--host=** _HOST_
> Execute the operation remotely over SSH

**--no-ask-password**
> Do not query the user for authentication for privileged operations

**--no-pager**
> Do not pipe output into a pager

**--no-legend**
> Do not print column headers and footer hints

**-h, --help**
> Display help information

**--version**
> Print version string

# DESCRIPTION

**updatectl** checks for and installs system updates managed by **systemd-sysupdated.service**, the service counterpart to **systemd-sysupdate**. Update targets represent components of the system that can be updated independently, such as the host itself.

Enabling or disabling a feature only changes configuration by default: enabled features are downloaded at the next update, and disabled ones are cleaned up at the next update or vacuum, unless **--now** is given.

# CAVEATS

Available since systemd 257. Only useful on systems set up for systemd-sysupdate; it does not manage packages from a distribution's package manager. If any update fails, **--reboot** does not reboot.

# SEE ALSO

[systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/updatectl.html)```

<!-- verified: 2026-11-09 -->
