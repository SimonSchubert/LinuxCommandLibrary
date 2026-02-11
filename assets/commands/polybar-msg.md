# TAGLINE

Send IPC messages to running Polybar

# TLDR

**Send action to module**

```polybar-msg action [module] [action]```

**Toggle module visibility**

```polybar-msg action [module] toggle```

**Send hook to IPC module**

```polybar-msg hook [module] [hook_index]```

**Quit polybar**

```polybar-msg cmd quit```

# SYNOPSIS

**polybar-msg** [_options_] _command_ [_args_...]

# PARAMETERS

**action** _module_ _action_
> Send action to module.

**hook** _module_ _index_
> Trigger IPC hook.

**cmd** _command_
> Send command (quit, restart, hide, show, toggle).

**-p** _pid_
> Target specific polybar PID.

# DESCRIPTION

**polybar-msg** sends IPC messages to running polybar instances. Controls modules, triggers hooks, and manages polybar lifecycle. Used for dynamic bar updates and scripted interactions.

# SEE ALSO

[polybar](/man/polybar)(1)

