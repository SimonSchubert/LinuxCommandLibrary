# TAGLINE

Run local large language models through Ubuntu inference snaps from the terminal

# TLDR

Start a chat session with the selected model

```inference-snaps chat```

Check engine and server status

```inference-snaps status```

Switch to a different execution engine (e.g. CUDA)

```sudo inference-snaps use-engine cuda```

Show hardware information (RAM, architecture, GPUs)

```sudo inference-snaps show-machine```

# SYNOPSIS

**inference-snaps** [_command_] [_options_]

# DESCRIPTION

**inference-snaps** (and the associated model snaps such as `deepseek-r1`, `gemma3`, `gemma4`, etc.) provide a simple way to run powerful open-weight LLMs locally on Ubuntu without writing any code or managing Python environments.

The snaps bundle the model weights, an inference engine (CPU, CUDA, ROCm, etc.), and a small chat server. Once started, you can talk to the model from the terminal or connect other tools to the local HTTP API.

Supported models (as of 2026) include DeepSeek R1, Google Gemma 3/4, Nemotron, Qwen-VL and others. Each model snap installs its own command that behaves like `inference-snaps`.

# COMMANDS

**chat**  
> Start an interactive chat (launches the background server on first use)

**status**  
> Show which model/engine is active and whether the chat server is running

**use-engine** _engine_  
> Switch execution backend (cpu, cuda, rocm, etc.) and download the matching model variant if needed

**show-machine**  
> Print detailed hardware information relevant to LLM inference

**get** / **set**  
> Read or change configuration keys (host, port, etc.)

# CAVEATS

- These are Ubuntu Snap packages. They work best on Ubuntu and Ubuntu-derived distributions.
- Large models require substantial RAM and/or a supported GPU.
- The first run of a model will download several gigabytes of weights.

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp) tools, [huggingface-cli](/man/huggingface-cli)(1)
