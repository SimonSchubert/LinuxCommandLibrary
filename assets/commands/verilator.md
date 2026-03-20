# TAGLINE

Verilog to C++ simulation compiler

# TLDR

**Lint Verilog**

```verilator --lint-only [design.v]```

**Compile to C++**

```verilator --cc [design.v]```

**With testbench**

```verilator --cc [design.v] --exe [testbench.cpp]```

**Build simulation**

```verilator --cc [design.v] --exe [tb.cpp] --build```

**Generate waves**

```verilator --cc [design.v] --trace```

**Generate SystemC** output

```verilator --sc [design.v]```

**Build binary** directly

```verilator --binary [design.v] --exe [tb.cpp]```

**Compile with parallel jobs**

```verilator --cc [design.v] --exe [tb.cpp] --build -j [4]```

# SYNOPSIS

**verilator** [_--lint-only_] [_--cc_] [_--trace_] [_options_] _files_

# PARAMETERS

**--lint-only**
> Lint check only.

**--cc**
> Generate C++.

**--exe**
> Create executable.

**--build**
> Compile output.

**--trace**
> Enable waveforms.

**--sc**
> Generate SystemC output.

**--binary**
> Generate C++ and build a binary executable directly.

**-Wall**
> Enable all warnings.

**--top-module** _module_
> Specify the top-level module name.

**-j** _N_
> Parallelism for build jobs.

**-CFLAGS** _flags_
> Pass flags to the C++ compiler.

**-LDFLAGS** _flags_
> Pass flags to the C++ linker.

# DESCRIPTION

**verilator** converts synthesizable Verilog and SystemVerilog designs into optimized C++ or SystemC models. The generated code compiles to native executables that run significantly faster than interpreted simulators, making it one of the fastest open-source Verilog simulators available.

The tool also functions as a lint checker with **--lint-only**, catching common coding errors and style issues without generating simulation code. Waveform tracing can be enabled with **--trace** to produce VCD files for viewing in waveform viewers like GTKWave.

# CAVEATS

Verilator is cycle-based and only supports the synthesizable subset of Verilog/SystemVerilog. It does not support all simulation constructs (e.g., delays, some system tasks). Two-state simulation only (no X/Z propagation).

# HISTORY

**Verilator** was created by **Wilson Snyder** as the fastest Verilog simulator through C++ compilation.

# SEE ALSO

[iverilog](/man/iverilog)(1), [gtkwave](/man/gtkwave)(1), [yosys](/man/yosys)(1)
