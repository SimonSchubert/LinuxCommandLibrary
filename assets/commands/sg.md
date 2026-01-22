# TLDR

**Search for a pattern** in the current directory

```sg -p '[pattern]'```

**Search for a pattern** in a specific language

```sg -p '[console.log($ARG)]' -l javascript```

**Search and replace** interactively

```sg -p '[old_code]' -r '[new_code]' -i```

**Apply rewrites** without confirmation

```sg -p '[foo($A)]' -r '[bar($A)]' --update-all [path/to/files]```

**Scan codebase** using rule configuration

```sg scan -c [sgconfig.yml]```

**Run a single rule file**

```sg scan -r [rule.yml]```

**Show matches with context** lines

```sg -p '[pattern]' -C [3]```

**Output results in JSON** format

```sg -p '[pattern]' --json```

# SYNOPSIS

**sg** _command_ [_options_] [_paths_...]

# COMMANDS

**run**
> Search code by pattern and optionally rewrite (default command)

**scan**
> Scan codebase using configuration files and rules

**test**
> Run tests for ast-grep rules

**new**
> Generate scaffolding files (project, rule, test, util)

**lsp**
> Start Language Server Protocol for editor integration

**completions**
> Generate shell completion scripts

# PARAMETERS

**-p**, **--pattern** _pattern_
> AST pattern to match; use $VAR for wildcards

**-r**, **--rewrite** _replacement_
> String to replace matched AST nodes

**-l**, **--lang** _language_
> Specify the programming language

**--selector** _kind_
> Extract specific AST node type from matches

**--strictness** _level_
> Matching strictness (cst, smart, ast, relaxed, signature)

**-i**, **--interactive**
> Start interactive editing session

**-U**, **--update-all**
> Apply all rewrites without confirmation

**--json**[=_style_]
> Output as JSON (pretty, stream, compact)

**-A** _num_
> Show lines after match

**-B** _num_
> Show lines before match

**-C** _num_
> Show context lines around match

**-c**, **--config** _file_
> Path to configuration file (default: sgconfig.yml)

# DESCRIPTION

**sg** (ast-grep) is a fast CLI tool for structural code search, linting, and rewriting based on abstract syntax trees. Unlike text-based grep, it understands code syntax and matches patterns at the AST level, making searches more precise and language-aware.

Patterns use a familiar code-like syntax with metavariables (**$VAR**, **$$$ARGS**) to match arbitrary expressions. For example, **console.log($MSG)** matches any console.log call regardless of the argument. Multiple metavariables with the same name must match identical code.

The tool supports many languages including JavaScript, TypeScript, Python, Rust, Go, Java, C, C++, and more via tree-sitter parsers. Rules can be defined in YAML configuration files for consistent codebase scanning.

# CAVEATS

On Linux, **sg** may conflict with the system **sg** command (setgroups). Use the full name **ast-grep** or create an alias. Pattern syntax varies slightly between languages due to AST differences.

# HISTORY

**ast-grep** was created by **Herrington Darkholme** and first released around **2022**. Written in **Rust** with **tree-sitter** for parsing, it was designed as a modern alternative to text-based code search tools, enabling precise structural matching across multiple programming languages.

# SEE ALSO

[grep](/man/grep)(1), [rg](/man/rg)(1), [sed](/man/sed)(1), [semgrep](/man/semgrep)(1)
