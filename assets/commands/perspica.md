# TAGLINE

Semantic diff that reviews code changes by what they do

# TLDR

**Review** the current branch (commits, uncommitted, and untracked files)

```perspica```

Open the same review in a **browser**

```perspica --web```

Review a **GitHub pull request** (uses `gh`)

```perspica --pr [123] --web```

Diff against another **base branch**

```perspica --branch [develop]```

Review **staged** changes only

```perspica --staged```

Diff a **git range** (merge-base, like a PR)

```perspica --git [main...feature]```

Compare the working tree against a **commit**

```perspica --git [HEAD~3]```

Compare **two files**

```perspica [old.ts] [new.ts]```

Write **JSON** instead of a terminal report

```perspica --json```

Group changes by intent with an **LLM** summary

```perspica -s```

# SYNOPSIS

**perspica** [_options_] [_old_file_ [_new_file_]]

# DESCRIPTION

**perspica** is a local semantic diff for reviewing code. It parses both sides of a change with tree-sitter, works out what actually changed (a rename, a new parameter, a moved function, a real logic change), and sets aside mechanical noise such as reformatting, comment-only edits, rename-only lines, unchanged moves, and generated files. It also points at what a line diff hides: references to names that no longer exist, calls that were not updated for a new signature, and code the change left unused.

Semantic analysis covers **TypeScript and JavaScript** (including TSX and JSX), **Python**, **Rust**, **Go**, **Java**, and **C**. Other files still appear as ordinary line diffs. Nothing is sent off the machine unless you ask for LLM analysis with **-s**. An optional LLM groups changes by intent, rates risk, and writes a summary. When the change came from your own Claude Code or Codex session, perspica can show the prompts that produced it.

With no arguments it reviews the current branch against its merge-base with `origin/HEAD`, `main`, or `master`, including uncommitted and untracked files. **--pr** uses the **gh** CLI to fetch a GitHub pull request. The default terminal format is **tty**; **--web** serves a viewer on **127.0.0.1** (default port **7890**). Analyses are cached under `.git/perspica/`.

# PARAMETERS

_OLD_FILE_ _NEW_FILE_
> Compare two files. Omit both to review the current git work.

**-l**, **--language** _LANGUAGE_
> Override language detection.

**-f**, **--format** _FORMAT_
> Output format: **tty** (default), **json**, or **web**.

**--json**
> Shorthand for **--format json**.

**--web**
> Open results in a local browser viewer.

**--port** _PORT_
> Port for the web viewer (default: **7890**; the next free port is used if taken).

**--no-open**
> Do not open a browser tab in web mode.

**--no-color**
> Disable colored output.

**--show-noise**
> Show mechanical hunks (formatting, renames, moves) in full in the terminal.

**--staged**
> Diff staged changes.

**--git** [_RANGE_]
> Diff the working tree against HEAD, or a commit range (`a..b`, `a...b`, or a ref).

**--pr** _NUMBER_
> Review a GitHub pull request by number (uses the **gh** CLI).

**--branch** [_BASE_]
> Review the current branch against its merge-base with _BASE_ (default: `origin/HEAD`, `main`, or `master`). This is what **perspica** does with no arguments.

**-s**, **--summarize**
> Group changes by intent, with risk and a summary, using an LLM. Sends the change list and changed code, never whole files.

**-d**, **--deep**
> Thorough analysis: the LLM may first read definitions and small files from the changed files. Slower. Implies **-s**.

**--api-key** _KEY_
> LLM API key. Prefer setting it in the environment.

**--provider** _PROVIDER_
> With **--api-key**: **anthropic** (default) or **openai**. **ollama** needs no key and uses a local model.

**--model** _MODEL_
> Model to use instead of the provider's default.

**--no-sessions**
> Do not read Claude Code or Codex sessions behind your change.

**--fresh**
> Run the LLM analysis again even if a saved one matches this diff.

**-h**, **--help**
> Print help.

**-V**, **--version**
> Print version.

# CAVEATS

Semantic classification is only for the listed languages; everything else is a line diff. **--pr** needs a working **gh** login. LLM analysis is optional and, except with Ollama, sends the classified change list and changed code to a provider. Agent session files under `~/.claude/projects` and `~/.codex/sessions` are read only for your own uncommitted work or commits authored with your git identity. The web viewer binds to **127.0.0.1** and refuses other hosts.

# HISTORY

**perspica** is a Rust CLI published on GitHub in **2026** under the MIT License. Install with `cargo install perspica` or a release binary.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git](/man/git)(1), [delta](/man/delta)(1), [difft](/man/difft)(1), [gh](/man/gh)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/sshah03/perspica)```

<!-- verified: 2026-10-01 -->
