# TAGLINE

SlackBuilds.org package management tool

# TLDR

**Synchronize with the SlackBuilds.org repository**

```sbopkg -r```

**Launch the dialog interface**

```sbopkg```

**Install a package** from the command line

```sbopkg -i [package]```

**Install multiple packages** with dependencies in order

```sbopkg -i "[dep1] [dep2] [package]"```

**Check for updates** to installed SBo packages

```sbopkg -c```

**Search and inspect** a package

```sbopkg -s [package]```

**Build a package without installing**

```sbopkg -b [package]```

# SYNOPSIS

**sbopkg** [_-r_] [_-c_] [_-i package_] [_-b package_] [_-s package_] [_-g_]

# PARAMETERS

**-r**
> Synchronize with the remote SlackBuilds.org repository

**-c**
> Check for updates to installed SBo packages

**-i** _package_
> Install the specified package (quote multiple packages)

**-b** _package_
> Build a package without installing it

**-s** _package_
> Search and display package information (README, SlackBuild, .info)

**-g**
> Upgrade installed packages with available updates

**-V**
> Display version information

**-h**
> Display help and all command-line options

# DESCRIPTION

**sbopkg** is a tool for Slackware Linux that interfaces with the SlackBuilds.org (SBo) repository. It synchronizes a local copy of the repository, browses available packages, and automates building and installing third-party software.

The tool features both a dialog-based interactive interface and command-line options. It can view README files, SlackBuild scripts, and .info files, download source code with MD5 verification, and build Slackware packages. Queue files (.sqf) enable batch processing of multiple packages.

When the primary download URL fails, sbopkg can retrieve source from the SBo Source Archive as a fallback.

# CAVEATS

sbopkg does not handle dependencies automatically as this is not native to Slackware. Install dependencies manually in order, or specify all packages in quotes: **-i "dep1 dep2 package"**. Must be run as root.

# HISTORY

sbopkg was created to simplify access to SlackBuilds.org, a community repository of build scripts for Slackware packages. New versions are released to match each Slackware release, maintaining compatibility with both the distribution and the SBo repository.

# SEE ALSO

[slackpkg](/man/slackpkg)(8), [installpkg](/man/installpkg)(8), [upgradepkg](/man/upgradepkg)(8), [makepkg](/man/makepkg)(8)
