# TAGLINE

Remote execution and configuration management system

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

**salt** is the primary command-line interface for SaltStack, a remote execution and configuration management system. It sends commands from the Salt master to minions (managed nodes), executing them in parallel across potentially thousands of systems simultaneously and returning results.

Targeting determines which minions receive commands, using glob patterns (default), regular expressions (**-E**), grain-based matching (**-G**) for targeting by OS or hardware properties, or compound expressions (**-C**) combining multiple criteria. Execution modules provide hundreds of functions covering package management, file operations, service control, and system administration.

States define the desired configuration of systems declaratively using YAML files. The **state.apply** function ensures minions converge to the defined state, making Salt suitable for both ad-hoc command execution and systematic infrastructure management.

# CAVEATS

Requires Salt master/minion setup. Large infrastructure needs tuning. State complexity grows.

# HISTORY

**Salt** was created by **Thomas Hatch** and released in **2011**. It became **SaltStack**, later acquired by **VMware** in 2020.

# SEE ALSO

[salt-master](/man/salt-master)(1), [salt-minion](/man/salt-minion)(1), [salt-key](/man/salt-key)(1)
