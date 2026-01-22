# TLDR

Perform a **dry run** to see which profiles would be removed

```sudo aa-remove-unknown -n```

**Remove** profiles that are no longer present in the configuration directory

```sudo aa-remove-unknown```

# SYNOPSIS

**aa-remove-unknown** [_-n_]

# DESCRIPTION

**aa-remove-unknown** removes AppArmor profiles that are currently loaded in the kernel but no longer have corresponding profile files in the configuration directory (**/etc/apparmor.d**). This helps clean up orphaned profiles after packages are removed or profiles are deleted.

# PARAMETERS

**-n, --dry-run**
> Show which profiles would be removed without actually removing them

**-h, --help**
> Display help information

# CAVEATS

Running without the **-n** flag will immediately unload orphaned profiles from the kernel. Use dry-run first to verify which profiles will be affected.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-status](/man/aa-status)(8), [aa-disable](/man/aa-disable)(8), [apparmor](/man/apparmor)(7)
