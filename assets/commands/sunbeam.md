# TAGLINE

General purpose command-line launcher

# TLDR

**Launch the root view**

```sunbeam```

**Run an installed extension** by its alias

```sunbeam [alias]```

**Run a specific extension command**

```sunbeam [alias] [command]```

**Install an extension** from a URL or local path

```sunbeam extension install [origin]```

**Install an extension under a custom alias**

```sunbeam extension install [origin] --alias [name]```

**List installed extensions**

```sunbeam extension list```

**Upgrade all extensions**

```sunbeam extension upgrade --all```

**Validate a list** emitted by a script against the Sunbeam schema

```[./script.sh] | sunbeam validate list```

**Edit the config file**

```sunbeam edit --config```

**Open a file or URL** in the default application

```sunbeam open [target]```

# SYNOPSIS

**sunbeam** [_command_] [_flags_]

**sunbeam** _alias_ [_command_] [**--**_param_ _value_...]

# PARAMETERS

_alias_ [_command_]
> Run an installed extension, or one of its commands. Command inputs are exposed as flags.

**extension install** _origin_ [**--alias** _name_]
> Install an extension from a URL or local file (alias: **add**).

**extension list**
> Show installed extensions (alias: **ls**).

**extension upgrade** [_alias_] [**--all**]
> Upgrade one or all extensions.

**extension remove** _alias_
> Uninstall an extension (aliases: **rm**, **uninstall**).

**extension rename** _alias_ _new-alias_
> Rename an installed extension.

**extension configure** _alias_
> Set extension preferences.

**extension create** _name_ [**-l** _language_]
> Scaffold a new extension.

**extension edit** _alias_
> Open an extension's source in the editor.

**validate** {**list**|**detail**|**manifest**|**config**}
> Validate JSON read from stdin against the Sunbeam schema.

**edit** [_file_] [**-c**] [**-e** _ext_]
> Open a file in the editor; **-c** edits the config file.

**open** _target_
> Open a URL or file with the default handler.

**copy**, **paste**
> Copy stdin to the clipboard, or print the clipboard to stdout.

**version**
> Print the sunbeam version.

**--help**
> Show usage for sunbeam or any subcommand.

# DESCRIPTION

**sunbeam** lets you define UIs composed of a succession of views from simple scripts written in any language. It is a hybrid between application launchers like Raycast and fuzzy-finders like fzf, rendering interactive lists, details, and forms from JSON emitted by your scripts.

An extension is an executable that prints a JSON manifest describing its commands and, when run, emits list or detail views. Extensions can be written in shell, Python, TypeScript (Deno), or any language that can print JSON to stdout. Each installed extension becomes a subcommand of **sunbeam**, so its commands can also be called directly from scripts. Sunbeam works well inside tmux or zellij popups.

# CONFIGURATION

**~/.config/sunbeam/sunbeam.json**
> Main config file listing installed extensions, their preferences, root items and oneliners. Created on first run. A **sunbeam.json** in the current directory or a parent takes precedence.

**SUNBEAM_CONFIG**
> Environment variable overriding the config file path.

# HISTORY

**sunbeam** was created by **pomdtr** and is written in **Go**. It is distributed under the MIT license. Version 1.0 was released in 2024.

# SEE ALSO

[fzf](/man/fzf)(1), [rofi](/man/rofi)(1), [dmenu](/man/dmenu)(1), [television](/man/television)(1)

# RESOURCES

```[Source code](https://github.com/pomdtr/sunbeam)```

```[Homepage](https://sunbeam.pomdtr.me/)```

```[Documentation](https://sunbeam.pomdtr.me/docs/)```

<!-- verified: 2026-11-23 -->
