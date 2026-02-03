# TLDR

**Draw on PPM image with script**

```ppmdraw -script "[line 0 0 100 100]" [input.ppm] > [output.ppm]```

**Use script file**

```ppmdraw -scriptfile [commands.txt] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmdraw** [_options_] [_file_]

# PARAMETERS

**-script** _commands_
> Drawing commands inline.

**-scriptfile** _file_
> File containing drawing commands.

# DESCRIPTION

**ppmdraw** draws shapes and text on PPM images using a scripting language. Supports lines, circles, text, and filled shapes. Part of Netpbm toolkit.

# SEE ALSO

[ppmlabel](/man/ppmlabel)(1), [pbmtext](/man/pbmtext)(1)

