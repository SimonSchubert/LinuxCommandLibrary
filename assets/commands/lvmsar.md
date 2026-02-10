# TAGLINE

was the LVM system activity reporter for displaying I/O statistics on logical

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

# SEE ALSO

[lvmsadc](/man/lvmsadc)(8), [dmstats](/man/dmstats)(8), [sar](/man/sar)(1), [lvm](/man/lvm)(8)
