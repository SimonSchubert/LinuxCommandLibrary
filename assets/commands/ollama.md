# TLDR

**Run a model**

```ollama run [llama2]```

**List installed models**

```ollama list```

**Pull a model**

```ollama pull [mistral]```

**Remove a model**

```ollama rm [model_name]```

**Start server**

```ollama serve```

**Create custom model**

```ollama create [mymodel] -f [Modelfile]```

# SYNOPSIS

**ollama** [_command_] [_options_]

# PARAMETERS

**run** _MODEL_
> Run model interactively.

**pull** _MODEL_
> Download model.

**list**
> List local models.

**rm** _MODEL_
> Remove model.

**serve**
> Start API server.

**create** _NAME_
> Create custom model.

**--help**
> Display help information.

# DESCRIPTION

**ollama** runs large language models locally. Manages model downloads and serving.

The tool provides local LLM inference. Supports various open models.

ollama runs LLMs locally.

# CAVEATS

Requires sufficient RAM/VRAM. Model sizes vary. GPU acceleration supported.

# HISTORY

Ollama was created for **easy local LLM** deployment and management.

# SEE ALSO

[llama.cpp](/man/llama.cpp)(1), [llamafile](/man/llamafile)(1)

