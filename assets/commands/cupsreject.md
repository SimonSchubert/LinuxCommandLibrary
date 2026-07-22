# TAGLINE

prevent printer from accepting new jobs

# TLDR

**Reject new print jobs** for a printer

```cupsreject [printer_name]```

**Reject with reason message**

```cupsreject -r "[printer offline]" [printer_name]```

# SYNOPSIS

**cupsreject** [_options_] _destination(s)_

# PARAMETERS

**-r** _reason_
> Set reason message for rejecting.

**-h** _server[:port]_
> Connect to specific server.

# DESCRIPTION

**cupsreject** instructs the printing system to reject new print jobs for the specified destinations. Existing jobs in the queue are not affected.

Use **cupsaccept** to accept jobs again. Requires administrator privileges.

# INSTALL

```apt: sudo apt install cups-client```

```dnf: sudo dnf install cups-client```

```pacman: sudo pacman -S cups```

```apk: sudo apk add cups```

```zypper: sudo zypper install cups-client```

```brew: brew install cups```

```nix: nix profile install nixpkgs#cups```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cupsaccept](/man/cupsaccept)(1), [cupsdisable](/man/cupsdisable)(1)

# RESOURCES

```[Source code](https://github.com/OpenPrinting/cups)```

```[Homepage](https://www.cups.org)```

```[Documentation](https://openprinting.github.io/cups/)```

<!-- verified: 2026-06-26 -->
