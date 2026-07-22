# TAGLINE

ACPI event monitor

# TLDR

**Listen** to any ACPI event while the daemon is running

```acpi_listen```

# SYNOPSIS

**acpi_listen** [_-h_]

# DESCRIPTION

**acpi_listen** monitors and displays ACPI (Advanced Configuration and Power Interface) events from the kernel in real-time. Events include power button presses, lid open/close, AC adapter connection, battery status changes, and thermal events.

The tool connects to the **acpid** daemon socket to receive events. Each event is printed to standard output as it occurs.

# PARAMETERS

**-h, --help**
> Display help information

# CAVEATS

Requires the **acpid** daemon to be running. Events will not be received if acpid is not active or if the user lacks permission to access the ACPI socket.

# HISTORY

Part of the **acpid** (ACPI daemon) package, which provides a framework for handling ACPI events on Linux systems.

# INSTALL

```apt: sudo apt install acpid```

```dnf: sudo dnf install acpid```

```pacman: sudo pacman -S acpid```

```apk: sudo apk add acpid```

```zypper: sudo zypper install acpid```

```nix: nix profile install nixpkgs#acpid```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[acpi](/man/acpi)(1), [acpid](/man/acpid)(8), [acpi_available](/man/acpi_available)(1)

# RESOURCES

```[Source code](https://sourceforge.net/projects/acpid2/)```

<!-- verified: 2026-06-10 -->
