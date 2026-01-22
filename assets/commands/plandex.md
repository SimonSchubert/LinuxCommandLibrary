# TLDR

**Start the interactive REPL**

```plandex```

**Describe a task or ask a question**

```plandex tell "[add a cancel button to the left of the submit button]"```

**Load files into context**

```plandex load [path/to/file.py]```

**Apply pending changes to project files**

```plandex apply```

**Apply changes and commit to git**

```plandex tell -a -c "[fix the authentication bug]"```

**View plan history**

```plandex log```

**Rewind to a previous step**

```plandex rewind [commit_hash]```

**Use the shorthand alias**

```pdx tell "[your prompt]"```

# SYNOPSIS

**plandex** [_command_] [_options_]

**pdx** [_command_] [_options_]

# PARAMETERS

**tell**, **t**
> Describe a task, ask a question, or chat

**load**, **l**
> Load files, directories, URLs, notes, or piped data into context

**apply**, **ap**
> Apply plan changes to project files

**rewind**
> Go back to a previous step in the plan history

**log**
> View the plan's history of changes

# TELL OPTIONS

**-f** _FILE_
> Read prompt from a file

**-a**, **--apply**
> Automatically apply changes after generation

**-c**, **--commit**
> Commit changes to git when used with --apply

**--auto-load-context**
> Automatically load context using project map

# DESCRIPTION

**Plandex** is an open-source AI coding agent designed for large projects and real-world tasks. It can plan and execute complex coding tasks that span many steps and touch dozens of files, handling up to 2 million tokens of context directly.

The tool uses a cumulative diff review sandbox that keeps AI-generated changes separate from your project files until you're ready to apply them. This allows easy rollback and debugging. Plandex supports multiple AI providers including Anthropic, OpenAI, Google, and open-source models.

Key features include automated debugging of terminal commands, fast project map generation with tree-sitter (30+ languages), and configurable autonomy levels from full automation to step-by-step review. The REPL mode offers fuzzy auto-complete for commands and file loading.

# CAVEATS

Windows is only supported via WSL; the tool does not work in CMD or PowerShell. Requires API keys from supported providers. Large context operations may consume significant tokens. The sandbox approach means changes are not immediately reflected in project files until applied.

# HISTORY

Plandex was founded by **Dane Schneider** in **2024** in San Francisco. The open-source release was announced in **April 2024**. Schneider previously founded EnvkeyConfig (YC W18). The project has gained over 14,000 GitHub stars and is designed to address the challenges of AI-assisted development on large codebases.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1)
