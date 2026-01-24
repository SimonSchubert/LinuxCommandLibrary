# TLDR

**Ping all minions**

```salt '*' test.ping```

**Run command on minions**

```salt '*' cmd.run '[command]'```

**Target specific minion**

```salt '[minion-id]' test.ping```

**Apply state**

```salt '*' state.apply```

**Apply specific state**

```salt '*' state.apply [webserver]```

**Install package**

```salt '*' pkg.install [nginx]```

**Show grains**

```salt '[minion]' grains.items```

**Copy file**

```salt '*' cp.get_file [salt://file.txt] [/tmp/file.txt]```

# SYNOPSIS

**salt** [_target_] _function_ [_args_]

# PARAMETERS

_TARGET_
> Minion pattern.

_FUNCTION_
> Module.function to execute.

**-G** _GRAIN_
> Target by grain.

**-E**
> Regex target.

**-L**
> List target.

**-C**
> Compound target.

**--async**
> Async execution.

**--timeout** _SECS_
> Command timeout.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**salt** manages infrastructure with Salt remote execution. Commands run across many minions simultaneously.

Targeting selects which minions execute. Glob, regex, grain, and compound matching available.

Execution modules provide functions. cmd.run, pkg.install, file.managed, and many more.

States define desired configuration. Declarative approach to infrastructure.

Grains are minion metadata. OS, hardware, and custom properties.

# CAVEATS

Requires Salt master/minion setup. Large infrastructure needs tuning. State complexity grows.

# HISTORY

**Salt** was created by **Thomas Hatch** and released in **2011**. It became **SaltStack**, later acquired by **VMware** in 2020.

# SEE ALSO

[salt-master](/man/salt-master)(1), [salt-minion](/man/salt-minion)(1), [salt-key](/man/salt-key)(1)
