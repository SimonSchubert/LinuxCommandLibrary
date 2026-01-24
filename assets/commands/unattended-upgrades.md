# TLDR

**Run unattended upgrades** manually

```sudo unattended-upgrades```

**Simulate upgrades** without installing (dry run)

```sudo unattended-upgrades --dry-run```

**Run with verbose output**

```sudo unattended-upgrades -v```

**Run with debug output**

```sudo unattended-upgrades -d```

**Configure automatic updates** interactively

```sudo dpkg-reconfigure -plow unattended-upgrades```

**Check if automatic updates are enabled**

```cat /etc/apt/apt.conf.d/20auto-upgrades```

# SYNOPSIS

**unattended-upgrades** [**-d**] [**-v**] [**--dry-run**] [**--minimal-upgrade-steps**]

# PARAMETERS

**-d**, **--debug**
> Enable extra debug output to /var/log/unattended-upgrades/unattended-upgrades.log.

**-v**, **--verbose**
> Show verbose output during operation.

**--dry-run**
> Simulate the upgrade process without actually installing packages.

**--apt-debug**
> Enable detailed APT/LibAPT output for debugging.

**--minimal-upgrade-steps**
> Perform upgrade in minimal steps, allowing cancellation with SIGINT. This is the default.

**--no-minimal-upgrade-steps**
> Perform upgrade without minimal steps.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**unattended-upgrades** automatically installs security updates and optionally other upgrades on Debian and Ubuntu systems. It runs daily via systemd timers (apt-daily.timer and apt-daily-upgrade.timer) to keep the system patched without manual intervention.

The tool is configured through apt configuration files, primarily /etc/apt/apt.conf.d/50unattended-upgrades for allowed origins and options, and /etc/apt/apt.conf.d/20auto-upgrades for enabling automatic updates. By default, only security updates are installed automatically.

Configuration options include email notifications, automatic removal of unused dependencies, automatic reboots if required, and blacklisting specific packages from automatic updates. The tool logs its activity to /var/log/unattended-upgrades/.

Both **unattended-upgrades** and **unattended-upgrade** commands work identically; one is a symlink to the other.

# CAVEATS

Automatic updates can cause issues if packages have breaking changes or require manual configuration. Automatic reboots should be carefully considered for production servers. Some packages may be held back if they require configuration prompts. Check logs regularly to ensure updates are applying successfully.

# HISTORY

**unattended-upgrades** was developed for **Debian** and **Ubuntu** to automate security patching. It became the default automatic update mechanism in Ubuntu, included by default since at least **Ubuntu 16.04**. The tool evolved from cron-based execution to systemd timers for more reliable scheduling and better integration with modern init systems.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1), [systemctl](/man/systemctl)(1)
