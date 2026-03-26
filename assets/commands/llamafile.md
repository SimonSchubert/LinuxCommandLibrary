# TAGLINE

Single-file executable for portable LLM inference

# TLDR

**Run a llamafile (launches chat in terminal and server on port 8080)**

```./[model].llamafile```

**Run in server-only mode**

```./[model].llamafile --server```

**Run in CLI mode with a prompt**

```./[model].llamafile --cli -p "[prompt]"```

**Run interactive chat mode**

```./[model].llamafile --chat```

**Load external model weights**

```llamafile -m [path/to/model.gguf]```

**Set context size and number of threads**

```./[model].llamafile -c [8192] -t [8] -p "[prompt]"```

**Run server on a specific host and port**

```./[model].llamafile --server --host [0.0.0.0] --port [8080]```

**Offload layers to GPU and set temperature**

```./[model].llamafile -ngl [999] --temp [0.7] -p "[prompt]"```

# SYNOPSIS

**llamafile** [_options_]

# PARAMETERS

**-m** _model_
> Path to model weights file (if not embedded in the llamafile).

**-p** _prompt_
> Input prompt text.

**--cli**
> Run in CLI mode, answering a single prompt.

**--chat**
> Run interactive chat mode with slash commands.

**--server**
> Start HTTP server mode with web UI.

**-c** _size_
> Context window size in tokens.

**-t** _threads_
> Number of threads to use for computation.

**-n** _count_
> Maximum number of tokens to generate.

**-ngl** _n_
> Number of layers to offload to GPU.

**--host** _addr_
> Server listening address (default: 127.0.0.1).

**--port** _port_
> Server port (default: 8080).

**--temp** _value_
> Sampling temperature (higher = more random).

**--top-k** _n_
> Top-k sampling (default: 40).

**--top-p** _value_
> Top-p nucleus sampling (default: 0.95).

**--seed** _n_
> Random seed for reproducible output.

**--grammar** _grammar_
> Apply BNF grammar to constrain output format.

**--mmproj** _file_
> Multimodal projection model weights for vision models.

**--image** _file_
> Image file input for multimodal models.

**--jinja**
> Enable Jinja template support for chat templates.

**-e**
> Enable prompt evaluation.

# DESCRIPTION

**llamafile** is a single-file executable that bundles llama.cpp with a model for portable LLM inference. The same file runs on Linux, macOS, Windows, FreeBSD, NetBSD, and OpenBSD without installation, built on Cosmopolitan Libc.

By default, llamafile launches both a terminal chatbot and an HTTP server with a web UI on port 8080. It can also run in dedicated CLI, chat, or server modes.

# CAVEATS

File sizes can be large (several GB). Requires chmod +x on Unix systems. Apple Silicon may require code signing. Models are memory-mapped for efficiency.

# HISTORY

llamafile was created by **Justine Tunney** at **Mozilla** in **2023**, combining Cosmopolitan Libc's universal binary format with llama.cpp.

# SEE ALSO

[llama.cpp](/man/llama.cpp)(1), [ollama](/man/ollama)(1)
