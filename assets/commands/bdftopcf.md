# TLDR

**Convert BDF font to PCF**

```bdftopcf [font.bdf] > [font.pcf]```

**Convert with output file**

```bdftopcf -o [font.pcf] [font.bdf]```

**Create terminal font**

```bdftopcf -t [font.bdf] > [font.pcf]```

**Set MSB first bit order**

```bdftopcf -m [font.bdf] > [font.pcf]```

**Set glyph padding**

```bdftopcf -p4 [font.bdf] > [font.pcf]```

# SYNOPSIS

**bdftopcf** [_options_] _fontfile.bdf_

# DESCRIPTION

**bdftopcf** is an X11 font compiler that converts fonts from Bitmap Distribution Format (BDF) to Portable Compiled Format (PCF). PCF fonts can be read by any architecture while allowing fast reading on the target machine.

# PARAMETERS

**-o** _outputfile_
> Write output to file instead of stdout

**-t**
> Create terminal font with uniform glyph sizes for faster rendering

**-i**
> Inhibit ink metrics computation

**-p**_n_
> Set glyph padding to n bytes (1, 2, 4, or 8)

**-u**_n_
> Set scanline unit to n bytes (1, 2, or 4)

**-m**
> Set font bit order to MSB first

**-l**
> Set font bit order to LSB first

**-M**
> Set font byte order to MSB first

**-L**
> Set font byte order to LSB first

# CAVEATS

Part of the X.Org font utilities. Output fonts are portable but read faster on matching architectures. Terminal fonts (-t) render faster but require uniform glyph sizing.

# SEE ALSO

[mkfontdir](/man/mkfontdir)(1), [mkfontscale](/man/mkfontscale)(1), [pcf2bdf](/man/pcf2bdf)(1)
