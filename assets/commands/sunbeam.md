# TAGLINE

General purpose command-line launcher

# TLDR

**Launch the root view**

```sunbeam```

**Run an extension** by alias or path

```sunbeam run [extension] [command]```

**Install an extension** from a URL or local path

```sunbeam extension install [origin]```

**List installed extensions**

```sunbeam extension list```

**Validate a script** against the Sunbeam schema

```sunbeam validate [manifest.json]```

**Open a file or URL** in the system handler

```sunbeam open [target]```

# SYNOPSIS

**sunbeam** [_command_] [_flags_]

# PARAMETERS

**run** _extension_ [_command_]
> Execute a command exposed by an installed extension.

**extension install** _origin_
> Install an extension from a Git URL or local directory.

**extension list**
> Show installed extensions.

**extension remove** _alias_
> Uninstall an extension.

**validate** _file_
> Check that a manifest or page conforms to the Sunbeam JSON schema.

**open** _target_
> Open a URL or file with the default handler.

**--help**
> Show usage for sunbeam or any subcommand.

# DESCRIPTION

**sunbeam** lets you define UIs composed of a succession of views from simple scripts written in any language. It is a hybrid between application launchers like Raycast and fuzzy-finders like fzf, rendering interactive lists, details, and forms from JSON emitted by your scripts.

Extensions can be written in shell, Python, TypeScript, or any language that can print JSON to stdout. Sunbeam ships integrations for GitHub, Nix, Google Search, Hacker News, and Pipe Boards, and embeds cleanly inside tmux or zellij popups.

# HISTORY

**sunbeam** was created by **pomdtr** and is written in **Go**. It is distributed under the MIT license.

# SEE ALSO

[fzf](/man/fzf)(1), [rofi](/man/rofi)(1), [television](/man/television)(1)
