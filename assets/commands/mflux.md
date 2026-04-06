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

```mflux-generate --model [dev] --prompt "[prompt]" --image-path [input.png] --image-strength [0.4]```

**Apply LoRA adapter weights**

```mflux-generate --model [dev] --prompt "[prompt]" --lora-paths [adapter.safetensors]```

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

**--output** _FILE_
> Output image path.

**--width** _PX_
> Image width in pixels.

**--height** _PX_
> Image height in pixels.

**--steps** _N_
> Number of inference steps.

**--seed** _INT_
> Random seed for reproducibility.

**--quantize**, **-q** _BITS_
> Quantization level (4 or 8 bit).

**--guidance** _FLOAT_
> Guidance scale.

**--negative-prompt** _TEXT_
> Text prompt for what the model should not generate.

**--image-path** _FILE_
> Path to an initial image for image-to-image generation.

**--image-strength** _FLOAT_
> How strongly the initial image influences output (default: 0.4, 0.0 = no influence).

**--lora-paths** _FILE_...
> Paths to one or more LoRA adapter weights.

**--lora-scales** _FLOAT_...
> Scales for each LoRA adapter.

**--metadata**
> Export a JSON file with generation metadata alongside the image.

**--low-ram**
> Reduce GPU memory usage by limiting MLX cache and releasing components after use.

**--base-model** _NAME_
> Specify architecture (schnell, dev) when loading from a local path.

# DESCRIPTION

**mflux** is a Flux image generation tool built natively on Apple's **MLX** framework, optimized for Apple Silicon (M1/M2/M3/M4). It generates images locally using Flux models without requiring a GPU server or cloud API. The package provides multiple CLI commands: **mflux-generate** for image generation, **mflux-save** for saving quantized model weights locally, and **mflux-info** for viewing image metadata.

Installation is via pip (`pip install mflux`). Model weights are downloaded from HuggingFace on first use and cached locally. Custom models can also be loaded from local paths or HuggingFace repositories.

**schnell** is faster with fewer steps needed (2-4 steps). **dev** produces higher quality but requires more steps (20-25). Quantization (4-bit or 8-bit) reduces memory usage for machines with limited unified memory. The **--low-ram** flag further reduces memory by releasing components after use.

LoRA adapters allow fine-tuned styles and concepts to be applied on top of base models. Image-to-image generation is supported via **--image-path** and **--image-strength**.

# CAVEATS

Apple Silicon only (M-series Macs). Requires Python 3.10+. Model downloads are several GB. Memory usage depends on model and quantization level. The **--low-ram** flag helps on memory-constrained systems but limits generation to single images.

# HISTORY

**mflux** was created by **Filip Strand** in **2024** to bring native Flux image generation to Apple Silicon using the MLX framework. It has since expanded to support multiple model architectures beyond Flux, including models loaded from HuggingFace repositories and local paths.

# SEE ALSO

[sd-cli](/man/sd-cli)(1), [comfyui](/man/comfyui)(1)
