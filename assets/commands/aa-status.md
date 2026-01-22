# TLDR

Check **AppArmor status**

```sudo aa-status```

Display status in **JSON format**

```sudo aa-status --json```

Display status in **pretty JSON format**

```sudo aa-status --pretty-json```

Display the number of **loaded policies**

```sudo aa-status --profiled```

Display the number of **enforcing policies**

```sudo aa-status --enforced```

Display the number of **complaining policies**

```sudo aa-status --complaining```

Display the number of policies in **kill mode**

```sudo aa-status --kill```

# SYNOPSIS

**aa-status** [_option_]

# DESCRIPTION

**aa-status** reports various aspects of the current state of AppArmor confinement. By default, it outputs information about loaded profiles, their enforcement modes, and confined processes.

# PARAMETERS

**--enabled**
> Returns error code if AppArmor is not active

**--profiled**
> Shows count of loaded AppArmor policies

**--enforced**
> Shows count of enforcing policies

**--complaining**
> Shows count of non-enforcing policies

**--kill**
> Shows count of enforcing policies that terminate tasks on violations

**--special-unconfined**
> Shows count of unconfined mode policies

**--process-mixed**
> Shows processes confined by stacked profiles in different modes

**--verbose**
> Displays comprehensive AppArmor policy data (default behavior)

**--json**
> Outputs policy data in JSON format for machine processing

**--pretty-json**
> Provides human and machine-readable JSON output

**--help**
> Displays usage information

# CAVEATS

Exit codes indicate different states: **0** = enabled with policy, **1** = not enabled, **2** = enabled but no policy, **3** = control files unavailable, **4** = insufficient privileges.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-disable](/man/aa-disable)(8), [apparmor](/man/apparmor)(7)
