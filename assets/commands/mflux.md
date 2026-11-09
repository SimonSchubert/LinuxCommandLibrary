# TAGLINE

Flux image generation tool built natively on Apple's MLX framework

# TLDR

**Generate an image from a text prompt**

```mflux-generate --model [schnell] --prompt "[a sunset over mountains]"```

**Generate with the higher-quality dev model and more steps**

```mflux-generate --model [dev] --prompt "[prompt]" --steps [25] --seed [42]```

**Specify image dimensions**

```mflux-generate --model [schnell] --prompt "[prompt]" --width [1024] --height [768]```

**Save to a specific output path**

```mflux-generate --model [schnell] --prompt "[prompt]" --output [output.png]```

**Use a quantized model for lower memory usage**

```mflux-generate --model [schnell] --prompt "[prompt]" --quantize [8]```

**Generate using image-to-image with an init image**

```mflux-generate --model [dev] --prompt "[prompt]" --image [input.png] [0.4]```

**Apply LoRA adapter weights**

```mflux-generate --model [dev] --prompt "[prompt]" --lora [adapter.safetensors] [0.7]```

**Generate with Z-Image Turbo** using its dedicated command

```mflux-generate-z-image-turbo --prompt "[prompt]" --width [1280] --height [500] --seed [42] --steps [9]```

**Save a local quantized copy of model weights**

```mflux-save --model [schnell] --quantize [8] --path [path/to/save]```

# SYNOPSIS

**mflux-generate** **--model** _name_ **--prompt** _text_ [_options_]

**mflux-save** **--model** _name_ **--path** _dir_ [_options_]

# PARAMETERS

**--model**, **-m** _NAME_
> Model to use (schnell, dev, or a HuggingFace repo/local path).

**--prompt** _TEXT_
> Text prompt for image generation. Use - to read from stdin.

**--prompt-file** _FILE_
> Read the prompt from a file, re-read before each generation.

**--output** _FILE_
> Output image path (default: image.png).

**--width** _PX_
> Image width in pixels (default: 1024).

**--height** _PX_
> Image height in pixels (default: 1024).

**--steps** _N_
> Number of inference steps.

**--seed** _INT_...
> One or more random seeds for reproducibility.

**--auto-seeds** _N_
> Generate N images with random seeds.

**--quantize**, **-q** _BITS_
> Quantization level in bits (3, 4, 5, 6 or 8).

**--guidance** _FLOAT_
> Guidance scale.

**--negative-prompt** _TEXT_
> Text prompt for what the model should not generate.

**--image** _FILE_ [_STRENGTH_]
> Initial image for image-to-image generation, with optional strength (default: 0.4). Replaces the deprecated **--image-path** and **--image-strength**.

**--lora** _PATH_ [_SCALE_]
> Add a LoRA with an optional scale (default: 1.0). Repeatable. Replaces the deprecated **--lora-paths** and **--lora-scales**.

**--metadata**, **--make-conf**
> Write the generation parameters to a JSON sidecar file next to the image.

**--low-ram**
> Reduce GPU memory usage by limiting MLX cache and releasing components after use.

**--mlx-cache-limit-gb** _GB_
> Limit the MLX cache size without enabling full low-RAM mode.

**--base-model** _NAME_
> Specify architecture (schnell, dev) when loading from a local path.

# DESCRIPTION

**mflux** is a Flux image generation tool built natively on Apple's **MLX** framework, optimized for Apple Silicon (M1/M2/M3/M4). It generates images locally using Flux models without requiring a GPU server or cloud API. The package provides multiple CLI commands: **mflux-generate** for FLUX.1 image generation, model-specific variants such as **mflux-generate-z-image-turbo**, **mflux-generate-flux2** and **mflux-generate-qwen**, **mflux-save** for saving quantized model weights locally, **mflux-train** for LoRA training, and **mflux-info** for viewing image metadata.

Installation is via uv (`uv tool install --upgrade mflux`). Model weights are downloaded from HuggingFace on first use and cached locally. Custom models can also be loaded from local paths or HuggingFace repositories.

**schnell** is faster with fewer steps needed (2-4 steps). **dev** produces higher quality but requires more steps (20-25). Quantization (4-bit or 8-bit) reduces memory usage for machines with limited unified memory. The **--low-ram** flag further reduces memory by releasing components after use.

LoRA adapters allow fine-tuned styles and concepts to be applied on top of base models. Image-to-image generation is supported via **--image-path** and **--image-strength**.

# CAVEATS

Designed for Apple Silicon (M-series Macs), although upstream also documents NVIDIA DGX installs. Requires Python 3.11+. Model downloads are several GB. Memory usage depends on model and quantization level. The **--low-ram** flag helps on memory-constrained systems but limits generation to single images.

# HISTORY

**mflux** was created by **Filip Strand** in **2024** to bring native Flux image generation to Apple Silicon using the MLX framework. It has since expanded to support multiple model architectures beyond Flux, including models loaded from HuggingFace repositories and local paths. Development moved to the **mflux-community** GitHub organization.

# SEE ALSO

[sd-cli](/man/sd-cli)(1), [comfyui](/man/comfyui)(1)

# RESOURCES

```[Source code](https://github.com/mflux-community/mflux)```

<!-- verified: 2026-11-09 -->
