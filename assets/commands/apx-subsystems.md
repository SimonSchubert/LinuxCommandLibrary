# TAGLINE

Manage containerized subsystems for isolated package installations

# TLDR

**Create** new subsystem

```apx subsystems new```

**List** subsystems

```apx subsystems list```

**Reset** subsystem

```apx subsystems reset -n name```

**Force** reset

```apx subsystems reset -n name -f```

**Remove** subsystem

```apx subsystems rm -n name```

**Force** remove

```apx subsystems rm -n name -f```

# SYNOPSIS

**apx subsystems** _command_ [_OPTIONS_]

# DESCRIPTION

**apx subsystems** manages containerized subsystems in the apx package manager. Subsystems are containers created from pre-existing stacks, allowing isolated package installations with different package managers.

# PARAMETERS

**new**
> Interactively create a new subsystem

**list**
> List all available subsystems

**reset**
> Reset a subsystem to its initial state

**rm**
> Remove a subsystem

**-n, --name** _name_
> Specify subsystem name

**-f, --force**
> Force the operation without confirmation

# CAVEATS

Subsystems require container runtime support. Removing or resetting a subsystem destroys its contents. Creating subsystems requires a compatible stack to be available.

# HISTORY

**apx** is the package manager for **Vanilla OS**, providing subsystem-based package management with support for multiple package managers.

# SEE ALSO

[apx-stacks](/man/apx-stacks)(1), [distrobox](/man/distrobox)(1)
