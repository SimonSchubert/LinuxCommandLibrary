# TAGLINE

OpenWrt firmware upgrade tool

# TLDR

**Check** for available firmware upgrades

```owut check```

**Upgrade** firmware while retaining all packages and configuration

```owut upgrade```

**Download** a firmware image without installing it

```owut download```

**Upgrade** to a specific OpenWrt version

```owut upgrade -V [24.10.1]```

**Add packages** during the upgrade

```owut upgrade -a [package1] -a [package2]```

**Remove packages** during the upgrade

```owut upgrade -r [package_name]```

**List** all user-installed packages

```owut list```

**Show available** OpenWrt versions

```owut versions```

# SYNOPSIS

**owut** [_options_] _command_

# DESCRIPTION

**owut** (OpenWrt Upgrade Tool) is a command-line utility that upgrades OpenWrt router firmware by creating custom images through the Attended Sysupgrade (ASU) server. It builds personalized firmware images that retain all currently installed packages and configuration, then downloads, verifies, and installs them.

The tool communicates with the ASU server to request a build matching the device's current package set, optionally adding or removing packages. It handles the entire upgrade workflow: collecting device information, requesting a build, monitoring progress, downloading the image, verifying its integrity, and performing the sysupgrade.

# COMMANDS

**check**
> Collect all resources and report upgrade stats without performing any action.

**upgrade**
> Build, download, verify and install a firmware image.

**download**
> Build, download and verify an image without installing.

**verify**
> Verify a previously downloaded firmware image.

**install**
> Install a specified local firmware image.

**list**
> Show all packages installed by the user.

**versions**
> Show available OpenWrt versions.

**blob**
> Display the JSON blob for the ASU build request.

**dump**
> Collect all resources and dump internal data structures.

# PARAMETERS

**-V** _version_, **--version-to** _version_
> Specify the target version. Defaults to the currently installed version.

**-R** _code_, **--rev-code** _code_
> Specify a version code. Literal **none** is allowed. Defaults to latest build.

**-a** _package_, **--add** _package_
> Add a new package to the build list. Can be repeated.

**-r** _package_, **--remove** _package_
> Remove an installed package from the build list. Can be repeated.

**-i** _path_, **--image** _path_
> Image file path for download, verify, install and upgrade. Defaults to **/tmp/firmware.bin**.

**-I** _path_, **--init-script** _path_
> Path to a uci-defaults script to run on first boot. Use **-** to read from stdin.

**-F** _type_, **--fstype** _type_
> Desired root file system type: **squashfs**, **ext4**, **ubifs**, or **jffs2**.

**-S** _size_, **--rootfs-size** _size_
> Root file system size in MB. Use with caution.

**-p** _script_, **--pre-install** _script_
> Script to execute just prior to launching the final sysupgrade.

**-f** _format_, **--format** _format_
> Format for **list** output: **fs-user**, **fs-all**, or **config**.

**-k**, **--keep**
> Save all downloaded working files.

**--force**
> Force a build even when there are downgrades or no changes.

**--clean-slate**
> Remove all but default packages from the build.

**-v**, **--verbose**
> Print various diagnostics. Repeat for more output.

**-q**, **--quiet**
> Reduce verbosity. Repeat for total silence.

**-h**, **--help**
> Display help information.

**--version**
> Display version information.

# CAVEATS

owut requires OpenWrt **24.10 or later** (including main snapshots) due to its dependency on the **ucode-mod-uclient** package. For older OpenWrt versions (23.05 and earlier), use the **auc** package instead. The **--rootfs-size** option can render a device unbootable if misused. Firmware upgrades always carry risk and should be performed with a stable power source and network connection.

# HISTORY

owut was created by **efahl** and published on GitHub as an open-source project under the **GPL-2.0** license. It was developed as a successor to the **auc** (Attended Upgrade Client) tool, rewritten in **ucode** rather than C to be more maintainable and extensible. It became a standard OpenWrt package starting with version **24.10**, integrating with the Attended Sysupgrade server infrastructure that has been part of the OpenWrt ecosystem since **2017**.

# SEE ALSO

[sysupgrade](/man/sysupgrade)(1), [opkg](/man/opkg)(1)
