# TAGLINE

C++ auto-nice daemon that applies process rules for CPU, I/O, and affinity

# TLDR

Dump **parsed rules** currently loaded

```ananicy-cpp dump rules```

Dump configured **process types**

```ananicy-cpp dump types```

Dump rules as **JSON**

```ananicy-cpp dump rules --json```

**Validate** a rules file without applying it

```ananicy-cpp parse [path/to/file.rules]```

Enable and start the **systemd service**

```sudo systemctl enable --now ananicy-cpp.service```

# SYNOPSIS

**ananicy-cpp** _command_ [_options_]

# COMMANDS

**dump** **rules** [_--json_]
> Print currently parsed rules (optionally as JSON).

**dump** **types**
> Print configured process types.

**parse** _file.rules_
> Parse and validate a rules file without applying it.

# DESCRIPTION

**ananicy-cpp** is a C++ rewrite of the Ananicy auto-nice daemon. It watches processes and applies community or local rules that set niceness, CPU scheduler, I/O class, OOM score, cpuset affinity, and optional cgroup placement. The goal is the same as Ananicy: keep interactive programs snappy while background jobs (compilers, indexers) stay polite, with much lower CPU and memory use than the original Python daemon.

Rules live under **/etc/ananicy.d** (or **ANANICY_CPP_CONFDIR**) in `.rules` files. Types (`.types`) and cgroups (`.cgroups`) avoid repeating the same settings. Global options are in **/etc/ananicy.d/ananicy-cpp.conf** (or **ANANICY_CPP_CONF**). Original Ananicy rule sets can be copied into that directory as a drop-in starting point.

# CONFIGURATION

Global settings use `key=value` lines. Common keys include **check_freq** (full scan interval, default 60 seconds), **apply_nice**, **apply_sched**, **apply_ionice**, **apply_oom_score_adj**, **apply_cpuset**, **cgroup_load**, **type_load**, **rule_load**, and **loglevel**.

A rule is one JSON object per line:

```
{"name": "gcc", "nice": 19, "sched": "batch", "ioclass": "idle"}
{"name": "my-game", "cpuset": "performance-cores", "nice": -5}
```

Named cpuset aliases such as **big-cores**, **little-cores**, **x3d-cache**, **llc-N**, and **node-N** are resolved from detected CPU topology.

# CAVEATS

The daemon typically runs as root via systemd. **cgroup** placement generally requires root (there is no dedicated capability). cgroup v1 is recommended for full CPUQuota support. Realtime policies (**fifo**, **rr**) can starve the rest of the system if misused. I/O class and ionice only apply with the CFQ I/O scheduler.

# HISTORY

Ananicy was written by Nefelim4ag in Python. **ananicy-cpp** reimplements the same rule model with an event-based C++ scanner so RAM stays in kilobytes and CPU use is near idle.

# INSTALL

```pacman: sudo pacman -S ananicy-cpp```

```nix: nix profile install nixpkgs#ananicy-cpp```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[renice](/man/renice)(1), [ionice](/man/ionice)(1), [chrt](/man/chrt)(1), [taskset](/man/taskset)(1)

# RESOURCES

```[Source code](https://gitlab.com/ananicy-cpp/ananicy-cpp)```

<!-- verified: 2026-08-26 -->
