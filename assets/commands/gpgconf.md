# TLDR

**List all GnuPG components**

```gpgconf --list-components```

**List directories used by GnuPG**

```gpgconf --list-dirs```

**Reload gpg-agent**

```gpgconf --reload gpg-agent```

**Kill gpg-agent**

```gpgconf --kill gpg-agent```

**Launch gpg-agent**

```gpgconf --launch gpg-agent```

**List options for a component**

```gpgconf --list-options [gpg-agent]```

**Apply default configuration**

```gpgconf --apply-defaults```

# SYNOPSIS

**gpgconf** [_options_] [_command_]

# SUBCOMMANDS

**--list-components**
> List installed GnuPG components.

**--list-dirs**
> List directories used by GnuPG.

**--list-options** _component_
> List options for component.

**--list-config**
> List global configuration.

**--check-options** _component_
> Check options for component.

**--apply-defaults**
> Apply default values.

**--reload** _component_
> Reload a component.

**--kill** _component_
> Kill a running component.

**--launch** _component_
> Launch a component.

**--check-programs**
> Check installed programs.

# DESCRIPTION

**gpgconf** is a utility for configuring GnuPG components. It can query and modify configuration files, manage daemons like gpg-agent, and apply settings programmatically. Commonly used to reload gpg-agent after configuration changes.

# SEE ALSO

[gpg](/man/gpg)(1), [gpg-agent](/man/gpg-agent)(1)

