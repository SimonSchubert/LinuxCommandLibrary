# TLDR

**Check** for available upgrades

```sudo synoupgrade --check```

Check for **patches** only

```sudo synoupgrade --check-smallupdate```

**Download** latest upgrade

```sudo synoupgrade --download```

**Start** upgrade process

```sudo synoupgrade --start```

**Auto** upgrade to latest

```sudo synoupgrade --auto```

**Auto** apply patches only

```sudo synoupgrade --auto-smallupdate```

Upgrade from **patch file**

```sudo synoupgrade --patch [/path/to/file.pat]```

Display **help**

```synoupgrade```

# SYNOPSIS

**synoupgrade** [**-h**]

**synoupgrade** [**-p** _file.pat_] [**--no-reboot**]

**synoupgrade** [**--online** | **--online_download** | **--online_install**]

# PARAMETERS

**-h**
> Display help information

**-p, --patch** _file.pat_
> Upgrade from local patch file (absolute path required)

**--no-reboot**
> Prevent automatic reboot after upgrade

**--check**
> Check for available upgrades online

**--check-smallupdate**
> Check for patches without major version upgrade

**--download**
> Download latest upgrade

**--download-smallupdate**
> Download patches only

**--start**
> Start the upgrade process

**--auto**
> Automatically upgrade to latest version

**--auto-smallupdate**
> Automatically apply patches

**--online**
> Check online servers for updates

**--online_download**
> Download available updates

**--online_install**
> Install downloaded updates

# DESCRIPTION

**synoupgrade** is the firmware upgrade utility for Synology DiskStation Manager (DSM). It provides command-line control over the NAS operating system update process, enabling both manual upgrades from local patch files and automated online updates.

The tool handles DSM's proprietary .pat firmware packages and manages the complete upgrade workflow including download, verification, installation, and system reboot.

# CAVEATS

Requires root privileges. SSH access must be enabled on the NAS. Only accepts Synology .pat firmware files. Interruption during upgrade can cause system corruption or data loss. Always backup critical data before upgrading. The system typically reboots after upgrade unless --no-reboot is specified.

# HISTORY

**synoupgrade** is developed by **Synology Inc.** as part of DiskStation Manager. Synology NAS devices have been available since **2004**, with DSM evolving as the primary operating system. The command-line upgrade tool complements the web-based Control Panel upgrade interface.

# SEE ALSO

[synopkg](/man/synopkg)(8), [synoservice](/man/synoservice)(8)
