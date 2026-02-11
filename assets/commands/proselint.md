# TAGLINE

Linter for English prose style

# TLDR

**Check text file**

```proselint [document.txt]```

**Check multiple files**

```proselint [*.md]```

**Output as JSON**

```proselint --json [document.txt]```

**Show version**

```proselint --version```

**Check from stdin**

```cat [document.txt] | proselint```

# SYNOPSIS

**proselint** [_options_] _files_...

# DESCRIPTION

**proselint** is a linter for English prose. It checks for writing issues like clichés, jargon, redundancy, and common errors, helping improve clarity and style.

The tool draws on advice from style guides and editorial best practices, providing actionable suggestions for better writing.

# PARAMETERS

**--json**
> Output in JSON format.

**--config** _file_
> Configuration file.

**--compact**
> Compact output format.

**--version**
> Show version.

**--help**
> Show help.

# CHECKS

Clichés, jargon, weasel words, redundancy, sexism, consistency, typography, hedging, archaisms, mixed metaphors, and more.

# CONFIGURATION

**~/.config/proselint/config** (or **.proselintrc**)
> JSON configuration file to enable or disable specific checks, such as cliches, jargon, redundancy, and typography rules.

# CAVEATS

Style suggestions subjective. May flag intentional usage. English only. Some checks may not apply to all contexts.

# HISTORY

**proselint** was created by **Amperser Labs** to bring code linting concepts to prose. It aggregates wisdom from editorial style guides into an automated checking tool, useful for writers, documentation, and content review.

# SEE ALSO

[vale](/man/vale)(1), [write-good](/man/write-good)(1), [grammarly](/man/grammarly)(1), [aspell](/man/aspell)(1)
