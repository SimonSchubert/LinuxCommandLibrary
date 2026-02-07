# TAGLINE

File bug reports with automatic system diagnostics.

# TLDR

Report a bug about **the whole system**

```apport-bug```

Report a bug about a **specific package**

```apport-bug [package]```

Report a bug about a **specific executable**

```apport-bug [path/to/executable]```

Report a bug about a **specific process**

```apport-bug [PID]```

Report a bug about the **Linux kernel**

```apport-bug linux```

Report a bug from an existing **crash file**

```apport-bug [/var/crash/_bin_bash.1000.crash]```

# SYNOPSIS

**apport-bug** [_symptom_|_PID_|_package_|_program path_|_crash file_]

**apport-collect** _report-number_

# DESCRIPTION

**apport-bug** reports problems to your distribution's bug tracking system, using Apport to collect local system information that helps developers diagnose and fix issues more efficiently.

The recommended approach is to run the command without arguments to see a list of known symptoms and select the most relevant one. This generates the most useful bug reports.

The tool automatically detects the desktop environment and launches **apport-gtk** or **apport-kde** accordingly. If neither is available, or the session does not run under X11, it falls back to **apport-cli** for command-line interaction.

# CAVEATS

Only available on Ubuntu and Ubuntu-based distributions. Requires a configured Launchpad account to submit bug reports. Crash files in **/var/crash/** are automatically removed after approximately 7 days.

# HISTORY

Apport was developed by Canonical for Ubuntu, first introduced around **2006** as an automated crash reporting system. It evolved to include **apport-bug** as a user-facing tool for manually filing bug reports with automatically collected system diagnostics.

# SEE ALSO

[apport-cli](/man/apport-cli)(1), [apport-unpack](/man/apport-unpack)(1), [ubuntu-bug](/man/ubuntu-bug)(1)
