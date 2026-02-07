# TAGLINE

visualization for profiled stack traces

# TLDR

**Generate flame graph from perf data**

```perf script | stackcollapse-perf.pl | flamegraph.pl > [flame.svg]```

**From dtrace output**

```stackcollapse.pl [out.dtrace] | flamegraph.pl > [flame.svg]```

**Custom title**

```flamegraph.pl --title "[My App Profile]" [stacks.txt] > [flame.svg]```

**Inverted (icicle) graph**

```flamegraph.pl --inverted [stacks.txt] > [flame.svg]```

**Set width**

```flamegraph.pl --width [1200] [stacks.txt] > [flame.svg]```

# SYNOPSIS

**flamegraph.pl** [_options_] [_input_]

# PARAMETERS

**--title** _text_
> Title for the graph.

**--width** _pixels_
> SVG width (default 1200).

**--height** _pixels_
> Frame height (default 16).

**--minwidth** _pixels_
> Minimum width to show.

**--inverted**
> Generate icicle graph (top-down).

**--reverse**
> Reverse stack order.

**--colors** _palette_
> Color palette: hot, mem, io, java.

**--hash**
> Color by function name hash.

**--flamechart**
> Time-ordered flame chart.

# DESCRIPTION

**FlameGraph** is a visualization tool for profiled stack traces, created by Brendan Gregg. It generates interactive SVG graphs where the x-axis shows the stack population and the y-axis shows stack depth.

Flame graphs quickly reveal which code paths consume the most resources. They work with any profiler output that can be converted to the collapsed stack format.

# WORKFLOW

```bash
# 1. Collect profile (Linux perf)
perf record -g ./myapp

# 2. Convert to text stacks
perf script > out.perf

# 3. Collapse stacks
stackcollapse-perf.pl out.perf > stacks.txt

# 4. Generate flame graph
flamegraph.pl stacks.txt > flame.svg
```

# CAVEATS

Requires Perl. Input must be in collapsed stack format. Large profiles may produce complex graphs. Colors are random unless --hash used. Interactive features require SVG-capable browser.

# HISTORY

Flame graphs were invented by **Brendan Gregg** in **2011** while at Joyent for analyzing performance issues. The visualization technique has become standard for performance profiling across languages and platforms.

# SEE ALSO

[perf](/man/perf)(1), [dtrace](/man/dtrace)(1), [bpftrace](/man/bpftrace)(8)
