# TAGLINE

Run RSI-Anything code-repair and GUI self-improvement workflows

# TLDR

**List** available tasks and recipe modes

```rsi tasks```

**Download** code-repair experiment assets (evaluation profile)

```rsi assets code_repair --profile [evaluate] --output [assets]```

Download the **full** code-repair asset set, including models

```rsi assets code_repair --profile [full] --output [assets]```

**Verify** selected release files without downloading

```rsi assets code_repair --verify --output [assets]```

**Preview** stages and resolved paths (does not create a run)

```rsi plan --config [configs/code_repair/default.json]```

**Run** a workflow from a recipe

```rsi run --config [configs/gui/default.json]```

**Resume** an interrupted run with the same recipe

```rsi run --config [configs/gui/default.json] --resume```

Print the saved **run state**

```rsi status --run [runs/gui]```

**Report** metrics from a finished or failed run

```rsi report --run [runs/gui]```

# SYNOPSIS

**rsi** _command_ [_options_]

# PARAMETERS

**tasks**
> Print a JSON object of tasks and recipe modes: `code_repair` (`full`, `evaluate`, `verify`) and `gui` (`full`, `smoke`).

**assets** `code_repair` [**--output** _dir_] [**--profile** `evaluate`|`full`] [**--skip-models**] [**--verify**]
> Download or verify versioned experiment assets for code repair. Default **--output** is `assets`, default **--profile** is `evaluate`. **--skip-models** installs data and checkpoints only. **--verify** checks selected release files without downloading. No `gui` target exists on this subcommand.

**plan** **--config** _file_
> Load the JSON recipe and print the resolved config, stage list, and generated files. Does not create a run directory or start workers.

**run** **--config** _file_ [**--resume**]
> Execute the recipe's stages in order. Without **--resume**, _run_root_ must be empty (aside from the workflow lock). With **--resume**, completed stages are skipped after their recorded output hashes match; a changed recipe or source identity is rejected. A filesystem lock prevents two runners from owning the same run.

**status** **--run** _dir_
> Print `state.json` from _dir_ (stage status, attempts, output hashes).

**report** **--run** _dir_
> Combine `state.json` with the task adapter's result files and print task, mode, status, stages, and metrics.

Every subcommand prints JSON on stdout. Exit **0** on success, **1** on a recipe or runtime error, **130** on interrupt (SIGINT/SIGTERM). Interrupted runs keep state and stage logs.

# DESCRIPTION

**rsi** is the shared command-line workflow of **RSI-Anything**, a research framework that turns world-model predictions and interaction feedback into recursive self-improvement. The paper applies the same propose → predict → select → evaluate → learn → retain cycle to code repair and GUI interaction (and, in the paper, laboratory planning, reaction optimization, and immune science). The CLI covers the two implemented task adapters: **code_repair** and **gui**.

The console script is `rsi_anything.cli:main` (package **rsi-anything** 0.2.0). Install from a source checkout with `pip install -e .` (Python 3.10 or newer). The runner uses only the Python standard library; each task runs in its own interpreter named by the recipe's **python** field (`current` means the process that launched `rsi`).

**Code repair, full:** verify assets → update initial / semantic / expanded / incumbent world models → evaluate. Evaluation-only recipes use `configs/code_repair/evaluate.json`. **GUI, full:** acquire models → check environment → freeze protocol → browser and world preflights → adapt and evaluate. **GUI, smoke:** real browser episodes with the rule controller.

Each run lives under `run_root`: `config.json`, `state.json`, `summary.json`, `logs/workflow/`, and task-native checkpoints. Resume requires the same recipe and source identity. Incomplete code-repair outputs are moved into `attempts/` before retry.

# CONFIGURATION

A recipe is a JSON file. Relative paths resolve beside that file. Allowed keys:

**task**
> `code_repair` or `gui`. Required.

**run_root**
> Directory for this run. Required. Must not be the source checkout or a source/config/task subdirectory (`src`, `tasks`, `configs`, `docs`, `scripts`, `tests`, `.git`).

**mode**
> Code repair: `full`, `evaluate`, `verify`. GUI: `full`, `smoke`. Default `full`.

**python**
> Worker interpreter: a path, an executable name, or `current`. Virtualenv paths keep their symlink so the selected environment stays active.

**repository**
> Path to the RSI-Anything source tree. Default is the installed package's checkout. Must contain `tasks/<task>/`.

**options**
> Task-specific object. Code repair: `assets`, `train_gpu`, `gpus`, `inputs`, `judge_workers`, optional `checkpoint`. GUI: `world_model`, `policy_model`, `assets`, `policy_port`, `resource_plan`, `download_models`, smoke `episodes`. Path-valued keys (`assets`, `checkpoint`, `world_model`, `policy_model`) are resolved beside the recipe.

Example (`configs/code_repair/default.json`): `task` `code_repair`, `mode` `full`, `run_root` pointing at a `runs/` directory, `python` a venv interpreter, `options.gpus` a comma-separated GPU list.

# CAVEATS

This is a research workflow, not a general-purpose crawler or trainer. Full recipes expect GPUs, large Hugging Face assets, and the task-specific virtualenv (`.venv-code-repair` or `.venv-gui` in the upstream guides). GUI workers need Playwright Chromium (`python -m playwright install chromium`) and the `rsi_anything_gui` extra.

`rsi assets` only accepts `code_repair`. Changing scientific inputs needs a new `run_root`. Two processes cannot share a run directory. The CLI is installed from the GitHub tree; it is not a separate PyPI distribution under the name `rsi`.

# HISTORY

**RSI-Anything** (Cui, Zeng, Xu, and others, **2026**, arXiv:2610.13912) builds on **JEPA-Anything**. The `rsi` console script is the shared source-checkout interface that runs the code-repair and GUI recipes from that paper.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [playwright](/man/playwright)(1), [mlflow](/man/mlflow)(1)

# RESOURCES

```[Source code](https://github.com/Gen-Verse/RSI-Anything)```

```[Documentation](https://github.com/Gen-Verse/RSI-Anything/blob/main/docs/workflow.md)```

<!-- verified: 2026-10-14 -->
