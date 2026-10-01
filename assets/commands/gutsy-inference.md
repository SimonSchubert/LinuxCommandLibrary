# TAGLINE

Serve a local decision model that returns probabilities

# TLDR

**Check** that the model loads and that state caching matches a full re-encode

```gutsy-inference check```

**Serve** the Decisions API on localhost

```gutsy-inference serve```

Answer **one JSON request** without starting the server

```gutsy-inference decide [request.json]```

Read the request from **stdin**

```gutsy-inference decide -```

Measure **CPU latency** at a few state lengths

```gutsy-inference bench```

Require a **bearer token** taken from an environment variable

```gutsy-inference serve --api-key-env [GUTSY_KEY]```

# SYNOPSIS

**gutsy-inference** **serve** [**--config** _file_] [**--host** _address_] [**--port** _port_] [**--threads** _n_] [**--api-key-env** _var_] [**--no-preload**] [**--quiet**]

**gutsy-inference** **decide** [**--config** _file_] [**--threads** _n_] _request.json_|**-**

**gutsy-inference** **bench** [**--config** _file_] [**--model** _name_] [**--threads** _n_] [**--state-tokens** _n_ ...] [**--questions** _n_] [**--repeats** _n_]

**gutsy-inference** **check** [**--config** _file_] [**--threads** _n_]

# DESCRIPTION

**gutsy-inference** runs a gutsy decision model on the local machine through llama.cpp. A request carries a **state** (text or JSON) and typed questions. The answer is a probability for every option, not generated text. Nothing is sent over the network unless you expose **serve** yourself.

The shipped model, **gutsy-0.8b** v0.3, is a fine-tune of Qwen3.5-0.8B distributed as a Q8_0 GGUF of about 775 MB, plus a calibration file. Weights are downloaded separately (Hugging Face repository **kouhxp/gutsy**) into the paths named by **models.json**. The runtime needs **llama-cpp-python** 0.3.35 or newer so the **qwen35** architecture loads.

**check** loads every model in the config and prints whether the cached state path agrees with a full re-encode, plus the calibration temperatures. A line containing **caching OK** means the snapshot path is in use. **caching disabled** still returns answers, but every question re-encodes the whole state.

**serve** listens on **127.0.0.1:8765** by default and preloads models. **POST /v1/systemone** is the TypeSafe-style endpoint (an unknown model name such as **jev-latest** falls back to the default model, and the response **model** field names what actually answered). **POST /api/alpha/decisions** and **POST /v1/decisions** speak the OpenRouter Decisions shape. **GET /health** reports loaded models, the caching self-check, and temperatures. **GET /v1/models** lists names.

**decide** reads one request object from a file, or from stdin when the path is **-**, and prints the JSON answer. **bench** times questions against synthetic states. The default lengths are 200, 1000, and 4000 tokens, with 5 questions and 3 repeats.

The state is encoded once. Each question restores that snapshot and scores only its own tokens. Up to 64 questions may share one request. Question types are **noul** (yes/no, answer field **noul** is P(yes)), **choice** (2–255 named options), and **score** (2–16 ordered levels, lowest first). Choice and score answers include **probabilities**, **confidence**, **margin**, and **reject**. **reject** is the probability that none of the options fit or that the state does not say. Option probabilities are conditioned on not rejecting, so they still sum to 1. Yes/no answers have none of those extra fields. A single model call holds at most 16 options. Longer choice lists are shortlisted unless the model sets **"shortlist": false**, which then refuses lists above 16. Score questions are never shortlisted.

# PARAMETERS

**--config** _file_

> Model registry. Default **models.json** in the working directory.

**--threads** _n_

> CPU threads. The default is about the number of physical cores. Using every logical core is often slower. Overrides **n_threads** in the config for this process.

**serve**

> Start the HTTP server. Models are loaded at startup unless **--no-preload** is set.

**--host** _address_

> Bind address. Default **127.0.0.1**.

**--port** _port_

> Listen port. Default **8765**.

**--api-key-env** _var_

> Require **Authorization: Bearer** with the value of environment variable _var_. The process exits if that variable is empty.

**--no-preload**

> Do not load models until the first request.

**--quiet**

> Reduce server log output.

**decide** _request.json_

> One Decisions request. Use **-** to read JSON from stdin. The printed object is the model answer.

**bench**

> Print the thread count and latency figures for the selected model.

**--model** _name_

> Model to benchmark. Default is the config's **default** model.

**--state-tokens** _n_ ...

> State lengths to time. Default **200 1000 4000**.

**--questions** _n_

> Questions asked against each state. Default **5**.

**--repeats** _n_

> Repeats per length. Default **3**.

**check**

> Load each configured model, compare cached answers with a full re-encode, and print calibration temperatures.

# CONFIGURATION

**models.json** names the GGUF and its calibration file. Copy **models.example.json** and point **gguf** and **calibration** at the downloaded files. Top-level keys:

**default** is the model used when a request omits **model**. **n_threads** is the CPU thread count (**null** lets the runtime estimate physical cores). **n_gpu_layers** is **0** for CPU and **-1** to offload every layer to a GPU. **cache_entries** and **cache_mb** bound the LRU of encoded states (the example uses 4 entries and 512 MB).

Each model object has **gguf**, **calibration**, **n_ctx** (8192 for gutsy-0.8b-v03), **reject_slot** (**true** when the model was trained with a reject option), **shortlist** (default **true**), and optionally **max_options** when a call should hold fewer than 16 options.

# CAVEATS

Inference is serialized per model, so concurrent requests queue. The context window is 8192 tokens for the state plus the question. On CPU, latency grows with the first encoding of a long state. Follow-up questions on a cached state do not pay that cost again.

The same request returns the same probabilities on the same machine and llama.cpp build. A different build or GPU can change the last decimal places. Shortlisted answers on easy lookups tend to spread probability across eliminated options, so **confidence** understates how often the top option is right.

**check** must be run from the directory that contains **models.json**, or pass **--config** with a path the **gguf** entries can resolve. Date arithmetic, fresh multi-step rulebooks, and open-ended world knowledge are weak spots of the 0.8B model. Gate actions on thresholds you measure on your own labels.

# SEE ALSO

[ollama](/man/ollama)(1), [llama-cli](/man/llama-cli)(1), [llama.cpp](/man/llama.cpp)(1), [llm](/man/llm)(1)

# RESOURCES

```[Source code](https://github.com/kouhxp/gutsy)```

```[Documentation](https://github.com/kouhxp/gutsy/blob/main/gutsy-inference/README.md)```

<!-- verified: 2026-10-01 -->
