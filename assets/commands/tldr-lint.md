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

**tldr-lint** validates TLDR pages. It checks formatting.

TLDR page validation. Format compliance.

Multiple rules. Structure and style.

Directory scanning. Batch checking.

CI integration. Automated validation.

# CAVEATS

TLDR format specific. Node.js required. For tldr contributors.

# HISTORY

**tldr-lint** was created for the **tldr-pages** project to validate page formatting consistency.

# SEE ALSO

[tldr](/man/tldr)(1), [markdownlint](/man/markdownlint)(1)
