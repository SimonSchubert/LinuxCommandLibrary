# TLDR

**Generate an image from a text prompt**

```mflux-generate --prompt "[a sunset over mountains]" --model [flux]```

**Specify image dimensions**

```mflux-generate --prompt "[prompt]" --width [1024] --height [768] --model [flux]```

**Set steps and seed**

```mflux-generate --prompt "[prompt]" --steps [20] --seed [42] --model [flux]```

**Save to specific path**

```mflux-generate --prompt "[prompt]" --output [output.png] --model [flux]```

**Use quantized model for lower memory**

```mflux-generate --prompt "[prompt]" --quantize [4] --model [flux]```

**Apply a LoRA adapter**

```mflux-generate --prompt "[prompt]" --lora-path [adapter.safetensors] --model [flux]```

# SYNOPSIS

**mflux-generate** **--prompt** _text_ **--model** _name_ [_options_]

# PARAMETERS

**--prompt** _TEXT_
> Text prompt for image generation.

**--model** _NAME_
> Model to use (flux, flux-dev, flux-schnell).

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

**--quantize** _BITS_
> Quantization level (4 or 8 bit).

**--lora-path** _FILE_
> Path to LoRA adapter weights.

**--guidance** _FLOAT_
> Guidance scale.

# DESCRIPTION

**mflux** is a Flux image generation tool built natively on Apple's **MLX** framework, optimized for Apple Silicon (M1/M2/M3/M4). It generates images locally using Flux models without requiring a GPU server or cloud API.

Installation is via pip (`pip install mflux`). The tool downloads model weights on first use and caches them locally.

Flux-schnell is faster with fewer steps needed. Flux-dev produces higher quality but takes longer. Quantization (4-bit or 8-bit) reduces memory usage for running on machines with limited unified memory.

LoRA adapters allow fine-tuned styles and concepts to be applied on top of base models.

# CAVEATS

Apple Silicon only (M-series Macs). Requires Python 3.10+. Model downloads are several GB. Memory usage depends on model and quantization level. Limited to Flux model family.

# HISTORY

**mflux** was created by **Filip Strand** in **2024** to bring native Flux image generation to Apple Silicon using the MLX framework. It provides a streamlined alternative to running Stable Diffusion through compatibility layers on macOS.

# SEE ALSO

[sd-cli](/man/sd-cli)(1), [comfyui](/man/comfyui)(1)
