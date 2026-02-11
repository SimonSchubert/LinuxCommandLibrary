# TAGLINE

Open source Verilog RTL synthesis framework

# TLDR

**Run synthesis on Verilog file**

```yosys -p "synth -top [module]" [design.v]```

**Start interactive shell**

```yosys```

**Execute script file**

```yosys -s [script.ys]```

**Synthesize and output to file**

```yosys -p "synth -top [module]" -o [output.json] [design.v]```

**Quick synthesis** shortcut

```yosys -S [design.v]```

**Run TCL script**

```yosys -c [script.tcl]```

**List available commands**

```yosys -H```

**Get help for command**

```yosys -h [synth]```

# SYNOPSIS

**yosys** [_options_] [_infile_...]

# PARAMETERS

**-s** _scriptfile_
> Execute commands from script file.

**-c** _tclfile_
> Execute TCL script file.

**-p** _command_
> Execute command(s).

**-o** _outfile_
> Write design to file on exit.

**-f** _frontend_
> Frontend for input files.

**-b** _backend_
> Backend for output file.

**-m** _module_
> Load plugin module.

**-l** _logfile_
> Write log to file.

**-q**
> Quiet operation (errors only).

**-v** _level_
> Log verbosity level.

**-t**
> Add timestamps to log.

**-S**
> Shortcut for synth command.

**-H**
> Print command list.

**-h** _command_
> Help for specific command.

**-Q**
> Suppress banner.

**-T**
> Suppress footer.

# DESCRIPTION

**yosys** is an open source framework for RTL synthesis. It reads Verilog hardware description language and synthesizes it to gate-level netlists for various target technologies.

The tool provides an interactive shell with numerous commands for reading designs, elaboration, optimization, technology mapping, and writing outputs. Synthesis flows are defined through script files or command-line arguments.

Supported input formats include Verilog, RTLIL, and Liberty. Output formats include BLIF, EDIF, JSON, Verilog, and various FPGA-specific formats. The tool supports plugins for extending functionality.

Yosys is widely used in open-source FPGA toolchains including Lattice iCE40 and ECP5 flows with nextpnr.

# CAVEATS

SystemVerilog support is limited. Complex designs may require multiple synthesis passes. Some features need external plugin modules. Memory and timing optimization may need manual tuning.

# HISTORY

**yosys** was created by Clifford Wolf (now Claire Wolf) and released in 2012. It became the foundation of open-source FPGA toolchains, enabling fully open synthesis flows. The project is now maintained by YosysHQ and remains central to the open FPGA ecosystem.

# SEE ALSO

[nextpnr](/man/nextpnr)(1), [iverilog](/man/iverilog)(1), [verilator](/man/verilator)(1)
