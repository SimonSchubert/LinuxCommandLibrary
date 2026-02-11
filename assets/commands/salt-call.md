# TAGLINE

Run Salt modules locally on a minion

# TLDR

**Run state locally**

```salt-call state.apply```

**Run specific state**

```salt-call state.apply [apache]```

**Execute module function**

```salt-call cmd.run 'uname -a'```

**Run in local mode**

```salt-call --local grains.items```

**Test mode**

```salt-call state.apply test=True```

# SYNOPSIS

**salt-call** [_options_] _function_ [_arguments_...]

# PARAMETERS

**--local**
> Run without master.

**--grains**
> Return minion grains.

**--pillar** _data_
> Set pillar data.

**--output** _format_
> Output format (json, yaml, etc.).

**--state-output** _mode_
> State output verbosity.

**--log-level** _level_
> Log level.

# DESCRIPTION

**salt-call** runs Salt execution modules and states directly on a minion. Useful for testing, debugging, and masterless Salt configurations. Part of SaltStack configuration management.

# SEE ALSO

[salt](/man/salt)(1), [salt-run](/man/salt-run)(1), [salt-master](/man/salt-master)(1)

