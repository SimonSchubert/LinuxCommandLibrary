# TAGLINE

Report AppArmor profile and confinement status

# TLDR

Report which profiles are loaded and which processes they confine

```sudo aa-status```

Test whether AppArmor is **enabled at all**, for use in a script

```sudo aa-status --enabled```

Emit the same report as **machine-readable JSON**

```sudo aa-status --pretty-json```

Count the profiles that are **loaded**

```sudo aa-status --profiled```

Count the profiles that **block** violations

```sudo aa-status --enforced```

Count the profiles that only **log** violations

```sudo aa-status --complaining```

Count the profiles that **kill** offending tasks

```sudo aa-status --kill```

Count processes that have a profile but are running **unconfined**

```sudo aa-status --unconfined```

# SYNOPSIS

**aa-status** [_option_]

# DESCRIPTION

**aa-status** reports the current state of AppArmor confinement on the system. By default, it displays a summary of loaded profiles grouped by enforcement mode (enforce, complain, kill, unconfined), the number of confined processes, and which profiles apply to them. Individual flags can query specific counters for use in scripts. The **--json** and **--pretty-json** flags provide machine-parseable output suitable for monitoring and automation pipelines.

# PARAMETERS

**--enabled**
> Returns error code if AppArmor is not enabled

**--profiled**
> Shows count of loaded AppArmor policies

**--enforced**
> Shows count of enforcing policies

**--complaining**
> Shows count of non-enforcing (complain mode) policies

**--kill**
> Shows count of enforcing policies that terminate tasks on violations

**--prompt**
> Shows count of enforcing policies with fallback to userspace mediation

**--special-unconfined**
> Shows count of unconfined mode policies

**--process-mixed**
> Shows count of processes confined by profile stacks with profiles in different modes

**--verbose**
> Displays comprehensive AppArmor policy data (default behavior)

**--json**
> Outputs policy data in JSON format for machine processing

**--pretty-json**
> Provides human and machine-readable JSON output

**--count**
> Shows only counts for selected information

**--show** _TYPE_
> Specify what to display: processes, profiles, or all (default: all)

**--filter.mode** _REGEX_
> Filter output by profile mode using a POSIX regular expression

**--filter.profiles** _REGEX_
> Filter output by confining profile name using a POSIX regular expression

**--filter.pid** _REGEX_
> Filter output by process PID using a POSIX regular expression

**--filter.exe** _REGEX_
> Filter output by executable name using a POSIX regular expression

**--help**
> Displays usage information

# CAVEATS

Exit codes indicate different states: **0** = enabled with policy, **1** = not enabled, **2** = enabled but no policy, **3** = control files unavailable, **4** = insufficient privileges.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# INSTALL

```apt: sudo apt install apparmor```

```pacman: sudo pacman -S apparmor```

```apk: sudo apk add apparmor-utils```

```zypper: sudo zypper install apparmor-utils```

```nix: nix profile install nixpkgs#apparmor-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-disable](/man/aa-disable)(8), [apparmor](/man/apparmor)(7)
