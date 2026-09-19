# TAGLINE

Read-only semantic code review using TypeSafe Jev

# TLDR

**Check files** in the current directory

```jeff check```

**Check specific paths**

```jeff check [path/to/src] [file.go]```

Emit **JSON** for CI

```jeff check --output-format json```

**Bypass the answer cache** and re-query the model

```jeff check --no-cache```

**Store** a TypeSafe API key in the system keyring

```jeff auth login```

**Remove** the stored API key

```jeff auth logout```

# SYNOPSIS

**jeff** **check** [**--output-format** _text_|_json_] [**--no-cache**] [_PATH_...]

**jeff** **auth** **login**

**jeff** **auth** **logout**

# DESCRIPTION

**jeff** is a read-only Go CLI that reviews source files against a built-in catalog of semantic design rules. It does not parse or lint syntax. Each applicable rule is a Jev *noul* question from TypeSafe: the file contents are sent as *state* to the TypeSafe API, and the model returns a probability in **[0, 1]** that the rule's statement holds. Scores below **0.20** pass, scores at or above **0.80** are violations, and values in between are inconclusive.

The embedded catalog is the **GEN** family (**GEN001**–**GEN020**): unclear or excessive responsibility, misleading names, low cohesion, hidden side effects, weak error handling, missing validation, unnecessary complexity, premature abstraction, coupling, leaked abstractions, duplicated domain knowledge, redundant comments, missing rationale, fragile control flow, representable invalid state, mixed infrastructure, and code that is hard to test. Rules apply per file. Markdown, plain text, hidden files, and **vendor/** trees are excluded even when discovery walks them.

With no paths, **jeff check** walks the current working directory. Directory walks honor nested **.gitignore** files and skip **.git**. An explicitly named file is always checked, even if gitignore would have skipped it. Symlink inputs are rejected. Files must be valid UTF-8 without NUL bytes.

Text output prints only non-passing checks plus a summary of violations, inconclusive results, and errors. JSON is a single object with **schema_version**, **checks**, **errors**, and **warnings**. Successful answers are cached under **.jeff-cache/v1/** in the invocation root so unchanged files are not re-sent.

# PARAMETERS

**check** [_PATH_...]
> Review files at the given paths, or the current directory when omitted.

**--output-format** _text_|_json_
> Text (default) for interactive use, or JSON for CI parsers.

**--no-cache**
> Do not read or write the answer cache.

**auth login**
> Prompt for a TypeSafe API key (hidden on a TTY) and store it in the system keyring as service **jeff**, account **typesafe-api-key**. Accepts a single line on stdin when not a TTY.

**auth logout**
> Delete the stored keyring credential. Does not unset **TYPESAFE_API_KEY**.

**-h**, **--help**
> Print usage. **jeff check -h** and **jeff auth -h** print the matching subcommand usage.

# CONFIGURATION

**TYPESAFE_API_KEY**
> API key used when set. Overrides the keyring. Must be non-empty, at most 2048 bytes, and contain no NUL or newline.

**TYPESAFE_BASE_URL**
> TypeSafe API origin. Default **https://api.typesafe.ai**. Requests go to **/v1/systemone**. Useful for a compatible test endpoint.

**.jeff-cache/v1/**
> Per-answer JSON cache under the invocation root, keyed by SHA-256 of the model, file contents, and question. Mode **0700** on the directory, **0600** on entries. **just clean** in the upstream repo removes **.jeff-cache** and **bin**.

**.gitignore**
> Discovery for directory inputs loads gitignore patterns as it walks. Explicit file arguments skip this filter.

# EXIT STATUS

**0**
> Every applicable check passed.

**1**
> At least one conclusive violation, and no error or inconclusive result.

**2**
> Usage error, missing or invalid credentials, unreadable input, provider failure, internal error, or an inconclusive noul.

# CAVEATS

**jeff** is read-only on disk, but it sends source file contents to TypeSafe over the network whenever the cache misses. Treat that as sharing code with a third party. It is not a substitute for a conventional linter: results are probabilistic judgments, not AST matches, so scores between **0.20** and **0.80** fail CI with exit **2**. The rule catalog is compiled in; there is no flag to add, drop, or retune rules. The Go module path is **jeff** rather than a repository URL, so install from a clone with **go build -o bin/jeff ./cmd/jeff** (Go **1.25** or newer). Provider calls retry up to three times with a 10-second per-attempt timeout and a 30-second overall cap.

# HISTORY

**jeff** was published by **Alurith** in **September 2026** as a Show HN CLI that runs a fixed semantic-review catalog through TypeSafe's Jev model.

# SEE ALSO

[semgrep](/man/semgrep)(1), [ast-grep](/man/ast-grep)(1), [golangci-lint](/man/golangci-lint)(1), [staticcheck](/man/staticcheck)(1), [ruff](/man/ruff)(1)

# RESOURCES

```[Source code](https://github.com/Alurith/jeff)```

```[Documentation](https://docs.typesafe.ai/introduction)```

<!-- verified: 2026-09-19 -->
