# TAGLINE

ACPI event daemon

# TLDR

**Start** the ACPI daemon

```sudo acpid```

Start in **foreground** for debugging

```sudo acpid -f```

Start with custom **configuration directory**

```sudo acpid -c [/etc/acpi/events]```

Start with increased **debug** output

```sudo acpid -d```

# SYNOPSIS

**acpid** [_-c confdir_] [_-d_] [_-e eventfile_] [_-f_] [_-g group_] [_-l logfile_] [_options_]

# DESCRIPTION

**acpid** (ACPI Event Daemon) monitors ACPI events from the kernel and executes corresponding shell scripts or programs. It handles hardware events such as power button presses, lid closing, AC adapter changes, and battery status changes.

The daemon reads event configuration files from /etc/acpi/events/ and runs the associated scripts when matching events occur. This enables automatic responses to hardware events like suspending when the laptop lid closes or shutting down when the power button is pressed.

# PARAMETERS

**-c** _dir_
> Configuration directory for event files (default: /etc/acpi/events)

**-d**
> Enable debug mode with increased verbosity

**-e** _file_
> Event source file (default: /proc/acpi/event or /dev/input/event*)

**-f**
> Run in foreground (don't daemonize)

**-g** _group_
> Set socket group ownership

**-l** _file_
> Log file location (default: /var/log/acpid)

**-p** _file_
> PID file location

**-s** _file_
> Socket file for client connections

# CONFIGURATION

**/etc/acpi/events/**
> Directory containing event rule files. Each file defines an event pattern and an action (script) to execute when that event occurs.

**/etc/acpi/handler.sh**
> Default event handler script invoked by acpid when events match. Receives the event type and parameters as arguments.

# CAVEATS

Requires root privileges or appropriate permissions to access ACPI events. Event scripts must be executable. Modern systems using systemd may handle ACPI events through logind instead. Misconfigured scripts can interfere with power management.

# HISTORY

**acpid** was developed in the early **2000s** as Linux transitioned from APM (Advanced Power Management) to ACPI. Tim Hockin was an early maintainer. The daemon became a standard component for laptop power management on Linux systems.

# SEE ALSO

[acpi](/man/acpi)(1), [acpi_listen](/man/acpi_listen)(1), [systemctl](/man/systemctl)(1), [loginctl](/man/loginctl)(1)
