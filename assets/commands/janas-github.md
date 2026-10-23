# TAGLINE

Read GitHub issues, releases, and commits over MCP

# TLDR

**Serve** GitHub read-only over stdio

```janas-github```

Register with **Claude Code**

```claude mcp add github -- /path/to/janas-github```

# SYNOPSIS

**janas-github**

# DESCRIPTION

**janas-github** is a Janas service: a read-only MCP server over standard input and output for GitHub's REST API. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory. Nothing on GitHub is changed.

Tools:

- **github_issues** — issues or pull requests (`kind`), `open`, `closed`, or `all`. `new` is those opened since the last time this repository was asked; `days` is a window. Each line has number, title, author, date, comments, labels, and link. A pull request says whether it was merged or is a draft
- **github_releases** — latest releases (`count`; 1 is the latest), with tag, name, date, author, pre-release flag, files, the start of the notes, and a link. A repository with no releases yields its latest tags
- **github_commits** — commits on a branch over the last days (`days` defaults to 7, `branch` to the default branch, optional `author`). Newest first, ten at most
- **github_repo** — description, stars, forks, watchers, open issues and pull requests, language, licence, default branch, last push, topics, and site

A repository is `owner/name`, a github.com link, or a name alone. A bare name is looked up among the user's own repositories first (when a token is present), otherwise the public repository of that name with the most stars. The answer says which one was taken.

**janas-chat** shows the lists from a layout and gives the model a short brief. Terms such as commit and pull request come from the chat's glossary so a translation does not turn them into everyday words. Logs go to standard error.

# PARAMETERS

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CONFIGURATION

**GH_TOKEN**, **GITHUB_TOKEN**
> Token sent only to GitHub's API. If neither is set, `gh auth token` is used when **gh** is logged in. The token stays in memory: it is never written or printed, and a redirect to another host drops it.

**~/.config/janas/github-seen.txt**
> One line a repository, the last time its issues or pull requests were read. The first "new" query means the last seven days.

# CAVEATS

This is an MCP **server**, not a prompt. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `github` in `~/.config/janas/mcp.json` replaces the automatic start.

Without a token GitHub allows 60 requests an hour and 10 searches a minute. With a token that is 5,000 and 30, and private repositories are visible. The service only reads.

# HISTORY

**janas-github** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-git](/man/janas-git)(1), [gh](/man/gh)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/github/README.md)```

<!-- verified: 2026-10-23 -->
