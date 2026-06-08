# TAGLINE

Generate and read hands-on technical tutorials locally

# TLDR

**Serve** tutorials in the local web UI

```lathe serve```

**List** bundled LLM skills

```lathe skills list```

**Install** skills into the current project

```lathe skills install```

**Install** skills for all projects

```lathe skills install --user```

**Install** Cursor slash commands from bundled skills

```lathe skills install --agent cursor```

**Show** available writing voices

```lathe voice list```

**Set** the default tutorial voice

```lathe voice set-default [plainspoken|companion]```

# SYNOPSIS

**lathe** **serve** [_options_]

**lathe** **skills** **install** [_options_]

**lathe** **skills** **list**

**lathe** **voice** **list**

**lathe** **voice** **show** _name_

**lathe** **voice** **set-default** _name_

**lathe** **voice** **add** _name_ **--file** -

# PARAMETERS

**--port** _N_
> HTTP port for **serve** (default **4242**).

**--user**
> Install skills to **~/.claude/skills/** (Claude Code) or **~/.agents/skills/** (Codex) instead of the current directory.

**--agent** _target_
> Skill install target: **cursor** (writes **.cursor/commands/**), **codex**, or **all**.

# DESCRIPTION

**lathe** is a Go CLI plus bundled LLM skills that generate multi-part, hands-on technical tutorials for self-directed learning. You prompt an agent session with **/lathe** (for example **/lathe build a 3D slicer in Erlang**); the skill writes Markdown parts and metadata, then **lathe serve** renders them in a purpose-built local browser UI at **http://localhost:4242**.

The CLI never calls an LLM itself. It stores tutorials under **~/.lathe/tutorials/** (one directory per slug with **metadata.json** and **part-NN.md** files), serves them, and exposes deterministic commands the skills invoke (**store**, **verify-result**, **extend-start**, **voice add**, and similar). Companion skills **/lathe-extend**, **/lathe-verify**, **/lathe-ask**, and **/lathe-voice** extend, validate, question, or author custom tutorial voices.

**lathe skills install** copies bundled **SKILL.md** files into Claude Code, Cursor, or Codex so slash commands are discoverable. Voices (**plainspoken**, **companion**, or custom) control prose style; each tutorial records its voice and source model in metadata and in an authorship byline.

# CONFIGURATION

Tutorial storage: **~/.lathe/tutorials/<slug>/** with **metadata.json** (title, topic, tags, tools, sources, voice, model, status). Custom voices are saved under **~/.lathe/voices/** via **lathe voice add**. Default HTTP port is **4242**; override with **--port** on **serve**.

# CAVEATS

Tutorial generation quality depends on the frontier model used in your agent session. Skills are tuned for Claude Code on macOS; Linux installs use the **install.sh** script or **go install**. The Homebrew cask is macOS-only.

# SEE ALSO

[go](/man/go)(1), [curl](/man/curl)(1)