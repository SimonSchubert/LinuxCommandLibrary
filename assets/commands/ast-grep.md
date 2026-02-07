# TAGLINE

Structural code search and rewrite using AST patterns

# TLDR

**Search for a pattern** in the current directory

```ast-grep --pattern '[console.log($ARG)]'```

**Search with specific language**

```ast-grep --pattern '[async function $NAME() {}]' --lang typescript```

**Search and rewrite** code

```ast-grep --pattern '[$OLD].forEach($FN)' --rewrite '[$OLD].map($FN)'```

**Interactive rewrite** with confirmation

```ast-grep --pattern '[$A] == [$B]' --rewrite '[$A] === [$B]' --interactive```

**Output matches as JSON**

```ast-grep --pattern '[var $X = $Y]' --json```

**Scan using rule configuration** files

```ast-grep scan```

**Search with context lines**

```ast-grep --pattern '[TODO]' --context 3```

# SYNOPSIS

**ast-grep** [_command_] [_options_]

**sg** [_command_] [_options_]

# PARAMETERS

**run**
> Run a one-time search or rewrite (default command)

**scan**
> Scan and rewrite code using configuration rules

**test**
> Test ast-grep rules

**new**
> Create new ast-grep project, rules, or tests

**lsp**
> Start language server for IDE integration

**-p** _pattern_, **--pattern** _pattern_
> AST pattern to search for; use $VAR for metavariables

**-r** _replacement_, **--rewrite** _replacement_
> Replacement pattern for matches

**-l** _lang_, **--lang** _lang_
> Target language (javascript, typescript, python, rust, go, etc.)

**-i**, **--interactive**
> Interactive mode for confirming rewrites

**--json** [_style_]
> Output in JSON format (pretty, stream, compact)

**-A** _num_, **--after** _num_
> Show num lines after each match

**-B** _num_, **--before** _num_
> Show num lines before each match

**-C** _num_, **--context** _num_
> Show num lines around each match

**--stdin**
> Read code from standard input

**--threads** _num_
> Number of threads (0 for auto-detection)

**-c** _file_, **--config** _file_
> Path to config file (default: sgconfig.yml)

# DESCRIPTION

**ast-grep** (also invoked as **sg**) is a structural code search and rewriting tool. Unlike text-based grep, it parses code into an Abstract Syntax Tree (AST) and matches patterns at the syntactic level, ensuring matches respect code structure.

Patterns use a code-like syntax where **$METAVARIABLES** match any expression. For example, **console.log($MSG)** matches any console.log call regardless of its argument. This enables precise refactoring that text-based tools cannot achieve.

The tool supports multiple languages through tree-sitter parsers, including JavaScript, TypeScript, Python, Rust, Go, C, C++, Java, and more. The **scan** command applies rules from YAML configuration files, enabling project-wide linting and enforcement of code patterns.

Configuration files (**sgconfig.yml**) define rule directories and project settings. Individual rules specify patterns, rewrites, severity levels, and file filters.

# CONFIGURATION

**sgconfig.yml**
> Project configuration file defining rule directories, language settings, and custom rule paths.

# CAVEATS

The **sg** alias conflicts with the Linux **setgroups** command; use the full **ast-grep** command or create a custom alias. Pattern syntax varies slightly by language due to AST differences. Complex patterns may require understanding tree-sitter node types.

# HISTORY

**ast-grep** was created by **Herrington Darkholme** and released in **2022**. Written in Rust for performance, it was designed to bring structural code search to the command line, inspired by tools like Semgrep and Comby. The tool gained popularity for its speed and intuitive pattern syntax for code refactoring tasks.

# SEE ALSO

[grep](/man/grep)(1), [ripgrep](/man/ripgrep)(1), [sed](/man/sed)(1), [semgrep](/man/semgrep)(1)
