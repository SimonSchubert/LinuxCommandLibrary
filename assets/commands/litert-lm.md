# TAGLINE

run on-device LiteRT-LM language models from the command line

# TLDR

**Chat** with a local `.litertlm` file

```litert-lm run [path/to/model.litertlm]```

Run a model from a **Hugging Face** repo with one prompt

```litert-lm run --from-huggingface-repo [owner/repo] [file.litertlm] --prompt "[question]"```

Use the **GPU** backend

```litert-lm run [model.litertlm] --backend gpu```

Attach an **image** (multimodal)

```litert-lm run [model.litertlm] --vision-backend gpu --attachment [image.jpg] --prompt "[Describe this image.]"```

Load **Python tools** from a preset

```litert-lm run [model.litertlm] --preset [preset.py]```

Start an **OpenAI-compatible** HTTP server

```litert-lm serve --port [9379]```

**Benchmark** a model

```litert-lm benchmark [model.litertlm]```

**List** imported models

```litert-lm list```

# SYNOPSIS

**litert-lm** _command_ [_options_]

# COMMANDS

**run** [_model_ | _id_] [_options_]
> Interactive chat or a single **--prompt**.

**serve** [_options_]
> OpenAI-compatible API server.

**benchmark** _model_
> Measure decode/prefill performance.

**list**
> List imported models.

# PARAMETERS

**--from-huggingface-repo** _owner/name_
> Download the named file from that repository.

**--prompt** _text_
> One-shot prompt instead of a REPL.

**--backend** _cpu|gpu_
> Inference backend.

**--enable-speculative-decoding** _true_
> Multi-token prediction when the model ships a drafter (GPU).

**--vision-backend** / **--audio-backend** _cpu|gpu_
> Required when using image or audio **--attachment** (repeatable).

**--preset** _file.py_
> Python file defining `tools` and optional `system_instruction` for function calling.

**--port** _n_
> Listen port for **serve**.

**-h**, **--help**
> Help for the tool or a subcommand (`litert-lm run --help`).

# DESCRIPTION

**litert-lm** is the CLI for Google's **LiteRT-LM** stack: on-device LLM inference with LiteRT, used in Chrome, Chromebook Plus, and Pixel Watch. It runs `.litertlm` packages (Gemma and others) on CPU or GPU, with optional vision/audio attachments and Python tool loops.

Install from PyPI (`uv tool install litert-lm` or `pip`) or from GitHub releases. GPU needs working drivers (Vulkan on Linux/Windows, Metal on macOS). MTP (**--enable-speculative-decoding**) only works when the model includes a drafter.

# CAVEATS

Not every `.litertlm` file supports MTP, GPU, or multimodality. Hugging Face downloads need network and accept the model license. **serve** is a local API; do not bind it on an untrusted network without your own access control.

# HISTORY

LiteRT-LM CLI shipped around the Gemma 4 on-device releases (v0.10+). Later versions added Windows GPU, `serve`, Android, and C API prebuilts.

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1)

# RESOURCES

```[Documentation](https://ai.google.dev/edge/litert-lm/cli)```

```[Homepage](https://ai.google.dev/edge/litert-lm)```

```[Source code](https://github.com/google-ai-edge/LiteRT-LM)```

<!-- verified: 2026-08-26 -->
