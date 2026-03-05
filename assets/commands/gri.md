# TAGLINE

Git and Gerrit review interface for managing change requests

# TLDR

**List all pending reviews** across configured servers

```gri```

**List reviews** from a specific server

```gri [server_name]```

**Show reviews assigned to you**

```gri --mine```

**Show reviews with a specific status**

```gri --status [open|merged|abandoned]```

# SYNOPSIS

**gri** [_options_] [_server_]

# DESCRIPTION

**gri** (Git Review Interface) is a command-line tool that lists git reviews from multiple servers in a way that makes it easier to identify which ones need your attention. It supports **Gerrit** and **GitHub** as backends, allowing developers to manage pull requests and code reviews across multiple repositories and servers from a single terminal interface.

gri aggregates change requests and presents them in a unified view, helping developers track outstanding reviews, identify stale changes, and prioritize their code review workflow.

# CAVEATS

Requires Python 3 and appropriate authentication credentials configured for each server. Configuration is managed through a config file that specifies server URLs and authentication tokens. Performance depends on the number of servers and change requests being tracked.

# HISTORY

**gri** was developed as part of the **pycontribs** project to simplify the workflow of developers who review code across multiple Gerrit and GitHub instances. It is written in **Python** and released as open source software.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1)
