# TAGLINE

was the LVM system activity data collector for gathering I/O

# TLDR

Run the **collector** (legacy LVM1 systems only)

```lvmsadc```

Report **I/O statistics** using the device-mapper replacement

```dmstats report [/dev/mapper/device]```

# SYNOPSIS

**lvmsadc**

# DESCRIPTION

**lvmsadc** was the LVM system activity data collector for gathering I/O statistics on logical volumes. It collected raw performance data that could be analyzed with the companion tool **lvmsar**.

This command is **not supported under LVM2**. Modern LVM2 installations should use **dmstats** instead, which provides more comprehensive device-mapper statistics including histogram data and region-based measurements.

# CAVEATS

**Deprecated**: This command only works on legacy LVM1 systems. For LVM2, use **dmstats** to collect and report I/O statistics on device-mapper devices.

# INSTALL

```apt: sudo apt install lvm2```

```dnf: sudo dnf install lvm2```

```pacman: sudo pacman -S lvm2```

```apk: sudo apk add lvm2```

```zypper: sudo zypper install lvm2```

```nix: nix profile install nixpkgs#lvm2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvmsar](/man/lvmsar)(8), [iostat](/man/iostat)(1), [lvm](/man/lvm)(8)
