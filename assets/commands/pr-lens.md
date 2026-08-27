# TAGLINE

Draw pull-request diffs as architecture and data-flow diagrams from the CLI

# TLDR

Install the npm CLI (binary name **pr-lens**)

```npm install -g @coldtea/pr-lens-cli```

**Analyze** the diff against the merge base of origin/main (needs a model key in the environment)

```pr-lens analyze --base origin/main```

**Render** the graph as light and dark SVGs

```pr-lens render [.pr-lens/graph.json]```

**Compose** the pull-request comment markdown (does not post)

```pr-lens comment --graph [.pr-lens/drawn.graph.json] --manifest [.pr-lens/manifest.json] --asset-base-url [https://raw.githubusercontent.com/owner/repo/pr-lens/42]```

**Validate** graph, config, or manifest files

```pr-lens validate [.pr-lens/graph.json] [.github/pr-lens.yml]```

**Export** a merged snapshot map after the pull request lands

```pr-lens export [.pr-lens/graph.json] -o [.github/pr-lens.map.json]```

# SYNOPSIS

**pr-lens** **analyze** **--base** _ref_ [_options_]

**pr-lens** **render** _graph.json_ [_options_]

**pr-lens** **comment** **--graph** _file_ **--manifest** _file_ [_options_]

**pr-lens** **validate** _file_ ...

**pr-lens** **export** _graph.json_ [_options_]

# PARAMETERS

**-h**, **--help** / **-v**, **--version**
> Top-level help, or print the CLI version. Each subcommand also accepts **--help**.

**analyze --base** _ref_
> Required. The change is measured against the **merge base** of this ref and **--head**, not the tip of the base branch.

**analyze --head** _ref_
> Tip of the change (default **HEAD**).

**analyze --repo** _dir_ / **--repo-slug** _owner/name_ / **--remote** _name_
> Repository to read (default **.**). Slug is inferred from **origin** unless overridden.

**analyze --provider** _id_
> **gemini** (default), **openai**, or **openai-compatible**.

**analyze --model** _name_ / **--base-url** _url_ / **--api-key-env** _name_
> Model id (required for **openai-compatible**), endpoint, and env var holding the key. Default keys: **GEMINI_API_KEY** or **OPENAI_API_KEY**. Never pass a key as a flag.

**analyze --lens** _name_
> Repeatable. Lenses are **architecture** and **data-flow** (default both).

**analyze --pr** _number_
> Recorded in provenance only.

**analyze --max-diff-bytes** _n_ / **--max-output-tokens** _n_
> Diff truncation (default 400000 bytes) and model output room (default 32768).

**analyze --dry-run**
> Report prompt size and send nothing.

**analyze -o**, **--out** _file_
> Graph document path (default **.pr-lens/graph.json**).

**render -o**, **--out** _dir_
> Directory for SVGs, **manifest.json**, and **drawn.graph.json** (default **.pr-lens/**).

**render --theme** light|dark|both
> Default **both**.

**comment --graph** / **--manifest**
> Must be the **drawn** document the renderer wrote, plus its manifest (hash-checked).

**comment --asset-base-url** _url_
> Where published SVGs will be fetched from in the markdown.

**comment --print-marker**
> Print only the hidden HTML comment used to find an existing PR Lens comment.

**comment --no-branding** / **comment -o** _file_
> Omit the footer, or write markdown to a file instead of stdout.

**export -o** _file_ / **--id** _id_ / **--sha** _sha_
> Map path (default **.github/pr-lens.map.json**), map id, and commit it reflects.

**--config** _file_ / **--no-config**
> On **analyze** and **render**: use or ignore **.github/pr-lens.yml**. **analyze** reads **lenses** from it; **render** applies rename/exclude/lane/group overlays.

# DESCRIPTION

**pr-lens** is the command-line entry of **PR Lens**: it turns a Git diff into a schema-valid graph, draws animated architecture and data-flow SVGs, and composes the markdown that the GitHub App and Action post as a pull-request comment. The npm package is **@coldtea/pr-lens-cli**; the binary is **pr-lens**. Requires **Node.js 20.11+**.

Only **analyze** talks to a model. The key is read from the environment and the diff is sent only to the named provider (Google Gemini, OpenAI, or any **/chat/completions** server via **--base-url**). Commit SHAs, the repository slug, pull-request number, and line counts are filled from Git; values the model writes there are discarded. If the answer fails the contract, validation errors are sent back **once**.

**render** writes self-contained, deterministic SVGs (no script, no external references), a manifest of asset names, and **drawn.graph.json** (the document after corrections). **comment** prints markdown and **does not post**. **export** drops deleted nodes and delta annotations so a merged change can be committed as a snapshot map; nothing in the pipeline reads that map back.

The same diagrams are also produced by the hosted GitHub App, the Action at **coldteadotai/pr-lens/packages/action**, and an agent skill (**npx skills add coldteadotai/pr-lens**).

# CONFIGURATION

**.github/pr-lens.yml** is picked up automatically. Typical keys:

**lenses**
> Which views **analyze** should fill.

**map.rename** / **map.exclude** / **map.lane** / **map.group**
> Draw-time overlay (match paths or ids). Unmatched selectors are reported so a drifted config does not fail silently.

**branding**
> Footer on composed comments.

Scratch output lives in **.pr-lens/**. The first write adds that directory to **.gitignore**. **--out** pointing elsewhere leaves gitignore alone.

# CAVEATS

Misuse (unknown command, missing **--base**, bad flags) exits **2**; other failures exit **1**. Failure codes a script can branch on include **USAGE**, **EMPTY_DIFF**, **MISSING_API_KEY**, **PROVIDER_FAILED**, **MODEL_OUTPUT_INVALID**, **GIT_FAILED**, and **INVALID_DOCUMENT**.

**comment** refuses a graph/manifest pair whose content hash does not match. OpenAI and OpenAI-compatible endpoints are separate **--provider** values because they disagree on **max_tokens** vs **max_completion_tokens**. The CLI does not install the GitHub App or post comments itself.

# HISTORY

PR Lens is published by **Coldtea AI** (MIT). CLI package version around **0.1.3**. Homepage **https://prlens.dev**.

# SEE ALSO

[git](/man/git)(1), [git-diff](/man/git-diff)(1), [gh](/man/gh)(1), [mermaid](/man/mermaid)(1)

# RESOURCES

```[Source code](https://github.com/coldteadotai/pr-lens)```

```[Homepage](https://prlens.dev)```

```[Documentation](https://github.com/coldteadotai/pr-lens/tree/main/packages/cli#readme)```

<!-- verified: 2026-08-27 -->
