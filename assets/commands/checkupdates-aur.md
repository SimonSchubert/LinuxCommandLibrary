# TAGLINE

check for AUR package updates

# TLDR

List pending updates for **AUR packages**

```checkupdates-aur```

List pending updates in **debug mode**

```CHECKUPDATES_DEBUG=1 checkupdates-aur```

# SYNOPSIS

**checkupdates-aur** [_options_]

# DESCRIPTION

**checkupdates-aur** checks for pending updates from the Arch User Repository (AUR). It reads the foreign packages reported by **pacman -Qm**, queries the AUR RPC interface for their current versions, and prints each outdated package in the same format as checkupdates: _name_ _local-version_ **->** _aur-version_.

This tool complements the standard checkupdates command by covering packages not in the official repositories, which makes it usable in update indicators and status bars. It is a small Perl script distributed on CPAN as **OS::CheckUpdates::AUR**.

# PARAMETERS

**-h**, **--help**
> Display a short usage message

# ENVIRONMENT

**CHECKUPDATES_DEBUG**
> Set to 1 to enable debug output (requires the Smart::Comments Perl module)

# CAVEATS

Arch Linux specific. Every foreign package (**pacman -Qm**) is looked up in the AUR, so locally built packages that are not in the AUR are silently skipped. Requires network access to query the AUR API. The last release (**0.04**) dates from **2016**; AUR helpers such as **yay -Qua** or **paru -Qua** offer the same check and are actively maintained.

# SEE ALSO

[checkupdates](/man/checkupdates)(1), [yay](/man/yay)(1), [paru](/man/paru)(1), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://metacpan.org/dist/OS-CheckUpdates-AUR)```

<!-- verified: 2026-11-23 -->
