# TAGLINE

Serve and validate robotics world-action models

# TLDR

**List** known checkpoints and registered adapters

```instinctflash models```

**Preflight** a checkpoint with no weight download

```instinctflash serve [model-id] --serve.dry_run=true```

**Serve** a checkpoint on the openpi websocket protocol

```instinctflash serve [model-id]```

**Serve on a chosen port** in FP8

```instinctflash serve [model-id] --serve.port=[8000] --fp8```

**Load once**, emit one action, and exit

```instinctflash serve [/path/to/checkpoint] --serve.smoke=true```

**Check** that a directory is a publishable package

```instinctflash validate [/path/to/checkpoint]```

**Write a declaration** from facts the checkpoint can prove

```instinctflash validate [/path/to/checkpoint] --validate.scaffold=auto```

**List** simulator adapters

```instinctflash eval adapters```

# SYNOPSIS

**instinctflash** **models** [**--json**]

**instinctflash** **serve** _MODEL_ [**--serve.**_FIELD_**=**_VALUE_] [**--runtime.**_FIELD_**=**_VALUE_] [**--fp8**] [**--config_path=**_FILE_]

**instinctflash** **validate** _DIR_ [**--validate.**_FIELD_**=**_VALUE_] [**--config_path=**_FILE_]

**instinctflash** **eval** _COMMAND_ [_options_]

# PARAMETERS

**models** [**--json**]
> List built-in checkpoints and whether each adapter is registered. Does not load weights or check that a GPU is present. **--json** prints the catalog as JSON.

**serve** _MODEL_
> Print a declaration-only preflight (device, **instinctflash.json**, and the optimization plan), then load _MODEL_ and serve actions. _MODEL_ is a Hugging Face id or a local checkpoint directory. A local directory with no declaration is scaffolded first. The server speaks msgpack over websockets, the same wire protocol as openpi. Default bind is **0.0.0.0:8000**. Clients use **openpi_client.WebsocketClientPolicy**, or **GET /healthz**.

**--serve.dry_run=true**
> Stop after the preflight. No download and no GPU load.

**--serve.smoke=true**
> Load the checkpoint, run one zero-filled observation with a fixed smoke-test prompt, print the action, and exit. This shows that the checkpoint loads here and returns finite actions. It is not an evaluation.

**--serve.host=**_ADDR_
> Bind address. Default **0.0.0.0**.

**--serve.port=**_N_
> Bind port. Default **8000**.

**--serve.viz=true**
> Stream observations, actions, and latency to a Rerun viewer. Requires the **viz** extra (**rerun-sdk**). **--serve.viz_sink** chooses the sink: empty spawns a viewer, a path ending in **.rrd** records headless, and a **rerun+http://** URL attaches to a viewer that is already running.

**--serve.seed=**_N_
> Seed the RNGs the model draws noise from, so two serves of the same inputs can be compared value for value. Serving with FP8 rejects this option.

**--fp8**
> Short form of **--runtime.precision=fp8**. **--fp8=false** selects **native**.

**--runtime.precision=native|fp8**
> Numerical precision. The default is **native**, which keeps a bit-exact transformation ceiling. **fp8** is an explicit numerical change.

**--runtime.tier_ceiling=bitexact|numeric|behavioral**
> Strongest accuracy claim the plan may spend. When omitted, the runtime stays bit-exact and may honor checkpoint-declared operating points up to numeric. Passing a value makes that ceiling a hard demand.

**--runtime.device=**_DEVICE_
> Device to run on.

**--runtime.placement=auto|in_process|worker|engine**
> Where execution runs. Default **auto**.

**--runtime.nfe.**_STREAM_**=**_N_
> Override the number of function evaluations for one stream, for example **--runtime.nfe.action=4**.

**--runtime.exclude_passes=**_LIST_
> Drop named optimization passes. The value is a YAML list, for example **--runtime.exclude_passes=[name]**.

**--runtime.step_cache=dynamic|checkpoint**
> Step-cache mode. DreamZero's dynamic step cache is opt-in and requires **--runtime.tier_ceiling=behavioral**.

