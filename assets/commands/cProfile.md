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

**Profile a module** run as a script

```python -m cProfile -m [module]```

**Profile specific function in code**

```import cProfile; cProfile.run('[function_call()]')```

**View saved profile with pstats**

```python -c "import pstats; p = pstats.Stats('[profile.prof]'); p.sort_stats('cumtime').print_stats(20)"```

**Visualize with snakeviz**

```snakeviz [profile.prof]```

# SYNOPSIS

**python -m cProfile** [**-o** _output_] [**-s** _sort_] (_script.py_ | **-m** _module_) [_args_]

# PARAMETERS

**-o**, **--outfile** _file_
> Save profile statistics to file for later analysis.

**-s**, **--sort** _sort_
> Sort output by specified column. Applies only when **-o** is not given.

**-m**
> Treat the first argument as a module name and profile it as with python -m.

# SORT OPTIONS

**calls** / **ncalls**: Number of calls
**cumulative** / **cumtime**: Cumulative time (including subcalls)
**tottime** / **time**: Total time in function (excluding subcalls)
**file** / **filename** / **module**: File name
**name**: Function name
**nfl**: Function name/file/line
**pcalls**: Primitive call count
**stdname**: Standard name
**line**: Line number

# DESCRIPTION

**cProfile** is Python's built-in deterministic profiler that measures how much time is spent in each function. It's implemented in C for low overhead, making it suitable for profiling long-running programs. Since Python 3.15 the implementation lives in **profiling.tracing**, and **cProfile** remains available as a backward-compatible name.

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

cProfile was added to Python in version **2.5** (2006) as a faster alternative to the pure-Python **profile** module. It was based on **lsprof** contributed by **Armin Rigo**. The C implementation has much lower overhead than the original profiler while maintaining the same interface.

# SEE ALSO

[py-spy](/man/py-spy)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/python/cpython)```

```[Homepage](https://www.python.org/)```

```[Documentation](https://docs.python.org/3/library/profiling.tracing.html)```

<!-- verified: 2026-11-09 -->
