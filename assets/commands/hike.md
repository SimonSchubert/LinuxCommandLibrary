# TAGLINE

Markdown browser for the terminal

# TLDR

**Start hike** to browse markdown files

```hike```

**Open a specific markdown file**

```hike [path/to/file.md]```

# SYNOPSIS

**hike** [_options_] [_file_]

# DESCRIPTION

**hike** is a terminal-based Markdown browser that provides the ability to browse and view local Markdown files, as well as Markdown files downloaded from the web. It includes shortcuts for quickly accessing Markdown files on popular git forges like **GitHub**, **GitLab**, **Codeberg**, and **Bitbucket**.

Hike supports editing Markdown documents from the local filesystem with a built-in editor, and also supports using your own choice of external editor. Commands can be discovered via the command palette (**Ctrl+P**).

# CAVEATS

Requires a terminal with modern rendering capabilities. Web-hosted Markdown files require an internet connection for fetching.

# HISTORY

**hike** was created by **Dave Pearson** (davep) and is written in **Python** using the **Textual** TUI framework. It was designed to provide a native terminal experience for browsing documentation and README files.

# SEE ALSO

[glow](/man/glow)(1), [mdcat](/man/mdcat)(1), [bat](/man/bat)(1)
