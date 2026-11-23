# TAGLINE

CLI for the Kanwas collaborative thinking space

# TLDR

**Authenticate** via the browser

```kanwas login```

**Pull** a workspace into the current directory (interactive picker)

```kanwas pull```

**Pull** a specific workspace non-interactively

```kanwas pull --name "[workspace_name]"```

**Push local changes** back to the bound workspace

```kanwas push```

**Import** a folder of markdown files into a workspace

```kanwas import [path/to/notes] --id [workspace_uuid] --dest [subfolder]```

**List workspaces** as JSON for scripting

```kanwas workspaces --json```

# SYNOPSIS

**kanwas** _command_ [_options_]

# DESCRIPTION

**kanwas** is the command-line client for **Kanwas**, an open-source shared context board for teams and AI agents. The CLI syncs a workspace with the local filesystem so notes can be edited in any editor, bulk-imported from existing markdown, or accessed from CI and coding agents (Claude Code, Codex, etc.).

Authentication uses a browser-based flow and is stored globally in **~/.kanwas/config.json**. After the first **pull**, the directory is bound to that workspace through a **.kanwas.json** file, and later **pull**/**push** calls reuse it.

# COMMANDS

**login** [**--api-url** _url_] [**--frontend-url** _url_] [**--yjs-server-host** _host_]
> Authenticate with Kanwas via the browser. The URL options point the CLI at a self-hosted instance.

**pull** [**--id** _uuid_ | **--name** _name_]
> Download workspace files into the current directory. Without **--id** or **--name** an interactive picker is shown.

**push**
> Upload local changes to the bound workspace.

**import** _source_ [**--id** _uuid_ | **--name** _name_] [**--dest** _path_] [**--overwrite**]
> Import a markdown file or folder (only **.md** files, directory structure preserved) into a workspace, optionally under _path_ and replacing existing files.

**workspaces** [**--json**]
> List the workspaces you have access to.

**clean** [**--force**]
> Delete all remote files in the workspace; **--force** skips the confirmation prompt.

# CAVEATS

The CLI is part of an actively evolving platform; the set of commands and their flags may change between releases. **login** needs a browser to complete authorization; use **--id** or **--name** for non-interactive use in CI or agents. **clean** irreversibly deletes every remote file in the workspace.

# HISTORY

**Kanwas** is developed by the **kanwas-ai** organization as an open-source platform for collaborative thinking that pairs human users with AI agents on a shared canvas. The CLI exists to integrate canvas content into existing developer workflows.

# SEE ALSO

[git](/man/git)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/kanwas-ai/kanwas)```

```[Homepage](https://kanwas.ai)```

<!-- verified: 2026-11-23 -->
