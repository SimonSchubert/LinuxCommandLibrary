# TAGLINE

Suspend system to RAM

# TLDR

**Suspend to RAM**

```sudo pm-suspend```

**Suspend with quirks**

```sudo pm-suspend --quirk-dpms-on```

**Suspend and set auto-resume**

```sudo pm-suspend --auto-quirks```

# SYNOPSIS

**pm-suspend** [_options_]

# PARAMETERS

**--quirk-dpms-on**
> Turn display on after resume.

**--quirk-vbe-post**
> POST video after resume.

**--quirk-s3-bios**
> S3 BIOS quirk.

**--auto-quirks**
> Automatically detect quirks.

**--help**
> Show help.

# DESCRIPTION

**pm-suspend** puts the system into suspend (sleep) mode, also known as S3 or suspend-to-RAM. The system state is preserved in RAM while power consumption is minimized.

Part of pm-utils power management utilities.

# EXAMPLES

```bash
# Simple suspend
sudo pm-suspend

# With video quirks
sudo pm-suspend --quirk-vbe-post

# Suspend with all auto quirks
sudo pm-suspend --auto-quirks

# Hibernate instead (suspend to disk)
sudo pm-hibernate
```

# HOOKS

Custom scripts in /etc/pm/sleep.d/ run before suspend and after resume:
```bash
#!/bin/bash
case "$1" in
    suspend|hibernate)
        # Before sleep
        ;;
    resume|thaw)
        # After wake
        ;;
esac
```

# CAVEATS

Deprecated on systemd systems (use systemctl suspend). Requires working ACPI. May need quirks for some hardware.

# HISTORY

pm-utils was developed by **Peter Jones** and the Fedora team for Linux power management before systemd.

# SEE ALSO

[pm-hibernate](/man/pm-hibernate)(8), [systemctl](/man/systemctl)(1), [rtcwake](/man/rtcwake)(8)
