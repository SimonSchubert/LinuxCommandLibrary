# TAGLINE

Suspend system to RAM

# TLDR

**Suspend to RAM (S3)**

```sudo pm-suspend```

**Turn display on after resume if it stays blank**

```sudo pm-suspend --quirk-dpms-on```

**Re-POST the video BIOS on resume**

```sudo pm-suspend --quirk-vbe-post```

**Save/restore PCI config for the VGA card**

```sudo pm-suspend --quirk-save-pci```

**Persist quirks that worked to the last-known-working DB**

```sudo pm-suspend --store-quirks-as-lkw```

# SYNOPSIS

**pm-suspend** [_--quirk-*_] [_--store-quirks-as-lkw_] [_--help_]

# PARAMETERS

**--quirk-dpms-on**
> Use DPMS to turn the display on after resume if it remains blank.

**--quirk-dpms-suspend**
> Use DPMS to switch the display off before suspending.

**--quirk-radeon-off**
> Disable Radeon display before suspend, re-enable on resume (legacy ThinkPads).

**--quirk-s3-bios**
> Call the video BIOS during S3 resume.

**--quirk-s3-mode**
> Set the video card to VGA text mode, then call the BIOS on resume.

**--quirk-vbe-post**
> Re-POST the video card via the VESA BIOS on resume.

**--quirk-vbemode-restore**
> Save and restore the VESA mode across suspend to prevent X corruption.

**--quirk-vbestate-restore**
> Save and restore low-level video state around suspend.

**--quirk-vga-mode-3**
> Force VGA text mode 3 on resume.

**--quirk-save-pci**
> Save and restore the PCI configuration space of the VGA card.

**--store-quirks-as-lkw**
> If the invocation succeeds, write the quirks used to `/var/cache/pm-utils/last_known_working.quirkdb` so they are applied automatically next time.

**--help**
> Show help.

# DESCRIPTION

**pm-suspend** puts the machine into ACPI S3 (suspend-to-RAM). Most devices are powered off, but system state is preserved in RAM, allowing near-instant resume at the cost of continuous (small) power draw. Typical laptops can maintain S3 for one to three days on battery.

**pm-suspend** is part of **pm-utils**. It runs hook scripts in `/etc/pm/sleep.d/` and `/usr/lib/pm-utils/sleep.d/` before sleeping and again on resume. Hooks receive `suspend`/`resume` (or `hibernate`/`thaw`) as their first argument:

```bash
#!/bin/sh
case "$1" in
    suspend|hibernate) : # before sleep ;;
    resume|thaw)       : # after wake ;;
esac
```

Video hardware is the most common source of resume failures; the `--quirk-*` flags apply well-known workarounds. Use `pm-suspend --auto-quirks` (when supplied by the distribution) or combine `--store-quirks-as-lkw` with the quirks that fix your machine to make them persistent.

# CAVEATS

Deprecated on systemd-based distributions; prefer **systemctl suspend** (which uses systemd-logind and systemd-sleep). Requires root and a working ACPI/kernel suspend path. The right set of `--quirk-*` flags is hardware-specific; try them one at a time when troubleshooting black screens on resume.

# HISTORY

**pm-utils** was developed by **Richard Hughes**, **Peter Jones**, and the Fedora/openSUSE power-management teams in the late 2000s as a replacement for the older `hal`-based scripts. It became the standard suspend/hibernate frontend on most Linux distributions until superseded by **systemd-logind** and **systemd-sleep** around 2012-2015.

# SEE ALSO

[systemctl](/man/systemctl)(1), [rtcwake](/man/rtcwake)(8)
