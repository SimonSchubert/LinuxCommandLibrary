# TAGLINE

Learn by building with agent-written hands-on tutorials

# TLDR

**Launch** the desktop app (from a desktop session)

```lathe```

**Serve** the reader in a browser at http://localhost:4242

```lathe serve```

**Serve** on another port, hosting a specific ACP agent

```lathe serve --port [8080] --agent [command]```

**List** bundled LLM skills

```lathe skills list```

**Install** skills into the current project

```lathe skills install```

**Install** skills for all projects

```lathe skills install --user```

**Install** skills for another agent

```lathe skills install --agent [cursor|codex|gemini|opencode|all]```

**Set the code folder** for a tutorial and open it

```lathe start [slug] [path/to/folder]```

**Move** a tutorial to the Trash

```lathe rm [slug]```

**Show** available writing voices

```lathe voice list```

**Set** the default tutorial voice

```lathe voice set-default [plainspoken|companion]```

# SYNOPSIS

**lathe**

**lathe** **serve** [_options_]

**lathe** **skills** **install** [_options_]

**lathe** **skills** **list**

**lathe** **voice** **list**

**lathe** **voice** **show** _name_

**lathe** **voice** **set-default** _name_

**lathe** **voice** **add** _name_ **--file** -

**lathe** **shelf** **list**|**new**|**set**

**lathe** **start** _slug_ [_path_]

**lathe** **verify-cancel** _slug_

**lathe** **rm** [**--now**] _slug_

# PARAMETERS

**--port** _N_
> HTTP port for **serve** (default **4242**).

**--agent** _command_
> For **serve**: the ACP agent command to host.

**--user**
> Install skills for all projects (e.g. **~/.claude/skills/**) instead of the current project (**./.claude/skills/**).

**--agent** _target_
> For **skills install**: target agent, one of **cursor**, **codex**, **gemini**, **opencode**, **cline**, **windsurf**, **antigravity** or **all**.

**--now**
> For **rm**: delete immediately instead of moving to the Trash.

# DESCRIPTION

**lathe** is a desktop app and CLI (one Go binary) for learning by building: a coding agent writes a hands-on, single- or multi-part technical tutorial on any topic, and you work through it by typing the code yourself in a reader made for it. The app drives the agent you already use (Claude Code, Codex, Gemini CLI, opencode or Goose) over the **Agent Client Protocol**, and offers **Ask**, **Check my work**, **Verify tutorial** and **Write Part N** actions, shelves, search and a Trash.

From a terminal agent, install the skills and prompt **/lathe** (for example **/lathe build a 3D slicer in Erlang**); **lathe serve** renders the library in a browser at **http://localhost:4242**.

Lathe never calls a model API itself. It stores tutorials under **~/.lathe/tutorials/** (one directory per slug with **metadata.json** and **part-NN.md** files), serves them, and exposes deterministic commands the skills invoke (**store**, **verify-result**, **voice add**, and similar). Companion skills **/lathe-extend**, **/lathe-verify**, **/lathe-ask**, **/lathe-check**, **/lathe-tag**, **/lathe-shelf** and **/lathe-voice** add parts, verify tutorials, answer questions, hint at your code, tag, shelve and draft voices. Running **/lathe-work** in a terminal agent lets the app's buttons drive work in that session.

**lathe skills install** copies the bundled cross-tool **SKILL.md** files into the chosen agent's skill directory so slash commands are discoverable. Voices (**plainspoken**, **companion**, or custom) control prose style; each tutorial records its voice and source model in metadata and in an authorship byline.

# CONFIGURATION

Tutorial storage: **~/.lathe/tutorials/<slug>/** with **metadata.json** (title, topic, status, tags, parts, tools, sources, voice, model), one Markdown file per part, reading state in **progress.json**, **exercises.json**, **workspace.json** and **checks.jsonl**, and verified code snapshots as git tags under **code/**. Shelves live in **~/.lathe/shelves.json**, the Trash in **~/.lathe/trash/**, custom voices in **~/.lathe/voices/**, and app settings such as **agent_path** in **~/.lathe/config.json**. Default HTTP port is **4242**; override with **--port** on **serve**.

# CAVEATS

Tutorial quality depends on the model behind your agent; tutorials are LLM-written and can contain mistakes. The author tests mainly with Claude Code on macOS. There is no packaged Linux app: build the desktop app with **CGO_ENABLED=1 go install -tags desktop,production github.com/devenjarvis/lathe@latest** (needs GTK 4 and WebKitGTK 6 headers), or get the CLI only via **install.sh** or a plain **go install** (Go 1.26+). Claude Code needs the **claude-agent-acp** adapter to be hosted by the app. The per-job file restrictions are a Lathe policy, not an OS sandbox.

# SEE ALSO

[go](/man/go)(1), [claude](/man/claude)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/devenjarvis/lathe)```

<!-- verified: 2026-11-23 -->
