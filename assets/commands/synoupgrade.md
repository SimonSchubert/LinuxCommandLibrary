# TAGLINE

Synology firmware upgrade utility

# TLDR

**Check** for available upgrades

```sudo synoupgrade --check```

Check for **patches** only

```sudo synoupgrade --check-smallupdate```

**Download** latest upgrade

```sudo synoupgrade --download```

Download **patches** only

```sudo synoupgrade --download-smallupdate```

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

**synoupgrade** [_option_]

**synoupgrade** **--patch** _/path/to/file.pat_

# PARAMETERS

**--check**
> Check for available upgrades

**--check-smallupdate**
> Check for patches without upgrading the DSM version

**--download**
> Download latest upgrade

**--download-smallupdate**
> Download patches only

**--start**
> Start the upgrade process

**--auto**
> Automatically upgrade to latest version

**--auto-smallupdate**
> Automatically apply patches without upgrading the DSM version

**--patch** _file.pat_
> Upgrade from a local patch file (absolute path required)

# DESCRIPTION

**synoupgrade** is the command-line upgrade utility for Synology DiskStation Manager (DSM). It can check for, download and install DSM updates, or upgrade from a local .pat firmware file. Synology does not publish a reference for it, so run it without arguments to see the options on your DSM version.

# CAVEATS

Requires root privileges and SSH access to the NAS. Interruption during an upgrade can cause system corruption or data loss. Always backup critical data before upgrading.

# HISTORY

**synoupgrade** is developed by **Synology Inc.** as part of DiskStation Manager. It complements the web-based Control Panel upgrade interface.

# SEE ALSO

[synopkg](/man/synopkg)(8), [synoservice](/man/synoservice)(8)

# RESOURCES

```[Homepage](https://www.synology.com/en-global/dsm)```

<!-- verified: 2026-11-09 -->
