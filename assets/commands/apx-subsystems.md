# TAGLINE

Manage containerized subsystems for isolated package installations

# TLDR

**Create** new subsystem interactively

```apx subsystems new```

**Create** a subsystem from a named stack

```apx subsystems new --name [name] --stack [stack]```

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
> Create a new subsystem. Interactive unless name and stack are given.

**list**
> List all available subsystems

**reset**
> Reset a subsystem to its initial state

**rm**
> Remove a subsystem

**-n, --name** _name_
> Specify the subsystem name (new, reset, rm)

**-s, --stack** _stack_
> Specify the stack to base the subsystem on (new)

**-H, --home** _path_
> Set a custom home directory for the subsystem (new)

**-i, --init**
> Use systemd inside the subsystem container (new)

**-j, --json**
> Output the subsystem list as JSON (list)

**-f, --force**
> Force the operation without confirmation (reset, rm)

# CAVEATS

Subsystems require container runtime support. Removing or resetting a subsystem destroys its contents. Creating subsystems requires a compatible stack to be available.

# HISTORY

**apx** is the package manager for **Vanilla OS**, providing subsystem-based package management with support for multiple package managers.

# SEE ALSO

[apx](/man/apx)(1), [apx-stacks](/man/apx-stacks)(1), [distrobox](/man/distrobox)(1)

# RESOURCES

```[Source code](https://github.com/Vanilla-OS/apx)```

```[Homepage](https://apx.vanillaos.org/)```

```[Documentation](https://docs.vanillaos.org/docs/en/apx)```

<!-- verified: 2026-06-11 -->
