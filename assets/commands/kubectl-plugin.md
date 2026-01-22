# TLDR

**List installed plugins**

```kubectl plugin list```

**Show plugin info**

```kubectl plugin list --name-only```

# SYNOPSIS

**kubectl plugin** _command_ [_options_]

# PARAMETERS

**list**
> List installed plugins.

**--name-only**
> Show only plugin names.

**--help**
> Display help information.

# DESCRIPTION

**kubectl plugin** manages kubectl plugins. Plugins extend kubectl with custom commands.

The command discovers plugins in PATH matching kubectl-* pattern. Install plugins via krew or manually.

kubectl plugin lists extensions.

# CAVEATS

Subcommand of kubectl. Plugins must be executable. Consider krew for management.

# HISTORY

kubectl plugin support was added to **Kubernetes** to enable extensible command-line functionality.

# SEE ALSO

[kubectl](/man/kubectl)(1), [krew](/man/krew)(1)
