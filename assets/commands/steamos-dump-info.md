# TAGLINE

Print basic SteamOS system information for debugging

# TLDR

**Print SteamOS system information**

```sudo steamos-dump-info```

**Show the copy logged to the kernel log** at boot

```sudo dmesg | grep "SteamOS System Info"```

**Check the boot-time service** that runs it

```systemctl status steamos-dump-info.service```

# SYNOPSIS

**steamos-dump-info**

# DESCRIPTION

**steamos-dump-info** is a small shell script from Valve's **steamos-customizations** package that prints a summary of the system state, with every line prefixed by **SteamOS System Info:**. It reports:

- The OS name (**PRETTY_NAME** from _/etc/os-release_)
- The current A/B root partition, as reported by **steamos-partition**
- The board and product serial numbers from _/sys/class/dmi/id_
- The first battery's model name, status and charge level
- The A/B boot configuration (boot attempts, boot count, boot time, invalid image flags) from **steamos-bootconf dump-config**

The **steamos-dump-info.service** systemd unit runs it once at every boot and writes its output to _/dev/kmsg_, so the information appears in the kernel log and in **journalctl -k**, where it is readily available in bug reports.

# CAVEATS

Must be run as root, otherwise it exits with an error. It takes no options. It is specific to SteamOS 3 (Steam Deck and other SteamOS devices). The output includes the device serial numbers, so redact them before sharing logs publicly. Values that cannot be read (for example in a virtual machine) are printed as placeholders instead of failing.

# HISTORY

Added to **steamos-customizations** by **Valve** in **2023** for SteamOS 3.

# SEE ALSO

[dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1), [systemctl](/man/systemctl)(1), [dmidecode](/man/dmidecode)(8), [steamos-finalize-install](/man/steamos-finalize-install)(1)
