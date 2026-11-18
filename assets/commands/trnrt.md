# TAGLINE

Serve and compile large language models on AWS Trainium

# TLDR

**Serve** an OpenAI-compatible API on a Trainium2 box

```trnrt serve --model [/model] --port [8000]```

Serve the **batch-8** configuration

```trnrt serve --model [/model] --preset batch8```

Run **one engine** with no router in front

```trnrt engine --model [/model] --core-base [0] --port [8001]```

Build the **compile cache** on a CPU host, one step at a time

```trnrt compile shapes [zai-org/GLM-5.3-Flash] --revision [COMMIT] --out [/data/trnrt]```

```trnrt compile decisions --model [zai-org/GLM-5.3-Flash] --revision [COMMIT] --out [/data/trnrt]```

```trnrt compile capture --out [/data/trnrt] -- --model [/data/trnrt/shapes]```

```trnrt compile compile --out [/data/trnrt] --work-root [/data/trnrt/work]```

```trnrt compile strip --out [/data/trnrt]```

# SYNOPSIS

**trnrt** **serve** **--model** _DIR_ [_options_]

**trnrt** **engine** **--model** _DIR_ [_options_]

**trnrt** **compile** **shapes** | **decisions** | **capture** | **compile** | **strip** [_options_]

**trnrt** **--help**

# DESCRIPTION

**trnrt** is the command-line entry of TrnRT, an inference engine for large language models on AWS Trainium. The console script is **trnrt**, the same entry as **python -m trnrt**. It serves an OpenAI-compatible chat and completions API, including streaming, tool calls, and reasoning output.

**serve** starts several engines on disjoint NeuronCores and a session-affine router in front of them. Each session stays on one engine so that engine's prefix cache can be reused. The default is two engines of 32 tensor-parallel ranks on one **trn2.48xlarge**, listening on port **8000**. Engine _i_ listens on the router port plus 1 plus _i_, on localhost only. Engines start one at a time and must answer **/health** before the next starts.

**engine** is one engine and its own API, with no router. **serve** launches it as a child. The child is marked to receive SIGTERM when the parent exits, so an engine does not keep its NeuronCores after the server is gone.

**compile** builds the cache those engines load. Graphs are captured on a CPU host. The serving host compiles nothing unless **--allow-compile** is set. A missing graph stops start-up. The README quickstart runs each subcommand inside the project's Docker image, which carries the Neuron SDK.

The supported model at the time of writing is GLM-5.3-Flash. The served defaults are a 1,048,576-token context, FP8 KV cache, 256-token pages, and decode batches of up to 12 requests per engine (**--preset batch12**). **--preset batch8** is the other non-speculative configuration. Presets whose names start with **mtp-** turn on speculative decoding with the model's MTP layer. A preset only changes defaults; an explicit flag still wins. Capture and serve must use the same preset, or the server will not find its graphs.

With no subcommand, or with **--help**, **trnrt** prints the module docstring and exits **0**. An unknown subcommand exits **2**. An engine that stops because a graph is missing from the cache exits **3**. An engine that refuses to start because its devices are busy or host memory is too fragmented exits **4**.

# COMMANDS

**serve**
> Engines plus the router. Requires **--model**.

**engine**
> One engine and its OpenAI API.

**compile shapes**
> Write the checkpoint config and safetensors headers. The model argument is a Hugging Face repo id or a local directory. **--revision** pins a commit, branch, or tag.

**compile decisions**
> Record load-time decisions that read weight values. **--model** is required.

**compile capture**
> Capture every graph the engine runs, on the meta device. Engine arguments go after **--** and must match the server, including **--preset**.

**compile compile**
> Run neuronx-cc on every captured entry that has no compiled binary yet.

**compile strip**
> Drop debug info from those binaries, in place.

# PARAMETERS

**--model** _DIR_
> Checkpoint directory or Hugging Face repo id. Required for **serve** and **engine**.

**--revision** _REV_
> Commit, branch, or tag when **--model** is a repo id. Host-only; it does not change graphs.

**--preset** _NAME_
> Named configuration: **batch12** (default values), **batch8**, **mtp-batch8**, **mtp-always**, **mtp-batch12**, or **mtp-batch24**.

**--port** _N_
> Router port for **serve** (default **8000**). Engine _i_ uses that port plus 1 plus _i_. For **engine**, the API port (default **8001**).

**--host** _ADDR_
> Bind address (default **0.0.0.0**). Child engines bind to localhost.

**--engines** _N_
> How many engines **serve** starts (default **2**), each with **--tp** ranks on consecutive cores.

**--tp** _N_
> Tensor-parallel ranks per engine (default **32**), one logical NeuronCore each.

**--core-base** _N_
> First logical NeuronCore for **engine** (default **0**).

**--served-model-name** _NAME_
> Name clients send as the model (default **glm**).

**--device** _neuron|cpu_
> Where the engine runs (default **neuron**). NKI kernels do not run on **cpu**.

**--allow-compile**
> Compile a graph that is missing from the cache on this host instead of failing. That compile takes minutes to hours per graph.

**--startup-timeout** _SECONDS_
> How long each engine has to load, warm every graph, and answer **/health** (default **3600**). **0** waits forever. Past the limit, **serve** stops every engine and exits **1**.

**--out** _DIR_
> Work directory for **compile** (shapes, capture, and the cache root).

**--work-root** _DIR_
> Scratch trees for neuronx-cc during **compile compile**. Default: the temp directory.

# CAVEATS

Serving needs a **trn2.48xlarge** and a compile cache built for the same arguments. The cache is not optional. **--allow-compile** on the serving box is the escape hatch, and it is slow.

**--max-running** only limits how many requests run at once. It does not change graphs. Bucket lists, page size, and speculative presets do change graphs, so they belong in the capture command as well as in **serve**.

The router keeps an idle client connection open for **75** seconds by default, longer than many HTTP client pools, so a client does not write into a connection the router is already closing.

This repository's published numbers were measured on an earlier build. The project documents which graphs and requests it has rechecked.

# SEE ALSO

[docker](/man/docker)(1), [python3](/man/python3)(1), [huggingface-cli](/man/huggingface-cli)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/RunanywhereAI/trnrt)```

```[Homepage](https://runanywhere.ai)```

```[Documentation](https://github.com/RunanywhereAI/trnrt/blob/development/docs/README.md)```

<!-- verified: 2026-11-18 -->
