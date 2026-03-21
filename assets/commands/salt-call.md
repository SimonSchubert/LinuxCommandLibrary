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

**Test mode** (dry run without making changes)

```salt-call state.apply test=True```

**Show output in JSON format**

```salt-call --output json grains.items```

**Run with debug logging**

```salt-call --log-level=debug state.apply```

# SYNOPSIS

**salt-call** [_options_] _function_ [_arguments_...]

# PARAMETERS

**--local**
> Run without connecting to a Salt master. Uses local file client.

**--grains**
> Return minion grain data.

**--pillar** _data_
> Set pillar data as a dictionary (e.g., '{"key": "value"}').

**--output** _format_
> Output format: json, yaml, nested, raw, highstate, quiet, etc.

**--state-output** _mode_
> State output verbosity: full, terse, mixed, changes.

**--log-level** _level_
> Log level: all, garbage, trace, debug, info, warning, error, critical, quiet.

**--id** _MINION_ID_
> Specify the minion ID (overrides the configured minion ID).

**--retcode-passthrough**
> Exit with the Salt command return code, useful for scripting.

**--no-color**
> Disable colored output.

# DESCRIPTION

**salt-call** runs Salt execution modules and states directly on a minion without going through the Salt master. This is useful for testing, debugging, and masterless Salt configurations where the minion applies states independently.

When used with **--local**, it operates completely independently of a master, making it ideal for standalone configuration management or testing states before deploying them across infrastructure.

# SEE ALSO

[salt](/man/salt)(1), [salt-run](/man/salt-run)(1), [salt-master](/man/salt-master)(1), [salt-minion](/man/salt-minion)(1), [salt-key](/man/salt-key)(1)

