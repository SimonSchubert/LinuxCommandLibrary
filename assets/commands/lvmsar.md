# TAGLINE

Deprecated LVM1 system activity reporter for logical volume I/O statistics

# TLDR

Run the **legacy reporter** (LVM1 systems only)

```lvmsar```

Report **I/O statistics** for a device using device-mapper stats

```dmstats report [/dev/mapper/device]```

**List statistics regions** for a device

```dmstats list [/dev/mapper/device]```

# SYNOPSIS

**lvmsar**

# DESCRIPTION

**lvmsar** was the LVM system activity reporter for displaying I/O statistics on logical volumes. It processed data collected by **lvmsadc** and presented performance metrics for analysis.

This command is **not supported under LVM2**. Modern systems should use **dmstats** instead, which provides comprehensive device-mapper statistics including read/write operations, throughput, and latency histograms.

# CAVEATS

**Deprecated**: This command only works on legacy LVM1 systems. For LVM2, use **dmstats report** to view I/O statistics on device-mapper devices.

# INSTALL

```apt: sudo apt install lvm2```

```dnf: sudo dnf install lvm2```

```pacman: sudo pacman -S lvm2```

```apk: sudo apk add lvm2```

```zypper: sudo zypper install lvm2```

```nix: nix profile install nixpkgs#lvm2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvmsadc](/man/lvmsadc)(8), [sar](/man/sar)(1), [lvm](/man/lvm)(8)
