# TAGLINE

Python deterministic profiler

# TLDR

**Profile a Python script**

```python -m cProfile [script.py]```

**Profile and sort by cumulative time**

```python -m cProfile -s cumtime [script.py]```

**Profile and save to file**

```python -m cProfile -o [profile.prof] [script.py]```

**Sort by total time in function**

```python -m cProfile -s tottime [script.py]```

**Profile specific function in code**

```import cProfile; cProfile.run('[function_call()]')```

**View saved profile with pstats**

```python -c "import pstats; p = pstats.Stats('[profile.prof]'); p.sort_stats('cumtime').print_stats(20)"```

**Visualize with snakeviz**

```snakeviz [profile.prof]```

# SYNOPSIS

**python -m cProfile** [**-o** _output_] [**-s** _sort_] _script.py_ [_args_]

# PARAMETERS

**-o** _file_
> Save profile statistics to file for later analysis.

**-s** _sort_
> Sort output by specified column.

**-m** _module_
> Profile a module instead of script.

# SORT OPTIONS

**calls**: Number of calls
**cumtime**: Cumulative time (including subcalls)
**cumulative**: Alias for cumtime
**tottime**: Total time in function (excluding subcalls)
**time**: Alias for tottime
**ncalls**: Number of calls
**name**: Function name
**filename**: File name

# DESCRIPTION

**cProfile** is Python's built-in deterministic profiler that measures how much time is spent in each function. It's implemented in C for low overhead, making it suitable for profiling production code.

The profiler tracks every function call and return, recording the number of calls and time spent. Output shows each function with call count, total time, time per call, cumulative time, and cumulative time per call.

Profile data can be saved for later analysis with the **pstats** module or visualized with tools like **snakeviz**, **pyprof2calltree**, or **gprof2dot**. This enables detailed investigation of performance bottlenecks.

# PROGRAMMATIC USAGE

```python
import cProfile
import pstats

profiler = cProfile.Profile()
profiler.enable()
# Code to profile
profiler.disable()

stats = pstats.Stats(profiler)
stats.sort_stats('cumtime')
stats.print_stats(10)
```

# CAVEATS

Profiling adds overhead that can affect measurements, especially for fast functions. The profiler is deterministic, not statistical, so it captures every call but may impact performance. Use **line_profiler** for line-by-line profiling or **py-spy** for sampling-based profiling with lower overhead.

# HISTORY

cProfile was added to Python in version **2.5** (2006) as a faster alternative to the pure-Python **profile** module. It was based on **lsprof** contributed by **Armin Rigo**. The C implementation provides roughly 10x less overhead than the original profiler while maintaining the same interface.

# SEE ALSO

[profile](/man/profile)(3py), [timeit](/man/timeit)(1), [py-spy](/man/py-spy)(1), [line_profiler](/man/line_profiler)(1)
