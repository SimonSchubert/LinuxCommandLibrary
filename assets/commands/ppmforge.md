# TAGLINE

Generate fractal terrain and cloud images

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

**ppmforge** generates fractal-based images using procedural algorithms, producing realistic terrain, cloud, and planetary surface images. The terrain mode creates elevation-colored landscapes with water, while the cloud mode generates atmospheric patterns.

A random seed parameter allows reproducible generation, and mesh size controls the level of fractal detail. The night mode creates star field images. Output dimensions are configurable independently for width and height. Part of the Netpbm toolkit.

# CAVEATS

Procedural generation. Part of Netpbm suite.

# HISTORY

ppmforge was created as part of **Netpbm** for fractal image generation.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmplasma](/man/ppmplasma)(1)

