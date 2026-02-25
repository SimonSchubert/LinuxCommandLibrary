# TAGLINE

Local AI text generation server and inference engine

# TLDR

**Launch** with a GGUF model file

```koboldcpp --model [path/to/model.gguf]```

**Launch** with GPU acceleration using CUDA

```koboldcpp --model [path/to/model.gguf] --usecuda --gpulayers [35]```

**Launch** with Vulkan GPU support on a custom port

```koboldcpp --model [path/to/model.gguf] --usevulkan --gpulayers [35] --port [8080]```

**Run a single prompt** without starting a server

```koboldcpp --model [path/to/model.gguf] --prompt "[What is the meaning of life?]"```

**Launch in CLI interactive mode** without the web UI

```koboldcpp --model [path/to/model.gguf] --cli```

**Load a saved configuration** file

```koboldcpp --config [path/to/config.kcpps]```

# SYNOPSIS

**koboldcpp** [_options_] [**--model** _model_path_]

# PARAMETERS

**--model** _path_
> Specify the GGUF/GGML model file to load

**--config** _file_
> Load a .kcpps configuration file

**--usecuda**
> Enable NVIDIA CUDA GPU acceleration

**--usevulkan**
> Enable Vulkan GPU acceleration (AMD/NVIDIA)

**--gpulayers** _n_
> Number of model layers to offload to GPU

**--threads** _n_
> Set CPU thread count for inference

**--contextsize** _n_
> Set maximum context length in tokens

**--port** _n_
> Change server port (default: 5001)

**--host** _addr_
> Bind to a specific IP address

**--multiuser** _n_
> Enable multiuser mode with _n_ concurrent slots

**--password** _key_
> Require API authentication with the given key

**--cli**
> Launch interactive command-line interface without starting a server

**--prompt** _text_
> Run a single prompt, print output, and exit

**--benchmark**
> Run performance benchmarking mode

**--flashattention**
> Enable flash attention for improved performance

**--smartcontext**
> Enable smart context handling to reduce reprocessing

**--usemmap**
> Enable memory-mapped file I/O for model loading

**--usemlock**
> Force model to remain in RAM (prevent swapping)

**--ssl**
> Enable SSL for HTTPS connections

**--remotetunnel**
> Enable remote tunnel access for sharing the server

**--sdmodel** _path_
> Load a Stable Diffusion model for image generation

**--noavx2**
> Compatibility mode for older CPUs without AVX2

**--showgui**
> Show the GUI launcher even when command-line flags are used

**--help**
> Display all available commands

# DESCRIPTION

**koboldcpp** is a self-contained AI text generation server that runs large language models locally. Built on top of **llama.cpp**, it provides a bundled web UI (KoboldAI Lite) and supports all GGML and GGUF model formats. It requires no external dependencies and runs as a single executable.

The server exposes an API compatible with KoboldAI and OpenAI formats, making it usable with a wide range of frontends and applications. It supports CPU inference as well as GPU acceleration through **CUDA** (NVIDIA), **Vulkan** (AMD/NVIDIA), and **Metal** (Apple Silicon).

Beyond text generation, koboldcpp supports **image generation** (Stable Diffusion), **speech recognition** (Whisper), and **text-to-speech**, all within the same executable. The bundled web UI offers multiple interaction modes including chat, instruct, adventure, and story writing.

# CONFIGURATION

When launched without arguments, koboldcpp opens a **GUI launcher** for interactive configuration. Settings can be saved to and loaded from **.kcpps** configuration files. Command-line flags override GUI settings when both are used.

Key configuration considerations include **GPU layer offloading** (more layers on GPU means faster inference but requires more VRAM), **context size** (larger contexts use more memory), and **thread count** (typically set to the number of physical CPU cores).

# CAVEATS

Model files can be very large (several GB to over 100 GB) and require significant RAM or VRAM. GPU acceleration requires appropriate drivers and hardware support. Performance varies significantly based on model size, quantization level, and available hardware. The Vulkan backend is more broadly compatible but generally slower than CUDA on NVIDIA hardware. Flash attention requires compatible model architectures.

# HISTORY

KoboldCpp was created by a developer known as **LostRuins** (alias **Concedo**) and first released on **March 16, 2023** as a fork of **llama.cpp** combined with the KoboldAI interface. It was designed to provide a simple, self-contained way to run large language models locally without complex setup. The project grew rapidly alongside the open-source LLM movement, continuously adding features like multi-modal support, GPU backends, and image generation capabilities. It is licensed under **AGPL-3.0**.

# SEE ALSO

[llama](/man/llama)(1), [ollama](/man/ollama)(1)
