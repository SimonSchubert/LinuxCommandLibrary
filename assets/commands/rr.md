# TLDR

**Record program execution**

```rr record [./program]```

**Replay recording**

```rr replay```

**List recordings**

```rr ls```

**Replay specific trace**

```rr replay [trace-directory]```

**Record with chaos mode**

```rr record --chaos [./program]```

**Pack trace for sharing**

```rr pack [trace-directory]```

# SYNOPSIS

**rr** _command_ [_options_] [_program_] [_args_]

# PARAMETERS

**record**
> Record execution.

**replay**
> Replay recording.

**ls**
> List traces.

**pack**
> Pack trace.

**--chaos**
> Randomize scheduling.

**-n**
> Number of processes.

**-h**
> Help for command.

# DESCRIPTION

**rr** records and replays execution. It enables deterministic debugging.

Record once, debug many. Reproduce bugs reliably.

Time-travel debugging. Step backwards through execution.

Integrates with GDB. Standard debugging interface.

Low overhead recording. Near native speed.

Chaos mode finds races. Randomizes scheduling.

# CAVEATS

Linux x86-64 only. Requires perf_event access. Some syscalls unsupported.

# HISTORY

**rr** was developed by **Mozilla** for debugging Firefox. It provides record-and-replay debugging for Linux.

# SEE ALSO

[gdb](/man/gdb)(1), [strace](/man/strace)(1), [perf](/man/perf)(1)
