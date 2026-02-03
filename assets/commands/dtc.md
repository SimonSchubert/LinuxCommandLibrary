# TLDR

**Compile DTS to DTB**

```dtc -I dts -O dtb -o [output.dtb] [input.dts]```

**Decompile DTB to DTS**

```dtc -I dtb -O dts -o [output.dts] [input.dtb]```

**Check DTS syntax**

```dtc -I dts -O dts [input.dts]```

**Include search path**

```dtc -I dts -O dtb -i [include_path] -o [output.dtb] [input.dts]```

**Generate assembly output**

```dtc -I dts -O asm -o [output.S] [input.dts]```

# SYNOPSIS

**dtc** [_options_] _input_file_

# PARAMETERS

**-I** _format_
> Input format (dts, dtb, fs).

**-O** _format_
> Output format (dts, dtb, asm).

**-o** _file_
> Output file.

**-i** _path_
> Include search path.

**-W** _warning_
> Enable warning.

**-E** _error_
> Enable error.

**-@**
> Generate symbols for overlays.

# DESCRIPTION

**dtc** (Device Tree Compiler) compiles Device Tree Source (DTS) files to Device Tree Blob (DTB) format and vice versa. Used for configuring hardware in Linux systems, especially embedded devices.

# SEE ALSO

[fdtdump](/man/fdtdump)(1), [fdtget](/man/fdtget)(1)

