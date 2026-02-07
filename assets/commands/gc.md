# TAGLINE

runtime garbage collection trigger

# TLDR

**Run garbage collection**

```gc```

**Force collection**

```gc -f```

**Collect specific generation**

```gc [generation]```

**Show collection stats**

```gc -v```

# SYNOPSIS

**gc** [_options_]

# PARAMETERS

**-f**, **--force**
> Force garbage collection.

**-v**, **--verbose**
> Show collection statistics.

**--help**
> Display help information.

# DESCRIPTION

**gc** triggers garbage collection in various runtime environments and shell contexts. The specific behavior depends on the shell or language environment.

In PowerShell, gc is an alias for Get-Content. In other contexts, it may trigger memory cleanup operations. The exact functionality varies by system.

The command is context-dependent and may have different meanings across shells and environments.

# CAVEATS

Behavior varies by shell/environment. May be an alias. Check your specific shell documentation.

# HISTORY

gc appears in various contexts as a command or alias. In shells like PowerShell, it's an alias for file operations. In other systems, it may relate to garbage collection.

# SEE ALSO

[cat](/man/cat)(1), [powershell](/man/powershell)(1)
