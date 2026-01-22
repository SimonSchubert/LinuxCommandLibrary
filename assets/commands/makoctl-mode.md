# TLDR

**List** all currently active modes

```makoctl mode```

**Add** a mode

```makoctl mode -a [do-not-disturb]```

**Remove** a mode

```makoctl mode -r [do-not-disturb]```

**Toggle** a mode (add if absent, remove if present)

```makoctl mode -t [do-not-disturb]```

**Set specific modes**, replacing all current modes

```makoctl mode -s [mode1 mode2 ...]```

# SYNOPSIS

**makoctl mode** [_options_] [_mode_...]

# PARAMETERS

**-a _mode_**
> Add a mode to the active set

**-r _mode_**
> Remove a mode from the active set

**-t _mode_**
> Toggle a mode (add if inactive, remove if active)

**-s _modes_**
> Set the exact list of active modes, replacing all current modes

# DESCRIPTION

**makoctl mode** manages notification modes in the mako notification daemon. Modes allow changing notification behavior based on context—for example, enabling "do-not-disturb" to silence notifications during presentations or focus time.

Modes are defined in mako's configuration file with specific criteria and actions. When a mode is active, notifications matching that mode's criteria receive different treatment (hidden, grouped, styled differently, etc.).

Multiple modes can be active simultaneously, and their effects are combined according to mako's configuration rules.

# CAVEATS

Mode names must be defined in mako's configuration file before they can be used. Without configuration, modes have no effect. Changes are immediate and persist until explicitly removed or mako restarts.

# SEE ALSO

[makoctl](/man/makoctl)(1), [makoctl-invoke](/man/makoctl-invoke)(1), [mako](/man/mako)(5)
