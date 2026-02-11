# TAGLINE

Self-hosted AI coding assistant

# TLDR

**Start Tabby server** with GPU acceleration

```tabby serve --model [StarCoder-1B] --device cuda```

**Start server with chat model**

```tabby serve --model [StarCoder-1B] --chat-model [Qwen2-1.5B-Instruct] --device cuda```

**Run with CPU** only

```tabby serve --model [StarCoder-1B] --device cpu```

**Run via Docker** with GPU support

```docker run -it --gpus all -p 8080:8080 -v $HOME/.tabby:/data tabbyml/tabby serve --model [StarCoder-1B] --device cuda```

**Specify port** for the server

```tabby serve --model [StarCoder-1B] --port [8080]```

# SYNOPSIS

**tabby** serve [**--model** _name_] [**--chat-model** _name_] [**--device** _type_] [**--port** _port_]

# PARAMETERS

**--model** _name_
> Code completion model to use (e.g., StarCoder-1B, CodeLlama-7B).

**--chat-model** _name_
> Conversational AI model for chat features (e.g., Qwen2-1.5B-Instruct).

**--device** _type_
> Hardware acceleration: cuda (NVIDIA GPU), metal (Apple M1/M2), cpu.

**--port** _port_
> Port to expose the API server. Default: 8080.

**--help**
> Display help information.

# DESCRIPTION

**tabby** is a self-hosted AI coding assistant that provides code completion, inline edits, and chat capabilities. Unlike cloud-hosted alternatives, Tabby runs entirely on your own infrastructure, giving you full control over models, data, and costs.

The **serve** command starts the Tabby API server, which exposes an OpenAPI-compatible interface for IDE extensions and other clients. The server supports multiple code completion models including StarCoder, CodeLlama, and CodeGen families.

Tabby is optimized for consumer-grade GPUs and supports NVIDIA CUDA for Linux/Windows and Apple Metal for macOS. CPU-only mode is available for environments without GPU acceleration, though with reduced performance.

Data is stored in **~/.tabby** by default, including model weights, configuration, and indexed code repositories. The server provides a web UI at the configured port for administration, model management, and repository indexing.

# CAVEATS

GPU acceleration requires appropriate drivers (CUDA toolkit for NVIDIA, Metal for Apple Silicon). Model downloads can be several gigabytes depending on the selected model. Self-hosting requires adequate hardware resources; recommended minimum is 8GB VRAM for GPU mode or 16GB RAM for CPU mode.

# HISTORY

Tabby was created by TabbyML and released as open-source in **2023**, positioning itself as a self-hosted alternative to GitHub Copilot. The project gained traction among enterprises and developers seeking data privacy and cost control. Version 0.24 in **February 2025** added LDAP authentication, and version 0.30 in **July 2025** introduced GitLab merge request context indexing.

# SEE ALSO

[ollama](/man/ollama)(1), [llamacpp](/man/llamacpp)(1), [copilot](/man/copilot)(1)
