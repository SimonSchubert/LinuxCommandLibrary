# TAGLINE

Get or set process resource limits

# TLDR

Display **all limits** for current process

```prlimit```

Display limits for **specific process**

```prlimit -p [pid]```

Run command with **custom file limit**

```prlimit -n [1024] [command]```

# SYNOPSIS

**prlimit** [**-p** _pid_] [_limit_=_value_] [_command_]

# PARAMETERS

**-p, --pid _pid_**
> Process ID to query or modify

**-n, --nofile _limit_**
> Maximum number of open files

**-u, --nproc _limit_**
> Maximum number of processes

**-s, --stack _limit_**
> Maximum stack size

**-v, --as _limit_**
> Maximum virtual memory size

**-m, --rss _limit_**
> Maximum resident set size

# DESCRIPTION

**prlimit** gets or sets process resource limits. It can query limits for a running process or run a new command with specified limits. Limits can be set as soft:hard or just a single value for both.

The tool provides finer control than ulimit, allowing modification of another process's limits and setting both soft and hard limits simultaneously.

# CAVEATS

Modifying another process requires appropriate privileges. Hard limits can only be raised by root. Some limits may not be adjustable on all systems.

# HISTORY

**prlimit** is part of **util-linux**, providing a modern interface to the prlimit system call. It offers more flexibility than the shell built-in ulimit command.

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add util-linux-misc```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ulimit](/man/ulimit)(1), [getrlimit](/man/getrlimit)(2)
