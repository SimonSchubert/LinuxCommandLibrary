# TAGLINE

Unload all AppArmor profiles and disable enforcement

# TLDR

**Disable** all AppArmor profiles and stop enforcement

```sudo aa-teardown```

# SYNOPSIS

**aa-teardown**

# DESCRIPTION

**aa-teardown** tears down all AppArmor profiles and disables AppArmor enforcement. This command unloads all currently loaded profiles from the kernel, effectively removing AppArmor security restrictions from all confined processes.

This is typically used for troubleshooting when AppArmor profiles are causing issues, or when completely disabling AppArmor on a system.

# PARAMETERS

**-h, --help**
> Display help information

# CAVEATS

Running this command removes **all AppArmor security protections** from the system. Applications will run without any AppArmor confinement until profiles are reloaded.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-status](/man/aa-status)(8), [aa-disable](/man/aa-disable)(8), [aa-enforce](/man/aa-enforce)(8), [apparmor](/man/apparmor)(7)
