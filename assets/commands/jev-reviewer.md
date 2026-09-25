# TAGLINE

Rank pull-request changes so a person reviews the important ones first

# TLDR

Store the **TypeSafe and OpenAI keys** on this machine

```jev-reviewer setup```

Check tools, keys, the local server, and **live provider access**

```jev-reviewer doctor```

The same check **without calling the providers**

```jev-reviewer doctor --offline```

**Analyze** a pull request from its local clone

```jev-reviewer analyze --pr [https://github.com/owner/repo/pull/123] --repo [path/to/clone]```

Analyze more than the default **12 change units**

```jev-reviewer analyze --pr [https://github.com/owner/repo/pull/123] --max-units [40]```

Skip the optional **Graphify** code graph

```jev-reviewer analyze --pr [https://github.com/owner/repo/pull/123] --no-graphify```

Use an explicit **priority policy**

```jev-reviewer analyze --pr [https://github.com/owner/repo/pull/123] --policy [path/to/policy.json]```

Also write a **copy of the report** (it contains source excerpts)

```jev-reviewer analyze --pr [https://github.com/owner/repo/pull/123] --output [path/to/report.json]```

Start the **local extension bridge** on port 4731

```jev-reviewer serve```

Listen on **another port**

```jev-reviewer serve --port [8080]```

Replay the **bundled demo** without calling either provider

```jev-reviewer demo```

Print the **extension pairing token** (not the model keys)

```jev-reviewer token```

# SYNOPSIS

**jev-reviewer** _command_ [_options_]

# PARAMETERS

**setup**
> Prompt in the terminal for `TYPESAFE_API_KEY` and `OPENAI_API_KEY` and store them. Input is hidden. Requires an interactive terminal; do not pass key values as arguments. A key already in the credentials file is left as-is. A key present only in the environment can be copied into the file. To replace a stored OpenAI key, run `node scripts/setup-keys.mjs --replace-openai` from a checkout.

**doctor** [**--offline**] [**--port** _n_]
> Check required tools, where each key comes from, the local server, and provider access. **--offline** skips the live provider requests. **--port** is the server port to probe (default 4731). Exits non-zero when a check fails.

**analyze** **--pr** _url_ [**--repo** _path_] [**--policy** _file_] [**--graphify** | **--no-graphify**] [**--max-units** _n_] [**--output** _file_]
> Classify committed changes on a GitHub pull request. **--pr** is the pull-request URL. **--repo** is the local clone whose `origin` is that repository (default: the current directory). Needs `git` and an authenticated `gh`. Resolves the base and head commits, splits the diff into change units (hunks), and analyzes the first **--max-units** of them in path order (default 12, range 1–100). The rest stay as GitHub's original diff and are marked not analyzed. Before analysis it makes one small request to each provider and stops if either fails. Writes a report under `~/.cache/jev-reviewer/reviews`. **--output** also writes that report to _file_; the copy contains source excerpts. Does not post anything to GitHub.

**serve** [**--port** _n_]
> Serve cached reports on `127.0.0.1` (default port 4731) for the unpacked Chrome extension. Ctrl-C stops it.

**demo** [**--port** _n_]
> Start the same local server and point at the bundled recorded demo. Makes no TypeSafe or OpenAI calls. The recorded explanations are prepared demonstration copy, not a live model run.

**token**
> Print the local pairing token the extension stores under Connection. This is not a model-provider key. Treat it as local access material.

**-h**, **--help**
> Print the command summary. Also printed when no command is given.

**--graphify** / **--no-graphify**
> **analyze** only. Try Graphify for related symbols and dependencies, or skip it. Graphify is on by default and the run falls back to the diff and nearby source when it is unavailable. Install with `uv tool install graphifyy` when you want the graph.

# DESCRIPTION

**jev-reviewer** is the command installed by the Jev-Code-Reviewer project (`npm` package name `jev-reviewer`, binary `bin/jev-reviewer.mjs`). It is a local review aid for pull requests that are too large to read as a raw diff. TypeSafe's **Jev** model assigns each analyzed change an attention priority. **OpenAI** writes the prose a reviewer sees instead of the diff: old logic, new logic, what changed, and why a person might need to look. Priorities mean attention, not correctness.

