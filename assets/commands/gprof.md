# TAGLINE

GNU execution profiler

# TLDR

**Generate profile report**

```gprof [program] [gmon.out]```

**Flat profile only**

```gprof -p [program]```

**Call graph only**

```gprof -q [program]```

**Suppress static functions**

```gprof -a [program]```

**Output to file**

```gprof [program] > [profile.txt]```

# SYNOPSIS

**gprof** [_options_] [_executable_] [_profile-data_]

# PARAMETERS

**-p**, **--flat-profile**
> Print flat profile only.

**-q**, **--graph**
> Print call graph only.

**-b**, **--brief**
> Suppress explanatory text.

**-a**, **--no-static**
> Suppress static functions.

**-z**, **--display-unused-functions**
> Show functions never called.

**-c**, **--static-call-graph**
> Include static call graph.

**-A**, **--annotated-source**
> Print annotated source.

**-l**, **--line**
> Line-by-line profiling.

# DESCRIPTION

**gprof** analyzes program execution profiles to identify performance bottlenecks. It requires programs compiled with the **-pg** flag and produces reports showing time spent in each function and call relationships.

The tool generates two main reports: a flat profile showing time per function, and a call graph showing function relationships and cumulative times.

# WORKFLOW

```bash
# 1. Compile with profiling
gcc -pg -o program program.c

# 2. Run program (generates gmon.out)
./program

# 3. Analyze profile
gprof program gmon.out > analysis.txt
```

# CAVEATS

Requires recompilation with -pg. Adds overhead to execution. Sampling-based; short-running functions may be underrepresented. Modern alternatives include perf and valgrind.

# HISTORY

gprof was developed at **UC Berkeley** in the early **1980s** by Susan Graham, Peter Kessler, and Marshall McKusick. It became the standard Unix profiler and remains part of GNU binutils.

# SEE ALSO

[perf](/man/perf)(1), [valgrind](/man/valgrind)(1), [gcov](/man/gcov)(1), [gcc](/man/gcc)(1)
