# TLDR

**Generate fractal terrain**

```ppmforge > [terrain.ppm]```

**Generate clouds**

```ppmforge -clouds > [clouds.ppm]```

**Generate night view**

```ppmforge -night > [night.ppm]```

**Specify dimensions**

```ppmforge -width [512] -height [512] > [output.ppm]```

# SYNOPSIS

**ppmforge** [_options_]

# PARAMETERS

**-clouds**
> Generate cloud image.

**-night**
> Generate night view.

**-width** _N_
> Output width.

**-height** _N_
> Output height.

**-seed** _N_
> Random seed.

**-mesh** _N_
> Mesh size.

# DESCRIPTION

**ppmforge** generates fractal images. Creates terrain, clouds, planets.

The tool produces procedural images. Part of Netpbm.

ppmforge creates fractals.

# CAVEATS

Procedural generation. Part of Netpbm suite.

# HISTORY

ppmforge was created as part of **Netpbm** for fractal image generation.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmplasma](/man/ppmplasma)(1)

