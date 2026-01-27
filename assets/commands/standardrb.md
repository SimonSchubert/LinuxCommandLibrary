# TLDR

**Lint Ruby files** in current directory

```standardrb```

**Lint specific files**

```standardrb [path/to/file.rb] [path/to/other.rb]```

**Automatically fix** code style issues

```standardrb --fix```

**Fix including unsafe corrections**

```standardrb --fix-unsafely```

**Generate a todo file** for existing violations

```standardrb --generate-todo```

**Output in progress format**

```standardrb --format progress```

**Start language server** for IDE integration

```standardrb --lsp```

# SYNOPSIS

**standardrb** [_options_] [_files_...]

# PARAMETERS

**--fix**
> Automatically fix code style issues where possible.

**--fix-unsafely**
> Apply fixes including those marked as unsafe.

**--generate-todo**
> Create **.standard_todo.yml** to ignore existing violations.

**--format** _format_
> Output format: progress, simple, json, etc.

**--lsp**
> Run as Language Server Protocol server for IDE integration.

**--no-fix**
> Disable auto-fixing (default behavior).

**--parallel**
> Run in parallel mode for faster linting.

**--config** _file_
> Use a specific configuration file.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**standardrb** is Ruby's opinionated linter and formatter, bringing the StandardJS philosophy to Ruby. It provides a zero-configuration approach to code style by wrapping RuboCop with a fixed set of rules, eliminating debates about code formatting.

The tool enforces consistent style across Ruby projects without requiring configuration files or team discussions about style preferences. It includes rules from RuboCop's built-in cops and rubocop-performance.

Standard Ruby integrates with editors via LSP support and can be used in CI pipelines. The **--generate-todo** option helps adopt Standard in existing projects by creating an ignore file for current violations that can be addressed incrementally.

# CAVEATS

Standard is intentionally unconfigurable; if you need custom rules, use RuboCop directly. The **--fix-unsafely** option may change code behavior in rare cases. Standard forwards most CLI arguments to RuboCop, so RuboCop flags generally work. Requires Ruby 2.6 or later.

# HISTORY

**Standard Ruby** was created to bring the "no configuration" philosophy of StandardJS to the Ruby ecosystem. It was built on top of RuboCop to leverage its extensive rule set while providing an opinionated, zero-config experience. The project has gained significant adoption in the Ruby community as a way to avoid bikeshedding over code style.

# SEE ALSO

[rubocop](/man/rubocop)(1), [ruby](/man/ruby)(1), [bundle](/man/bundle)(1)
