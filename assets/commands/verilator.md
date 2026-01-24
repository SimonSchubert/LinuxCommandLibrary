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

**verilator** compiles Verilog. It generates C++ code.

Fast simulation. Compiled speed.

Lint checking. Find errors.

Waveform support. VCD output.

SystemVerilog. Partial support.

# CAVEATS

Not full simulator. Cycle-based. Synthesizable subset.

# HISTORY

**Verilator** was created by **Wilson Snyder** as the fastest Verilog simulator through C++ compilation.

# SEE ALSO

[iverilog](/man/iverilog)(1), [gtkwave](/man/gtkwave)(1), [yosys](/man/yosys)(1)
