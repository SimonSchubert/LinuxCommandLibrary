# TAGLINE

Semantic document search, parsing, and Q&A for the terminal

# TLDR

**Parse** PDFs to text/markdown paths

```semtools parse [files...]```

**Semantic search** in text files

```semtools search "[query]" [files...] --max-distance [0.3]```

**Ask** a question over documents

```semtools ask "[question]" [files...]```

**Use a workspace** for cached embeddings

```semtools workspace use [name]```

**Search with workspace** after export

```export SEMTOOLS_WORKSPACE=[name]; semtools search "[query]" [dir]/*.txt```

# SYNOPSIS

**semtools** *command* [*options*] [*args*]

# DESCRIPTION

**semtools** is a Rust CLI for document-centric workflows: **parse** converts PDFs and office documents (default backend: LlamaParse API), **search** performs local semantic keyword search with embeddings, **ask** runs an LLM agent with search/read tools over a corpus, and **workspace** caches embeddings for large collections under **~/.semtools/workspaces/**.

Install via **npm i -g @llamaindex/semtools** or **cargo install semtools**. Designed for Unix pipelines (stdin/stdout and **xargs**).

# PARAMETERS

**parse** [*OPTIONS*] *FILES*...

> Parse documents. **-b**, **--backend** selects parser (default **llama-parse**). **-c** config path. **-v** verbose.

**search** [*OPTIONS*] *QUERY* [*FILES*...]

> Semantic search. **-n**, **--n-lines** context lines (default 3). **--top-k** result count. **-m**, **--max-distance** distance threshold. **-i** ignore case. **-j** JSON output. Files optional if using stdin.

**ask** [*OPTIONS*] *QUERY* [*FILES*...]

> Question-answering agent over files or stdin. Requires an LLM API key (OpenAI-compatible; see config).

**workspace** **use**|**status**|**prune**

> Manage embedding workspaces. **use** prints shell export instructions for **SEMTOOLS_WORKSPACE**.

# CAVEATS

**parse** needs a LlamaIndex Cloud API key by default. **ask** needs an LLM provider key. **search**/**workspace** are local but use embedding models (download/runtime cost). Do not send confidential documents to third-party parse/LLM APIs without review.

# SEE ALSO

[rg](/man/rg)(1), [pdftotext](/man/pdftotext)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/run-llama/semtools)```

<!-- verified: 2026-07-19 -->
