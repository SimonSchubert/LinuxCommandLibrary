# TLDR

**Upscale image**

```waifu2x-ncnn-vulkan -i [input.png] -o [output.png]```

**2x scale**

```waifu2x-ncnn-vulkan -i [input.png] -o [output.png] -s [2]```

**Denoise**

```waifu2x-ncnn-vulkan -i [input.png] -o [output.png] -n [2]```

**Use specific GPU**

```waifu2x-ncnn-vulkan -i [input] -o [output] -g [0]```

**Tile size**

```waifu2x-ncnn-vulkan -i [input] -o [output] -t [400]```

# SYNOPSIS

**waifu2x-ncnn-vulkan** [_-i input_] [_-o output_] [_-s scale_] [_-n noise_]

# PARAMETERS

**-i** _FILE_
> Input file.

**-o** _FILE_
> Output file.

**-s** _SCALE_
> Scale ratio (2).

**-n** _LEVEL_
> Noise level (-1,0,1,2,3).

**-g** _GPU_
> GPU device.

**-t** _SIZE_
> Tile size.

# DESCRIPTION

**waifu2x-ncnn-vulkan** upscales images. It uses AI neural networks.

Anime-style upscaling. Best for illustrations.

Denoising included. Remove compression artifacts.

Vulkan GPU acceleration. Fast processing.

NCNN backend. Mobile-optimized inference.

# CAVEATS

GPU recommended. Best for anime/illustrations. Large VRAM for big images.

# HISTORY

**waifu2x-ncnn-vulkan** is a Vulkan implementation of **waifu2x**, an AI image upscaler originally by nagadomi.

# SEE ALSO

[imagemagick](/man/imagemagick)(1), [realsr-ncnn-vulkan](/man/realsr-ncnn-vulkan)(1)
