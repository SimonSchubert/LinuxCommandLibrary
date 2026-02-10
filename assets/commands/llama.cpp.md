# TAGLINE

port of Meta's LLaMA model to C/C++ for efficient CPU and GPU inference

# TLDR

**Run interactive chat**

```./main -m [model.gguf] -i```

**Generate text with prompt**

```./main -m [model.gguf] -p "[Your prompt here]"```

**Set context size**

```./main -m [model.gguf] -c [4096] -p "[prompt]"```

**Use multiple threads**

```./main -m [model.gguf] -t [8] -p "[prompt]"```

**Run server mode**

```./server -m [model.gguf] --port [8080]```

**Quantize model**

```./quantize [model.gguf] [output.gguf] [q4_0]```

# SYNOPSIS

**main** [_options_] -m _model_ -p _prompt_

# PARAMETERS

**-m** _model_
> Path to GGUF model file.

**-p** _prompt_
> Input prompt.

**-i**
> Interactive mode.

**-c** _size_
> Context size.

**-t** _threads_
> Number of threads.

**-n** _tokens_
> Number of tokens to generate.

**--temp** _temp_
> Temperature for sampling.

**-ngl** _layers_
> GPU layers to offload.

# DESCRIPTION

**llama.cpp** is a port of Meta's LLaMA model to C/C++ for efficient CPU and GPU inference. It supports various quantization formats and runs LLMs on consumer hardware.

The project includes tools for model conversion, quantization, and serving.

# SUPPORTED FORMATS

```
GGUF - Current format
Quantizations: q4_0, q4_1, q5_0, q5_1, q8_0
GPU: CUDA, Metal, OpenCL
```

# CAVEATS

Models must be converted to GGUF format. Memory requirements depend on model size and quantization. GPU support varies by backend.

# HISTORY

llama.cpp was created by **Georgi Gerganov** in March **2023** after Meta released LLaMA weights, enabling local LLM inference.

# SEE ALSO

[llamafile](/man/llamafile)(1), [ollama](/man/ollama)(1), [ggml](/man/ggml)(1)
