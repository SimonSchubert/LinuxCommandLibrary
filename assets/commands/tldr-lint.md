# TAGLINE

Validate TLDR page formatting

# TLDR

**Lint file**

```tldr-lint [page.md]```

**Lint directory**

```tldr-lint [pages/]```

**Verbose output**

```tldr-lint -v [page.md]```

**Format output**

```tldr-lint -f [json] [page.md]```

**Ignore rules**

```tldr-lint -I [TLDR001] [page.md]```

# SYNOPSIS

**tldr-lint** [_-v_] [_-f format_] [_-I rules_] _files_

# PARAMETERS

**-v**
> Verbose output.

**-f** _FORMAT_
> Output format.

**-I** _RULES_
> Ignore rules.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**tldr-lint** validates TLDR pages against the project's formatting guidelines, checking for structural correctness, proper markdown syntax, and style compliance. Each rule is identified by a code (e.g., TLDR001) and can be selectively ignored with the **-I** flag.

The tool can lint individual files or scan entire directories for batch validation, making it suitable for CI pipelines that enforce consistent page formatting across the tldr-pages repository. Output formats include plain text and JSON for integration with other tools.

# CAVEATS

TLDR format specific. Node.js required. For tldr contributors.

# HISTORY

**tldr-lint** was created for the **tldr-pages** project to validate page formatting consistency.

# SEE ALSO

[tldr](/man/tldr)(1), [markdownlint](/man/markdownlint)(1)
