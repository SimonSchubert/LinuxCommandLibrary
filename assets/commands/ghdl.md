# TAGLINE

Open-source VHDL simulator and synthesizer

# TLDR

**Analyze VHDL file**

```ghdl -a [file.vhdl]```

**Elaborate design**

```ghdl -e [entity_name]```

**Run simulation**

```ghdl -r [entity_name]```

**Run with VCD waveform output**

```ghdl -r [entity_name] --vcd=[output.vcd]```

**Run with GHW waveform output**

```ghdl -r [entity_name] --wave=[output.ghw]```

**Run simulation with stop time**

```ghdl -r [entity_name] --stop-time=[100ns]```

**Import files**

```ghdl -i [file.vhdl]```

**Syntax check only**

```ghdl -s [file.vhdl]```

# SYNOPSIS

**ghdl** _command_ [_options_] _files_

# PARAMETERS

**-a** _FILE_
> Analyze VHDL source file.

**-e** _ENTITY_
> Elaborate design entity.

**-r** _ENTITY_
> Run simulation.

**-i** _FILE_
> Import VHDL file.

**-s** _FILE_
> Syntax check only.

**--vcd** _FILE_
> Generate VCD waveform output.

**--wave** _FILE_
> Generate GHW waveform output.

**--stop-time** _TIME_
> Simulation stop time (e.g., 100ns, 1us, 10ms).

**--std** _STANDARD_
> VHDL standard to use: 87, 93, 93c, 00, 02, 08.

**--work** _NAME_
> Set the work library name.

**--ieee** _LIBRARY_
> Select IEEE library flavor: standard, synopsys, mentor.

**--help**
> Display help information.

# DESCRIPTION

**ghdl** is an open-source VHDL simulator and synthesizer. It analyzes, elaborates, and simulates VHDL designs, supporting VHDL-87, VHDL-93, VHDL-2002, and VHDL-2008 standards.

The typical workflow involves three steps: analyzing source files (**-a**) to check syntax and compile, elaborating the design hierarchy (**-e**) to resolve all dependencies, and running the simulation (**-r**). Waveform outputs in VCD and GHW formats can be generated for viewing in tools like GTKWave.

# CAVEATS

Some advanced VHDL features may have limitations. Synthesis support is experimental. Large simulations can be memory-intensive.

# HISTORY

GHDL was started by **Tristan Gingold** and is written in Ada. It provides a free software alternative to commercial VHDL simulators.

# SEE ALSO

[gtkwave](/man/gtkwave)(1), [iverilog](/man/iverilog)(1), [verilator](/man/verilator)(1)
