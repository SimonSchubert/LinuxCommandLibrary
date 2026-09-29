# TAGLINE

Run a command and kill every process it starts

# TLDR

Run a **build with a 30-second wall-clock limit**

```corral --wall 30s -- ./build.sh```

Cap **stdout and stderr together** and write an **audit JSON** record

```corral --wall 5m --max-output 1M --json [run.json] -- make test```

Force **cgroup v2 enforced mode** with memory and process limits

```corral-enforced --wall 30s --mem 512M --pids 64 -- ./build.sh```

Stay in **fallback mode** (no cgroup) and still reap leftovers

```corral --cgroup-mode=fallback --wall 10s -- [command]```

**Inherit stdin** instead of connecting it to `/dev/null`

```corral --stdin inherit --wall 30s -- [command]```

Print the **version**

```corral --version```

# SYNOPSIS

**corral** [_options_] [**--**] _command_ [_args_...]

**corral-enforced** [_options_] [**--**] _command_ [_args_...]

# PARAMETERS

**--wall** _DURATION_
> Wall-clock limit for the run. A duration is an integer with `ms`, `s`, `m`, or `h`; a bare integer is seconds

**--grace** _DURATION_
> Time between SIGTERM and SIGKILL (default **2s**). **0** skips SIGTERM and sends SIGKILL immediately

**--verify-timeout** _DURATION_
> Maximum time to drain and prove every leftover process has stopped after SIGKILL (default **2s**)

**--mem** _SIZE_
> Memory limit. Enforced mode only. A size is an integer of bytes with optional **K**, **M**, or **G** (powers of 1024)

**--pids** _COUNT_
> Maximum number of processes. Enforced mode only

**--max-output** _SIZE_
> Combined stdout plus stderr byte cap. The run ends when the cap is reached

**--cgroup-mode** _MODE_
> **auto** (default), **enforced**, or **fallback**. **auto** uses a cgroup v2 group when one can be created

**--cgroup-parent** _PATH_
> Delegated cgroup under which corral creates per-run groups

**--stdin** _POLICY_
> **null** (default: stdin is `/dev/null`) or **inherit**

**--json** _PATH_
> Write one JSON audit record for the run to _PATH_ (mode, limits, why it ended, step times, leftover pids)

**--quiet**
> Do not print the human summary line on stderr

**--version**
> Print the version and exit

**--help**
> Print usage and exit

**--**
> End of options. Everything after it is the command, even if it starts with `-`

# DESCRIPTION

**corral** runs a command with an optional time limit and, when it returns, no process that the command started is still alive. It verifies that before it returns. If it cannot prove it, it exits **120**, overriding every other exit code.

Typical runners signal the direct child or its process group and then wait until the output pipes close. That fails when a daemon double-forks and calls `setsid()`, when a background process keeps stdout or stderr open, or when a process ignores SIGTERM. Leftover processes keep ports, file locks, and CPU, and the next run can fail because of them.

corral controls the full process tree:

- **Enforced mode** puts the command in its own **cgroup v2** group. The kernel keeps every descendant in that group, and one write to `cgroup.kill` stops all of them. **--mem** and **--pids** apply only in this mode. It needs a delegated cgroup. The **corral-enforced** wrapper starts one with `systemd-run --user --scope -p Delegate=yes` and then execs **corral --cgroup-mode=enforced**.
- **Fallback mode** needs no cgroup. corral is a child subreaper, finds remaining processes through `/proc` (parent, process group, and session), and signals them through pidfds so a reused pid never gets the signal.

The run ends when the command exits, not when its pipes close. After each run, corral stops and reaps processes until none are left. In enforced mode the kernel must also report the group empty, and `rmdir` of the group must succeed.

The command is started in a new session so a signal to its group never reaches corral. Stdin is `/dev/null` unless **--stdin inherit** is set.

corral is not a security sandbox. It does not limit file access, network access, or privileges.

# EXIT CODES

**command's code**
> The command exited on its own

**128+N**
> Signal _N_ stopped the command, or corral itself received signal _N_ (130 for Ctrl-C)

**124**
> The wall-clock limit expired

**121**
> The memory limit was reached (enforced mode)

**122**
> The output limit was reached

**126**, **127**
> corral could not start the command (**127**: not found)

**125**
> Setup failed or an option is not correct. The command did not start

**120**
> corral could not prove that all processes stopped. This code overrides all others

# CAVEATS

Linux only. Needs Linux **5.11** or later, and **5.14** or later for enforced mode. Prebuilt binaries target x86-64 with glibc **2.36** or later.

The Homebrew formula and AUR packages named **corral** are ponylang's Pony dependency manager, not this process supervisor. Install from the GitHub release or build with CMake.

corral cannot see work the command starts outside its process tree (`systemd-run`, D-Bus, `at`). In enforced mode a process can leave the group if it writes to cgroupfs itself. In fallback mode corral cannot signal a setuid child and then exits **120**. If you stop corral with SIGKILL, only the direct child is sure to stop. There is no PTY support and no CPU-time limit.

# HISTORY

Written by Cardinal44. MIT licensed. Version **0.1.0** (2026-09-28).

# SEE ALSO

[timeout](/man/timeout)(1), [systemd-run](/man/systemd-run)(1), [prlimit](/man/prlimit)(1), [cgexec](/man/cgexec)(1), [kill](/man/kill)(1)

# RESOURCES

```[Source code](https://github.com/Cardinal44/corral)```

<!-- verified: 2026-09-30 -->
