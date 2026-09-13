# TAGLINE

Turn AI coding-agent work into a personal knowledge graph

# TLDR

**Set up** hooks for the agents in the current project

```learnlance setup```

Let the agent **analyze its own work** in chat instead of a separate LLM CLI

```learnlance setup --in-chat```

**Check** which hooks are installed and actually firing

```learnlance doctor```

**Render and open** the interactive HTML knowledge graph

```learnlance show```

**List** learned concepts with explanations

```learnlance list -v```

Print **counts by category**

```learnlance stats```

**Add a concept** the agent missed

```learnlance add "[debouncing]"```

**Remove one concept** from the graph

```learnlance clear "[delta encoding]"```

**Wipe** the whole graph without a prompt

```learnlance clear -y```

Configure **only Cursor** by hand

```learnlance install --cursor```

Point analysis at a **local Ollama** model

```learnlance config --llm-cmd "ollama run [llama3]"```

# SYNOPSIS

**learnlance** [_command_] [_options_]

# COMMANDS

**setup**
> Detect supported coding agents and write their hooks for this project. Run this first after install. Same as a bare **install**.

**install**
> Configure one agent by flag, or detect and configure all of them when no agent flag is given.

**uninstall**
> Remove selected agent hooks. With no flags, remove the Claude Code hook and disable auto-setup.

**doctor**
> Print environment status, hook presence versus evidence of firing, LLM backend, and concept count.

**config**
> Show or change settings (LLM command, model alias, enable/disable, background work, topic cap).

**show**
> Render the project's knowledge graph to HTML and open it in a browser.

**list**
> List learned concepts, most seen first. **-v** includes explanations.

**stats**
> Print concept, link, turn, and session counts, plus a per-category breakdown.

**add** _concept_
> Search the codebase for a topic the agent missed, ask the LLM to explain it, and merge it into the graph.

**clear** [_concept_]
> Remove one matching concept (and orphaned related nodes), or wipe the entire graph when no concept is given.

**help**
> Print the command menu.

# PARAMETERS

**--in-chat**
> On **setup** / **install**: the agent analyzes its own work in the conversation instead of shelling out to a separate LLM CLI. Not available for **git**.

**-v**, **--verbose**
> On **setup**: also print per-agent mechanisms and confidence. On **list**: include explanations.

**--path** _DIR_, **--project** _DIR_
> Project directory instead of the current working directory (**setup**, **install**, **uninstall**, **add** use **--path**; **show**, **list**, **stats**, **clear** use **--project**).

**--cursor**, **--codex**, **--copilot**, **--commandcode**, **--kiro**, **--gemini**, **--antigravity**, **--git**
> Select a single agent on **install** or **uninstall**. Bare **install** detects all of them.

**--no-open**
> On **show**: write the HTML graph and do not open a browser.

**--force**
> On **add**: insert the concept from general knowledge even if no matching code is found.

**-y**, **--yes**
> On **clear**: skip the confirmation prompt.

**--llm-cmd** _CMD_
> On **config**: LLM CLI used for analysis (reads a prompt on stdin). Empty string restores auto-detection.

**--cli-model** _MODEL_
> On **config**: optional model alias for the CLI backend (for example **haiku**).

**--claude-bin** _PATH_
> On **config**: legacy explicit path to the **claude** executable. **--llm-cmd** supersedes this.

**--enable**, **--disable**
> On **config**: pause or resume analysis without uninstalling hooks.

**--background** **on**|**off**
> On **config**: run analysis in a detached process (**on**, default) or inline (**off**).

**--max-topics** _N_
> On **config**: maximum concepts extracted per agent turn (default 5).

# DESCRIPTION

**learnlance** is a Python CLI that watches coding agents and turns the code they write into a persistent personal knowledge graph. After each turn that edits files, it extracts transferable concepts (for example delta encoding, not "this project's helper"), merges them into a per-project graph, and regenerates a self-contained HTML map.

It integrates with **Claude Code**, **OpenAI Codex**, **Cursor**, **GitHub Copilot** (CLI, cloud, and VS Code), **Command Code**, **Kiro**, **Gemini CLI**, **Google Antigravity**, and a **git post-commit** fallback. Most hooks are written per project; the Claude Code hook is user-level. **setup** (and a bare **install**) detects which agents are present and configures them. Later commands also run a quiet auto-setup so moving to a new project does not require an extra step, except **setup**, **install**, **uninstall**, **help**, and the internal hook worker.

Analysis does not need an API key. By default it reuses an LLM CLI already on **PATH** and logged in: **claude**, **gemini**, **copilot**, **cursor-agent**, or **ollama**. **--in-chat** instead asks the agent that just wrote the code to name the concepts, which is visible in the conversation and uses some of its context. Turns with no substantive code skip the LLM call. Failures in hooks are logged and swallowed so they cannot interrupt the coding session.

The package is stdlib-only (Python 3.10 or newer) so hooks stay reliable in whatever environment an agent launches them. Install from PyPI with **pip install learnlance**. Internal **hook** and **_worker** subcommands are invoked by agent integrations, not by hand.

# CONFIGURATION

**~/.learnlance/config.json**
> Global settings. Override the directory with **LEARNLANCE_HOME**. Keys include **enabled**, **llm_cmd** (empty means auto-detect), **cli_model**, **claude_bin**, **max_topics_per_turn**, **background**, **min_chars**, and **max_input_chars**.

**~/.learnlance/projects/**_name-hash_**/graph.json**
> Per-project knowledge graph. **graph.html** next to it is the rendered view. **~/.learnlance/projects.json** is the registry of known projects.

**~/.learnlance/insights/**
> Per-session recap markdown.

**~/.learnlance/learnlance.log**
> Diagnostics used by **doctor** to tell configured hooks from hooks that have actually fired.

**LEARNLANCE_HOME**
> Alternative root instead of **~/.learnlance**.

**LEARNLANCE_ACTIVE**
> Set on LLM CLI processes spawned by learnlance so a Stop hook can ignore re-entrant calls.

# CAVEATS

Needs **Python 3.10+** and, unless **--in-chat** is used, an LLM CLI already logged in. With no backend configured, edits are held rather than analyzed. **--in-chat** is not available for **git**, and it spends an extra agent turn that you see in the chat. A bare **uninstall** disables auto-setup until **setup** or **install** is run again. **clear** without **-y** refuses to wipe data when stdin is not a TTY. **add** still needs a working LLM CLI. Hook files follow each vendor's documented API but are unverified on a machine until **doctor** sees them fire. The HTML graph is local and offline; **show** opens it in the default browser unless **--no-open** is set.

# HISTORY

**learnlance** is an MIT-licensed, stdlib-only Python CLI by **aeroscissorz**, first published in **2026**. It is distributed on PyPI as **learnlance**, with the console script pointing at **learnlance.cli:main**.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [copilot](/man/copilot)(1), [gemini](/man/gemini)(1), [ollama](/man/ollama)(1), [git](/man/git)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/aeroscissorz/learnlance)```

```[Documentation](https://github.com/aeroscissorz/learnlance/blob/main/docs/getting-started.md)```

<!-- verified: 2026-09-14 -->
