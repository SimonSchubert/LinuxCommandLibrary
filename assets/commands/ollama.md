# TAGLINE

runs large language models locally

# TLDR

**Run a model** interactively

```ollama run [llama3]```

**Run a model** with a prompt

```ollama run [llama3] "[What is the capital of France?]"```

**List installed models**

```ollama list```

**Pull a model**

```ollama pull [mistral]```

**Show model info**

```ollama show [llama3]```

**List running models**

```ollama ps```

**Remove a model**

```ollama rm [model_name]```

**Start the API server**

```ollama serve```

# SYNOPSIS

**ollama** [_command_] [_options_]

# PARAMETERS

**run** _MODEL_ [_PROMPT_]
> Run model interactively or with a one-off prompt.

**pull** _MODEL_
> Download model from registry.

**push** _MODEL_
> Push model to registry.

**list** (or **ls**)
> List locally available models.

**show** _MODEL_
> Show model information (architecture, parameters, license).

**ps**
> List currently running models.

**stop** _MODEL_
> Stop a running model.

**rm** _MODEL_
> Remove a local model.

**cp** _SOURCE_ _DESTINATION_
> Copy a model locally under a new name.

**serve**
> Start the Ollama API server (default port 11434).

**create** _NAME_ **-f** _MODELFILE_
> Create a custom model from a Modelfile.

**--help**
> Display help information.

# DESCRIPTION

**ollama** runs large language models locally. It handles model downloads, serving via a REST API, and interactive chat sessions.

Supports a wide range of open models including Llama, Mistral, Gemma, Phi, Qwen, DeepSeek, and others. Models are pulled from the Ollama registry and cached locally.

The API server provides OpenAI-compatible endpoints for chat completions, embeddings, and model management. Custom models can be created using Modelfiles that specify base models, system prompts, parameters, and adapter layers.

# CAVEATS

Requires sufficient RAM/VRAM depending on model size. GPU acceleration is supported (NVIDIA, AMD, Apple Silicon). The API server listens on localhost:11434 by default; configure with OLLAMA_HOST environment variable.

# HISTORY

**Ollama** was created by **Jeffrey Morgan** and first released in **2023**. Built on **llama.cpp**, it simplifies the process of downloading, running, and managing open-source language models locally. The project quickly gained popularity as interest in running LLMs without cloud APIs grew.

# SEE ALSO

[llama.cpp](/man/llama.cpp)(1), [llamafile](/man/llamafile)(1)

