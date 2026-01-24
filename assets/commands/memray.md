# TLDR

**Profile memory usage**

```memray run [script.py]```

**Profile with output file**

```memray run -o [output.bin] [script.py]```

**Generate flame graph**

```memray flamegraph [output.bin]```

**Generate summary report**

```memray summary [output.bin]```

**Live memory view**

```memray run --live [script.py]```

**Profile with native tracking**

```memray run --native [script.py]```

**Generate tree view**

```memray tree [output.bin]```

**Attach to running process**

```memray attach [pid]```

# SYNOPSIS

**memray** [_run_] [_flamegraph_] [_summary_] [_tree_] [_attach_] [_options_] [_args_]

# PARAMETERS

**run** _SCRIPT_
> Profile script execution.

**flamegraph** _FILE_
> Generate flame graph HTML.

**summary** _FILE_
> Show allocation summary.

**tree** _FILE_
> Show tree view of allocations.

**stats** _FILE_
> Show statistics.

**table** _FILE_
> Show table of allocations.

**attach** _PID_
> Attach to running process.

**-o** _FILE_, **--output** _FILE_
> Output file for profile data.

**--live**
> Show live memory view.

**--native**
> Track native (C/C++) allocations.

**--follow-fork**
> Follow child processes.

**-f**, **--force**
> Overwrite existing output.

# DESCRIPTION

**memray** profiles Python memory allocations, tracking where memory is allocated and by which code. It helps identify memory leaks, high-water marks, and allocation patterns.

The tool tracks every allocation and deallocation, recording stack traces. Post-run analysis generates visualizations showing memory usage over time and by location.

Flame graphs show allocation call stacks, with width representing allocation size. They quickly identify which functions allocate most memory.

Live mode provides real-time visualization during execution. It's useful for understanding memory patterns in long-running applications.

Native tracking includes C extension allocations, not just Python objects. This reveals memory used by numpy, pandas, and other libraries with native components.

Process attachment profiles already-running applications, useful for production debugging without restart.

# CAVEATS

Tracking overhead slows execution. Large profiles consume disk space. Native tracking requires debug symbols for readable output. Some allocations may be missed in highly optimized code.

# HISTORY

**memray** was developed by **Bloomberg** and released as open source in **2022**. It was designed for debugging memory issues in large-scale Python applications used in financial services.

# SEE ALSO

[py-spy](/man/py-spy)(1), [tracemalloc](/man/tracemalloc)(3), [valgrind](/man/valgrind)(1), [heaptrack](/man/heaptrack)(1)
