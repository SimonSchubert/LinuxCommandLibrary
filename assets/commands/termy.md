# TAGLINE

Deterministic natural-language terminal assistant (no LLM)

# TLDR

Translate a request into a **shell command** (asks before running)

```termy [list files in this directory]```

Skip the **confirmation** prompt

```termy -y [create a file notes.txt]```

Look up **related intents** for a keyword

```termy files```

Pipe a prompt on **stdin**

```echo "[print json file data.json]" | termy```

Talk to a **different installed NPC**

```termy --npc [name] [status]```

# SYNOPSIS

**termy** [**-y**] [**--npc** _name_] [_query_ ...]

# PARAMETERS

_query_
> Natural-language prompt. Remaining arguments are joined with spaces. Required unless the prompt is piped on stdin.

**-y**, **--yes**
> Skip the interactive Yes/No prompt and run matched commands. Also sets **TERMY_YES=1** for child processes.

**--npc** _name_
> NPC profile to query (default **termy**). The profile must already be installed under the NPC-Forge registry.

# DESCRIPTION

**termy** is the bundled Linux terminal assistant of **NPC-Forge**. It maps a natural-language prompt to a canned intent from a JSON dataset and, when the intent includes a tool call, proposes a shell command. Matching is deterministic: there are no embeddings, no trained classifier, and no LLM. The parser (FlintParser / FlintNPC) strips interjections, scores sentiment, then tries an exact match, a template match, and a slower probabilistic match that uses inverse document frequency, bag-of-words, and IDF-weighted Levenshtein for typos.

On each run **termy** first POSTs the prompt to the local NPC-Forge gateway at **http://127.0.0.1:5000/api/chat/**_npc_ (1 second timeout). If the server is down it loads the NPC engine in-process from **~/.local/share/npc-forge**. A match prints a status line (name, match status, confidence), optional thinking text, the command, and a short response. Intents tagged **permission: yolo** run immediately through **bash**. Intents tagged **ask** wait for an interactive Yes/No choice unless **-y** was given. Before execution, every **.sh** file in the NPC's **scripts/** directory is sourced in the same bash command.

If confidence is too low the request is **rejected** and **termy** lists related intents (deduplicated by category, capped by the NPC **suggestions** setting). Typing a listed number re-runs **termy** with that intent's sample phrase.

Install **termy** only after the framework: clone **NPC-Forge**, run **./setup.sh**, then **npc-forge install npcs/termy**. The NPC installer writes a wrapper to **~/.local/bin/termy** that uses the framework virtualenv. The project currently documents Linux and WSL only.

# CONFIGURATION

**~/.local/share/npc-forge/npcs/termy/**
> Installed NPC profile: **config.json**, **dataset/**, **scripts/**, and the Python client. **npc-forge install** copies this tree from the source checkout (or leaves a symlink in **--dev** mode).

**~/.local/share/npc-forge/npcs/termy/config.json**
> NPC profile. Keys include **npc_name**, **tts** (speech synthesizer binary, default **espeak-ng**), **creator**, **sentence_threshold**, **word_threshold**, and **suggestions** (how many related intents to list).

**~/.local/share/npc-forge/npcs/termy/dataset/**
> Intent files (**dataset_*.json**, **templates_*.json**) plus vocabulary. Format is NDF 0.0 (NPC-Forge Dataset Format). After editing, run **npc-forge reboot** so the gateway reloads the dataset.

**~/.local/share/termy/config.json**
> Per-user file created on first install. The client reads this path for optional spoken replies (it speaks the response when the **tts** key is **on**, using the synthesizer named in the NPC profile).

**TERMY_YES**
> Environment flag. **1** has the same effect as **-y**.

# CAVEATS

This is an **experimental** first release. The author ships it **AS IS** with no warranty and warns that matched intents can emit long command chains. Review every proposed command; **yolo** intents and **-y** skip that review.

A prompt is mandatory (arguments or a non-empty stdin). There is no interactive REPL: **termy** with no input prints usage and exits.

Matched commands run with **shell=True** and **executable=/bin/bash** as the installing user. Destructive intents are supposed to use **permission: ask**, but a dataset or parser bug can still run the wrong command.

The HTTP path assumes the NPC-Forge Flask service on **127.0.0.1:5000**. **serve** / **start** / **stop** / **logs** go through a **systemd --user** unit (**npc-forge.service**). Without systemd, start **server.py** yourself or rely on the in-process fallback.

**~/.local/bin** must be on **PATH**. Do not run the installer as root. Optional spoken output wants **espeak-ng** on **PATH** (the NPC **setup.sh** tries to install it).

# HISTORY

**termy** is the first NPC shipped with **NPC-Forge**, written in Python by **Giovanni Blu Mitolo** (author of PJON) under the **GNU Affero GPL v3**. The GitHub repository was created on **18 July 2026** after about two months of work that started from a local LLM harness and then dropped machine learning entirely. Version **1.0.0** in **pyproject.toml** is the experimental public CLI; **Show HN** followed in **September 2026**.

# SEE ALSO

[npc-forge](/man/npc-forge)(1), [aichat](/man/aichat)(1), [sgpt](/man/sgpt)(1), [navi](/man/navi)(1), [fuck](/man/fuck)(1), [espeak-ng](/man/espeak-ng)(1), [bash](/man/bash)(1)

# RESOURCES

```[Source code](https://github.com/gioblu/NPC-Forge)```

```[Documentation](https://github.com/gioblu/NPC-Forge/blob/main/npcs/termy/README.md)```

<!-- verified: 2026-09-04 -->
