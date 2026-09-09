# TAGLINE

Small terminal coding agent that edits files and runs commands with approval

# TLDR

**Start** an interactive session in the current project

```hazzel```

Print the **version**

```hazzel --version```

Print **usage**

```hazzel --help```

Start with an **OpenAI** key from the environment

```OPENAI_API_KEY=[sk-...] hazzel```

Start with an **Anthropic** key from the environment

```ANTHROPIC_API_KEY=[sk-ant-...] hazzel```

# SYNOPSIS

**hazzel** [_--version_] [_--help_]

# PARAMETERS

**-V**, **--version**
> Print the Hazzel version and exit.

**-h**, **--help**
> Print a short usage line and exit.

Hazzel is an interactive session. After start, work is driven by prompts and slash commands, not extra CLI flags.

# SLASH COMMANDS

**/model**
> Pick a provider and model. Prompts for an API key if none is stored for that provider.

**/plan** **on**|**off**
> Read-only exploration. Hazzel proposes a numbered plan and changes nothing until you turn plan mode off.

**/prove** **on**|**off**
> Smoke-check Python edits in **/tmp** before you trust them.

**/status**
> Git working-tree status.

**/diff** [_--staged_]
> Changed files with a per-file diff preview.

**/commit** [_message_]
> Suggest a commit message and commit after approval.

**/branch** [_create_|_switch_ _name_]
> List branches, or create / switch.

**/push**, **/pull**, **/sync**
> Push, pull, or pull then push. Destructive git (**--force**, **reset --hard**) is blocked.

**/log** [_n_]
> Recent commits (default 10, max 20).

**/undo** [_n_]
> Undo the last file change (or the last _n_ changes).

**/usage**
> Session and last-turn token counts.

**/summary**
> Summarize the last implementation.

**/clear**
> Reset conversation and usage, then redraw the welcome screen.

**/logout**
> Clear saved API keys.

**/help**
> Command overview.

**/exit**
> Leave Hazzel. **quit**, **:q**, and **Ctrl+D** also exit.

# DESCRIPTION

**hazzel** is a small terminal coding agent. It reads, searches, and lists a codebase, edits files with a diff preview, runs shell commands with approval and a timeout, and offers git helpers. File mutations and shell commands go through you first. Shell is sandboxed to the project root (the current working directory at start). Tag files with **@path** to put them in context.

Bring your own key. There is no subscription. Providers: Groq (default model **openai/gpt-oss-120b**), OpenAI, Anthropic, and Mistral. Switch any time with **/model**. Keys can come from **OPENAI_API_KEY**, **ANTHROPIC_API_KEY**, **MISTRAL_API_KEY**, or **GROQ_API_KEY**, from a project **.env**, or from the config file.

Early-stage (v0.1.4). No web browsing, pull requests, deploys, background agents, or session persistence across restarts. It does not replace an editor.

# CONFIGURATION

**~/.config/hazzel/config.json**
> Saved provider, model, prove/plan flags, and API keys. Written **0600**; the config directory is **0700**. Legacy path **~/.hazzel/config.json** is still read if the XDG file is missing.

**OPENAI_API_KEY**, **ANTHROPIC_API_KEY**, **MISTRAL_API_KEY**, **GROQ_API_KEY**
> Provider keys. Environment values win over the config file. A project **.env** can supply the same names when they are not already set.

# CAVEATS

Requires Python 3.10+ and a provider API key. Sessions do not persist across restarts. Review diffs and shell commands before approving them. **/undo** only restores file checkpoints taken during this process (up to 200 events). Destructive git stays blocked, but approved shell commands still run as your user inside the project root.

# HISTORY

**Hazzel** is a Python terminal agent published on PyPI under **AGPL-3.0-or-later**. It appeared as an early public release in **2026**, with a design that keeps the agent small and every mutation behind an approval prompt.

# SEE ALSO

[aider](/man/aider)(1), [claude](/man/claude)(1), [grok](/man/grok)(1), [opencode](/man/opencode)(1), [git](/man/git)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/mukundzha/hazzel)```

<!-- verified: 2026-09-09 -->
