# TAGLINE

Turn a codebase into a compact XML blueprint for LLMs

# TLDR

**Generate a structural blueprint of a project**

```crespo [./myproject]```

**Write the blueprint to a named file**

```crespo [./myproject] --output [blueprint.xml]```

**Add AI-generated one-line file summaries**

```crespo [./myproject] --mode summary --groq [api_key]```

**Include full source with secrets redacted**

```crespo [./myproject] --mode concat```

**Analyze a remote GitHub repository directly**

```crespo --git [https://github.com/user/repo]```

# SYNOPSIS

**crespo** _PATH_ [**--mode** _structure|summary|concat_] [**--git** _URL_] [**--groq** _KEY_] [**--output** _FILENAME_]

# DESCRIPTION

**crespo** converts a source tree into a compact XML "blueprint" intended to be fed to large language models. Instead of concatenating raw files, it uses **Tree-sitter** AST parsing to extract only the structural parts of each file, imports, classes, functions, and the connections between modules, which the project reports cuts token usage substantially compared to pasting the whole codebase.

It works in three modes. The default **structure** mode emits an AST skeleton of imports, classes, and functions. The **summary** mode adds a one-line, AI-generated description per file and requires a Groq API key. The **concat** mode embeds the full source of each file inside the structured XML while redacting detected secrets.

crespo is installed from PyPI with **pip install crespo** and supports Python, JavaScript, TypeScript, JSX, TSX, Rust, Go, Java, C, and C++. It can analyze a local directory or clone and analyze a GitHub repository in place with **--git**.

# PARAMETERS

**--mode** _structure|summary|concat_

> Output mode. **structure** (default) emits the AST skeleton, **summary** adds per-file AI summaries, **concat** includes redacted full source.

**--git** _URL_

> Clone and analyze a GitHub repository directly instead of a local path.

**--groq** _KEY_

> Groq API key used by **summary** mode. The key is saved for future runs.

**--output** _FILENAME_

> Write the blueprint to a custom filename.

# CAVEAT

**summary** mode is not local-only: it sends file information to the Groq API and requires a valid API key, so avoid it on private or sensitive code unless that is acceptable. Although **concat** mode attempts to redact secrets, automated redaction is best-effort and should not be relied on as a guarantee before sharing output.

# SEE ALSO

[repomix](/man/repomix)(1), [git](/man/git)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/hrudulmmn/crespo)```

<!-- verified: 2026-06-23 -->
