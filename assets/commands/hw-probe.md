# TAGLINE

Probe Linux hardware and upload reports to the Linux hardware database

# TLDR

**Probe all hardware** and upload the report to linux-hardware.org

```sudo -E hw-probe -all -upload```

**Probe and run operability checks** (graphics, drive, CPU, memory)

```sudo -E hw-probe -all -check -upload```

**Probe locally** without uploading (saved under `/root/HW_PROBE/`)

```sudo -E hw-probe -all```

**Disable** specific log collectors

```sudo -E hw-probe -all -upload -disable [xdpyinfo,xorg.conf]```

**Tag a probe** with an inventory identifier

```sudo -E hw-probe -all -upload -i [INVENTORY_ID]```

**Generate** a new inventory ID linked to your email

```sudo -E hw-probe -generate-inventory -email [you@example.com]```

**Install a daily cron job** that probes the system and alerts on failures

```sudo -E hw-probe -start```

**Dump and decode** the ACPI tables (requires `acpica-tools`)

```sudo -E hw-probe -all -dump-acpi -decode-acpi -upload```

# SYNOPSIS

**hw-probe** [_options_]

# PARAMETERS

**-all**
> Probe for all hardware. Equivalent to enabling every individual probe collector.

**-probe**
> Probe for hardware (a lighter probe than **-all**).

**-logs**
> Collect system logs (dmesg, journal, lspci, lsusb, etc.).

**-log-level** _N_
> Set log collection verbosity: `mini`, `default`, or `maximal`.

**-upload**
> Upload the resulting probe to linux-hardware.org and print the public URL.

**-check**
> Run operability sanity tests on graphics, drive, CPU and memory.

**-check-graphics**
> Test integrated and discrete graphics with **glxgears**.

**-check-hdd**
> Test drive read speed with **hdparm**.

**-check-cpu**
> Test CPU using **dd** and **md5sum**.

**-check-memory**
> Test RAM with **memtester**.

**-id** _DESC_, **-name** _DESC_
> Set a custom name or description for the probe.

**-i** _ID_
> Tag the probe with an inventory identifier.

**-generate-inventory**, **-generate-inventory-id**
> Request a new inventory ID, linked to **-email**.

**-email** _ADDR_
> Email address to associate with a generated inventory ID.

**-disable** _A,B,C_
> Disable specific log collectors (e.g. `xdpyinfo,xorg.conf`).

**-enable** _A,B,C_
> Force-enable specific log collectors disabled by default.

**-dump-acpi**
> Dump the ACPI tables.

**-decode-acpi**
> Decode dumped ACPI tables (requires **acpica-tools**).

**-show**
> Show summary of probe data on the console.

**-verbose**
> Print detailed log output during probing.

**-pci-ids** _PATH_, **-usb-ids** _PATH_, **-sdio-ids** _PATH_, **-pnp-ids** _PATH_
> Use a custom IDs database file when decoding device IDs.

**-import** _DIR_
> Re-create probes from a directory of previously-saved probe data.

**-start**
> Install a daily cron job that probes the system and emails on hardware failure.

**-stop**
> Remove the daily cron job created by **-start**.

**-debug**
> Enable debug output and keep temporary files.

**-help**
> Print full usage information.

# DESCRIPTION

**hw-probe** collects a snapshot of a machine's hardware configuration and the related kernel/userspace logs, then optionally uploads it to the public **Linux Hardware Database** at linux-hardware.org. The uploaded probe gets a permanent URL that can be shared on bug trackers, mailing lists, or vendor support requests.

A probe combines the output of standard tools (lspci, lsusb, lscpu, dmidecode, smartctl, lshw, edid, dmesg, Xorg.log, etc.) into a structured, anonymized bundle. The database aggregates these reports to track hardware compatibility across Linux distributions, identify suitable drivers for unsupported devices, and recommend kernels known to work with a given configuration.

The tool also doubles as a self-monitoring agent: with **-start** it adds a cron job that runs daily, compares the new probe with the previous one and emails the user if a disk SMART error, missing device, or other anomaly appears. It is widely used by distributions, vendors, and end users to diagnose driver issues, plan upgrades, and inventory fleets of machines.

# CAVEATS

Most probes require **root** privileges to read SMART data, DMI tables and X session logs — invoke via `sudo -E` so that environment variables (notably `DISPLAY`) are preserved. A full probe with **-check** can take a minute or more because of memtester and disk timing tests. Uploaded probes are public; they are anonymized but inventory tags and machine names are kept verbatim, so do not include sensitive identifiers in **-id** or **-i**.

# CONFIGURATION

Local probes are written to `/root/HW_PROBE/LATEST/` (or `~/HW_PROBE/LATEST/` for non-root probes). The cron job created by **-start** lives in `/etc/cron.daily/hw-probe`. Decoding ACPI requires the **acpica-tools** package; reading SMART requires **smartmontools**; graphics checks require **mesa-utils** for **glxgears**.

# HISTORY

**hw-probe** was created by **Andrey Ponomarenko** as the front-end client for the Linux Hardware Database project, first released in **2018**. It is written in Perl and ships in the AUR, Debian/Ubuntu, Fedora, openSUSE and FreeBSD ports. The companion site, linux-hardware.org, has since collected millions of public probes used by kernel developers and distribution maintainers to track Linux hardware support over time.

# SEE ALSO

[lshw](/man/lshw)(1), [lspci](/man/lspci)(8), [lsusb](/man/lsusb)(8), [dmidecode](/man/dmidecode)(8), [hwinfo](/man/hwinfo)(8), [smartctl](/man/smartctl)(8), [inxi](/man/inxi)(1)
