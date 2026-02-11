# TAGLINE

AI-powered image upscaling with Vulkan

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

**waifu2x-ncnn-vulkan** is an AI-powered image upscaling and denoising tool that uses convolutional neural networks to enlarge images while preserving detail. It is particularly effective for anime-style artwork and illustrations, producing cleaner results than traditional interpolation methods.

The tool supports 2x upscaling and multiple noise reduction levels for removing JPEG compression artifacts. It uses the ncnn neural network inference framework with Vulkan GPU acceleration, enabling fast processing on a wide range of graphics hardware without requiring CUDA or specific vendor drivers.

Processing can be tuned with tile size options to manage GPU memory usage for large images, and specific GPUs can be selected on multi-GPU systems. Input and output support common image formats including PNG, JPEG, and WebP.

# CAVEATS

GPU recommended. Best for anime/illustrations. Large VRAM for big images.

# HISTORY

**waifu2x-ncnn-vulkan** is a Vulkan implementation of **waifu2x**, an AI image upscaler originally by nagadomi.

# SEE ALSO

[imagemagick](/man/imagemagick)(1), [realsr-ncnn-vulkan](/man/realsr-ncnn-vulkan)(1)