**validate** _DIR_
> Check that _DIR_ can load as a checkpoint package. Missing files, weight-index problems, and any **FILL_ME** sentinels fail the command. An embedded certificate is checked against its integrity hash: **intact** or **tampered**.

**--validate.scaffold=**_BASE_
> Write **instinctflash.json** before the check. **auto** detects the base from the checkpoint's own config. A hub id such as **lerobot/pi05_base** copies that built-in declaration. Facts the checkpoint cannot prove are written as **FILL_ME** and then flagged. **--validate.force=true** is required to overwrite a declaration that already exists.

**--validate.teacher_outcomes=**_FILE_
> Teacher outcome JSONL. Together with **--validate.student_outcomes** and **--validate.margin**, run the paired non-inferiority check and stamp the certificate into the declaration's provenance block. All three are required. The margin must be less than or equal to 0. The runtime never reads provenance.

**--validate.student_outcomes=**_FILE_
> Student outcome JSONL for the certificate.

**--validate.margin=**_N_
> Non-inferiority margin for the certificate. Must be **<= 0**.

**--config_path=**_FILE_
> JSON or YAML config merged under the defaults. Dotted command-line fields override the file. An unknown field is an error.

**--output.format=text|json**
> Report format. Default **text**.

**--output.path=**_FILE_
> Write the report to _FILE_ atomically.

**eval** _COMMAND_
> Simulator and evidence tooling for paired acceleration benchmarks. **instinctflash eval -h** lists every verb. Everyday ones are **adapters** (print model and simulator contracts), **coverage --run** _DIR_ (routes, adapters, and evidence for a finished run), and **report --run** _DIR_ (release gates on a finished run).

# DESCRIPTION

**instinctflash** is the command-line tool for InstinctFlash, a serving runtime for robotics world-action and vision-language-action models. Installing the package creates the **instinctflash** console script (**instinctflash.cli:main**).

The core install can inspect a checkpoint and decide which optimizations are legal with no PyTorch and no GPU. Loading and serving a model needs that model's own environment: a separate virtualenv per family, with CUDA, on Jetson Thor or on an RTX 4090 or RTX 5090 workstation. **serve** prints the preflight before any weight is downloaded. If a local checkpoint still contains **FILL_ME** fields, or an unmerged LoRA adapter, serve stops before the download and prints the fields or the merge step.

A prompt change starts a new episode. A client can also reset explicitly with **{"reset": true}** in the observation.

**validate** is the package trust check. Given teacher outcomes, student outcomes, and a margin, it certifies that the student is not inferior within that margin and stamps the certificate into **instinctflash.json**. A later plain **validate** of the same directory detects a certificate that was edited after stamping.

The verbs **devices**, **describe**, **plan**, **run**, and **certify** still run. Each prints one line pointing at **serve** or **validate**, then behaves as it used to, so older scripts keep working.

# CAVEATS

**pip install** of the core package does not install a model stack. Inference, the websocket extra, and FP8 each need their own dependencies, and each model family pins its own Python (3.12, or 3.13 for the Cosmos3 edge and nano policies). **models** and **--serve.dry_run** can succeed on a laptop that cannot actually serve.

**serve** listens on all interfaces at port **8000** unless **--serve.host** and **--serve.port** say otherwise.

**--fp8**, a numeric or behavioral tier ceiling, and a shorter step schedule change actions relative to the untouched checkpoint. The default path is native precision with a bit-exact ceiling. **--serve.seed** is rejected for an FP8 serve.

The license is **AGPL-3.0-or-later**.

# HISTORY

General Instinct published the InstinctFlash source in **September 2026**. One runtime and one **instinctflash** command cover LingBot-VA, LingBot-VLA, pi0.5, GR00T N1.7, Cosmos3 policies, and DreamZero, with the same API on Jetson Thor and on desktop NVIDIA GPUs.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [uv](/man/uv)(1), [huggingface-cli](/man/huggingface-cli)(1)

# RESOURCES

```[Source code](https://github.com/General-Instinct/InstinctFlash)```

```[Homepage](https://general-instinct.com/)```

```[Documentation](https://github.com/General-Instinct/InstinctFlash/blob/main/README.md)```

<!-- verified: 2026-09-22 -->
