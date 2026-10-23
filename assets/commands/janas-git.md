# TAGLINE

This machine's Git repositories as an MCP server

# TLDR

**Serve** local repositories over stdio

```janas-git```

Register with **Claude Code**

```claude mcp add git -- /path/to/janas-git```

# SYNOPSIS

**janas-git**

# DESCRIPTION

**janas-git** is a Janas service: an MCP server over standard input and output for the Git repositories on this computer. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory.

Tools that only read, and run without asking:

- **git_status** — branch, the remote it follows, ahead or behind, files staged, changed, untracked, and in conflict
- **git_log** — latest commits (`count`, 10 unless asked, 20 at most), optionally one path, one author, or the last days
- **git_diff** — unstaged changes, or staged ones (`staged`), in a path or the whole tree. The user sees up to 400 lines; the model sees the start
- **git_branches** — local branches, most recently used first

Tools that change the repository. They set MCP `readOnlyHint` false, so the client asks first:

- **git_commit** — commit what is staged, after staging named `files` or every changed tracked file (`all`). Optional `signoff`
- **git_pull** — `git pull --ff-only` of the upstream branch
- **git_push** — push to the upstream. A branch with none goes to `origin` and is set to follow it only when `set_upstream` is asked. Never forced
- **git_switch** — switch, or create and switch (`create`). Git's own refusal is the answer when changes would be lost

Not offered: `reset`, `restore`, file `checkout`, `clean`, `stash drop`, `rebase`, `commit --amend`, `--no-verify`, `push --force`, deleting a branch. Git is executed with arguments as they are, with no shell. A branch or path that starts with `-` is refused, and paths go after `--`.

A repository is a path, a name whose last path component is listed in `~/.config/janas/git-repos.txt` (one path a line), or, when none is named, the directory **janas-chat** was started in.

In **janas-chat** a changing call is shown whole and waits for `y`, including with **--mcp-auto**. On a pipe it is not run. After a change, the answer is Git's own words. Logs go to standard error.

# PARAMETERS

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CONFIGURATION

**~/.config/janas/git-repos.txt**
> One repository path a line. The name the tools accept is the last component.

# CAVEATS

This is an MCP **server**, not a prompt. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `git` in `~/.config/janas/mcp.json` replaces the automatic start.

Git runs with no terminal, so a password prompt (SSH or HTTPS) fails at once. An SSH agent and Git credential helpers still work. Other MCP clients decide for themselves whether to ask before a call that changes something.

# HISTORY

**janas-git** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-github](/man/janas-github)(1), [git](/man/git)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/git/README.md)```

<!-- verified: 2026-10-23 -->
