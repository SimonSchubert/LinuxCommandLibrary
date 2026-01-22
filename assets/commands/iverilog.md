# TLDR

**Compile Verilog file**

```iverilog -o [output] [input.v]```

**Compile multiple files**

```iverilog -o [output] [file1.v] [file2.v]```

**Specify top module**

```iverilog -s [top_module] -o [output] [input.v]```

**Generate VCD output**

```iverilog -o [output] [input.v] && vvp [output]```

**Include directory**

```iverilog -I [include_dir] -o [output] [input.v]```

**Define macro**

```iverilog -D[MACRO=value] -o [output] [input.v]```

# SYNOPSIS

**iverilog** [_options_] _file_...

# PARAMETERS

**-o** _FILE_
> Output file name.

**-s** _MODULE_
> Specify top-level module.

**-I** _DIR_
> Add include directory.

**-D** _MACRO_
> Define preprocessor macro.

**-g** _STANDARD_
> Verilog standard (2001, 2005, 2009, 2012).

**-t** _TARGET_
> Target format (vvp, null).

**--help**
> Display help information.

# DESCRIPTION

**iverilog** is the Icarus Verilog compiler. It compiles Verilog HDL to simulation executables.

The tool supports IEEE Verilog standards. Output runs with vvp simulator for verification and testing.

iverilog compiles Verilog designs.

# CAVEATS

Simulation only, not synthesis. Some SystemVerilog limited. Output requires vvp runtime.

# HISTORY

Icarus Verilog was created by **Stephen Williams** as an open-source alternative to commercial Verilog simulators.

# SEE ALSO

[vvp](/man/vvp)(1), [gtkwave](/man/gtkwave)(1), [verilator](/man/verilator)(1), [yosys](/man/yosys)(1)
