# TAGLINE

CLI for authoring and deploying pixel towns with AI NPCs

# TLDR

**Install** the CLI (or run without a global install)

```npm install -g @redplanethq/town```

```pnpm dlx @redplanethq/town [login]```

**Log in** to CORE and save a personal access token

```town login```

**Create a new town** and open the chat creator

```town new ["My Town"]```

**Clone an existing town** into a local folder

```town clone --slug [my-town]```

**Deploy** the current folder's town definition to the server

```town deploy```

**Force a full layout reflow** on deploy

```town deploy --reflow```

**Print the plot catalog** (optional per-town data)

```town catalog --slug [my-town]```

**Generate a custom building exterior** image

```town generate exterior ["a cozy bookshop with a green awning"] --out [exterior.png]```

**Test an NPC prompt** against a real LLM

```town test npc [npcs/cafe.mdx] -q ["What do you recommend today?"]```

# SYNOPSIS

**town** [_command_] [_options_]

**town** {**login** | **new** | **clone** | **deploy** | **catalog** | **delete** | **generate** | **test** | **init**} [_args_] [_options_]

# DESCRIPTION

**town** is the companion command-line tool for **Town** (by RedPlanetHQ / CORE): multiplayer pixel-map spaces where each building hosts AI characters with personalities and tool skillsets. Players explore towns in the browser; creators edit towns as a folder of JSON and MDX on disk, then push changes with this CLI.

A town folder typically contains **town.json** (building list and custom plot refs), **npcs/** (one **.mdx** file per character, frontmatter for identity and body as the system prompt), optional **customPlots/** (user-defined interiors/exteriors), plus catalog/manifest reference files. Bare **town** with no subcommand, run inside a folder that has **town.json**, launches the interactive chat creator (requires prior **town login**). Outside a town folder, bare **town** prints help.

Authentication uses a CORE personal access token stored at **~/.town/config.json** (mode **0600**). API calls send that token as a Bearer credential to the configured town server.

# COMMANDS

**login**

> Authenticate with CORE (browser OAuth flow) and save host URLs plus PAT under **~/.town/config.json**.

**new** [_name_]

> Create a new town (prompts for a name when omitted), scaffold the local folder, and launch the chat creator.

**clone**

> Pull an existing town's state into a local directory. Use **--slug** to pick a town without an interactive prompt.

**deploy**

> Upload **town.json**, **customPlots/**, and **npcs/** to the server. Uploads new local PNGs, then POSTs the plot payload; the server applies incremental layout ops by default.

**catalog**

> Print available plot keys from the global catalog; with **--slug**, include that town's tags and item templates.

**delete**

> Permanently delete one of your towns. **--force** skips the type-the-slug confirmation.

**generate exterior** _concept_ / **generate interior** _concept_

> Generate a pixel-art PNG for a custom plot exterior or interior from a short text description.

**test set-key** _provider_ _key_

> Store an LLM API key for local NPC testing (**anthropic**, **openai**, or **ollama**). Environment variables always override saved keys.

**test npc** [_mdxPath_]

> Run an NPC prompt against a real model (multi-turn session, one-shot question, or scripted scenario).

**init**

> Deprecated alias. Exits with a message to use **town new** or **town clone** instead.

# PARAMETERS

**deploy** options:

**-d**, **--dir** _path_

> Folder containing **town.json**, **customPlots/**, and **npcs/** (default: current directory).

**--slug** _slug_

> Target town slug (defaults from **town.json** id stash, then folder name).

**--reflow**

> Wipe the server-side plot before applying so layout is regenerated from scratch.

**clone** / **delete** / **catalog** / **generate**: **--slug** _slug_ where noted.

**delete**: **--force** — skip confirmation.

**generate exterior**: **--out** _path_ (default **exterior.png**), **--tiles** _WxH_, **--category** _cat_, **--slug** _slug_

**generate interior**: **--out** _path_ (default **interior.png**), **--category** _cat_, **--slug** _slug_

**test npc**: **-s** / **--session** _file_, **-q** / **--question** _text_, **-f** / **--script** _file_, **--show**, **--reset**, **--speaker** _name_, **--model** _id_

# CONFIGURATION

Credentials and optional LLM keys live in **~/.town/config.json** (directory **~/.town/**, file permissions **0600**):

```
{
  "auth": {
    "coreUrl": "https://app.getcore.me",
    "townUrl": "https://town.getcore.me",
    "pat": "<CORE personal access token>"
  },
  "llm": {
    "provider": "anthropic",
    "anthropicKey": "...",
    "openaiKey": "...",
    "ollamaKey": "..."
  }
}
```

Shell environment variables (**ANTHROPIC_API_KEY**, **OPENAI_API_KEY**, **OLLAMA_API_KEY**, **LLM_PROVIDER**, **OLLAMA_BASE_URL**) take precedence over values stored under **llm**. Use **town login** to populate **auth**; use **town test set-key** for local NPC testing keys.

# CAVEATS

Requires Node.js (the published package targets modern Node and is typically run via **npm** / **pnpm**). Most mutating commands need a successful **town login**. **town init** no longer creates or clones towns — use **new** or **clone**. Sprite uploads on deploy accept PNG only (content-addressed, size-capped on the server). **town test npc** needs a configured LLM key and may incur provider costs. The interactive creator TUI expects a real terminal.

# HISTORY

**Town** is an open-source project from **RedPlanetHQ**, built around the **CORE** agent/memory platform. Towns are multiplayer pixel maps with tool-using AI NPCs; the **@redplanethq/town** package provides the offline authoring and deploy workflow. Early CLI versions used a single **init** verb for both create and clone; that was later split into **town new** and **town clone**, with **init** retained only as a migration hint.

# SEE ALSO

[npm](/man/npm)(1), [pnpm](/man/pnpm)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/RedPlanetHQ/town)```

```[Homepage](https://town.getcore.me/explore)```

```[Documentation](https://github.com/RedPlanetHQ/town#readme)```

<!-- verified: 2026-07-18 -->
