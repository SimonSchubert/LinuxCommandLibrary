# TAGLINE

CLI for deterministic NPC agents that run without an LLM

# TLDR

Install the framework from a **git clone** (user-space, not root)

```git clone [https://github.com/gioblu/NPC-Forge.git] && cd NPC-Forge && chmod +x setup.sh && ./setup.sh```

Install the bundled **TERMy** assistant

```npc-forge install [npcs/termy]```

Install an NPC in **editable** developer mode

```npc-forge install [./npcs/termy] --dev```

**List** installed NPCs

```npc-forge list```

**Start**, **stop**, or **restart** the user systemd service

```npc-forge start```

```npc-forge stop```

```npc-forge restart```

Follow the **service log**

```npc-forge logs```

Run the **test suite**

```npc-forge test```

# SYNOPSIS

**npc-forge** _command_ [_options_]

# PARAMETERS

**-h**, **--help**
> Print the command list and exit. Also shown when **npc-forge** is invoked with no arguments (that path exits 1).

**--dev**
> With **install** only. Passes **--dev** to the NPC's **setup.sh** hook (symlinks / editable install). Ignored on other commands.

# COMMANDS

**serve**, **start**
> **systemctl --user start npc-forge.service**. The unit runs **server.py** from **~/.local/share/npc-forge** (Flask on **127.0.0.1:5000**).

**stop**
> **systemctl --user stop npc-forge.service**.

**restart**, **reboot**
> **systemctl --user restart npc-forge.service**. Use this after editing an NPC dataset so the gateway reloads intents.

**logs**, **watch**
> If the unit is inactive, start it, then **tail -n 20 -f** **~/.local/share/npc-forge/npc_forge.log**. Ctrl+C leaves the service running.

**list**
> Print each directory under **~/.local/share/npc-forge/npcs/** with creator, intent count, vocabulary size, dataset size, and whether any intent declares tools.

**install** _path_ [**--dev**]
> Copy _path_ into **~/.local/share/npc-forge/npcs/**_name_ (_name_ is the directory basename, lowercased) and run **setup.sh** in the source tree if present. If the source already resolves to the target (dev symlink), the copy is skipped.

**test**, **tests**
> Run **tests/run_tests.py** with the framework venv Python, or **unittest discover** if that runner is missing.

# DESCRIPTION

**npc-forge** administers **NPC-Forge**, a Python framework for CPU-only conversational agents (NPCs) that do not use embeddings, machine learning, or LLMs. Intents live in JSON datasets (NDF 0.0). FlintParser matches prompts with exact, template, and probabilistic steps; FlintNPC then returns a message and optional tool calls. The same engine is exposed over HTTP so editors and LLM harnesses can treat an NPC as an OpenAI-compatible model.

The **npc-forge** wrapper on **PATH** is a short script written by **./setup.sh** into **~/.local/bin/npc-forge**. It runs **cli.main** inside **~/.local/share/npc-forge/venv**. The installer also copies or symlinks the Python sources, creates that virtualenv (**pip install** the **pyproject.toml** package, Python **3.8+**), and, when **systemctl** exists, installs a user unit **npc-forge.service**. **./setup.sh --dev** symlinks sources for live editing. **./setup.sh --uninstall** stops the unit and deletes the wrapper and data directory. Do not run the installer as root.

The gateway listens on **http://127.0.0.1:5000**. Native routes include **POST /api/chat/**_npc_ and **GET /**_npc_**/chat/** (compiled HTML). OpenAI-shaped routes include **GET /api/v1/models** and **POST /api/v1/chat/completions**, which is how TERMy is wired into Copilot-style clients. **termy** is a separate binary installed with **npc-forge install npcs/termy**.

The README currently limits this experimental release to **Linux** and **WSL**.

# CONFIGURATION

**~/.local/share/npc-forge/**
> Framework prefix: Python modules, **venv/**, **npcs/**, **tests/**, and **npc_forge.log**.

**~/.local/share/npc-forge/npcs/**
> One subdirectory per installed NPC. **list** and the HTTP registry read this tree.

**~/.local/bin/npc-forge**
> User-space launcher. **setup.sh** appends **~/.local/bin** to **PATH** in **~/.bashrc** or **~/.zshrc** when it is missing.

**~/.config/systemd/user/npc-forge.service**
> User unit. **WorkingDirectory** is the framework prefix; **ExecStart** is the venv Python running **server.py**; stdout/stderr append to **npc_forge.log**; **Restart=always**.

# CAVEATS

Experimental **1.0.0** release, licensed **AGPL-3.0**, distributed **AS IS**. There is no **npc-forge uninstall**; use **./setup.sh --uninstall** from a checkout.

**serve** / **start** / **stop** / **restart** / **logs** all call **systemctl --user**. They fail if systemd is unavailable (including typical macOS). The Flask app is the development server bound to localhost; the API docs recommend gunicorn for anything public.

**install** needs a real directory path. The CLI has no package registry or download step. **--dev** is only meaningful with **install**.

Requires **python3**, the **venv** module, and write access to **~/.local**. **~/.local/bin** must be on **PATH** after install.

# HISTORY

**NPC-Forge** is written by **Giovanni Blu Mitolo** (known for the **PJON** protocol). The public repository was created on **18 July 2026**. The first Python package version is **1.0.0**. The **npc-forge** CLI, systemd user service, OpenAI-compatible gateway, and bundled **termy** NPC were the experimental Linux/WSL surface shown on Hacker News in **September 2026**. License: **GNU Affero GPL v3**.

# SEE ALSO

[termy](/man/termy)(1), [systemctl](/man/systemctl)(1), [python3](/man/python3)(1), [flask](/man/flask)(1), [aichat](/man/aichat)(1), [copilot](/man/copilot)(1)

# RESOURCES

```[Source code](https://github.com/gioblu/NPC-Forge)```

```[Documentation](https://github.com/gioblu/NPC-Forge/blob/main/docs/NPC-Forge-cli.md)```

<!-- verified: 2026-09-04 -->
