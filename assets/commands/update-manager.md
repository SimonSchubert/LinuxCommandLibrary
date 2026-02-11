# TAGLINE

Ubuntu graphical software update manager

# TLDR

**Launch the Software Updater** GUI

```update-manager```

**Check for distribution upgrade**

```update-manager -c```

**Check for updates** and launch GUI

```update-manager -d```

**Launch with no focus** (for notifications)

```update-manager --no-focus-on-map```

**Check for updates from proposed repository**

```update-manager -p```

# SYNOPSIS

**update-manager** [**-c**|**--check-dist-upgrades**] [**-d**|**--devel-release**] [**-p**|**--proposed**] [**--no-focus-on-map**]

# PARAMETERS

**-c**, **--check-dist-upgrades**
> Check if a new distribution release is available for upgrade.

**-d**, **--devel-release**
> Check for upgrades to the latest development release.

**-p**, **--proposed**
> Include updates from the proposed repository (pre-release updates).

**--no-focus-on-map**
> Do not focus the window when it appears. Useful for background notifications.

**--no-update**
> Do not check for updates when starting.

**-h**, **--help**
> Show help message.

# DESCRIPTION

**update-manager** is Ubuntu's graphical frontend for the apt package management system. Known as "Software Updater" in the application menu, it provides a user-friendly interface for checking and installing system updates.

The tool checks for available package updates, displays them with descriptions and sizes, and allows users to selectively install updates. It also detects when new Ubuntu releases are available and offers to perform distribution upgrades.

update-manager handles security updates, regular package updates, and major version upgrades. It integrates with Ubuntu's notification system to alert users when updates are available. For servers or command-line environments, the equivalent functionality is provided by **apt** or **apt-get**.

# CAVEATS

Requires a graphical environment (X11 or Wayland). For headless servers, use apt-get or apt instead. Distribution upgrades should be performed with adequate preparation and backups. Some updates may require a system restart to take effect.

# HISTORY

**update-manager** was developed by Canonical as part of Ubuntu's user-friendly desktop experience. It first appeared in early Ubuntu releases around **2004-2005** to make system updates accessible to users unfamiliar with command-line package management. The tool has evolved to include distribution upgrade capabilities and integration with Ubuntu's Long Term Support (LTS) release cycle.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [do-release-upgrade](/man/do-release-upgrade)(8), [unattended-upgrades](/man/unattended-upgrades)(8)
