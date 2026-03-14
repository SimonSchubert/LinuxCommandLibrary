# TAGLINE

Remove packages on Mageia Linux

# TLDR

**Uninstall** a package

```sudo urpme [package]```

Remove **orphan** packages no longer needed

```sudo urpme --auto-orphans```

Remove a package and **automatically confirm**

```sudo urpme --auto [package]```

**Simulate** package removal without actually removing

```urpme --test [package]```

Remove package and clean up **orphaned dependencies**

```sudo urpme --auto-orphans [package]```

# SYNOPSIS

**urpme** [_OPTIONS_] _PACKAGE_...

# PARAMETERS

**--auto-orphans**
> Remove orphaned packages (no longer needed as dependencies).

**--auto**
> Automatically confirm removal without prompting.

**--test**
> Simulate removal without actually changing the system.

**--justdb**
> Update only the RPM database, do not remove files.

**--noscripts**
> Do not execute package scriptlets during removal.

**-a**
> Remove all matching packages if name is ambiguous.

**-v, --verbose**
> Verbose output.

# DESCRIPTION

**urpme** uninstalls packages in Mageia Linux. It handles package removal including dependency checking and can automatically remove orphaned packages that are no longer needed by any installed package.

Part of the urpmi package management suite for Mageia (formerly Mandriva Linux).

# CAVEATS

Mageia-specific tool. Use --auto-orphans carefully as it may remove packages you still need indirectly. Requires root privileges for actual removal. Use --test first to preview changes.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmq](/man/urpmq)(8), [urpmi.update](/man/urpmi.update)(8), [rpm](/man/rpm)(8)
