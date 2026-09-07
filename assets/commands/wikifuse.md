# TAGLINE

Merge Wikipedia articles across languages into one source-attributed page

# TLDR

Compare an **English-only** article with a merged English+French version

```wikifuse diff --qid [Q27182] --base en --compare en,fr --out [path/to/output] --no-llm```

**Fetch** Wikipedia pages for a Wikidata entity

```wikifuse fetch --qid [Q1058] --languages en,hi --out [path/to/output]```

Pick the **N largest language editions** instead of listing codes

```wikifuse fetch --qid [Q1058] --top-langs [4] --out [path/to/output]```

**Merge** language editions into an intermediate representation (no LLM ordering)

```wikifuse merge --qid [Q1058] --languages en,hi --out [path/to/output] --no-llm```

Merge with **OpenAI passage ordering** (needs `OPENAI_API_KEY`)

```wikifuse merge --qid [Q1058] --languages en,hi --out [path/to/output] --llm-model [gpt-4o-mini]```

Render the IR as **MediaWiki wikitext**

```wikifuse render --ir [path/to/wikifuse.ir.json] --out [path/to/article.wikitext]```

Generate an **HTML preview** of a saved IR

```wikifuse preview --ir [path/to/wikifuse.ir.json] --out [path/to/preview.html]```

Replay a saved comparison **without network or model calls**

```wikifuse diff-preview --comparison [path/to/comparison.json] --out [path/to/diff.html]```

Print the **package version**

```wikifuse --version```

# SYNOPSIS

**wikifuse** [_--version_] _command_ [_options_]

# PARAMETERS

**fetch**
> Download Wikipedia pages and metadata for a Wikidata QID into **--out**.

**merge**
> Fetch, translate, and combine language editions into `wikifuse.ir.json` plus `ATTRIBUTION.md`.

**render**
> Turn a saved IR JSON file into MediaWiki wikitext.

**preview**
> Turn a saved IR JSON file into an HTML preview.

**diff**
> Compare a single-language base article with a merged multi-language version and write `diff.html` plus supporting JSON.

**diff-preview**
> Rebuild comparison HTML from a saved `comparison.json` without fetching, translating, or calling an LLM.

**--qid** _QID_
> Wikidata identifier (for example `Q1058`). Required for **fetch**, **merge**, and **diff**.

**--languages** _CODES_
> Comma-separated Wikipedia language codes (for example `en,hi`). Used by **fetch** and **merge**. If omitted, **--top-langs** (default 2) selects the largest editions.

**--top-langs** _N_
> With **fetch** or **merge**, select the _N_ largest language editions by article size when **--languages** is not given.

**--base** _LANG_
> With **diff**, language of the unmerged side (default `en`).

**--compare** _CODES_
> With **diff**, comma-separated languages for the merged side (required). The base language is included in both sides.

**--out** _PATH_
> Output directory for **fetch**, **merge**, and **diff**; output file for **render**, **preview**, and **diff-preview**.

**--ir** _FILE_
> Saved `wikifuse.ir.json` for **render** and **preview**.

**--comparison** _FILE_
> Saved `comparison.json` for **diff-preview**.

**--use-llm** / **--no-llm**
> With **merge** and **diff**, use an OpenAI model to order source passages without rewriting them (default **--use-llm**). If `OPENAI_API_KEY` is unset, the CLI warns and falls back to a basic text merge.

**--llm-model** _NAME_
> OpenAI model for passage ordering (default `gpt-4o-mini`).

**--version**
> Print the installed version and exit.

**--help**
> Show help for the group or a subcommand.

# DESCRIPTION

**wikifuse** is a Python command-line tool that merges Wikipedia articles for the same Wikidata entity across language editions. Editions often emphasize different facts and citations; the tool fetches each requested revision, keeps passages attached to their inline references, translates non-English text to English via a LibreTranslate-compatible service, and writes a single intermediate representation (IR) with provenance.

The pipeline is: fetch pages at recorded revision IDs; parse passages (a passage ends at an inline citation or paragraph break); translate; merge identical passages within a section while retaining references and source revisions; then render wikitext or HTML. When an OpenAI key is set, the LLM only reorders passages. An invalid ordering response leaves the original order intact.

Merged output always targets English (`target_lang` is hardcoded to `en` in the CLI). A comparison from **diff** captures each requested source article once and writes `sources.json`, `base.ir.json`, `merged.ir.json`, `comparison.json`, `ATTRIBUTION.md`, and `diff.html`. Missing requested articles stop the comparison. Word and reference counts describe output size; they do not establish factual accuracy or translation quality.

Each claim's `provenance` field is a list of `{wiki, title, rev_id}` records. Reference records keep their original citation wikitext. Undefined or conflicting named references, and references without preceding text in their paragraph, raise an error.

# CONFIGURATION

**WIKIFUSE_TRANSLATE_URL**
> LibreTranslate `/translate` endpoint. Default `https://libretranslate.com/translate`. Point this at a self-hosted server (for example `http://localhost:5000/translate`) to avoid the hosted API key.

**WIKIFUSE_TRANSLATE_API_KEY**
> API key for the translation service. Required by the default hosted LibreTranslate endpoint; omit it when your own server does not require one.

**OPENAI_API_KEY**
> Enables LLM passage ordering for **merge** and **diff**. Without it, those commands warn and run a basic text merge. **--no-llm** disables ordering even when the key is set; translation still uses the configured LibreTranslate service.

Translation sends the full input in chunks of at most 500 characters, splitting at whitespace where possible. Requests time out after 15 seconds of inactivity. Transient network failures and HTTP 429/500/502/503/504 get at most three attempts per chunk, with retry waits capped at 30 seconds. Permanent HTTP errors and malformed responses fail immediately. A failed chunk aborts the CLI without replacing the merged IR or diff output. Failed translations are not cached.

# CAVEATS

Requires **Python 3.11+**. The README documents `pip install wikifuse`, but as of 2026-09-07 the project is not published on PyPI; install from the GitHub repository. Cross-language runs need a reachable LibreTranslate service. The default hosted endpoint requires an API key. The CLI does not rewrite Wikipedia prose: it concatenates and optionally reorders source passages. Wikipedia text is **CC BY-SA 4.0**; remixes must include attribution (`ATTRIBUTION.md` records source language and revision IDs). Development status is alpha (0.1.0).

# HISTORY

**wikifuse** is a Python CLI by **Gaurav Sood** (MIT license). The GitHub repository was created in **September 2025**. It uses Click, Requests, wikitextparser, and the OpenAI client; it does not bundle Torch, Transformers, or an embedding model.

# SEE ALSO

[wikit](/man/wikit)(1), [wiki-tui](/man/wiki-tui)(1), [jq](/man/jq)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/gojiplus/wikifuse)```

```[Documentation](https://gojiplus.github.io/wikifuse/)```

<!-- verified: 2026-09-07 -->
