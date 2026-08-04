# TAGLINE

Stream large Qwen MoE models on Apple Silicon with low RAM

# TLDR

**Build** the release binaries

```git clone https://github.com/leonickson1/Swiftlet.git && cd Swiftlet```

```swift build -c release```

**Download / repack** a 4-bit model container from Hugging Face

```.build/release/swiftlet-repack --from-hf Leonickson/Qwen3.6-35B-A3B-qpack --output ~/models/qwen3.6-35b.qpack```

**Chat** with multi-turn history

```swiftlet chat ~/models/qwen3.6-35b.qpack "[Who wrote One Hundred Years of Solitude?]" "[What language did he write it in?]"```

**One-shot** generation with stats

```swiftlet generate ~/models/qwen3.6-35b.qpack --gpu --chat --prompt "[Explain expert streaming in one paragraph.]"```

Start an **OpenAI-compatible** local server

```swiftlet-server --model ~/models/qwen3.6-35b.qpack --port 8080```

# SYNOPSIS

**swiftlet** **chat** _model.qpack_ [_prompt_...]

**swiftlet** **generate** _model.qpack_ [**--gpu**] [**--chat**] [**--prompt** _text_]

**swiftlet-repack** **--from-hf** _repo_ **--output** _path_

**swiftlet-server** **--model** _path_ [**--port** _n_]

# PARAMETERS

**chat** _model_ [_prompts_...]
> Interactive or scripted multi-turn chat. Applies the model chat template, can disable reasoning blocks, and caches conversation state so follow-ups only prefill the new turn.

**generate** _model_ [**--gpu**] [**--chat**] [**--prompt** _text_]
> One-shot generation with optional GPU path and generation statistics.

**swiftlet-repack** **--from-hf** _owner/repo_ **--output** _file.qpack_
> Stream and pack expert weights into a fixed-stride **.qpack** container (resumable). Also accepts raw MLX checkpoints via **--source** / Hugging Face MLX community repos.

**swiftlet-server** **--model** _file.qpack_ [**--port** _n_]
> OpenAI chat-completions-compatible HTTP server (loopback-oriented).

# DESCRIPTION

**swiftlet** is a **Swift + Metal** runtime for the **Qwen3-Next** and **Qwen3.5/3.6 MoE** hybrid family on **Apple Silicon**. Only the dense core stays resident in RAM; routed Mixture-of-Experts weights stream from SSD with **pread** into a bounded expert cache. That design runs models such as **Qwen3.6-35B-A3B** (~2.6 GB peak RAM, ~18 GB on disk) and **Qwen3-Next-80B-A3B** (~4.3 GB peak RAM, ~42 GB on disk) at 4-bit quantization on ordinary Macs—and the 35B class can run on recent iPhones inside companion apps.

The package ships three executables: **swiftlet** (chat / generate), **swiftlet-repack** (build **.qpack** containers), and **swiftlet-server** (OpenAI-compatible API). **SwiftletCore** is also a library for embedding in macOS/iOS apps. Kernels are runtime-compiled Metal shaders; layer math is validated against mlx-lm reference fixtures.

# CAVEATS

**Apple Silicon only** (macOS 14+ / iOS 17+). Requires free SSD space for full containers (tens of GB). Only a few billion parameters are active per token, so factual recall can feel closer to a smaller dense model than the headline parameter count. The decode loop remains a performance focus; reported speeds vary by chip. Model weights are downloaded separately and remain under their own licenses (Qwen models: Apache-2.0). Not a general Linux GPU inference stack.

# HISTORY

**Swiftlet** is an Apache-2.0 project that applies expert-streaming ideas (in the spirit of work such as TurboFieldfare) to Qwen hybrid MoE architectures with Gated DeltaNet and sparse expert routing, implemented from scratch in Swift and Metal against mlx-lm correctness references.

# SEE ALSO

[ollama](/man/ollama)(1), [mlx](/man/mlx)(1), [llama](/man/llama)(1)

# RESOURCES

```[Source code](https://github.com/leonickson1/Swiftlet)```

```[Homepage](https://github.com/leonickson1/Swiftlet)```

<!-- verified: 2026-08-04 -->
