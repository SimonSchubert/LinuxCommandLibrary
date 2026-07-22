# TAGLINE

Run local LLM inference from the command line (llama.cpp)

# TLDR

**Load a model and start an interactive chat**

```llama-cli -m [path/to/model.gguf]```

**Run a single prompt and print the completion**

```llama-cli -m [path/to/model.gguf] -p "[prompt]" -no-cnv```

**Set the prompt context size**

```llama-cli -m [path/to/model.gguf] -c [4096]```

**Offload model layers to the GPU**

```llama-cli -m [path/to/model.gguf] -ngl [all]```

**Download and run a model from Hugging Face**

```llama-cli -hf [user/model:quant]```

**Read the first prompt from a file**

```llama-cli -m [path/to/model.gguf] -f [path/to/prompt.txt]```

**Provide a system prompt**

```llama-cli -m [path/to/model.gguf] -sys "[You are a helpful assistant]"```

**Control randomness with temperature**

```llama-cli -m [path/to/model.gguf] --temp [0.7]```

# SYNOPSIS

**llama-cli** **-m** _model.gguf_ [_options_]

**llama-cli** **-hf** _user/model[:quant]_ [_options_]

# DESCRIPTION

**llama-cli** is the command-line inference tool of the **llama.cpp** project. It loads a model in the **GGUF** format and generates text either interactively, as a back-and-forth chat, or in a single non-interactive completion. It runs entirely on local hardware, using the CPU, a GPU (CUDA, Metal, Vulkan, ROCm), or a mix of both.

By default llama-cli enters conversation mode when the model ships with a chat template, applying that template automatically and exposing an interactive prompt. The **-no-cnv** flag disables this and treats the input strictly as a raw completion prompt. Models can be supplied as a local file with **-m**, downloaded on demand from Hugging Face with **-hf**, or pulled from a Docker repository with **-dr**.

The tool exposes the full sampler stack (temperature, top-k, top-p, min-p, mirostat, DRY, and more), context management options such as context size and context shifting, and hardware controls for thread count and GPU layer offloading. It shares its argument parser with the other llama.cpp tools like **llama-server**, so most flags behave identically across them.

# PARAMETERS

**-m**, **--model** _FNAME_

> Path to the GGUF model file to load.

**-hf**, **--hf-repo** _user/model[:quant]_

> Download the model from a Hugging Face repository; quant defaults to Q4_K_M.

**-p**, **--prompt** _PROMPT_

> Prompt to start generation with. For a system message use **-sys**.

**-f**, **--file** _FNAME_

> Read the prompt from a file.

**-sys**, **--system-prompt** _PROMPT_

> System prompt to use with the model, when the chat template supports one.

**-c**, **--ctx-size** _N_

> Size of the prompt context (default: 0, loaded from the model).

**-n**, **--predict** _N_

> Number of tokens to predict (default: -1, -1 = infinity).

**-ngl**, **--n-gpu-layers** _N_

> Maximum number of layers to store in VRAM. Accepts an exact number, **auto**, or **all**.

**-t**, **--threads** _N_

> Number of CPU threads to use during generation.

**-cnv**, **--conversation** / **-no-cnv**, **--no-conversation**

> Force conversation mode on or off (auto-enabled when a chat template is present).

**--temp** _N_

> Sampling temperature (default: 0.80).

**-co**, **--color** [on|off|auto]

> Colorize output to distinguish prompt and input from generated text.

**-i**, **--interactive**

> Run in interactive mode, returning control on a reverse prompt.

**-r**, **--reverse-prompt** _PROMPT_

> Halt generation at PROMPT and return control in interactive mode.

# CAVEAT

llama-cli only reads **GGUF** files; older GGML model files must be converted or re-downloaded. Performance and the achievable context size depend heavily on quantization and available VRAM: setting **-ngl** higher than your GPU memory allows causes a load failure or fallback to CPU. The single binary was historically named **main**; older guides referring to **./main** describe the same program.

# HISTORY

**llama.cpp** was created by **Georgi Gerganov** in **March 2023** as a plain C/C++ port of Meta's LLaMA model, aimed at running inference efficiently on consumer hardware without a GPU. The example program that became llama-cli was originally called **main**; it was renamed to **llama-cli** in **2024** when the project standardized its tool names. Development continues under the ggml-org organization with frequent releases.

# INSTALL

```apk: sudo apk add llama.cpp```

```brew: brew install llama.cpp```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[llama.cpp](/man/llama.cpp)(1), [llamafile](/man/llamafile)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)

# RESOURCES

```[Source code](https://github.com/ggml-org/llama.cpp)```

```[Documentation](https://github.com/ggml-org/llama.cpp/tree/master/tools/cli)```

<!-- verified: 2026-06-23 -->
