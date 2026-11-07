# TAGLINE

Generate video and audio with the HyperFlow H3 Flash model

# TLDR

Text to video and audio

```hyperflow-h3-flash --prompt "[A chef slides a bowl of ramen across a counter]" --output [ramen.mp4]```

Animate from a **first** frame

```hyperflow-h3-flash --prompt "[...]" --image [first.png] --output [clip.mp4]```

Use a **first and last** frame

```hyperflow-h3-flash --prompt "[...]" --image [first.png] --last-image [last.png] --output [clip.mp4]```

Condition on **reference** images, in prompt order

```hyperflow-h3-flash --prompt "[Picture 1 walks through the scene of Picture 2]" --reference [person.png] --reference [scene.png] --output [clip.mp4]```

A longer clip on **several** GPUs

```hyperflow-h3-flash --prompt "[...]" --num-frames [360] --gpus [4]```

Fewer sampling **steps** (4, 6, or 8; 6 is the default)

```hyperflow-h3-flash --prompt "[...]" --steps [4]```

# SYNOPSIS

**hyperflow-h3-flash** **--prompt** _text_ **--output** _file_ [_options_]

# PARAMETERS

**--prompt** _text_

> Generation prompt. Reference runs name pictures, videos, and audio clips in order

**--output** _file_

> File to write

**--image** _path_

> First keyframe. Selects the first-and-last task instead of text-only

**--last-image** _path_

> Last keyframe, together with **--image**

**--reference** _path_

> Repeatable reference input, in the same order as the prompt. Limits: 9 images, 3 videos, 3 audio clips, 12 total

**--num-frames** _n_

> Frame count at 24 fps. Allowed range 124 to 362. The default is 124 (about 5.2 seconds). 362 is about 15 seconds. Values round up to `17n+5` (360 becomes 362)

**--steps** _4_|_6_|_8_

> Sampling steps. 4 is faster, 6 is the default, 8 is the quality setting

**--height** _px_, **--width** _px_

> Multiples of 32. The default short edge is 768. The aspect follows **--image**, or 16:9 for a text-only run

**--gpus**, **--num-gpus** _1_|_2_|_4_|_7_|_8_|_auto_

> Context and VAE tile parallelism. The process re-launches under torchrun. More than one GPU requires Linux or WSL2

**--offload** _auto_|_none_|_model_|_stream_

> Where weights sit relative to GPU memory. The default is **auto**

**--text-encoder-precision** _bf16_|_fp8_

> **fp8** needs the `fp8` extra and uses less system RAM when offloading. The default is **bf16**

**--fp8-gemm** _triton_|_deepgemm_

> GEMM backend for the fp8 text encoder. **deepgemm** needs Hopper or newer. The default is **triton**

**--attention** _auto_|_sdpa_|_fa3_

> **fa3** is FlashAttention-3 on Hopper when the kernels package is installed. Otherwise PyTorch SDPA is used

**--block-chunk** _n_

> Slice token-wise work inside a block to cap activation memory. 0 is the default. 16384 is the documented setting for a 15 second mixed reference clip in 24 GB

**--weights**, **--subfolder**, **--base-model**

> Override the transformer repository, the task subfolder, or the base MiniMax-H3 snapshot

# DESCRIPTION

**hyperflow-h3-flash** is the command-line entry of the HyperFlow H3 Flash Python package from Video Rebirth. The same entry is available as a `python -m` module inside that package. It runs the INT8 convrot runtime locally. It is not the ComfyUI or stable-diffusion.cpp GGUF path, which load the same weights through those other programs.

Three tasks are selected by the inputs:

- Text only: video and audio from **--prompt**
- **--image**, optionally with **--last-image**: first frame, or first and last frame
- **--reference**: up to 12 images, videos, and audio clips named from the prompt

Install from the Git repository (`pip install` of that URL). Python 3.10 or newer, PyTorch 2.6 or newer with CUDA and Triton, and an Ampere or newer NVIDIA GPU are required. The first run downloads the task weights (on the order of 90 GB, or about 68 GB with the fp8 text encoder) and compiles Triton kernels once. Multi-GPU does not run on native Windows.

The Python API is `load_pipeline` with the task name `t2va`, `fl2va`, or `ref2va`.

# CAVEATS

This command needs an NVIDIA GPU. CPU and non-CUDA PyTorch builds are not the documented runtime. The first launch is a large download plus a kernel compile.

Frame counts that are not of the form `17n+5` are rounded up. **--height** and **--width** must be multiples of 32.

**--gpus auto** uses up to four visible GPUs. Values other than 1, 2, 4, 7, 8, and auto are not in the documented set.

The package does not ship as a distro binary. GGUF workflows in ComfyUI are a different install and do not add this command.

# HISTORY

HyperFlow H3 Flash is Video Rebirth's distilled video-and-audio model, published with weights on Hugging Face under VideoRebirthAI/hyperflow-h3-flash. The **hyperflow-h3-flash** command is the INT8 Python runtime in that repository. A separate repository holds the 8-step LoRA for the full-size MiniMax-H3 model.

# SEE ALSO

[python3](/man/python3)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/Video-Rebirth/hyperflow-h3-flash)```

```[Homepage](https://www.videorebirth.com/lp/hyperflow-flash)```

```[Documentation](https://huggingface.co/VideoRebirthAI/hyperflow-h3-flash)```

<!-- verified: 2026-11-07 -->
