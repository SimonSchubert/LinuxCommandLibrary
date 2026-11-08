# TAGLINE

not a Netpbm program; gamma correction is done with pnmgamma

# TLDR

**Apply gamma correction** with the real tool

```pnmgamma [2.2] [input.ppm] > [output.ppm]```

**Reverse gamma correction**

```pnmgamma -ungamma [2.2] [input.ppm] > [linear.ppm]```

**Convert BT.709 to linear**

```pnmgamma -bt709tolinear [input.ppm] > [linear.ppm]```

**Convert linear to BT.709**

```pnmgamma -lineartobt709 [linear.ppm] > [output.ppm]```

**Convert BT.709 to sRGB**

```pnmgamma -bt709tosrgb [input.ppm] > [srgb.ppm]```

# SYNOPSIS

**pnmgamma** [**-ungamma**] [_gamma_ | _rgamma_ _ggamma_ _bgamma_] [_file_]

**pnmgamma** **-bt709tolinear**|**-lineartobt709**|**-bt709tosrgb**|**-srgbtobt709** [**-gamma=**_value_] [**-maxval=**_value_] [_file_]

# DESCRIPTION

There is no **pamgamma** program in Netpbm: it does not appear in the Netpbm program directory, source tree, or distribution man pages. Gamma correction is provided by **pnmgamma**, which reads PNM images.

Without a transfer option, **pnmgamma** applies a simple exponential with a gamma of 2.2. A gamma above 1 brightens midtones and **-ungamma** applies the inverse. See [pnmgamma](/man/pnmgamma)(1) for all options.

# CAVEATS

Commands named **pamgamma** in scripts or tutorials fail with "command not found". Replace them with **pnmgamma**, and note that flags such as **-srgb** and **-bt709** do not exist there.

# HISTORY

The page exists for readers searching this name. The conversion options of **pnmgamma** were added in Netpbm **10.32** (2006).

# SEE ALSO

[pnmgamma](/man/pnmgamma)(1), [pamfunc](/man/pamfunc)(1), [netpbm](/man/netpbm)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/pnmgamma.html)```

<!-- verified: 2026-11-08 -->
