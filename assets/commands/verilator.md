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

**-Wall**
> All warnings.

# DESCRIPTION

**verilator** converts synthesizable Verilog and SystemVerilog designs into optimized C++ or SystemC models. The generated code compiles to native executables that run significantly faster than interpreted simulators, making it one of the fastest open-source Verilog simulators available.

The tool also functions as a lint checker with **--lint-only**, catching common coding errors and style issues without generating simulation code. Waveform tracing can be enabled with **--trace** to produce VCD files for viewing in waveform viewers like GTKWave.

# CAVEATS

Not full simulator. Cycle-based. Synthesizable subset.

# HISTORY

**Verilator** was created by **Wilson Snyder** as the fastest Verilog simulator through C++ compilation.

# SEE ALSO

[iverilog](/man/iverilog)(1), [gtkwave](/man/gtkwave)(1), [yosys](/man/yosys)(1)