The bundled policy (`config/policy.json`) uses three levels. **P0** is human judgment required (permissions, security boundaries, destructive operations, incompatible contracts, or a consequential decision). **P1** is human review recommended. **P2** is low attention (documentation, formatting, mechanical edits, or a refactor that looks behavior-preserving). Uncertain changes default to P0 (`uncertainPriority` may be P0 or P1, never P2). The extension shows P0 files expanded and starts P1 and P2 collapsed. A repository may replace the policy with `.jev-reviewer.json`, or **--policy** can point at another JSON file. A path matching `alwaysReviewPaths` is forced to P0. The bundled patterns are `**/auth/**`, `**/migrations/**`, and `**/.github/workflows/**`. Incomplete or unsupported diffs are also kept at P0 or raised to `uncertainPriority`.

The Chrome extension is loaded unpacked from the repository's `extension/` directory. It only changes GitHub's classic **Files changed** page (`/pull/<n>/files`). The newer `/changes` page is not supported. When the server is down, the report is missing, or the report is older than the pull request's latest commit, the extension leaves GitHub's diff in place. Pair it with `jev-reviewer token`.

The package is `"private": true` and is not published to npm. Install from a checkout with Node.js 22 or newer: `npm install`, then `npm link` so `jev-reviewer` is on `PATH`. `git` and the GitHub CLI (`gh auth login`) are required for `analyze`.

# CONFIGURATION

**~/.config/jev-reviewer/credentials.json**
> `TYPESAFE_API_KEY` and `OPENAI_API_KEY`. Created by **setup** with owner-only permissions (directory `0700`, file `0600`). Not encrypted. A stored key wins over the same variable in the environment.

**TYPESAFE_API_KEY**, **OPENAI_API_KEY**
> Accepted from the environment when the credentials file has no value for that key. Shells that do not export them, including many coding-agent shells, will not see them. Prefer the credentials file.

**.jev-reviewer.json**
> Optional policy in the repository being reviewed. Overrides the bundled `config/policy.json`. **--policy** overrides both. The policy hash is stored in the report. Policy is operator configuration: it is read from the working tree separately from the commits under review.

**~/.cache/jev-reviewer/reviews**
> Cached reports. The file for a pull request is `{owner}--{repo}--{number}.json`. `serve` reads this directory and answers only on loopback. The extension requests `GET /api/reviews/{owner}/{repo}/{pullRequest}` with the pairing token. **JEV_REVIEWER_CACHE_DIR** replaces the `~/.cache/jev-reviewer` root.

**~/.config/jev-reviewer/pairing-token**
> Created on the first **token** run (32 random bytes, hex, mode `0600`). **JEV_REVIEWER_CONFIG_DIR** replaces the `~/.config/jev-reviewer` directory for this file. The credentials file above stays at its own path.

# CAVEATS

Live `analyze` sends changed code and nearby context to TypeSafe and OpenAI. The extension itself talks only to `127.0.0.1`. There is no hosted Jev-Reviewer backend and nothing is posted back to GitHub.

Only the first 12 change units are analyzed unless **--max-units** is raised (maximum 100). Units past the cap keep GitHub's diff.

`demo` does not exercise the live providers. Its classifications are a recorded Jev run; its explanations are prepared copy.

The project describes itself as a local prototype (version 0.1.0). Reports go stale when the pull request gains commits; rerun `analyze` and refresh the extension.

# HISTORY

**jev-reviewer** was published by the **egma-ai** organization in **September 2026** (GitHub repository created on 19 September 2026, version 0.1.0). It is MIT-licensed. The command is the local half of a three-part tool: this CLI, an agent skill that can run `analyze` after opening a pull request, and a Chrome extension that overlays the report on GitHub.

# SEE ALSO

[jevchat](/man/jevchat)(1), [jevals](/man/jevals)(1), [gh](/man/gh)(1), [git](/man/git)(1), [node](/man/node)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/egma-ai/jev-code-reviewer)```

```[Documentation](https://github.com/egma-ai/jev-code-reviewer#readme)```

<!-- verified: 2026-09-25 -->
