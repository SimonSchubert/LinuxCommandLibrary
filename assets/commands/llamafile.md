# TLDR

**Run llamafile**

```./[model].llamafile```

**Run with web UI**

```./[model].llamafile --server```

**Generate from prompt**

```./[model].llamafile -p "[prompt]"```

**Interactive chat mode**

```./[model].llamafile -i```

**Set context size**

```./[model].llamafile -c [8192] -p "[prompt]"```

**Specify threads**

```./[model].llamafile -t [8] -p "[prompt]"```

# SYNOPSIS

**llamafile** [_options_]

# PARAMETERS

**-m** _model_
> Model file (if not embedded).

**-p** _prompt_
> Input prompt.

**-i**
> Interactive mode.

**--server**
> Start web server.

**-c** _size_
> Context window size.

**-t** _threads_
> Number of threads.

**-ngl** _n_
> GPU layers.

**--port** _port_
> Server port.

# DESCRIPTION

**llamafile** is a single-file executable that bundles llama.cpp with a model for portable LLM inference. The same file runs on Linux, macOS, Windows, and BSD without installation.

llamafiles are self-contained and include a web UI for chat interactions.

# CREATING LLAMAFILE

```bash
# Bundle model into llamafile
zipalign -j0 llamafile model.gguf
chmod +x llamafile
```

# CAVEATS

File sizes can be large (several GB). Some systems need chmod +x. Apple Silicon requires signing. Memory mapped for efficiency.

# HISTORY

llamafile was created by **Justine Tunney** at **Mozilla** in **2023**, combining Cosmopolitan Libc's universal binary format with llama.cpp.

# SEE ALSO

[llama.cpp](/man/llama.cpp)(1), [ollama](/man/ollama)(1), [whisper.cpp](/man/whisper.cpp)(1)
