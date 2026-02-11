# TAGLINE

AI-powered image upscaling with GPU acceleration

# TLDR

**Upscale image**

```realsr-ncnn-vulkan -i [input.jpg] -o [output.png]```

**Specify scale factor**

```realsr-ncnn-vulkan -i [input.jpg] -o [output.png] -s [4]```

**Use specific model**

```realsr-ncnn-vulkan -i [input.jpg] -o [output.png] -m [models-DF2K]```

**Specify GPU**

```realsr-ncnn-vulkan -i [input.jpg] -o [output.png] -g [0]```

# SYNOPSIS

**realsr-ncnn-vulkan** [_options_] **-i** _input_ **-o** _output_

# PARAMETERS

**-i** _path_
> Input image file.

**-o** _path_
> Output image file.

**-s** _scale_
> Upscale ratio (4 default).

**-m** _path_
> Model directory.

**-g** _gpu_
> GPU device ID (-1 for CPU).

**-t** _size_
> Tile size.

**-j** _threads_
> Processing threads.

# DESCRIPTION

**realsr-ncnn-vulkan** is a Real-ESRGAN/Real-SR image upscaler using the ncnn neural network framework with Vulkan GPU acceleration. It produces high-quality upscaled images.

# EXAMPLES

```bash
# Basic 4x upscale
realsr-ncnn-vulkan -i photo.jpg -o photo_4x.png

# 2x scale
realsr-ncnn-vulkan -i photo.jpg -o photo_2x.png -s 2

# Use specific model
realsr-ncnn-vulkan -i anime.png -o anime_up.png -m models-DF2K_JPEG

# CPU only
realsr-ncnn-vulkan -i input.jpg -o output.png -g -1

# Batch process (use loop)
for f in *.jpg; do
  realsr-ncnn-vulkan -i "$f" -o "upscaled_$f"
done
```

# MODELS

```
models-DF2K       - General purpose
models-DF2K_JPEG  - JPEG artifact reduction
```

# CAVEATS

Requires Vulkan-capable GPU. Memory-intensive for large images. Processing can be slow.

# HISTORY

realsr-ncnn-vulkan is based on **Real-ESRGAN** research, ported to ncnn by **nihui** for efficient cross-platform inference.

# SEE ALSO

[waifu2x-ncnn-vulkan](/man/waifu2x-ncnn-vulkan)(1), [esrgan](/man/esrgan)(1), [imagemagick](/man/imagemagick)(1)
