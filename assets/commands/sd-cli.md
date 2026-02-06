# TLDR

**Generate an image from a text prompt**

```sd-cli -m [model.safetensors] -p "[a photo of a cat]" -o [output.png]```

**Generate with specific dimensions**

```sd-cli -m [model.safetensors] -p "[prompt]" --width [512] --height [512] -o [output.png]```

**Set generation parameters**

```sd-cli -m [model.safetensors] -p "[prompt]" --steps [20] --cfg-scale [7.0] --seed [42] -o [output.png]```

**Use a specific sampling method**

```sd-cli -m [model.safetensors] -p "[prompt]" --sampling-method [euler_a] -o [output.png]```

**Generate with negative prompt**

```sd-cli -m [model.safetensors] -p "[prompt]" -n "[blurry, low quality]" -o [output.png]```

**Image-to-image generation**

```sd-cli -m [model.safetensors] --img2img [input.png] -p "[oil painting style]" --strength [0.75] -o [output.png]```

# SYNOPSIS

**sd-cli** **-m** _model_ **-p** _prompt_ [_options_] **-o** _output_

# PARAMETERS

**-m**, **--model** _FILE_
> Path to model weights (.safetensors or .gguf).

**-p**, **--prompt** _TEXT_
> Text prompt for image generation.

**-n**, **--negative-prompt** _TEXT_
> Negative prompt to guide away from.

**-o**, **--output** _FILE_
> Output image path.

**--steps** _N_
> Number of sampling steps (default: 20).

**--cfg-scale** _FLOAT_
> Classifier-free guidance scale (default: 7.0).

**--seed** _INT_
> RNG seed (-1 for random).

**--width** _PX_
> Image width in pixels.

**--height** _PX_
> Image height in pixels.

**--sampling-method** _METHOD_
> Sampling method: euler, euler_a, heun, dpm2, dpm++2s_a, dpm++2m, dpm++2mv2, lcm.

**--img2img** _FILE_
> Input image for image-to-image generation.

**--strength** _FLOAT_
> Denoising strength for img2img (0.0-1.0).

**--threads** _N_
> Number of CPU threads.

**--rng** _TYPE_
> RNG type: std_default, cuda.

# DESCRIPTION

**sd-cli** is the command-line interface for **stable-diffusion.cpp**, a lightweight C/C++ implementation of Stable Diffusion using the ggml tensor library. It runs image generation models on CPU and GPU without requiring Python or heavy ML frameworks.

The tool supports Stable Diffusion 1.x, 2.x, SDXL, and Flux model architectures. Models in safetensors or gguf (quantized) format can be loaded directly. Quantized models significantly reduce memory usage while maintaining reasonable quality.

Text-to-image generates from a prompt. Image-to-image transforms an existing image guided by a prompt. The strength parameter controls how much the original image is altered.

Build from source using CMake. GPU acceleration is available through CUDA, Metal, and Vulkan backends.

# CAVEATS

Must be built from source. Large model files required (several GB). Quality depends on model choice and parameters. GPU acceleration requires backend-specific build flags. SDXL and Flux models need more memory than SD 1.x.

# HISTORY

**stable-diffusion.cpp** was created by **leejet** in **2023**, inspired by llama.cpp's approach of bringing ML models to C/C++ with minimal dependencies. It brought Stable Diffusion inference to resource-constrained environments and platforms without Python support.

# SEE ALSO

[mflux](/man/mflux)(1), [comfyui](/man/comfyui)(1), [convert](/man/convert)(1)
