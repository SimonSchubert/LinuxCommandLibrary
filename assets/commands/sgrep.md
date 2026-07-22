# TAGLINE

Remote code-search grep for lazy Git mounts

# TLDR

**Search committed content** in the current repository

```sgrep [pattern]```

**Search a specific repository** on the remote index

```sgrep --repo [owner/repo] [pattern]```

**List matching files** with a file-type filter

```sgrep -l --file '\.ts$' '[pattern]'```

**Search only locally changed files**

```sgrep --changed [file] '[pattern]'```

# SYNOPSIS

**sgrep** [_options_] _pattern_

# DESCRIPTION

**sgrep** is a remote code-search client for **git-lazy-mount** working trees and other repositories backed by a cloud search index. On a lazy mount, ordinary **grep** or **rg** reads every file and materializes the whole repository, defeating the purpose of on-demand fetching. **sgrep** answers queries from a search provider instead, so committed content can be found without faulting local blobs.

Results are overlaid with uncommitted edits automatically: changed files are searched on disk, stale remote hits are dropped, and new or edited lines appear correctly. By default the tool uses **Sourcegraph** as its provider, inferring the repository from the **origin** remote when **--repo** is omitted.

The binary is a self-contained Rust program with rustls TLS and no system library dependencies beyond a network connection.

# PARAMETERS

**--repo** _OWNER/REPO_
> Search a specific repository instead of inferring it from **origin**.

**-l**
> Print only file paths with matches (files-with-matches mode).

**--file** _GLOB_
> Restrict results to paths matching a file glob.

**-i**
> Case-insensitive search.

**--literal**
> Treat the pattern as a literal string instead of a regular expression.

**--count** _N_
> Request up to _N_ remote results (default 100).

**--timeout-secs** _SECONDS_
> Fail fast when a query exceeds the time limit.

**--changed** _FILE_
> Search only the specified locally changed file.

**--no-cache**
> Bypass the local result cache and query the provider fresh.

# CONFIGURATION

**SRC_ENDPOINT**
> Provider API endpoint (default `https://sourcegraph.com`).

**SRC_ACCESS_TOKEN**
> Access token for private repositories; optional for public repos.

**SGREP_PROVIDER**
> Active search backend (`sourcegraph` by default, or `exec` for a custom command).

**SGREP_BROAD_TIMEOUT_SECS**
> Timeout applied only to broad searches without **--file**, useful for agent workflows.

**SGREP_CACHE_TTL_SECS**
> Cache lifetime for remote results (default 600 seconds).

# CAVEATS

**sgrep** depends on network access to a configured search provider and is most valuable on **git-lazy-mount** trees or very large repositories where local ripgrep would be expensive. It searches committed content through the index plus local edits; it does not replace every **git grep** use case. For coding agents, project documentation often recommends disabling embedded grep tools and routing search through **sgrep** with **--file** filters when possible.

# HISTORY

**sgrep** was added to the **git-lazy-mount** project by **Mohsen Azimi** as a companion tool for microVM and agent environments where repositories are mounted lazily and full-tree search would be prohibitively slow.

# INSTALL

```apt: sudo apt install sgrep```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-lazy-mount](/man/git-lazy-mount)(1), [git](/man/git)(1), [rg](/man/rg)(1), [grep](/man/grep)(1)

# RESOURCES

```[Source code](https://github.com/mohsen1/git-lazy-mount/tree/main/crates/sgrep)```

<!-- verified: 2026-06-30 -->